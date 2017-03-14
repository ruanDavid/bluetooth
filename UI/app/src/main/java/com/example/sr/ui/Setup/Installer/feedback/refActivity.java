package com.example.sr.ui.Setup.Installer.feedback;

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
import com.example.sr.ui.fragment.ref.refFragmentX;
import com.example.sr.ui.fragment.ref.refFragmentXY;
import com.example.sr.ui.fragment.ref.refFragmentXYZ;
import com.example.sr.ui.fragment.ref.refFragmentXYZC;
import com.example.sr.ui.fragment.ref.refFragmentzX;
import com.example.sr.ui.fragment.ref.refFragmentzXZ1;
import com.example.sr.ui.fragment.ref.refFragmentzXZ1Z2;
import com.example.sr.ui.fragment.ref.refFragmentzXZ1Z2C;

public class refActivity extends Activity {
    private TextView refloding;
    private Button Ref_help;
    private Button Ref_back;
    private Fragment refFragmentx;
    private Fragment refFragmentxy;
    private Fragment refFragmentxyz;
    private Fragment refFragmentxyzc;
    private Fragment refFragmentzx;
    private Fragment refFragmentzxz1;
    private Fragment refFragmentzxz1z2;
    private Fragment refFragmentzxz1z2c;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ref);
        init();
        fragmentManager= getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        if ("Milling".equals(DROActivity.machineType))
        {
            switch (DROActivity.controlNumberOfAxes)
            {
                case 1:
                    fragmentTransaction.add(R.id.Ref_button_layout,refFragmentx);
                    fragmentTransaction.commit();
                    break;
                case 2:
                    fragmentTransaction.add(R.id.Ref_button_layout,refFragmentxy);
                    fragmentTransaction.commit();
                    break;
                case 3:
                    fragmentTransaction.add(R.id.Ref_button_layout,refFragmentxyz);
                    fragmentTransaction.commit();
                    break;
                case 4:
                    fragmentTransaction.add(R.id.Ref_button_layout,refFragmentxyzc);
                    fragmentTransaction.commit();
                    break;
            }
        }else if ("Lathe".equals(DROActivity.machineType))
        {
            switch (DROActivity.controlNumberOfAxes)
            {
                case 1:
                    fragmentTransaction.add(R.id.Ref_button_layout,refFragmentzx);
                    fragmentTransaction.commit();
                    break;
                case 2:
                    fragmentTransaction.add(R.id.Ref_button_layout,refFragmentzxz1);
                    fragmentTransaction.commit();
                    break;
                case 3:
                    fragmentTransaction.add(R.id.Ref_button_layout,refFragmentzxz1z2);
                    fragmentTransaction.commit();
                    break;
                case 4:
                    fragmentTransaction.add(R.id.Ref_button_layout,refFragmentzxz1z2c);
                    fragmentTransaction.commit();
                    break;
            }
        }
        Ref_help.setOnClickListener(new click());
        Ref_back.setOnClickListener(new click());
    }
    public void init()
    {
        refloding=(TextView)findViewById(R.id.Refloding);
        Ref_back=(Button)findViewById(R.id.Ref_back);
        Ref_help=(Button)findViewById(R.id.Ref_help);
        refFragmentx=new refFragmentX();
        refFragmentxy=new refFragmentXY();
        refFragmentxyz=new refFragmentXYZ();
        refFragmentxyzc=new refFragmentXYZC();
        refFragmentzx=new refFragmentzX();
        refFragmentzxz1=new refFragmentzXZ1();
        refFragmentzxz1z2=new refFragmentzXZ1Z2();
        refFragmentzxz1z2c=new refFragmentzXZ1Z2C();
    }
    class click implements View.OnClickListener
    {
        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.Ref_back:
                    break;
                case R.id.Ref_help:
                    break;
            }
        }
    }
}
