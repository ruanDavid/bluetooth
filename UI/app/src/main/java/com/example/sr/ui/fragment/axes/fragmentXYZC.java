package com.example.sr.ui.fragment.axes;

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
 * Created by Sr on 2017/3/2.
 */

public class fragmentXYZC extends Fragment {
    private Button fragmentxyzc_x;
    private Button fragmentxyzc_y;
    private Button fragmentxyzc_z;
    private Button fragmentxyzc_c;
    private Fragment axisConfigy;
    private Fragment axisConfigz;
    private Fragment axisConfigx;
    private Fragment axisConfigc;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private FragmentTransaction ft1;
    private FragmentTransaction ft2;
    private FragmentTransaction ft3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentxyzc,container,false);
        fragmentxyzc_x=(Button)view.findViewById(R.id.fragmentxyzc_x);
        fragmentxyzc_y=(Button)view.findViewById(R.id.fragmentxyzc_y);
        fragmentxyzc_z=(Button)view.findViewById(R.id.fragmentxyzc_z);
        fragmentxyzc_c=(Button)view.findViewById(R.id.fragmentxyzc_c);
        axisConfigy=new axis_configy();
        axisConfigz=new axis_configz();
        axisConfigx=new axis_configx();
        axisConfigc=new axis_configc();
        fragmentManager= getFragmentManager();
        fragmentxyzc_x.setOnClickListener(new click());
        fragmentxyzc_y.setOnClickListener(new click());
        fragmentxyzc_z.setOnClickListener(new click());
        fragmentxyzc_c.setOnClickListener(new click());
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
                    fragmentTransaction.replace(R.id.configuration_layout,axisConfigx);
                    fragmentTransaction.commit();
                    break;
                case R.id.fragmentxyzc_y:
                    ft1=fragmentManager.beginTransaction();
                    ft1.replace(R.id.configuration_layout,axisConfigy);
                    ft1.commit();
                    break;
                case R.id.fragmentxyzc_z:
                    ft2=fragmentManager.beginTransaction();
                    ft2.replace(R.id.configuration_layout,axisConfigz);
                    ft2.commit();
                    break;
                case R.id.fragmentxyzc_c:
                    ft3=fragmentManager.beginTransaction();
                    ft3.replace(R.id.configuration_layout,axisConfigc);
                    ft3.commit();
                    break;
            }
        }
    }
}
