package com.example.sr.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.TextView;

import com.example.sr.ui.MainActivity;
import com.example.sr.ui.R;
import com.example.sr.ui.fragment.mainfrag.milling_button;

/**
 * Created by Sr on 2017/2/17.
 */

public class Fragment_Lable extends Fragment {

    private TextView SETORCLEAR;
    private TextView INCHORMM;
    private TextView INCORABS;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_lable,container,false);
        SETORCLEAR=(TextView)view.findViewById(R.id.setOrClear);
        INCHORMM=(TextView)view.findViewById(R.id.INCHorMM);
        INCORABS=(TextView)view.findViewById(R.id.INCorABS);
        SETORCLEAR.setText(milling_button.SETORCLEAR);
        INCHORMM.setText(milling_button.INCHORMM);
        INCORABS.setText(milling_button.INCORABC);
        return view;
    }
}
