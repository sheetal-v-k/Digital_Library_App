package com.example.digitallibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    private int sleeptimer = 5;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();
    }
    private class LogoLauncher extends Thread{

        public void run(){
            try{
                sleep(1000 * sleeptimer);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            Intent intent = new Intent(Splash.this, Login.class);
            startActivity(intent);
            Splash.this.finish();
        }
    }


}
