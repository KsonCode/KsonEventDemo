package com.example.kson.ksoneventdemo.observer;

/**
 * 观察者接口，抽象
 */
public interface IObserver {
    void receiveMsg(String msg);//接收消息
}
