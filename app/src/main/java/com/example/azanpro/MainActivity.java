package com.example.azanpro;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int playon;
    MediaPlayer mplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mplayer = MediaPlayer.create(this, R.raw.azan);
        final TextView Textv = (TextView) findViewById(R.id.textView);
        playon=0;
        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(playon) {
                    case 0:
                        mplayer.start();
                        Textv.setText("Azan is playing");
                        playon = 1;
                        break;
                    case 1:
                        mplayer.pause();
                        Textv.setText("Azan is paused");
                        playon = 0;
                        break;
                }
            }
        });


    }

}