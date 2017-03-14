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

public class fedFragmentX extends Fragment {
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private Button fragmentx_x;
    private Fragment fedconfigx;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentx,container,false);
        fragmentx_x=(Button)view.findViewById(R.id.fragmentx_x);
        fedconfigx=new fedConfigx();
        fragmentManager= getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentx_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.feedback_configuration_layout,fedconfigx);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
