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

public class fragmentXY extends Fragment {
    private Button fragmentxy_x;
    private Button fragmentxy_y;
    private Fragment axisConfigx;
    private Fragment axisConfigy;
    private FragmentManager fragmentManager;
    private FragmentTransaction ft1;
    private FragmentTransaction ft2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentxy,container,false);
        fragmentxy_x=(Button)view.findViewById(R.id.fragmentxy_x);
        fragmentxy_y=(Button)view.findViewById(R.id.fragmentxy_y);
        axisConfigx=new axis_configx();
        axisConfigy=new axis_configy();
        fragmentManager= getFragmentManager();
        fragmentxy_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft1=fragmentManager.beginTransaction();
                ft1.replace(R.id.configuration_layout,axisConfigx);
                ft1.commit();
            }
        });
        fragmentxy_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft2=fragmentManager.beginTransaction();
                ft2.replace(R.id.configuration_layout,axisConfigy);
                ft2.commit();
            }
        });
        return view;
    }
}
