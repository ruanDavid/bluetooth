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

public class millingXY extends Fragment {
    private View view;
    private TextView millingxy_X;
    private TextView millingxy_Y;
    private TextView millingxy_X_VALUE;
    private TextView millingxy_Y_VALUE;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.main_millingxy,container,false);
        init();
        return view;
    }
    public void init()
    {
        millingxy_X=(TextView)view.findViewById(R.id.millingxy_X);
        millingxy_Y=(TextView)view.findViewById(R.id.millingxy_Y);
        millingxy_X_VALUE=(TextView)view.findViewById(R.id.millingxy_X_VALUE);
        millingxy_Y_VALUE=(TextView)view.findViewById(R.id.millingxy_Y_VALUE);
    }
}
