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

public class alarmFragmentXY extends Fragment {
    private View view;
    private Button alarmsfragmentxy_x;
    private Button alaemsfragmentxy_y;
    private Fragment alarmsx;
    private Fragment alarmsy;
    private FragmentManager fragmentManager;
    private FragmentTransaction ft1;
    private FragmentTransaction ft2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragmentxy,container,false);
        alarmsfragmentxy_x=(Button)view.findViewById(R.id.fragmentxy_x);
        alaemsfragmentxy_y=(Button)view.findViewById(R.id.fragmentxy_y);
        alarmsx=new alarmsx();
        alarmsy=new alarmsy();
        fragmentManager= getFragmentManager();
        alarmsfragmentxy_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft1=fragmentManager.beginTransaction();
                ft1.replace(R.id.alarms_configuration_layout, alarmsx);
                ft1.commit();
            }
        });
        alaemsfragmentxy_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft2=fragmentManager.beginTransaction();
                ft2.replace(R.id.alarms_configuration_layout,alarmsy);
                ft2.commit();
            }
        });
        return view;
    }
}
