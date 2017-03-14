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
 * Created by Sr on 2017/3/14.
 */

public class LatherXZ1 extends Fragment {
    private View view;
    private TextView latherxz1_X;
    private TextView latherxz1_z1;
    private TextView latherxz1_X_VALUE;
    private TextView latherxz1_Z1_VALUE;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.main_lather_xz1,container,false);
        init();
        return view;
    }
    public void init()
    {
        latherxz1_X=(TextView)view.findViewById(R.id.latherxz1_X);
        latherxz1_z1=(TextView)view.findViewById(R.id.latherxz1_z1);
        latherxz1_X_VALUE=(TextView)view.findViewById(R.id.latherxz1_X_VALUE);
        latherxz1_Z1_VALUE=(TextView)view.findViewById(R.id.latherxz1_Z1_VALUE);
    }
}
