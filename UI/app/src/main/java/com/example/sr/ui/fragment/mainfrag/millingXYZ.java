package com.example.sr.ui.fragment.mainfrag;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sr.ui.R;

/**
 * Created by Sr on 2017/3/13.
 */

public class millingXYZ extends Fragment {
    private View view;
    private TextView millingxyz_X;
    private TextView millingxyz_Y;
    private TextView millingxyz_Z;
    private TextView millingxyz_X_VALUE;
    private TextView millingxyz_Y_VALUE;
    private TextView millingxyz_Z_VALUE;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.main_millingxyz,container,false);
        init();
        return view;
    }
    public void init()
    {
        millingxyz_X=(TextView)view.findViewById(R.id.millingxyz_X);
        millingxyz_Y=(TextView)view.findViewById(R.id.millingxyz_Y);
        millingxyz_Z=(TextView)view.findViewById(R.id.millingxyz_Z);
        millingxyz_X_VALUE=(TextView)view.findViewById(R.id.millingxyz_X_VALUE);
        millingxyz_Y_VALUE=(TextView)view.findViewById(R.id.millingxyz_Y_VALUE);
        millingxyz_Z_VALUE=(TextView)view.findViewById(R.id.millingxyz_Z_VALUE);
    }
}
