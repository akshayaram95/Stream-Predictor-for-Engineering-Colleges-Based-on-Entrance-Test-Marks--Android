package com.example.akku.project1;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.RadioButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText et,et1;
final RadioButton rb,rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8;
        Button b;
        et=(EditText)findViewById(R.id.editText);
        et1=(EditText) findViewById(R.id.editText2);
        rb2=(RadioButton)findViewById(R.id.radioButton);
        rb1=(RadioButton)findViewById(R.id.radioButton2);
        rb=(RadioButton)findViewById(R.id.radioButton3);
        rb3=(RadioButton)findViewById(R.id.radioButton4);
        rb4=(RadioButton)findViewById(R.id.radioButton5);
        rb5=(RadioButton)findViewById(R.id.radioButton7);
        rb6=(RadioButton)findViewById(R.id.radioButton8);
        rb7=(RadioButton)findViewById(R.id.radioButton9);
        rb8=(RadioButton)findViewById(R.id.radioButton6);
        b=(Button) findViewById(R.id.button5);
        /*rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

*/
        final Context context=this;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float jee=Float.parseFloat(et.getText().toString());
                float tw=Float.parseFloat(et1.getText().toString());
                et.setText("");
                et1.setText("");

                float res=((jee*60)+(tw*40))/100;
                AlertDialog.Builder builder=new AlertDialog.Builder(context);
                builder.setNeutralButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                String dept;
                if(rb5.isChecked()) {
                    if (rb.isChecked()) {
                        if (res > 82.62) {
                            builder.setMessage("You are eligible for Information Technology");

                        } else {
                            builder.setMessage("You are not eligible for Information Technology");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb1.isChecked()) {
                        if (res > 92.10) {
                            builder.setMessage("You are eligible for Mechanical Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Mechanical Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb2.isChecked()) {
                        if (res > 89.62) {
                            builder.setMessage("You are eligible for Computer Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Computer Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb3.isChecked()) {
                        if (res > 84.86) {
                            builder.setMessage("You are eligible for Civil Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Civil Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb4.isChecked()) {
                        if (res > 78.19) {
                            builder.setMessage("You are eligible for EnTC Engineering");

                        } else {
                            builder.setMessage("You are not eligible for EnTC Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    }

                }

                if(rb6.isChecked()) {
                    if (rb.isChecked()) {
                        if (res > 54.50) {
                            builder.setMessage("You are eligible for Information Technology");

                        } else {
                            builder.setMessage("You are not eligible for Information Technology");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb1.isChecked()) {
                        if (res > 75.54) {
                            builder.setMessage("You are eligible for Mechanical Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Mechanical Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb2.isChecked()) {
                        if (res > 70.51) {
                            builder.setMessage("You are eligible for Computer Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Computer Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb3.isChecked()) {
                        if (res > 60.72) {
                            builder.setMessage("You are eligible for Civil Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Civil Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb4.isChecked()) {
                        if (res > 51.06) {
                            builder.setMessage("You are eligible for EnTC Engineering");

                        } else {
                            builder.setMessage("You are not eligible for EnTC Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    }

                }

                if(rb7.isChecked()) {
                    if (rb.isChecked()) {
                        if (res > 75.66) {
                            builder.setMessage("You are eligible for Information Technology");

                        } else {
                            builder.setMessage("You are not eligible for Information Technology");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb1.isChecked()) {
                        if (res > 90.16) {
                            builder.setMessage("You are eligible for Mechanical Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Mechanical Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb2.isChecked()) {
                        if (res > 84.18) {
                            builder.setMessage("You are eligible for Computer Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Computer Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb3.isChecked()) {
                        if (res > 80.42) {
                            builder.setMessage("You are eligible for Civil Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Civil Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb4.isChecked()) {
                        if (res > 79.51) {
                            builder.setMessage("You are eligible for EnTC Engineering");

                        } else {
                            builder.setMessage("You are not eligible for EnTC Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    }

                }

                if(rb8.isChecked()) {
                    if (rb.isChecked()) {
                        if (res > 33.84) {
                            builder.setMessage("You are eligible for Information Technology");

                        } else {
                            builder.setMessage("You are not eligible for Information Technology");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb1.isChecked()) {
                        if (res > 53.565) {
                            builder.setMessage("You are eligible for Mechanical Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Mechanical Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb2.isChecked()) {
                        if (res > 62.31) {
                            builder.setMessage("You are eligible for Computer Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Computer Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb3.isChecked()) {
                        if (res > 57.33) {
                            builder.setMessage("You are eligible for Civil Engineering");

                        } else {
                            builder.setMessage("You are not eligible for Civil Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    } else if (rb4.isChecked()) {
                        if (res > 54.19) {
                            builder.setMessage("You are eligible for EnTC Engineering");

                        } else {
                            builder.setMessage("You are not eligible for EnTC Engineering");
                        }
                        AlertDialog alert = builder.create();
                        alert.show();
                    }

                }
            }
        });


    }
}
