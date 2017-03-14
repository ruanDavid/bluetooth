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

public class alarmFragmentXYZC extends Fragment {
    private View view;
    private Button alarmsfragmentxyzc_x;
    private Button alsrmsfragmentxyzc_y;
    private Button alarmsfragmentxyzc_z;
    private Button alarmsfragmentxyzc_c;
    private Fragment alarmsx;
    private Fragment alarmsy;
    private Fragment alarmsz;
    private Fragment alarmsc;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private FragmentTransaction ft1;
    private FragmentTransaction ft2;
    private FragmentTransaction ft3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragmentxyzc,container,false);
        alarmsfragmentxyzc_x=(Button)view.findViewById(R.id.fragmentxyzc_x);
        alsrmsfragmentxyzc_y=(Button)view.findViewById(R.id.fragmentxyzc_y);
        alarmsfragmentxyzc_z=(Button)view.findViewById(R.id.fragmentxyzc_z);
        alarmsfragmentxyzc_c=(Button)view.findViewById(R.id.fragmentxyzc_c);
        alarmsx=new alarmsx();
        alarmsy=new alarmsy();
        alarmsz=new alarmsz();
        alarmsc=new alarmsc();
        fragmentManager= getFragmentManager();
        alarmsfragmentxyzc_x.setOnClickListener(new click());
        alsrmsfragmentxyzc_y.setOnClickListener(new click());
        alarmsfragmentxyzc_z.setOnClickListener(new click());
        alarmsfragmentxyzc_c.setOnClickListener(new click());
        return view;
    }
    class click implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.fragmentxyzc_x:
                    fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.alarms_configuration_layout,alarmsx);
                    fragmentTransaction.commit();
                    break;
                case R.id.fragmentxyzc_y:
                    ft1=fragmentManager.beginTransaction();
                    ft1.replace(R.id.alarms_configuration_layout,alarmsy);
                    ft1.commit();
                    break;
                case R.id.fragmentxyzc_z:
                    ft2=fragmentManager.beginTransaction();
                    ft2.replace(R.id.alarms_configuration_layout,alarmsz);
                    ft2.commit();
                    break;
                case R.id.fragmentxyzc_c:
                    ft3=fragmentManager.beginTransaction();
                    ft3.replace(R.id.alarms_configuration_layout,alarmsc);
                    ft3.commit();
                    break;
            }
        }
    }
}
