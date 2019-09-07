package com.example.imeeting.test;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * description:
 * created by wangbin on 2019/6/23
 */
public class TestAct extends Activity {
    public void testStartService() {
        Intent s = new Intent(this, MyService.class);

    }

    private MyService service = new MyService();

    static class MyService extends Service {

        @Override
        public IBinder onBind(Intent intent) {
            return null;
        }
    }
}
