package com.example.sr.ui.fragment.ref;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.sr.ui.R;

/**
 * Created by Sr on 2017/3/9.
 */

public class refConfigzz2 extends Fragment{
    private View view;
    private TextView ref_mark;
    private TextView useroffset;
    private TextView homeOnStartUp;
    private TextView ref_type;
    private TextView signal_period;
    private TextView externalMultiply;
    private TextView userOffset_value;
    private Spinner homeOnStartUpSpine;
    private Spinner ref_typeSpine;
    private Spinner signal_periodSpine;
    private Spinner externalMultiplySpine;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.refconfig,container,false);
        init();
        ref_typeSpine.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String data=(String)ref_typeSpine.getItemAtPosition(i);
                switch (data)
                {
                    case "None":
                        signal_period.setVisibility(View.INVISIBLE);
                        externalMultiply.setVisibility(View.INVISIBLE);
                        signal_periodSpine.setVisibility(View.INVISIBLE);
                        externalMultiplySpine.setVisibility(View.INVISIBLE);
                        break;
                    case "Normal":
                        signal_period.setVisibility(View.INVISIBLE);
                        externalMultiply.setVisibility(View.INVISIBLE);
                        signal_periodSpine.setVisibility(View.INVISIBLE);
                        externalMultiplySpine.setVisibility(View.INVISIBLE);
                        break;
                    case "Coded":
                        signal_period.setVisibility(View.VISIBLE);
                        externalMultiply.setVisibility(View.VISIBLE);
                        signal_periodSpine.setVisibility(View.VISIBLE);
                        externalMultiplySpine.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        return view;
    }
    public void init()
    {
        ref_mark=(TextView) view.findViewById(R.id.ref_mark);
        useroffset=(TextView) view.findViewById(R.id.useroffset);
        userOffset_value=(TextView) view.findViewById(R.id.userOffset_value);
        homeOnStartUp=(TextView) view.findViewById(R.id.homeOnStartUp);
        ref_type=(TextView) view.findViewById(R.id.ref_type);
        signal_period=(TextView) view.findViewById(R.id.signal_period);
        externalMultiply=(TextView) view.findViewById(R.id.externalMultiply);
        homeOnStartUpSpine=(Spinner)view.findViewById(R.id.homeOnStartUpSpine);
        ref_typeSpine=(Spinner)view.findViewById(R.id.ref_typeSpine);
        signal_periodSpine=(Spinner)view.findViewById(R.id.signal_periodSpine);
        externalMultiplySpine=(Spinner)view.findViewById(R.id.externalMultiplySpine);
        String[] homeOnstartup = getResources().getStringArray(R.array.YesorNo);
        String[] type = getResources().getStringArray(R.array.type);
        String[] signalp = getResources().getStringArray(R.array.signalp);
        String[] externalm = getResources().getStringArray(R.array.SIN_multiply);
        ArrayAdapter<String> homeadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, homeOnstartup);
        ArrayAdapter<String> typeadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, type);
        ArrayAdapter<String> signaladapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, signalp);
        ArrayAdapter<String> externaladapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, externalm);
        homeOnStartUpSpine.setAdapter(homeadapter);
        ref_typeSpine.setAdapter(typeadapter);
        signal_periodSpine.setAdapter(signaladapter);
        externalMultiplySpine.setAdapter(externaladapter);
    }
}
