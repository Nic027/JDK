package jdk.com.example.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import jdk.com.example.R;

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Timer();
    }

    private void Timer(){
        TimerTask tiempo = new TimerTask() {
            @Override
            public void run() {
                Intent Login = new Intent(SplashscreenActivity.this,Login.class);
                startActivity(Login);
                finish();
            }
        };
        Timer tiempot = new Timer();
        tiempot.schedule(tiempo,4000);
    }
}