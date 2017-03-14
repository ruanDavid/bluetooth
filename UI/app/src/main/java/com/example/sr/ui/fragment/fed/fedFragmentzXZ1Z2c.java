package com.example.sr.ui.fragment.fed;

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

public class fedFragmentzXZ1Z2c extends Fragment {
    private Button fragmentxZ1Z2c_x;
    private Button fragmentxZ1Z2c_Z1;
    private Button fragmentxZ1Z2c_Z2;
    private Button fragmentxZ1Z2c_c;
    private Fragment fedConfigzx;
    private Fragment fedConfigzz1;
    private Fragment fedConfigzz2;
    private Fragment fedConfigzc;
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
        fedConfigzx=new fedConfigzx();
        fedConfigzz1=new fedConfigzz1();
        fedConfigzz2=new fedConfigzz2();
        fedConfigzc=new fedConfigzc();
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
                    fragmentTransaction.replace(R.id.feedback_configuration_layout,fedConfigzx);
                    fragmentTransaction.commit();
                    break;
                case R.id.fragmentxZ1Z2c_Z1:
                    ft1=fragmentManager.beginTransaction();
                    ft1.replace(R.id.feedback_configuration_layout,fedConfigzz1);
                    ft1.commit();
                    break;
                case R.id.fragmentxZ1Z2c_Z2:
                    ft2=fragmentManager.beginTransaction();
                    ft2.replace(R.id.feedback_configuration_layout,fedConfigzz2);
                    ft2.commit();
                    break;
                case R.id.fragmentxZ1Z2c_c:
                    ft3=fragmentManager.beginTransaction();
                    ft3.replace(R.id.feedback_configuration_layout,fedConfigzc);
                    ft3.commit();
                    break;
            }
        }
    }
}
