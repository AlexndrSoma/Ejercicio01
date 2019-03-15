package com.veegadiego.ejercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;


    private TextView tv1;

    private Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.plain_text_input);
        et2 = findViewById(R.id.plain_text_input02);
        tv1 = findViewById(R.id.tv1);
        bt1 = findViewById(R.id.bt1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
String usr = et1.getText().toString();
tv1.setText(usr);
            }
        });

        bt1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String pss = et2.getText().toString();
                tv1.setText(pss);
            }
        });

    }
}
