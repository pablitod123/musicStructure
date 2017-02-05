package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicalstructure.R.id.nowPlaying;

public class playScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);


        //Find the view that shows the details category
        TextView details = (TextView) findViewById(R.id.details);

        //add the onClickListener
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailsIntent = new Intent(playScreenActivity.this, detailsActivity.class);
                startActivity(detailsIntent);
            }
        });
    }
}
