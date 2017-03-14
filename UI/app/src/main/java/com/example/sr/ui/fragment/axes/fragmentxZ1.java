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

public class fragmentxZ1 extends Fragment {
    private Button fragmentxZ1_x;
    private Button fragmentxZ1_Z1;
    private Fragment axisConfigzx;
    private Fragment axisConfigzz1;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private FragmentTransaction ft;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentxz1,container,false);
        fragmentxZ1_x=(Button)view.findViewById(R.id.fragmentxZ1_x);
        fragmentxZ1_Z1=(Button)view.findViewById(R.id.fragmentxZ1_Z1);
        axisConfigzx=new axis_configzx();
        axisConfigzz1=new axis_configzz1();
        fragmentManager= getFragmentManager();
        fragmentxZ1_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.configuration_layout,axisConfigzx);
                fragmentTransaction.commit();
            }
        });
        fragmentxZ1_Z1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft=fragmentManager.beginTransaction();
                ft.replace(R.id.configuration_layout,axisConfigzz1);
                ft.commit();
            }
        });
        return view;
    }
}
