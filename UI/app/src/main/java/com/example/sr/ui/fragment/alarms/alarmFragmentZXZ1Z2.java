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

public class alarmFragmentZXZ1Z2 extends Fragment{
    private View view;
    private Button alarmsfragmentxZ1Z2_x;
    private Button alarmsfragmentxZ1Z2_Z1;
    private Button alarmsfragmentxZ1Z2_Z2;
    private Fragment alarmszx;
    private Fragment alarmszz1;
    private Fragment alarmszz2;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private FragmentTransaction ft1;
    private FragmentTransaction ft2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragmentxz1z2,container,false);
        alarmsfragmentxZ1Z2_x=(Button)view.findViewById(R.id.fragmentxZ1Z2_x);
        alarmsfragmentxZ1Z2_Z1=(Button)view.findViewById(R.id.fragmentxZ1Z2_Z1);
        alarmsfragmentxZ1Z2_Z2=(Button)view.findViewById(R.id.fragmentxZ1Z2_Z2);
        alarmszx=new alsrmsxz_x();
        alarmszz1=new alsrmsxz_z1();
        alarmszz2=new alsrmsxz_z2();
        fragmentManager= getFragmentManager();
        alarmsfragmentxZ1Z2_x.setOnClickListener(new click());
        alarmsfragmentxZ1Z2_Z2.setOnClickListener(new click());
        alarmsfragmentxZ1Z2_Z1.setOnClickListener(new click());
        return view;
    }
    class click implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.fragmentxZ1Z2_x:
                    fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.alarms_configuration_layout,alarmszx);
                    fragmentTransaction.commit();
                    break;
                case R.id.fragmentxZ1Z2_Z1:
                    ft1=fragmentManager.beginTransaction();
                    ft1.replace(R.id.alarms_configuration_layout,alarmszz1);
                    ft1.commit();
                    break;
                case R.id.fragmentxZ1Z2_Z2:
                    ft2=fragmentManager.beginTransaction();
                    ft2.replace(R.id.alarms_configuration_layout,alarmszz2);
                    ft2.commit();
                    break;
            }
        }
    }
}
