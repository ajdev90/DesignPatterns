package com.ajdev.designpatterns.behaviour.visitor1;

public interface Visitor {
  public void visitCircle(Circle c);
  public void visitRectangle(Rectangle r);
  public void visitTriangle(Triangle t);
}
