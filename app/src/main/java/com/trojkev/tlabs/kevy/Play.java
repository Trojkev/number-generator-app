package com.trojkev.tlabs.kevy;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Play extends AppCompatActivity {

    Button btn_generate;
    TextView number;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        final MediaPlayer start_sound = MediaPlayer.create(this, R.raw.tlabs_creation);
        start_sound.start();

        number = (TextView) findViewById(R.id.generated_number);

        final Random r_int = new Random();

        btn_generate = (Button) findViewById(R.id.button);
        btn_generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = r_int.nextInt(9) + 1;
                number.setText(String.valueOf(num));
            }
        });
    }
}
