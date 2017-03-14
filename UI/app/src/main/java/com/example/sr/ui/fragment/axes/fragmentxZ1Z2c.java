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

public class fragmentxZ1Z2c extends Fragment {
    private Button fragmentxZ1Z2c_x;
    private Button fragmentxZ1Z2c_Z1;
    private Button fragmentxZ1Z2c_Z2;
    private Button fragmentxZ1Z2c_c;
    private Fragment axisConfigzx;
    private Fragment axisConfigzz1;
    private Fragment axisConfigzz2;
    private Fragment axisConfigzc;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private FragmentTransaction ft1;
    private FragmentTransaction ft2;
    private FragmentTransaction ft3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentxz1z2c,container,false);
        fragmentxZ1Z2c_x=(Button)view.findViewById(R.id.fragmentxZ1Z2c_x);
        fragmentxZ1Z2c_Z1=(Button)view.findViewById(R.id.fragmentxZ1Z2c_Z1);
        fragmentxZ1Z2c_Z2=(Button)view.findViewById(R.id.fragmentxZ1Z2c_Z2);
        fragmentxZ1Z2c_c=(Button)view.findViewById(R.id.fragmentxZ1Z2c_c);
        axisConfigzx=new axis_configzx();
        axisConfigzz1=new axis_configzz1();
        axisConfigzz2=new axis_configzz2();
        axisConfigzc=new axis_configzc();
        fragmentManager= getFragmentManager();
        fragmentxZ1Z2c_c.setOnClickListener(new click());
        fragmentxZ1Z2c_Z1.setOnClickListener(new click());
        fragmentxZ1Z2c_Z2.setOnClickListener(new click());
        fragmentxZ1Z2c_x.setOnClickListener(new click());
        return view;
    }
    class click implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.fragmentxZ1Z2c_x:
                    fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.configuration_layout,axisConfigzx);
                    fragmentTransaction.commit();
                    break;
                case R.id.fragmentxZ1Z2c_Z1:
                    ft1=fragmentManager.beginTransaction();
                    ft1.replace(R.id.configuration_layout,axisConfigzz1);
                    ft1.commit();
                    break;
                case R.id.fragmentxZ1Z2c_Z2:
                    ft2=fragmentManager.beginTransaction();
                    ft2.replace(R.id.configuration_layout,axisConfigzz2);
                    ft2.commit();
                    break;
                case R.id.fragmentxZ1Z2c_c:
                    ft3=fragmentManager.beginTransaction();
                    ft3.replace(R.id.configuration_layout,axisConfigzc);
                    ft3.commit();
                    break;
            }
        }
    }
}
