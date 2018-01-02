package com.everestit.services;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void onCreate() {
    }

    @Override
    public void onStart(Intent intent, int startId)
    {
        //continue run service in backgound
        final Handler handler = new Handler();
        final Runnable runb = new Runnable()
        {
            public void run()
            {
                Log.e("SERVICE","Service stared");
                handler.postDelayed(this, 1000);
            }
        };
        handler.postDelayed(runb, 0);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}