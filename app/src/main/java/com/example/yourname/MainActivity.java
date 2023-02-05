package com.example.yourname;

import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edit = findViewById(R.id.edit);
        TextView text =  findViewById(R.id.YourName);
        Button button = findViewById(R.id.button);
        ImageView image =findViewById(R.id.Image);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name = edit.getText().toString();
                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this,"Enter your name!",
                            Toast.LENGTH_LONG).show();
                } else {
                    text.setText(name);
                    if (isCapital(name)) {
                        image.setImageDrawable(getDrawable(R.drawable.sea));
                    } else {
                        image.setImageDrawable(getDrawable(R.drawable.sky));
                    }

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