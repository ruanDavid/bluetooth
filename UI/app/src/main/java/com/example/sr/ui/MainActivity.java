package com.example.sr.ui;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.FeatureGroupInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.sax.TextElementListener;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.sr.ui.Setup.HomeSearch;
import com.example.sr.ui.Setup.Installer.DRO.DROActivity;
import com.example.sr.ui.Setup.SetUp;
import com.example.sr.ui.fragment.mainfrag.LatherX;
import com.example.sr.ui.fragment.mainfrag.LatherXZ1;
import com.example.sr.ui.fragment.mainfrag.LatherXZ1Z2;
import com.example.sr.ui.fragment.mainfrag.LatherXZ1Z2C;
import com.example.sr.ui.fragment.mainfrag.lather_button;
import com.example.sr.ui.fragment.mainfrag.millingX;
import com.example.sr.ui.fragment.mainfrag.millingXY;
import com.example.sr.ui.fragment.mainfrag.millingXYZ;
import com.example.sr.ui.fragment.mainfrag.millingXYZC;
import com.example.sr.ui.fragment.mainfrag.milling_button;


public class MainActivity extends Activity {
    private TextView main_data_loding;
    private TextView main_button_loding;
    private Fragment milling_button;
    private Fragment millingX;
    private Fragment millingXY;
    private Fragment millingXYZ;
    private Fragment millingXYZC;
    private Fragment lather_button;
    private Fragment LatherX;
    private Fragment LatherXZ1;
    private Fragment LatherXZ1Z2;
    private Fragment LatherXZ1Z2C;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private FragmentTransaction fragmentTransaction1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        fragmentManager=getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction1=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_data_layout,millingXYZC);
        fragmentTransaction.replace(R.id.main_button_layout,milling_button);
        fragmentTransaction.commit();
        if ("Milling".equals(DROActivity.machineType))
        {
            switch (DROActivity.controlNumberOfAxes)
            {
                case 1:
                    fragmentTransaction1.replace(R.id.main_data_layout,millingX);
                    fragmentTransaction1.commit();
                    break;
                case 2:
                    fragmentTransaction1.replace(R.id.main_data_layout,millingXY);
                    fragmentTransaction1.commit();
                    break;
                case 3:
                    fragmentTransaction1.replace(R.id.main_data_layout,millingXYZ);
                    fragmentTransaction1.commit();
                    break;
                case 4:
                    fragmentTransaction1.replace(R.id.main_data_layout,millingXYZC);
                    fragmentTransaction1.commit();
                    break;
            }
        }else if ("Lathe".equals(DROActivity.machineType))
        {
            switch (DROActivity.controlNumberOfAxes)
            {
                case 1:
                    fragmentTransaction1.replace(R.id.main_data_layout,LatherX);
                    fragmentTransaction1.replace(R.id.main_button_layout,lather_button);
                    fragmentTransaction1.commit();
                    break;
                case 2:
                    fragmentTransaction1.replace(R.id.main_data_layout,LatherXZ1);
                    fragmentTransaction1.replace(R.id.main_button_layout,lather_button);
                    fragmentTransaction1.commit();
                    break;
                case 3:
                    fragmentTransaction1.replace(R.id.main_data_layout,LatherXZ1Z2);
                    fragmentTransaction1.replace(R.id.main_button_layout,lather_button);
                    fragmentTransaction1.commit();
                    break;
                case 4:
                    fragmentTransaction1.replace(R.id.main_data_layout,LatherXZ1Z2C);
                    fragmentTransaction1.replace(R.id.main_button_layout,lather_button);
                    fragmentTransaction1.commit();
                    break;
            }
        }
    }
    public void init()
    {
        main_button_loding=(TextView)findViewById(R.id.main_button_loding);
        main_data_loding=(TextView)findViewById(R.id.main_data_loding);
        milling_button=new milling_button();
        millingX=new millingX();
        millingXY=new millingXY();
        millingXYZ=new millingXYZ();
        millingXYZC=new millingXYZC();
        lather_button=new lather_button();
        LatherX=new LatherX();
        LatherXZ1=new LatherXZ1();
        LatherXZ1Z2=new LatherXZ1Z2();
        LatherXZ1Z2C=new LatherXZ1Z2C();
    }
}

