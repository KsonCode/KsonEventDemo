package com.example.kson.ksoneventdemo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.kson.ksoneventdemo.entity.UserBean;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
    }

    /**
     * 订阅和接收数据，以参数类型为准
     * @param s
     */
    @Subscribe(threadMode = ThreadMode.MAIN,priority = 1)
    public void receive(String s){
        System.out.println("receive:"+Thread.currentThread().getName());
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();

    }
    /**
     * 订阅和接收数据，以参数类型为准
     * @param s
     */
    @Subscribe(threadMode = ThreadMode.MAIN,priority = 100)
    public void receive2(String s){
        System.out.println("receive:"+Thread.currentThread().getName());
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();

    }
    /**
     * 订阅和接收数据，以参数类型为准
     * @param s
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receive3(String s){
        System.out.println("receive:"+Thread.currentThread().getName());
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();

    }

    /**
     * tiaozhuan
     * @param view
     */
    public void to2(View view) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("post:"+Thread.currentThread().getName());
//                EventBus.getDefault().postSticky("我是1的数据");
//        EventBus.getDefault().postSticky(new UserBean("kson"));
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
//            }
//        }).start();

    }


}
