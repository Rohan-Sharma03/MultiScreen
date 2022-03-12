package com.therohansharma03.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public static final String keyforperson="com.therohansharma03.multiscreen.customer";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void enter(View view){
        Intent intent = new Intent(this,MainActivity2.class);
    EditText editText1 = findViewById(R.id.fn);
    EditText editText2 = findViewById(R.id.sn);
    String message= "Thank you ! "+editText1.getText().toString()+" "+editText2.getText().toString()+"\n"+"For visiting ous.";
        intent.putExtra(keyforperson,message);
    startActivity(intent);}
}