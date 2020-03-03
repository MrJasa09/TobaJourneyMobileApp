package com.example.mobiletobajourney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TourAndTravelAct extends AppCompatActivity {

    Button btn_paketpertama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_and_travel);

        btn_paketpertama = findViewById(R.id.btn_paketpertama);
        btn_paketpertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotopaketpertama = new Intent(TourAndTravelAct.this,TicketDetailAct.class);
                startActivity(gotopaketpertama);
            }
        });
    }
}

