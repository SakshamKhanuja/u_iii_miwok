package com.basic.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.basic.miwok.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Performs View Binding.
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = ActivityMainBinding.inflate(
                (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        setContentView(mBinding.getRoot());

        // Registering a callback to open "ColorsActivity.java".
        mBinding.textViewColors.setOnClickListener(view -> openActivity(ColorsActivity.class));

        // Registering a callback to open "FamilyActivity.java".
        mBinding.textViewFamily.setOnClickListener(view -> openActivity(FamilyActivity.class));

        // Registering a callback to open "NumbersActivity.java".
        mBinding.textViewNumbers.setOnClickListener(view -> openActivity(NumbersActivity.class));

        // Registering a callback to open "PhrasesActivity.java".
        mBinding.textViewPhrases.setOnClickListener(view -> openActivity(PhrasesActivity.class));
    }

    /**
     * Opens Activity located in this app.
     *
     * @param activityClass is the Activity class which you want to open.
     */
    private void openActivity(Class<?> activityClass) {
        startActivity(new Intent(this, activityClass));
    }
}