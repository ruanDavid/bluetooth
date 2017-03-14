package com.example.sr.ui.Setup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sr.ui.Setup.Installer.InstallerActivity;
import com.example.sr.ui.R;
import com.example.sr.ui.Setup.User.UserActivity;

public class SetUp extends Activity {

    private Button User;
    private Button Installer;
    private Button Test;
    private Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up);
        User=(Button)findViewById(R.id.user);
        Installer=(Button)findViewById(R.id.installer);
        Back=(Button)findViewById(R.id.back);
        Test=(Button)findViewById(R.id.test);
        User.setOnClickListener(new envent());
        Installer.setOnClickListener(new envent());
        Test.setOnClickListener(new envent());
        Back.setOnClickListener(new envent());
    }
    class envent implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.user:
                    Intent intent=new Intent(SetUp.this,UserActivity.class);
                    startActivity(intent);
                    break;
                case R.id.installer:
                    Intent intent1=new Intent(SetUp.this,InstallerActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.test:
                    break;
                case R.id.back:
                    SetUp.this.finish();
                    break;
            }
        }
    }
}

