package com.example.sr.ui.Setup.Installer.DRO;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sr.ui.R;
import com.example.sr.ui.fragment.alarms.alarmFragmentX;
import com.example.sr.ui.fragment.alarms.alarmFragmentXY;
import com.example.sr.ui.fragment.alarms.alarmFragmentXYZ;
import com.example.sr.ui.fragment.alarms.alarmFragmentXYZC;
import com.example.sr.ui.fragment.alarms.alarmFragmentZX;
import com.example.sr.ui.fragment.alarms.alarmFragmentZXZ1;
import com.example.sr.ui.fragment.alarms.alarmFragmentZXZ1Z2;
import com.example.sr.ui.fragment.alarms.alarmFragmentZXZ1Z2C;

public class alarmsActivity extends Activity {
    private TextView loding;
    private Fragment fragmentx;
    private Fragment fragmentxy;
    private Fragment fragmentxyz;
    private Fragment fragmentxyzc;
    private Fragment fragmentxz;
    private Fragment fragmentxz1;
    private Fragment fragmentxz1z2;
    private Fragment fragmentxz1z2c;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarms);
        init();
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        if ("Milling".equals(DROActivity.machineType)) {
            switch (DROActivity.controlNumberOfAxes) {
                case 1:
                    fragmentTransaction.add(R.id.alarms_button_layout, fragmentx);
                    fragmentTransaction.commit();
                    break;
                case 2:
                    fragmentTransaction.add(R.id.alarms_button_layout, fragmentxy);
                    fragmentTransaction.commit();
                    break;
                case 3:
                    fragmentTransaction.add(R.id.alarms_button_layout, fragmentxyz);
                    fragmentTransaction.commit();
                    break;
                case 4:
                    fragmentTransaction.add(R.id.alarms_button_layout, fragmentxyzc);
                    fragmentTransaction.commit();
                    break;
            }
        } else if ("Lathe".equals(DROActivity.machineType)) {
            switch (DROActivity.controlNumberOfAxes) {
                case 1:
                    fragmentTransaction.add(R.id.alarms_button_layout, fragmentxz);
                    fragmentTransaction.commit();
                    break;
                case 2:
                    fragmentTransaction.add(R.id.alarms_button_layout, fragmentxz1);
                    fragmentTransaction.commit();
                    break;
                case 3:
                    fragmentTransaction.add(R.id.alarms_button_layout, fragmentxz1z2);
                    fragmentTransaction.commit();
                    break;
                case 4:
                    fragmentTransaction.add(R.id.alarms_button_layout, fragmentxz1z2c);
                    fragmentTransaction.commit();
                    break;
            }
        }

    }

    public void init() {
        loding = (TextView) findViewById(R.id.alarmsLoding);
        fragmentx = new alarmFragmentX();
        fragmentxy = new alarmFragmentXY();
        fragmentxyz = new alarmFragmentXYZ();
        fragmentxyzc = new alarmFragmentXYZC();
        fragmentxz = new alarmFragmentZX();
        fragmentxz1 = new alarmFragmentZXZ1();
        fragmentxz1z2 = new alarmFragmentZXZ1Z2();
        fragmentxz1z2c = new alarmFragmentZXZ1Z2C();
    }
}
