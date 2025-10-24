package com.example.androiduitesting;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// Reference: https://stackoverflow.com/questions/24610527/how-do-i-get-a-button-to-open-another-activity

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        // get city name from MainActivity
        String cityName = getIntent().getStringExtra("city_name");
        TextView cityNameView = findViewById(R.id.city_name_view);
        cityNameView.setText(cityName);

        Button btn = findViewById(R.id.back_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
