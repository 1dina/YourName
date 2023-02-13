package com.example.yourname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edit = findViewById(R.id.edit);

        Intent intent =new Intent(getBaseContext(),MainActivity2.class);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                name = edit.getText().toString();

                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this,"Enter your name!",
                            Toast.LENGTH_LONG).show();
                } else {
                    intent.putExtra("user_name",name);
                    startActivity(intent);

                }
            } });

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