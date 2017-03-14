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

public class fedFragmentzXZ1 extends Fragment {
    private Button fragmentxZ1_x;
    private Button fragmentxZ1_Z1;
    private Fragment fedConfigzx;
    private Fragment fedConfigzz1;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private FragmentTransaction ft;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentxz1,container,false);
        fragmentxZ1_x=(Button)view.findViewById(R.id.fragmentxZ1_x);
        fragmentxZ1_Z1=(Button)view.findViewById(R.id.fragmentxZ1_Z1);
        fedConfigzx=new fedConfigzx();
        fedConfigzz1=new fedConfigzz1();
        fragmentManager= getFragmentManager();
        fragmentxZ1_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.feedback_configuration_layout,fedConfigzx);
                fragmentTransaction.commit();
            }
        });
        fragmentxZ1_Z1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft=fragmentManager.beginTransaction();
                ft.replace(R.id.feedback_configuration_layout,fedConfigzz1);
                ft.commit();
            }
        });
        return view;
    }
}
