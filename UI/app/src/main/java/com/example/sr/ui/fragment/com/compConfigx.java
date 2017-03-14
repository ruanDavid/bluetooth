package com.example.sr.ui.fragment.com;

import android.app.Fragment;
import android.app.FragmentTransaction;
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

public class compConfigx extends Fragment {
    private View view;
    private TextView comp_type;
    private TextView compensation;
    private TextView mmORm;
    private TextView mm_value;
    private Spinner compensationSpine;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.refconfig,container,false);
        init();
        compensationSpine.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String data=(String)compensationSpine.getItemAtPosition(i);
                switch (data)
                {
                    case "None":
                        mmORm.setVisibility(View.INVISIBLE);
                        mm_value.setVisibility(View.INVISIBLE);
                        break;
                    case "Linear":
                        mmORm.setVisibility(View.VISIBLE);
                        mm_value.setVisibility(View.VISIBLE);
                        break;
                    case "Coded":
                        mmORm.setVisibility(View.INVISIBLE);
                        mm_value.setVisibility(View.INVISIBLE);
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
        comp_type=(TextView) view.findViewById(R.id.comp_type);
        compensation=(TextView) view.findViewById(R.id.compensation);
        mmORm=(TextView) view.findViewById(R.id.mmORm);
        mm_value=(TextView) view.findViewById(R.id.mm_value);
        compensationSpine=(Spinner)view.findViewById(R.id.compensationSpine);
        String[] compensation = getResources().getStringArray(R.array.compensation);
        ArrayAdapter<String> compadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, compensation);
        compensationSpine.setAdapter(compadapter);
    }
}
