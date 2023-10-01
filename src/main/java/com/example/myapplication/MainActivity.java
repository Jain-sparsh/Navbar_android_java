package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView lefticon = findViewById(R.id.left_icon);
        ImageView righticon = findViewById(R.id.right_icon);
        TextView title=findViewById(R.id.toolbar_title);

  lefticon.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Toast.makeText(MainActivity.this,"you tapped back button",Toast.LENGTH_SHORT).show();
      }
  });

  righticon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Menu will load shortly",Toast.LENGTH_SHORT).show();
            }
        });
  title.setText("MAD Classes");
    }
}