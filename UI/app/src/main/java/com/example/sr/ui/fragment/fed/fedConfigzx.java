package com.example.sr.ui.fragment.fed;

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

public class fedConfigzx extends Fragment {
    private View view;
    private TextView fed_pro;
    private TextView axis_type;
    private TextView encoder_signals;
    private TextView resolution;
    private TextView pulses_turns;
    private TextView TTL_multiply;
    private TextView SIN_multiply;
    private TextView axis_type_value;
    private Spinner encoder_signalsSpine;
    private Spinner TTL_multiplySpine;
    private Spinner SIN_multiplySpine;
    private TextView resolution_text;
    private TextView pulses;
    private TextView turns;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fedconfigzx,container,false);
        init();
        encoder_signalsSpine.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String data=(String)encoder_signalsSpine.getItemAtPosition(i);
                switch (data)
                {
                    case "TTL":
                        TTL_multiply.setVisibility(View.INVISIBLE);
                        TTL_multiplySpine.setVisibility(View.INVISIBLE);
                        SIN_multiply.setVisibility(View.INVISIBLE);
                        SIN_multiplySpine.setVisibility(View.INVISIBLE);
                        break;
                    case "1 Vpp":
                        TTL_multiply.setVisibility(View.VISIBLE);
                        TTL_multiplySpine.setVisibility(View.VISIBLE);
                        SIN_multiply.setVisibility(View.VISIBLE);
                        SIN_multiplySpine.setVisibility(View.VISIBLE);
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
        fed_pro=(TextView) view.findViewById(R.id.fed_pro);
        axis_type=(TextView) view.findViewById(R.id.axis_type);
        encoder_signals=(TextView) view.findViewById(R.id.encoder_signals);
        resolution=(TextView) view.findViewById(R.id.resolution);
        pulses_turns=(TextView) view.findViewById(R.id.pulses_turns);
        resolution_text=(TextView) view.findViewById(R.id.resolution_text);
        pulses=(TextView) view.findViewById(R.id.pulses);
        turns=(TextView) view.findViewById(R.id.turns);
        TTL_multiply=(TextView) view.findViewById(R.id.TTL_multiply);
        SIN_multiply=(TextView) view.findViewById(R.id.SIN_multiply);
        axis_type_value=(TextView)view.findViewById(R.id.axis_type_value);
        encoder_signalsSpine=(Spinner)view.findViewById(R.id.encoder_signalsSpine);
        TTL_multiplySpine=(Spinner)view.findViewById(R.id.TTL_multiplySpine);
        SIN_multiplySpine=(Spinner)view.findViewById(R.id.SIN_multiplySpine);
        String[] encodersignal = getResources().getStringArray(R.array.encoderSignals);
        String[] ttlmutiply = getResources().getStringArray(R.array.TTL_multiply);
        String[] sinmultiply = getResources().getStringArray(R.array.SIN_multiply);
        ArrayAdapter<String> encoderadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, encodersignal);
        ArrayAdapter<String> ttladapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, ttlmutiply);
        ArrayAdapter<String> sinadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, sinmultiply);
        encoder_signalsSpine.setAdapter(encoderadapter);
        TTL_multiplySpine.setAdapter(ttladapter);
        SIN_multiplySpine.setAdapter(sinadapter);
    }
}
