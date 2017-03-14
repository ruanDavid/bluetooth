package com.example.sr.ui.Setup.User;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import com.example.sr.ui.R;

public class UserActivity extends Activity {
    private Button back;
    private Button language;
    private Button Timer;
    private Button key_tone;
    private Button back_light;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Timer=(Button)findViewById(R.id.User_timer);
        language=(Button)findViewById(R.id.language);
        back=(Button)findViewById(R.id.user_back);
        key_tone=(Button)findViewById(R.id.key_tone);
        back_light=(Button)findViewById(R.id.back_light);
        Timer.setOnClickListener(new envent());
        language.setOnClickListener(new envent());
        back.setOnClickListener(new envent());
        back_light.setOnClickListener(new envent());
        key_tone.setOnClickListener(new envent());
    }
    class envent implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.user_back:
                    UserActivity.this.finish();
                    break;
                case R.id.User_timer:
                    Intent intent =new Intent(UserActivity.this,TimerActivity.class);
                    startActivity(intent);
                    break;
                case R.id.back_light:
                    break;
                case R.id.key_tone:
                    PopupMenu popupMenu = new PopupMenu(UserActivity.this, view);
                    popupMenu.getMenuInflater().inflate(R.menu.key_tone,popupMenu.getMenu());
                    //popupMenu.setOnMenuItemClickListener(onSetupMenuItemClickListener);
                    popupMenu.show();
                    break;
                case R.id.language:
                    PopupMenu popupMenu1 = new PopupMenu(UserActivity.this, view);
                    popupMenu1.getMenuInflater().inflate(R.menu.language,popupMenu1.getMenu());
                    //popupMenu1.setOnMenuItemClickListener(onSetupMenuItemClickListener);
                    popupMenu1.show();
                    break;
            }
        }
    }
}
