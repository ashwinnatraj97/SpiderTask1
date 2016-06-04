package com.example.android.spidertask1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("" + global.i);
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Save state to the savedInstanceState
        TextView textView = (TextView) findViewById(R.id.text);
        CharSequence save = textView.getText();
        savedInstanceState.putCharSequence("savedValue",save);
        String a = save.toString();
        global.i = Integer.parseInt(a);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore state from savedInstanceState
        CharSequence save = savedInstanceState.getCharSequence("savedValue");
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(save);
    }
    public void action(View view)
    {
        global.i++;
        display(global.i);
    }
    public void reset(View view)
    {
        global.i=0;
        display(global.i);
        changeColor();
    }
    public void display(int x)
    {
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("" + x);
    }
    public void changeColor()
    {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main_layout);
    }
}

