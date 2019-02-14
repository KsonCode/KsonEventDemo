package com.example.kson.ksoneventdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.kson.ksoneventdemo.entity.UserBean;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        EventBus.getDefault().register(this);
    }

    public void to1(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("post:"+Thread.currentThread().getName());
                EventBus.getDefault().post("我是2的数据1111");
                EventBus.getDefault().post("我是2的数据222");
                EventBus.getDefault().post("我是2的数据3333");
            }
        }).start();

        this.finish();
    }

//    @Subscribe(sticky = true,threadMode = ThreadMode.ASYNC)
//    public void r1(String s){
//        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
//        System.out.println("receive:"+Thread.currentThread().getName());
//    }
//
//    @Subscribe(sticky = true)
//    public void r2(UserBean userBean){
//        Toast.makeText(this,userBean.name,Toast.LENGTH_SHORT).show();
//    }
}
