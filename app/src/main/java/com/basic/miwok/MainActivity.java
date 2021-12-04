package com.basic.miwok;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.basic.miwok.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate((LayoutInflater)
                getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        setContentView(binding.getRoot());

        // Setting elevation of ActionBar to 0dp.
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setElevation(0F);
        }

        // Initializing Adapter to provide Word Category Fragments to ViewPager2.
        WordCategoryAdapter adapter = new WordCategoryAdapter(getSupportFragmentManager(),
                getLifecycle());

        // Set adapter for ViewPager2.
        binding.viewPager2.setAdapter(adapter);

        // Link ViewPager2 and TabLayout using TabLayoutMediator
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(binding.tabLayout,
                binding.viewPager2, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText(R.string.category_numbers);
                    break;

                case 1:
                    tab.setText(R.string.category_family);
                    break;

                case 2:
                    tab.setText(R.string.category_colors);
                    break;

                case 3:
                    tab.setText(R.string.category_phrases);
                    break;
            }
        });

        // Attach TabLayoutMediator to ViewPager2.
        tabLayoutMediator.attach();
    }
}