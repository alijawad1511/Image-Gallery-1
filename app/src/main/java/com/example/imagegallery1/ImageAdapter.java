package com.example.imagegallery1;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ImageAdapter extends FragmentPagerAdapter {
    public ImageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ImageFragment1();
        }else if(position==1){
            return new ImageFragment2();
        }else if(position==2){
            return new ImageFragment3();
        }else if(position==3){
            return new ImageFragment4();
        }else if(position==4){
            return new ImageFragment5();
        }else if(position==5){
            return new ImageFragment6();
        }else if(position==6){
            return new ImageFragment7();
        }else if(position==7){
            return new ImageFragment8();
        }else if(position==8){
            return new ImageFragment9();
        }else if(position==9){
            return new ImageFragment10();
        }else{
            return null;
        }
    }

    @Override
    public int getCount() {
        return 10;
    }
}
