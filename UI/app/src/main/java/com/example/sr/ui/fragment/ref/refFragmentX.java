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

public class refFragmentX extends Fragment{
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private Button fragmentx_x;
    private Fragment refconfigx;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentx,container,false);
        fragmentx_x=(Button)view.findViewById(R.id.fragmentx_x);
        refconfigx=new refConfigx();
        fragmentManager= getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentx_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.Ref_configuration_layout,refconfigx);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
