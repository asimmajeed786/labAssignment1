package com.example.labassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView oncreate_tv,onstart_tv,onresume_tv,onrestart_tv;
    Button go_to_second;
    static int countCreate=0;
    static int countStart=0;
    static int countResume=0;
    static int countRestart=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oncreate_tv=findViewById(R.id.oncreate);
        onstart_tv=findViewById(R.id.onstart);
        onresume_tv=findViewById(R.id.onresume);
        onrestart_tv=findViewById(R.id.onrestart);
        go_to_second=findViewById(R.id.go_to_second);

        countCreate++;
        oncreate.setText(String.valueOf(countCreate));
        go_to_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,second.class);
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
        countRestart;
        onrestart.setText(String.valueOf(countRestart));
    }

}
