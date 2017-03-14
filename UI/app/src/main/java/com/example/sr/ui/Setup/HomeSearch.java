package com.example.sr.ui.Setup;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import com.example.sr.ui.R;

public class HomeSearch extends Activity {

    private Button help;
    private Button home_search;
    private Button back;
    private TextView Ref;
    private TextView Tool;
    private TextView setOrClear;
    private TextView INCHorMM;
    private TextView INCorABS;
    private Chronometer timer;
    private TextView X;
    private TextView Y;
    private TextView Z;
    private TextView C;
    private TextView X_VALUE;
    private TextView Y_VALUE;
    private TextView Z_VALUE;
    private TextView C_VALUE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_search);
        back=(Button)findViewById(R.id.homeSearch_back);
        home_search=(Button)findViewById(R.id.homeSearch_homesearch);
        help=(Button)findViewById(R.id.homeSearch_help);
        Ref=(TextView) findViewById(R.id.Ref);
        Tool=(TextView) findViewById(R.id.Tool);
        setOrClear=(TextView) findViewById(R.id.setOrClear);
        INCorABS=(TextView) findViewById(R.id.INCorABS);
        INCHorMM=(TextView) findViewById(R.id.INCHorMM);
        timer=(Chronometer)findViewById(R.id.timer);
        X=(TextView) findViewById(R.id.X);
        X_VALUE=(TextView) findViewById(R.id.X_VALUE);
        Y=(TextView) findViewById(R.id.Y);
        Y_VALUE=(TextView) findViewById(R.id.Y_VALUE);
        Z=(TextView) findViewById(R.id.Z);
        Z_VALUE=(TextView) findViewById(R.id.Z_VALUE);
        C=(TextView) findViewById(R.id.C);
        C_VALUE=(TextView)findViewById(R.id.C_VALUE);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeSearch.this.finish();
            }
        });
    }
}
