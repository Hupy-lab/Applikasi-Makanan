package com.example.menumakanan;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class detail_activity extends AppCompatActivity{
    TextView myNama, myDesc, myHarga;
    ImageView myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_activity);

        myNama = (TextView) findViewById(R.id.DetNama);
        myDesc = (TextView) findViewById(R.id.DetDesc);
        myHarga = (TextView) findViewById(R.id.DetHrg);
        myImage = (ImageView) findViewById(R.id.gambarMakanan);

        // dapat dari  makananAdapter
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String[] mydata = extras.getStringArray("MYDATA");
            myNama.setText(mydata[0]);
            myDesc.setText(mydata[1]);
            myHarga.setText(mydata[2]);

            myImage.setImageResource(getResources().getIdentifier(mydata[3], "drawable", getPackageName()));
        }
    }
}
