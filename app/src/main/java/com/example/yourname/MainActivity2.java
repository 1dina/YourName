package com.example.yourname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView image =findViewById(R.id.Image);
        TextView text =  findViewById(R.id.YourName);
        Intent intent =getIntent();
         String name = intent.getStringExtra("user_name");


        text.setText(name);
        if (isCapital(name)) {
            image.setImageDrawable(getDrawable(R.drawable.sea));
        } else {
            image.setImageDrawable(getDrawable(R.drawable.sky));
        }
    }
    boolean isCapital(String name){
        char arr[]=name.toCharArray();
        if(Character.isUpperCase(name.charAt(0))){
            return true;
        } else{
            return false;
        }
    }
}