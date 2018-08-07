package com.sitharaj.coverage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.changeText).setOnClickListener(this);
        findViewById(R.id.changeTextAgain).setOnClickListener(this);
        text = (TextView) findViewById(R.id.text);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.changeText) {
            text.setText(((Button) v).getText().toString());
        } else if (v.getId() == R.id.changeTextAgain) {
            text.setText(((Button) v).getText().toString());
        }
    }
}
