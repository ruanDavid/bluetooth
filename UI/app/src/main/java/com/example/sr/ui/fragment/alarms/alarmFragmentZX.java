package com.example.sr.ui.fragment.alarms;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sr.ui.R;

/**
 * Created by Sr on 2017/3/9.
 */

public class alarmFragmentZX extends Fragment {
    private View view;
    private Button alarmsfragmentzx;
    private Fragment alarmszx;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragmentxz_x,container,false);
        alarmsfragmentzx=(Button)view.findViewById(R.id.fragmentxz_x);
        alarmszx=new alsrmsxz_x();
        fragmentManager= getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        alarmsfragmentzx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.alarms_configuration_layout,alarmszx);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
