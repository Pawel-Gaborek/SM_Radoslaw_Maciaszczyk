package com.example.myapplication;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class history extends AppCompatActivity {

    public Button history_2;
    public Button wifi_lis_2;
    public Button signal_power_2;

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        wifi_lis_2 = (Button) findViewById(R.id.network_2);
        wifi_lis_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(history.this, MainActivity.class);
                startActivity(toy);
            }
        });

        signal_power_2 = (Button) findViewById(R.id.power_2);
        signal_power_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signal = new Intent(history.this, signal_power.class);
                startActivity(signal);
            }
        });


    }

     */

}