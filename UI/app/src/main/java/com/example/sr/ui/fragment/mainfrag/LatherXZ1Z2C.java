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

public class LatherXZ1Z2C extends Fragment {
    private View view;
    private TextView latherxz1z2c_X;
    private TextView latherxz1z2c_Z1;
    private TextView latherxz1z2c_Z2;
    private TextView latherxz1z2c_C;
    private TextView latherxz1z2c_X_value;
    private TextView latherxz1z2c_Z1_value;
    private TextView latherxz1z2c_Z2_value;
    private TextView latherxz1z2c_C_value;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.main_lather_xz1z2c,container,false);
        init();
        return view;
    }
    public void init()
    {
        latherxz1z2c_X=(TextView)view.findViewById(R.id.latherxz1z2c_X);
        latherxz1z2c_Z1=(TextView)view.findViewById(R.id.latherxz1z2c_Z1);
        latherxz1z2c_Z2=(TextView)view.findViewById(R.id.latherxz1z2c_Z2);
        latherxz1z2c_C=(TextView)view.findViewById(R.id.latherxz1z2c_C);
        latherxz1z2c_X_value=(TextView)view.findViewById(R.id.latherxz1z2c_X_value);
        latherxz1z2c_Z1_value=(TextView)view.findViewById(R.id.latherxz1z2c_Z1_value);
        latherxz1z2c_Z2_value=(TextView)view.findViewById(R.id.latherxz1z2c_Z2_value);
        latherxz1z2c_C_value=(TextView)view.findViewById(R.id.latherxz1z2c_C_value);
    }
}
