package com.example.kson.ksoneventdemo.observer;

/**
 * 被观察者接口，抽象接口
 */
public interface IObservable {
    void registerObserver(IObserver iObserver);//注册观察者
    void removeObserver(IObserver iObserver);
    void notifyMsg();//通知消息给观察者，用于接收
}
