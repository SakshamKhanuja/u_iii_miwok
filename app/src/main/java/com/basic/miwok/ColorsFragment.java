package com.basic.miwok;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ColorsFragment extends Fragment {

    // Handles audio playing.
    private MediaPlayer mPlayer;

    // Handles audio focus.
    private AudioManager mAudioManager;

    // Shows a list of Words containing translation of colors.
    private ListView mListView;

    /*
     * This listener is attached to AudioManager to request audio focus for devices running
     * Android Nougat (API 25) and earlier.
     */
    private final AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener =
            focusChange -> {
                if (focusChange == AudioManager.AUDIOFOCUS_LOSS ||
                        focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK ||
                        focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT) {
                    // No need to wait for audio focus, releasing all memory resources.
                    releaseMediaPlayer();
                }
            };

    // Requests audio focus for devices running Android Oreo (API 26) and later.
    private AudioFocusRequest mAudioFocusRequest;

    // Required Fragment
    public ColorsFragment() {
        super(R.layout.word_list);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initializing AudioManager to request / abandon audio focus.
        mAudioManager = (AudioManager) view.getContext().getSystemService(Context.AUDIO_SERVICE);

        // Initializing a Custom ArrayAdapter - WordAdapter to send Views to ListView.
        WordAdapter wordAdapter = new WordAdapter(getContext(), WordData.getLanguageCategory(3),
                R.color.category_colors);
        mListView = view.findViewById(R.id.list_words);
        mListView.setAdapter(wordAdapter);

        // For devices running Android 8.0 (Oreo - API 26) and later.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            playMusicForOreoAndAbove();
        } else {
            playAudioForNougatAndBelow();
        }
    }

    /**
     * Plays Miwok word audio when a ListView containing words is clicked. It handles audio focus
     * and releases MediaPlayer resources appropriately.
     * <p>
     * This method works for devices running Android Nougat (API 25) and below.
     */
    private void playAudioForNougatAndBelow() {
        // Setting OnItemClickListener for ListView
        mListView.setOnItemClickListener(((parent, view, position, id) -> {

            // Release prev. resources
            releaseMediaPlayer();

            // Check if the app can have audio focus for a moment.
            if (mAudioManager.requestAudioFocus(mAudioFocusChangeListener,
                    AudioManager.STREAM_MUSIC,
                    AudioManager.AUDIOFOCUS_GAIN_TRANSIENT)
                    == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                // Prepare and start playing for clicked Word.
                mPlayer = MediaPlayer.create(getContext(), ((Word) parent.getItemAtPosition(position))
                        .getAudioResourceID());
                mPlayer.start();
                mPlayer.setOnCompletionListener(player -> releaseMediaPlayer());
            }
        }));
    }

    /**
     * Plays Miwok word audio when a ListView containing words is clicked. It handles audio focus
     * and releases MediaPlayer resources appropriately.
     * <p>
     * This method works for devices running Android Oreo (API 26) and later.
     */
    private void playMusicForOreoAndAbove() {
        // For devices running Android 8.0 (Oreo - API 26) and later.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            // Building AudioFocusRequest to set audio focus attributes.
            AudioFocusRequest.Builder builder =
                    new AudioFocusRequest.Builder(AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

            // Specifying the use case of this request.
            builder.setAudioAttributes(new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                    .build());

            // Set listener if audio focus gets updated in between playing audio.
            builder.setOnAudioFocusChangeListener(focusChange -> {
                if (focusChange == AudioManager.AUDIOFOCUS_LOSS ||
                        focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK ||
                        focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT) {
                    // No need to wait for audio focus, releasing all memory resources.
                    releaseMediaPlayer();
                }
            });

            // Initializing AudioFocusRequest.
            mAudioFocusRequest = builder.build();

            // Setting OnItemClickListener for ListView
            mListView.setOnItemClickListener(((parent, view, position, id) -> {
                // Release prev. resources
                releaseMediaPlayer();

                // Check if the app can have audio focus at the moment.
                if (mAudioManager.requestAudioFocus(mAudioFocusRequest) ==
                        AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {

                    // Prepare and start playing for clicked Word.
                    mPlayer = MediaPlayer.create(getContext(),
                            ((Word) parent.getItemAtPosition(position))
                                    .getAudioResourceID());
                    mPlayer.start();

                    // On complete audio playback memory resources are released.
                    mPlayer.setOnCompletionListener(player -> releaseMediaPlayer());
                }
            }));
        }
    }

    @Override
    public void onStop() {
        super.onStop();

        releaseMediaPlayer();
    }

    /**
     * Stops playing audio and releases all memory resources.
     */
    private void releaseMediaPlayer() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }

        // Abandons Audio Focus.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            mAudioManager.abandonAudioFocusRequest(mAudioFocusRequest);
        } else {
            mAudioManager.abandonAudioFocus(mAudioFocusChangeListener);
        }
    }
}