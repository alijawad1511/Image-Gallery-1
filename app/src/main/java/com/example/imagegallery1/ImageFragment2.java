package com.example.imagegallery1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ImageFragment2 extends Fragment {
    LinearLayout parent;
    boolean whiteFlag = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.image_fragment2, container, false);
        parent = view.findViewById(R.id.fragmentParent);

        parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(whiteFlag){
                    parent.setBackgroundColor(Color.BLACK);
                    whiteFlag = false;
                }else{
                    parent.setBackgroundColor(Color.WHITE);
                    whiteFlag = true;
                }

            }
        });
        return view;
    }

}
