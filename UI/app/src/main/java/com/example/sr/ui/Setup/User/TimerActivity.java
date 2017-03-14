package com.example.sr.ui.Setup.User;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sr.ui.R;

public class TimerActivity extends Activity {

    private Button on_off;
    private Button reset;
    private Button submit;
    private Button back;
    private TextView time;
    private EditText time_con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        on_off=(Button)findViewById(R.id.ON_OFF);
        reset=(Button)findViewById(R.id.reset);
        back=(Button)findViewById(R.id.timer_back);
        submit=(Button)findViewById(R.id.submit);
        time=(TextView)findViewById(R.id.Timer_name);
        time_con=(EditText)findViewById(R.id.timer_con);
        on_off.setOnClickListener(new envent());
        reset.setOnClickListener(new envent());
        back.setOnClickListener(new envent());
        submit.setOnClickListener(new envent());
    }
    class envent implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.ON_OFF:
                    break;
                case R.id.reset:
                    break;
                case R.id.timer_back:
                    TimerActivity.this.finish();
                    break;
                case R.id.submit:
                    break;
            }
        }
    }
}
