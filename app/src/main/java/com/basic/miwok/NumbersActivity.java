package com.basic.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.basic.miwok.databinding.WordListBinding;

public class NumbersActivity extends AppCompatActivity {

    // Performs View Binding.
    private WordListBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = WordListBinding.inflate(
                (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        setContentView(mBinding.getRoot());

        // Initializing a Custom ArrayAdapter - WordAdapter to send Views to ListView.
        WordAdapter wordAdapter = new WordAdapter(this, WordData.getLanguageCategory(1),
                R.color.category_numbers);
        mBinding.listWords.setAdapter(wordAdapter);
    }
}