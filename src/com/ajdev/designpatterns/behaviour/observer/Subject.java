package com.ajdev.designpatterns.behaviour.observer;

public interface Subject {
  public void addObserver(Observer o);
  public void deleteObserver(Observer o);
  public void NotifyAllObservers();
}
