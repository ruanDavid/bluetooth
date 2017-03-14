package com.example.sr.ui.Setup.Installer.comp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sr.ui.R;
import com.example.sr.ui.Setup.Installer.DRO.DROActivity;
import com.example.sr.ui.fragment.com.compFragmentX;
import com.example.sr.ui.fragment.com.compFragmentXY;
import com.example.sr.ui.fragment.com.compFragmentXYZ;
import com.example.sr.ui.fragment.com.compFragmentXYZC;
import com.example.sr.ui.fragment.com.compFragmentzX;
import com.example.sr.ui.fragment.com.compFragmentzXZ1;
import com.example.sr.ui.fragment.com.compFragmentzXZ1Z2;
import com.example.sr.ui.fragment.com.compFragmentzXZ1Z2C;

public class compActivity extends Activity {
    private TextView comploding;
    private Button comp_help;
    private Button comp_edit;
    private Button comp_back;
    private Fragment compFragmentx;
    private Fragment compFragmentxy;
    private Fragment compFragmentxyz;
    private Fragment compFragmentxyzc;
    private Fragment compFragmentzx;
    private Fragment compFragmentzxz1;
    private Fragment compFragmentzxz1z2;
    private Fragment compFragmentzxz1z2c;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp);
        init();
        fragmentManager= getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        if ("Milling".equals(DROActivity.machineType))
        {
            switch (DROActivity.controlNumberOfAxes)
            {
                case 1:
                    fragmentTransaction.add(R.id.comp_button_layout,compFragmentx);
                    fragmentTransaction.commit();
                    break;
                case 2:
                    fragmentTransaction.add(R.id.comp_button_layout,compFragmentxy);
                    fragmentTransaction.commit();
                    break;
                case 3:
                    fragmentTransaction.add(R.id.comp_button_layout,compFragmentxyz);
                    fragmentTransaction.commit();
                    break;
                case 4:
                    fragmentTransaction.add(R.id.comp_button_layout,compFragmentxyzc);
                    fragmentTransaction.commit();
                    break;
            }
        }else if ("Lathe".equals(DROActivity.machineType))
        {
            switch (DROActivity.controlNumberOfAxes)
            {
                case 1:
                    fragmentTransaction.add(R.id.comp_button_layout,compFragmentzx);
                    fragmentTransaction.commit();
                    break;
                case 2:
                    fragmentTransaction.add(R.id.comp_button_layout,compFragmentzxz1);
                    fragmentTransaction.commit();
                    break;
                case 3:
                    fragmentTransaction.add(R.id.comp_button_layout,compFragmentzxz1z2);
                    fragmentTransaction.commit();
                    break;
                case 4:
                    fragmentTransaction.add(R.id.comp_button_layout,compFragmentzxz1z2c);
                    fragmentTransaction.commit();
                    break;
            }
        }
        comp_help.setOnClickListener(new click());
        comp_edit.setOnClickListener(new click());
        comp_back.setOnClickListener(new click());

    }
    public void init()
    {
        comploding=(TextView)findViewById(R.id.comploding);
        comp_back=(Button)findViewById(R.id.comp_back);
        comp_edit=(Button)findViewById(R.id.comp_edit);
        comp_help=(Button)findViewById(R.id.comp_help);
        compFragmentx=new compFragmentX();
        compFragmentxy=new compFragmentXY();
        compFragmentxyz=new compFragmentXYZ();
        compFragmentxyzc=new compFragmentXYZC();
        compFragmentzx=new compFragmentzX();
        compFragmentzxz1=new compFragmentzXZ1();
        compFragmentzxz1z2=new compFragmentzXZ1Z2();
        compFragmentzxz1z2c=new compFragmentzXZ1Z2C();
    }
    class click implements View.OnClickListener
    {
        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.comp_back:
                    break;
                case R.id.comp_help:
                    break;
                case R.id.comp_edit:
                    break;
            }
        }
    }
}
