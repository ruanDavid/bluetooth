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
 * Created by Sr on 2017/2/18.
 */

public class   millingXYZC extends Fragment {
    private View view;
    private TextView X;
    private TextView Y;
    private TextView Z;
    private TextView C;
    private TextView X_VALUE;
    private TextView Y_VALUE;
    private TextView Z_VALUE;
    private TextView C_VALUE;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_xyzc,container,false);
        init();
        return view;
    }
    public void init()
    {
        X=(TextView)view.findViewById(R.id.X);
        Y=(TextView)view.findViewById(R.id.Y);
        Z=(TextView)view.findViewById(R.id.Z);
        C=(TextView)view.findViewById(R.id.C);
        X_VALUE=(TextView)view.findViewById(R.id.X_VALUE);
        Y_VALUE=(TextView)view.findViewById(R.id.Y_VALUE);
        Z_VALUE=(TextView)view.findViewById(R.id.Z_VALUE);
        C_VALUE=(TextView)view.findViewById(R.id.C_VALUE);
    }
}
