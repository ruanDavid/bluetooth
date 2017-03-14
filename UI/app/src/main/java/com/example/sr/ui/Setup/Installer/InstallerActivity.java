package com.example.sr.ui.Setup.Installer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sr.ui.R;
import com.example.sr.ui.Setup.Installer.DRO.DROActivity;

public class InstallerActivity extends Activity {
    private Button DRO;
    private Button feedback;
    private Button comp;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_installer);
        DRO=(Button)findViewById(R.id.DRO);
        feedback=(Button)findViewById(R.id.feedback);
        comp=(Button)findViewById(R.id.comp);
        back=(Button)findViewById(R.id.installer_back);
        DRO.setOnClickListener(new envent());
        feedback.setOnClickListener(new envent());
        comp.setOnClickListener(new envent());
        back.setOnClickListener(new envent());
    }
    class envent implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.DRO:
                    Intent intent=new Intent(InstallerActivity.this,DROActivity.class);
                    startActivity(intent);
                    break;
                case R.id.feedback:
//                    Intent intent1=new Intent(SetUp.this,InstallerActivity.class);
//                    startActivity(intent1);
                    break;
                case R.id.comp:
                    break;
                case R.id.installer_back:
                    break;
            }
        }
    }
}
