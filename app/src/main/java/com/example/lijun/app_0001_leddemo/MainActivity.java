package com.example.lijun.app_0001_leddemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private boolean ledOn = false;
    private Button button = null;
    private CheckBox checkBoxLed1 = null;
    private CheckBox checkBoxLed2 = null;
    private CheckBox checkBoxLed3 = null;
    private CheckBox checkBoxLed4 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.BUTTON);
        checkBoxLed1 = (CheckBox) findViewById(R.id.led1);
        checkBoxLed2 = (CheckBox) findViewById(R.id.led2);
        checkBoxLed3 = (CheckBox) findViewById(R.id.led3);
        checkBoxLed4 = (CheckBox) findViewById(R.id.led4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ledOn = !ledOn;
                if (ledOn) {
                    button.setText("ALL OFF");
                    checkBoxLed1.setChecked(true);
                    checkBoxLed2.setChecked(true);
                    checkBoxLed3.setChecked(true);
                    checkBoxLed4.setChecked(true);

                } else {
                    button.setText("ALL ON");
                    checkBoxLed1.setChecked(false);
                    checkBoxLed2.setChecked(false);
                    checkBoxLed3.setChecked(false);
                    checkBoxLed4.setChecked(false);
                }

            }
        });
    }
    public void onCheckBoxClicked(View view)
    {
        boolean checked = ((CheckBox)view).isChecked();
        switch (view.getId())
        {
            case R.id.led1:
                if(checked)
                {
                    Toast.makeText(getApplicationContext(),"Led1 on",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Led1 off",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.led2:
                if(checked)
                {
                    Toast.makeText(getApplicationContext(),"Led2 on",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Led2 off",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.led3:
                if(checked)
                {
                    Toast.makeText(getApplicationContext(),"Led3 on",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Led3 off",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.led4:
                if(checked)
                {
                    Toast.makeText(getApplicationContext(),"Led4 on",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Led4 off",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
