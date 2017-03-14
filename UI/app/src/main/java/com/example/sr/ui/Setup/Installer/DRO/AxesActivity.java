package com.example.sr.ui.Setup.Installer.DRO;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sr.ui.R;
import com.example.sr.ui.fragment.axes.fragmentX;
import com.example.sr.ui.fragment.axes.fragmentXY;
import com.example.sr.ui.fragment.axes.fragmentXYZ;
import com.example.sr.ui.fragment.axes.fragmentXYZC;
import com.example.sr.ui.fragment.axes.fragmentxZ1;
import com.example.sr.ui.fragment.axes.fragmentxZ1Z2;
import com.example.sr.ui.fragment.axes.fragmentxZ1Z2c;
import com.example.sr.ui.fragment.axes.fragmentxz_x;

public class AxesActivity extends Activity {

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
        setContentView(R.layout.activity_axes);
        init();
        fragmentManager= getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        if ("Milling".equals(DROActivity.machineType))
        {
            switch (DROActivity.controlNumberOfAxes)
            {
                case 1:
                    fragmentTransaction.add(R.id.button_layout,fragmentx);
                    fragmentTransaction.commit();
                    break;
                case 2:
                    fragmentTransaction.add(R.id.button_layout,fragmentxy);
                    fragmentTransaction.commit();
                    break;
                case 3:
                    fragmentTransaction.add(R.id.button_layout,fragmentxyz);
                    fragmentTransaction.commit();
                    break;
                case 4:
                    fragmentTransaction.add(R.id.button_layout,fragmentxyzc);
                    fragmentTransaction.commit();
                    break;
            }
        }else if ("Lathe".equals(DROActivity.machineType))
        {
            switch (DROActivity.controlNumberOfAxes)
            {
                case 1:
                    fragmentTransaction.add(R.id.button_layout,fragmentxz);
                    fragmentTransaction.commit();
                    break;
                case 2:
                    fragmentTransaction.add(R.id.button_layout,fragmentxz1);
                    fragmentTransaction.commit();
                    break;
                case 3:
                    fragmentTransaction.add(R.id.button_layout,fragmentxz1z2);
                    fragmentTransaction.commit();
                    break;
                case 4:
                    fragmentTransaction.add(R.id.button_layout,fragmentxz1z2c);
                    fragmentTransaction.commit();
                    break;
            }
        }
    }
    public void  init()
    {
        loding=(TextView)findViewById(R.id.loding);
        fragmentx=new fragmentX();
        fragmentxy=new fragmentXY();
        fragmentxyz=new fragmentXYZ();
        fragmentxyzc=new fragmentXYZC();
        fragmentxz=new fragmentxz_x();
        fragmentxz1=new fragmentxZ1();
        fragmentxz1z2=new fragmentxZ1Z2();
        fragmentxz1z2c=new fragmentxZ1Z2c();

    }

}
