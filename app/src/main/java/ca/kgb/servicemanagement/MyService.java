package ca.kgb.servicemanagement;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG_", "Printing 'this' onDestroy Service :" + this);
    }
}
