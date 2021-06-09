package com.example.aplikasiku.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.aplikasiku.DataActivity;
import com.example.aplikasiku.R;


public class TabData extends Fragment {
    Button button;

    public TabData() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tab_data, container, false);
        button = v.findViewById(R.id.dTransaksi2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent;

                switch (v.getId()) {
                    case R.id.dTransaksi2:
                        intent = new Intent(getActivity(), DataActivity.class);
                        startActivity(intent);
                        break;

                }
            }
        });
        return v;
    }
}
