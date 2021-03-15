package com.example.labassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second extends AppCompatActivity {

    TextView oncreate_tv,onstart_tv,onresume_tv,onrestart_tv;
    Button go_to_first;
    static int countCreate=0;
    static int countStart=0;
    static int countResume=0;
    static int countRestart=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        oncreate_tv=findViewById(R.id.oncreate2nd_tv);
        onstart_tv=findViewById(R.id.onstart2nd_tv);
        onresume_tv=findViewById(R.id.onresume2nd_tv);
        onrestart_tv=findViewById(R.id.onrestart2nd_tv);
        go_to_first=findViewById(R.id.go_to_first);

        countCreate;
        oncreate.setText(String.valueOf(countCreate));
        go_to_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(second.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        countStart;
        onstart.setText(String.valueOf(countStart));
    }

    @Override
    protected void onResume() {
        super.onResume();
        countResume;
        onresume.setText(String.valueOf(countResume));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        onRestart();
        onrestart.setText(String.valueOf(onRestart()));
    }
}