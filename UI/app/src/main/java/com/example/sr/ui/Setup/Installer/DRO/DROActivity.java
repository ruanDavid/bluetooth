package com.example.sr.ui.Setup.Installer.DRO;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.sr.ui.R;

public class DROActivity extends Activity {

    private TextView Ref;
    private TextView Tool;
    private TextView setOrClear;
    private TextView INCHorMM;
    private TextView INCorABS;
    private Chronometer timer;
    private TextView mechineType;
    private TextView numberOfAxes;
    private TextView defaultUnits;
    private TextView userToggle;
    private TextView showZsOnly;
    private TextView probe;
    private Spinner mechineTypeSpine;
    private Spinner numberOfAxesSpine;
    private Spinner defaultUnitsSpine;
    private Spinner userToggleSpine;
    private Spinner showZsOnlySpine;
    private Spinner probeSpine;
    private Button help;
    private Button axes;
    private Button alarms;
    private Button back;
    public static int controlNumberOfAxes;
    public static String machineType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dro);
        init();
        mechineTypeSpine.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String data=(String)mechineTypeSpine.getItemAtPosition(i);
                machineType=(String) mechineTypeSpine.getSelectedItem();
                switch (data)
                {
                    case "Milling":
                        probeSpine.setVisibility(View.VISIBLE);
                        showZsOnlySpine.setVisibility(View.INVISIBLE);
                        break;
                    case "Lathe":
                        probeSpine.setVisibility(View.INVISIBLE);
                        showZsOnlySpine.setVisibility(View.VISIBLE);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        numberOfAxesSpine.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                controlNumberOfAxes=Integer.parseInt(String.valueOf(numberOfAxesSpine.getSelectedItem()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        help.setOnClickListener(new envent());
        axes.setOnClickListener(new envent());
        alarms.setOnClickListener(new envent());
        back.setOnClickListener(new envent());
    }


    private void init() {
        Ref = (TextView) findViewById(R.id.Ref);
        Tool = (TextView) findViewById(R.id.Tool);
        setOrClear = (TextView) findViewById(R.id.setOrClear);
        INCorABS = (TextView) findViewById(R.id.INCorABS);
        INCHorMM = (TextView) findViewById(R.id.INCHorMM);
        timer = (Chronometer) findViewById(R.id.timer);
        mechineType = (TextView) findViewById(R.id.mechineType);
        numberOfAxes = (TextView) findViewById(R.id.numberOfAxes);
        defaultUnits = (TextView) findViewById(R.id.defaultUnits);
        userToggle = (TextView) findViewById(R.id.userToggle);
        showZsOnly = (TextView) findViewById(R.id.showZsOnly);
        probe = (TextView) findViewById(R.id.probe);
        help=(Button)findViewById(R.id.droHelp);
        axes=(Button)findViewById(R.id.axes);
        alarms=(Button)findViewById(R.id.alarms);
        back=(Button)findViewById(R.id.droBack);
        mechineTypeSpine = (Spinner) findViewById(R.id.mechineTypeSpine);
        numberOfAxesSpine = (Spinner) findViewById(R.id.numberOfAxesSpine);
        defaultUnitsSpine = (Spinner) findViewById(R.id.defaultUnitsSpine);
        userToggleSpine = (Spinner) findViewById(R.id.userToggleSpine);
        showZsOnlySpine = (Spinner) findViewById(R.id.showZsOnlySpine);
        probeSpine = (Spinner) findViewById(R.id.probeSpine);
        String[] mechinetype = getResources().getStringArray(R.array.mechineType);
        String[] numberofaxes = getResources().getStringArray(R.array.numberOfAxes);
        String[] defaultunit = getResources().getStringArray(R.array.defaultUnits);
        String[] usertoggle = getResources().getStringArray(R.array.YesorNo);
        String[] probe = getResources().getStringArray(R.array.probe);
        String[] showzsonly = getResources().getStringArray(R.array.YesorNo);
        ArrayAdapter<String> mechineadapter = new ArrayAdapter<String>(DROActivity.this, android.R.layout.simple_spinner_item, mechinetype);
        ArrayAdapter<String> numberadapter = new ArrayAdapter<String>(DROActivity.this, android.R.layout.simple_spinner_item, numberofaxes);
        ArrayAdapter<String> unitadapter = new ArrayAdapter<String>(DROActivity.this, android.R.layout.simple_spinner_item, defaultunit);
        ArrayAdapter<String> usertoggleadapter = new ArrayAdapter<String>(DROActivity.this, android.R.layout.simple_spinner_item, usertoggle);
        ArrayAdapter<String> probeadapter = new ArrayAdapter<String>(DROActivity.this, android.R.layout.simple_spinner_item, probe);
        ArrayAdapter<String> showadapter = new ArrayAdapter<String>(DROActivity.this, android.R.layout.simple_spinner_item, showzsonly);
        mechineadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        numberadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        usertoggleadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        probeadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        showadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mechineTypeSpine.setAdapter(mechineadapter);
        numberOfAxesSpine.setAdapter(numberadapter);
        defaultUnitsSpine.setAdapter(unitadapter);
        userToggleSpine.setAdapter(usertoggleadapter);
        probeSpine.setAdapter(probeadapter);
        showZsOnlySpine.setAdapter(showadapter);
    }

    class envent implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.droHelp:
                    break;
                case R.id.axes:
                    Intent intent=new Intent(DROActivity.this,AxesActivity.class);
                    startActivity(intent);
                    break;
                case R.id.alarms:
                    Intent intent1=new Intent(DROActivity.this,alarmsActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.droBack:
                    DROActivity.this.finish();
                    break;
            }
        }
    }
}
