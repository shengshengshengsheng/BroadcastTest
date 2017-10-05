package com.example.shengsheng.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by XQS on 2017/10/5 0005.
 */

public class MyBroadcastReceiver  extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context,"received in my broad cast receiver",Toast.LENGTH_LONG).show();


    }
}
