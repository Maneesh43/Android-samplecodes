package com.maneesh.exercisetabbedlayouts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    String[] titles=new String[]{"frag1","frag2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialToolbar toolbar =(MaterialToolbar) findViewById(R.id.toolbar);
        toolbar.setElevation(3);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        Vie v1=new Vie(this);
        ViewPager2 v=(ViewPager2)findViewById(R.id.viewpager);
        v.setAdapter(v1);
        TabLayout t=(TabLayout)findViewById(R.id.tabs);
        new TabLayoutMediator(t,v, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(titles[position]);
            }
        }).attach();
    }
    public class Vie extends FragmentStateAdapter{
        Vie(FragmentActivity fragmentActivity){
            super(fragmentActivity);
        }
        @NonNull
        public Fragment createFragment(int position){
            switch (position){
                case 0:return new frag1();
                case 1:return new frag2();
                default:return null;
            }
        }
        @Override
        public int getItemCount(){
            return 2;
        }
    }
}
