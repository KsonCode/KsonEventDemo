package com.example.kson.ksoneventdemo.observer;

public class Observer implements IObserver {
    @Override
    public void receiveMsg(String msg) {
        System.out.println(msg);
    }
}
