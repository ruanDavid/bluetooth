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

public class LatherX extends Fragment {
    private View view;
    private TextView latherx_X;
    private TextView latherx_X_VALUE;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.main_lather_x,container,false);
        latherx_X=(TextView)view.findViewById(R.id.latherx_X);
        latherx_X_VALUE=(TextView)view.findViewById(R.id.latherx_X_VALUE);
        return view;
    }
}
