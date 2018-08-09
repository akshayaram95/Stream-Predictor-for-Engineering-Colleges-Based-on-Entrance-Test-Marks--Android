package com.example.akku.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar prog;
    int progress = 0;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button) findViewById(R.id.button);
        prog=(ProgressBar) findViewById(R.id.progressBar);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prog.setVisibility(View.VISIBLE);
                setProgressValue(progress);


            }
        });


    }

    private void setProgressValue(final int progress) {

        // set the progress
        prog.setProgress(progress);
        // thread is used to change the progress value
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setProgressValue(progress + 10);
            }
        });
        thread.start();
        if(progress==100){
            Intent i = new Intent(MainActivity.this, activity2.class);
            startActivity(i);}
    }

}
