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

public class alarmFragmentXYZ extends Fragment {
    private View view;
    private Button alarmsfragmentxyz_x;
    private Button alarmsfragmentxyz_y;
    private Button alarmsfragmentxyz_z;
    private Fragment alarmsx;
    private Fragment alarmsy;
    private Fragment alarmsz;
    private FragmentManager fragmentManager;
    private FragmentTransaction ft1;
    private FragmentTransaction ft2;
    private FragmentTransaction ft3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragmentxyz,container,false);
        alarmsfragmentxyz_x=(Button)view.findViewById(R.id.fragmentxyz_x);
        alarmsfragmentxyz_y=(Button)view.findViewById(R.id.fragmentxyz_y);
        alarmsfragmentxyz_z=(Button)view.findViewById(R.id.fragmentxyz_z);
        alarmsx=new alarmsx();
        alarmsy=new alarmsy();
        alarmsz=new alarmsz();
        fragmentManager= getFragmentManager();
        alarmsfragmentxyz_x.setOnClickListener(new click());
        alarmsfragmentxyz_y.setOnClickListener(new click());
        alarmsfragmentxyz_z.setOnClickListener(new click());
        return  view;
    }
    class click implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.fragmentxyz_x:
                    ft1=fragmentManager.beginTransaction();
                    ft1.replace(R.id.alarms_configuration_layout,alarmsx);
                    ft1.commit();
                    break;
                case R.id.fragmentxyz_y:
                    ft2=fragmentManager.beginTransaction();
                    ft2.replace(R.id.alarms_configuration_layout,alarmsy);
                    ft2.commit();
                    break;
                case R.id.fragmentxyz_z:
                    ft3=fragmentManager.beginTransaction();
                    ft3.replace(R.id.alarms_configuration_layout,alarmsz);
                    ft3.commit();
                    break;
            }
        }
    }
}
