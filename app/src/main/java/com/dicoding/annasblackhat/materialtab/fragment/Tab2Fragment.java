package com.dicoding.annasblackhat.materialtab.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.dicoding.annasblackhat.materialtab.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends Fragment {

    private Button btn;

    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab2, container, false);
        btn = (Button)v.findViewById(R.id.btn_click_me);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hello...",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
