package com.example.sr.ui.fragment.mainfrag;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sr.ui.R;

/**
 * Created by Sr on 2017/3/14.
 */

public class lather_button extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.lather_main_button,container,false);
        return view;
    }
}
