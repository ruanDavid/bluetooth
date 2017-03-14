package com.example.sr.ui.fragment.alarms;

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
 * Created by Sr on 2017/3/2.
 */

public class alarmsx extends Fragment {
    private View view;
    private TextView alarms_name;
    private TextView vppAlarms;
    private TextView feedbackAlarms;
    private TextView over_speedAlarms;
    private TextView travelLimits;
    private TextView lowerLimits;
    private TextView upperLimits;
    private Spinner vppAlarmsSpine;
    private Spinner feedbackAlarmsSpine;
    private Spinner over_speedAlarmsSpine;
    private Spinner travelLimitsSpine;
    private EditText lowerLimitsEdit;
    private TextView lowerLimitsMM;
    private EditText upperLimitsEdit;
    private TextView upperLimitsMM;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.alarmsx,container,false);
        init();
        return view;
    }
    public void init()
    {
        alarms_name=(TextView)view.findViewById(R.id.alarms_name);
        vppAlarms=(TextView)view.findViewById(R.id.vppAlarms);
        feedbackAlarms=(TextView)view.findViewById(R.id.feedbackAlarms);
        over_speedAlarms=(TextView)view.findViewById(R.id.over_speedAlarms);
        travelLimits=(TextView)view.findViewById(R.id.travelLimits);
        lowerLimits=(TextView)view.findViewById(R.id.lowerLimits);
        upperLimits=(TextView)view.findViewById(R.id.upperLimits);
        lowerLimitsMM=(TextView)view.findViewById(R.id.lowerLimitsMM);
        upperLimitsMM=(TextView)view.findViewById(R.id.upperLimitsMM);
        lowerLimitsEdit=(EditText)view.findViewById(R.id.lowerLimitsEdit);
        upperLimitsEdit=(EditText)view.findViewById(R.id.upperLimitsEdit);
        vppAlarmsSpine=(Spinner)view.findViewById(R.id.vppAlarmsSpine);
        feedbackAlarmsSpine=(Spinner)view.findViewById(R.id.feedbackAlarmsSpine);
        over_speedAlarmsSpine=(Spinner)view.findViewById(R.id.over_speedAlarmsSpine);
        travelLimitsSpine=(Spinner)view.findViewById(R.id.travelLimitsSpine);
        String[] vpp_alarm = getResources().getStringArray(R.array.YesorNo);
        String[] feedback_alarm = getResources().getStringArray(R.array.feedbackAlarm);
        String[] overspeed_alarm = getResources().getStringArray(R.array.YesorNo);
        String[] travel_limits = getResources().getStringArray(R.array.YesorNo);
        ArrayAdapter<String> vppadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, vpp_alarm);
        ArrayAdapter<String> feedbackadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, feedback_alarm);
        ArrayAdapter<String> overspeedadapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, overspeed_alarm);
        ArrayAdapter<String> traveladapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, travel_limits);
        vppadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feedbackadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        overspeedadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        traveladapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vppAlarmsSpine.setAdapter(vppadapter);
        feedbackAlarmsSpine.setAdapter(feedbackadapter);
        over_speedAlarmsSpine.setAdapter(overspeedadapter);
        travelLimitsSpine.setAdapter(traveladapter);
    }
}
