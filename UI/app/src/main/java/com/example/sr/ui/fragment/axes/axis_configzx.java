package com.example.sr.ui.fragment.axes;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.sr.ui.R;

/**
 * Created by Sr on 2017/3/7.
 */

public class axis_configzx extends Fragment{
    private Spinner combineAxesSpine;
    private Spinner reverseCountingspine;
    private Spinner showFeedrateSpine;
    private Spinner hideAxisSpine;
    private TextView config_name;
    private TextView combineAxes;
    private TextView displayResolution;
    private TextView reverseCounting;
    private TextView showFeedrate;
    private TextView hideAxis;
    private TextView displayResolutionMM;
    private EditText displayResolutionEdit;
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.axis_configx,container,false);
        init();
        return view;
    }
    public void init() {
        combineAxesSpine = (Spinner) view.findViewById(R.id.combineAxesSpine);
        reverseCountingspine = (Spinner) view.findViewById(R.id.reverseCountingspine);
        showFeedrateSpine = (Spinner) view.findViewById(R.id.showFeedrateSpine);
        hideAxisSpine = (Spinner) view.findViewById(R.id.hideAxisSpine);
        config_name = (TextView) view.findViewById(R.id.config_name);
        combineAxes = (TextView) view.findViewById(R.id.combineAxes);
        displayResolution = (TextView) view.findViewById(R.id.displayResolution);
        displayResolutionMM = (TextView) view.findViewById(R.id.displayResolutionMM);
        reverseCounting = (TextView) view.findViewById(R.id.reverseCounting);
        showFeedrate = (TextView) view.findViewById(R.id.showFeedrate);
        hideAxis = (TextView) view.findViewById(R.id.hideAxis);
        displayResolutionEdit = (EditText) view.findViewById(R.id.displayResolutionEdit);
        String[] combine_axes = getResources().getStringArray(R.array.combineAxes);
        String[] reverse_counting = getResources().getStringArray(R.array.YesorNo);
        String[] show_feedrate = getResources().getStringArray(R.array.YesorNo);
        String[] hide_axis = getResources().getStringArray(R.array.YesorNo);
        ArrayAdapter<String> combineadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, combine_axes);
        ArrayAdapter<String> reverseadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, reverse_counting);
        ArrayAdapter<String> showadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, show_feedrate);
        ArrayAdapter<String> hideadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, hide_axis);
        combineadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        reverseadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        showadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hideadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combineAxesSpine.setAdapter(combineadapter);
        reverseCountingspine.setAdapter(reverseadapter);
        showFeedrateSpine.setAdapter(showadapter);
        hideAxisSpine.setAdapter(hideadapter);
    }
}
