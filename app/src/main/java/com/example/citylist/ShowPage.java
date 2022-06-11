package com.example.citylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_page2);
        Intent intent =getIntent();
        String city_name=intent.getStringExtra("cityname");
        TextView tView=findViewById(R.id.city);
        tView.setText(city_name);

        Button btn=findViewById(R.id.button_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(ShowPage.this,MainActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}