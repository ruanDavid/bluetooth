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
 * Created by Sr on 2017/3/8.
 */

public class fragmentxz_x extends Fragment {
    private Button fragmentxz_x;
    private Fragment axisConfigzx;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentxz_x,container,false);
        fragmentxz_x=(Button)view.findViewById(R.id.fragmentxz_x);
        axisConfigzx=new axis_configzx();
        fragmentManager= getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentxz_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.configuration_layout,axisConfigzx);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
