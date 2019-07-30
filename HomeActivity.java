package com.example.agecounterapp;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//_______Age Counter ___________
public class HomeActivity extends AppCompatActivity  implements View.OnClickListener {
    Button btn;
    EditText editText;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn = (Button)findViewById(R.id.btn);
        txtview = (TextView)findViewById(R.id.txtview);
        editText = (EditText)findViewById(R.id.editText);

        btn.setOnClickListener(this);
            }//onCreate


    @Override
    public void onClick(View v){
        int age,year;
        year=Integer.parseInt(editText.getText().toString());
        age=(2019-year);
        txtview.setText("You Age is "+age);   }

}//Class
