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

public class alarmFragmentX extends Fragment {
    private View view;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private Button alarmFragmentx;
    private Fragment alarmsx;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragmentx,container,false);
        fragmentManager=getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        alarmFragmentx=(Button)view.findViewById(R.id.fragmentx_x);
        alarmsx=new alarmsx();
        alarmFragmentx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.alarms_configuration_layout,alarmsx);
                fragmentTransaction.commit();
            }
        });
        return view;
    }

}
