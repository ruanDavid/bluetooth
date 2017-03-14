package com.example.sr.ui.fragment.mainfrag;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.sr.ui.R;
import com.example.sr.ui.Setup.HomeSearch;
import com.example.sr.ui.Setup.SetUp;

/**
 * Created by Sr on 2017/3/14.
 */

public class milling_button extends Fragment {
    private View view;
    private Button mil_Setup;
    private Button mil_Change;
    private Button mil_Display;
    private Button mil_Function;
    public static String SETORCLEAR="Set";
    public static String INCORABC="INC";
    public static String INCHORMM="MM";
    private TextView Ref;
    private TextView Tool;
    private TextView setOrClear;
    private TextView INCHorMM;
    private TextView INCorABS;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.milling_main_button,container,false);
        init();
        mil_Setup.setOnClickListener(new click());
        mil_Function.setOnClickListener(new click());
        mil_Display.setOnClickListener(new click());
        mil_Change.setOnClickListener(new click());
        return view;
    }
    public void init()
    {
        mil_Change=(Button)view.findViewById(R.id.mil_Change);
        mil_Display=(Button)view.findViewById(R.id.mil_Display);
        mil_Function=(Button)view.findViewById(R.id.mil_Function);
        mil_Setup=(Button)view.findViewById(R.id.mil_Setup);
        Ref=(TextView) view.findViewById(R.id.Ref);
        Tool=(TextView) view.findViewById(R.id.Tool);
        setOrClear=(TextView) view.findViewById(R.id.setOrClear);
        INCorABS=(TextView) view.findViewById(R.id.INCorABS);
        INCHorMM=(TextView) view.findViewById(R.id.INCHorMM);
    }
    public class click implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            int key=view.getId();
            switch (key)
            {
                case R.id.setUp:
                    PopupMenu popupMenu = new PopupMenu(getActivity(), view);
                    popupMenu.getMenuInflater().inflate(R.menu.setup,popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(onSetupMenuItemClickListener);
                    popupMenu.show();
                    break;
                case R.id.Change:
                    PopupMenu popupMenu1 = new PopupMenu(getActivity(), view);
                    popupMenu1.getMenuInflater().inflate(R.menu.change,popupMenu1.getMenu());
                    popupMenu1.setOnMenuItemClickListener(onChangeMenuItemClickListener);
                    popupMenu1.show();
                    break;
                case R.id.Display:
                    PopupMenu popupMenu2 = new PopupMenu(getActivity(), view);
                    popupMenu2.getMenuInflater().inflate(R.menu.display,popupMenu2.getMenu());
                    popupMenu2.show();
                    popupMenu2.setOnMenuItemClickListener(onDisplayMenuItemClickListener);
                    break;
                case R.id.Function:
                    PopupMenu popupMenu3 = new PopupMenu(getActivity(), view);
                    popupMenu3.getMenuInflater().inflate(R.menu.function,popupMenu3.getMenu());
                    popupMenu3.setOnMenuItemClickListener(onFunctionMenuItemClickListener);
                    popupMenu3.show();
                    break;
            }
        }
    }
    PopupMenu.OnMenuItemClickListener onSetupMenuItemClickListener=new PopupMenu.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId())
            {
                case R.id.setUp:
                    Intent intent1=new Intent(getActivity(),SetUp.class);
                    startActivity(intent1);
                    break;
                case R.id.homeSearch:
                    Intent intent=new Intent(getActivity(),HomeSearch.class);
                    startActivity(intent);
                    break;
            }
            return false;
        }
    };

    PopupMenu.OnMenuItemClickListener onDisplayMenuItemClickListener=new PopupMenu.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId())
            {
                case R.id.INC_ABS:
//                    Toast.makeText(MainActivity.this,INCorABS.getText(),Toast.LENGTH_SHORT).show();
                    if (INCorABS.getText().equals("INC")) {
                        INCorABS.setText("ABS");
                        INCORABC="ABS";
                    }else {
                        INCorABS.setText("INC");
                        INCORABC="INC";
                    }
                    break;
                case R.id.MM_INCH:
                    if (INCHorMM.getText().equals("MM"))
                    {
                        INCHorMM.setText("INCH");
                        INCHORMM="INCH";
                    }else {
                        INCHorMM.setText("MM");
                        INCHORMM="MM";
                    }
                    break;
                case R.id.Set_Clear:
                    if (setOrClear.getText().equals("Set"))
                    {
                        setOrClear.setText("Clear");
                        SETORCLEAR="Clear";
                    }else {
                        setOrClear.setText("Set");
                        SETORCLEAR="Set";
                    }
                    break;
                case R.id.DEG_DMS:
                    break;
            }
            return false;
        }
    };
    PopupMenu.OnMenuItemClickListener onChangeMenuItemClickListener=new PopupMenu.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId())
            {
                case R.id.reference:
                    break;
                case R.id.tool:
                    break;
            }
            return false;
        }
    };

    PopupMenu.OnMenuItemClickListener onFunctionMenuItemClickListener=new PopupMenu.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId())
            {
                case R.id.Bolt_Hole:
                    break;
                case R.id.Linear_drilling:
                    break;
                case R.id.Grid_drilling:
                    break;
                case R.id.Go_to:
                    break;
                case R.id.Calculator:
                    break;
            }
            return false;
        }
    };
}
