package structural.facade;

public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("직사각형");
  }
}
