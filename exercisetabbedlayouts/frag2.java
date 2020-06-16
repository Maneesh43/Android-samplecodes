package com.maneesh.exercisetabbedlayouts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag2 extends Fragment {

    public frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_frag2, container, false);
        FloatingActionButton f=(FloatingActionButton)v.findViewById(R.id.floating);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               final Snackbar s=Snackbar.make(v,"Snackbar",BaseTransientBottomBar.LENGTH_SHORT).setAction("Undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                s.show();
            }
        });
return v;
    }
}
