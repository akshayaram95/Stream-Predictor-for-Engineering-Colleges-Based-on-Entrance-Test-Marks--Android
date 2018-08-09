package com.example.akku.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity3 extends AppCompatActivity {
    TextView tv;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);
     tv=(TextView) findViewById(R.id.textView2);
        tv.setText("Pimpri Chinchwad College of Engineering (PCCoE) is one of the best engineering colleges in India, established in 1999, managed by Pimpri Chinchwad Education Trust.\n\nPCCoE is functioning proactively to provide the best professional environment to engineering and management students in terms of academics, industry oriented trainings, sports, co-curricular & extracurricular activities etc to create true aesthetically sensitive and technologically competent professionals.");


    }
}
