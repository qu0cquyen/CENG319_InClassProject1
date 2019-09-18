package com.example.inclass1project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView)findViewById(R.id.imageView);
        image.setImageResource(R.drawable.cat);

        Button btn = (Button)findViewById(R.id.mybtn);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast message = Toast.makeText(getApplicationContext(), "Hello, this is my first Android APP", Toast.LENGTH_LONG);
                message.show();
            }
        });

    }
}
