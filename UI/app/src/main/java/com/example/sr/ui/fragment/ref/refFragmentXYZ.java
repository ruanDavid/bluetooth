package com.example.sr.ui.fragment.ref;

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

public class refFragmentXYZ extends Fragment {
    private Button fragmentxyz_x;
    private Button fragmentxyz_y;
    private Button fragmentxyz_z;
    private Fragment refConfigy;
    private Fragment refConfigz;
    private Fragment refConfigx;
    private FragmentManager fragmentManager;
    private FragmentTransaction ft1;
    private FragmentTransaction ft2;
    private FragmentTransaction ft3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentxyz,container,false);
        fragmentxyz_x=(Button)view.findViewById(R.id.fragmentxyz_x);
        fragmentxyz_y=(Button)view.findViewById(R.id.fragmentxyz_y);
        fragmentxyz_z=(Button)view.findViewById(R.id.fragmentxyz_z);
        refConfigx=new refConfigx();
        refConfigy=new refConfigy();
        refConfigz=new refConfigz();
        fragmentManager= getFragmentManager();
        fragmentxyz_x.setOnClickListener(new click());
        fragmentxyz_y.setOnClickListener(new click());
        fragmentxyz_z.setOnClickListener(new click());
        return view;
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
                    ft1.replace(R.id.Ref_configuration_layout,refConfigx);
                    ft1.commit();
                    break;
                case R.id.fragmentxyz_y:
                    ft2=fragmentManager.beginTransaction();
                    ft2.replace(R.id.Ref_configuration_layout,refConfigy);
                    ft2.commit();
                    break;
                case R.id.fragmentxyz_z:
                    ft3=fragmentManager.beginTransaction();
                    ft3.replace(R.id.Ref_configuration_layout,refConfigz);
                    ft3.commit();
                    break;
            }
        }
    }
}
