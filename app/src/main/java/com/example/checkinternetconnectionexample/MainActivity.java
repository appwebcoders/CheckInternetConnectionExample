package com.example.checkinternetconnectionexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout m_no_internet_connection,m_internet_connection;
    CheckInternetStatus mCheckInternetStatus;
    boolean is_internet_connected = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_no_internet_connection = findViewById(R.id.nointernet);
        m_internet_connection = findViewById(R.id.internetconnected);
        mCheckInternetStatus = new CheckInternetStatus(MainActivity.this);
        is_internet_connected = mCheckInternetStatus.isInternetConnected();
        if(is_internet_connected){
            m_no_internet_connection.setVisibility(View.GONE);
            m_internet_connection.setVisibility(View.VISIBLE);
        } else {
            m_internet_connection.setVisibility(View.GONE);
            m_no_internet_connection.setVisibility(View.VISIBLE);
        }
    }
}