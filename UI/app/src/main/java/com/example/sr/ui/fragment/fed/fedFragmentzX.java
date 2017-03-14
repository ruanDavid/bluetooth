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

public class fedFragmentzX extends Fragment {
    private Button fragmentxz_x;
    private Fragment fedConfigzx;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentxz_x,container,false);
        fragmentxz_x=(Button)view.findViewById(R.id.fragmentxz_x);
        fedConfigzx=new fedConfigzx();
        fragmentManager= getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentxz_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.feedback_configuration_layout,fedConfigzx);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
