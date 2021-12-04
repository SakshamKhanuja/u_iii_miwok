package com.basic.miwok;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * Provides Word Fragments to ViewPager2.
 */
public class WordCategoryAdapter extends FragmentStateAdapter {

    public WordCategoryAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new NumbersFragment();

            case 1:
                return new FamilyFragment();

            case 2:
                return new ColorsFragment();

            case 3:
                return new PhrasesFragment();

            default:
                // Empty Fragment
                return new Fragment(R.layout.layout_item_word);
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
