package com.example.sr.ui.Setup.Installer.feedback;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sr.ui.R;
import com.example.sr.ui.Setup.Installer.DRO.DROActivity;
import com.example.sr.ui.Setup.Installer.InstallerActivity;
import com.example.sr.ui.fragment.fed.fedFragmentX;
import com.example.sr.ui.fragment.fed.fedFragmentXY;
import com.example.sr.ui.fragment.fed.fedFragmentXYZ;
import com.example.sr.ui.fragment.fed.fedFragmentXYZC;
import com.example.sr.ui.fragment.fed.fedFragmentzX;
import com.example.sr.ui.fragment.fed.fedFragmentzXZ1;
import com.example.sr.ui.fragment.fed.fedFragmentzXZ1Z2;
import com.example.sr.ui.fragment.fed.fedFragmentzXZ1Z2c;

public class feedbackActivity extends Activity {
    private TextView fedloding;
    private Button fedHelp;
    private Button fedRef;
    private Button fedBack;
    private Fragment fedFragmentx;
    private Fragment fedFragmentxy;
    private Fragment fedFragmentxyz;
    private Fragment fedFragmentxyzc;
    private Fragment fedFragmentzx;
    private Fragment fedFragmentzxz1;
    private Fragment fedFragmentzxz1z2;
    private Fragment getFedFragmentzxz1z2c;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        init();
        fragmentManager= getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        if ("Milling".equals(DROActivity.machineType))
        {
            switch (DROActivity.controlNumberOfAxes)
            {
                case 1:
                    fragmentTransaction.add(R.id.feedback_button_layout,fedFragmentx);
                    fragmentTransaction.commit();
                    break;
                case 2:
                    fragmentTransaction.add(R.id.feedback_button_layout,fedFragmentxy);
                    fragmentTransaction.commit();
                    break;
                case 3:
                    fragmentTransaction.add(R.id.feedback_button_layout,fedFragmentxyz);
                    fragmentTransaction.commit();
                    break;
                case 4:
                    fragmentTransaction.add(R.id.feedback_button_layout,fedFragmentxyzc);
                    fragmentTransaction.commit();
                    break;
            }
        }else if ("Lathe".equals(DROActivity.machineType))
        {
            switch (DROActivity.controlNumberOfAxes)
            {
                case 1:
                    fragmentTransaction.add(R.id.feedback_button_layout,fedFragmentzx);
                    fragmentTransaction.commit();
                    break;
                case 2:
                    fragmentTransaction.add(R.id.feedback_button_layout,fedFragmentzxz1);
                    fragmentTransaction.commit();
                    break;
                case 3:
                    fragmentTransaction.add(R.id.feedback_button_layout,fedFragmentzxz1z2);
                    fragmentTransaction.commit();
                    break;
                case 4:
                    fragmentTransaction.add(R.id.feedback_button_layout,getFedFragmentzxz1z2c);
                    fragmentTransaction.commit();
                    break;
            }
        }
        fedBack.setOnClickListener(new click());
        fedHelp.setOnClickListener(new click());
        fedRef.setOnClickListener(new click());

    }
    public void init()
    {
        fedloding=(TextView)findViewById(R.id.fedloding);
        fedBack=(Button)findViewById(R.id.fed_back);
        fedHelp=(Button)findViewById(R.id.fed_help);
        fedRef=(Button)findViewById(R.id.fed_ref);
        fedFragmentx=new fedFragmentX();
        fedFragmentxy=new fedFragmentXY();
        fedFragmentxyz=new fedFragmentXYZ();
        fedFragmentxyzc=new fedFragmentXYZC();
        fedFragmentzx=new fedFragmentzX();
        fedFragmentzxz1=new fedFragmentzXZ1();
        fedFragmentzxz1z2=new fedFragmentzXZ1Z2();
        getFedFragmentzxz1z2c=new fedFragmentzXZ1Z2c();

    }
    class click implements View.OnClickListener
    {
        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.fed_help:
                    break;
                case R.id.fed_ref:
                    Intent intent=new Intent(feedbackActivity.this,refActivity.class);
                    startActivity(intent);
                    break;
                case R.id.fed_back:
                    break;
            }
        }
    }
}
