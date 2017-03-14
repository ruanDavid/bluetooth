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

public class alarmFragmentZXZ1 extends Fragment {
    private View view;
    private Button alarmsfragmentxZ1_x;
    private Button alarmsfragmentxZ1_Z1;
    private Fragment alarmszx;
    private Fragment alarmszz1;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private FragmentTransaction ft;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragmentxz1,container,false);
        alarmsfragmentxZ1_x=(Button)view.findViewById(R.id.fragmentxZ1_x);
        alarmsfragmentxZ1_Z1=(Button)view.findViewById(R.id.fragmentxZ1_Z1);
        alarmszx=new alsrmsxz_x();
        alarmszz1=new alsrmsxz_z1();
        fragmentManager= getFragmentManager();
        alarmsfragmentxZ1_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.alarms_configuration_layout,alarmszx);
                fragmentTransaction.commit();
            }
        });
        alarmsfragmentxZ1_Z1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft=fragmentManager.beginTransaction();
                ft.replace(R.id.alarms_configuration_layout,alarmszz1);
                ft.commit();
            }
        });
        return  view;
    }
}
