package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows the Browse category
        TextView browse = (TextView) findViewById(R.id.browse);

        //add the onClickListener
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browseIntent = new Intent(MainActivity.this, BrowseActivity.class);
                startActivity(browseIntent);
            }
        });

        //Find the view that shows the nowPlaying category
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);

        //add the onClickListener
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, playScreenActivity.class);
                startActivity(nowPlayingIntent);
            }
        });


    }
}
