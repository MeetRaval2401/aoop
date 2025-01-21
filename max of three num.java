import java.io.*;
class Area {

   double PI = Math.PI; 
   public void areaOfCircle(double radius) {
      double area = 0;
      area = PI * radius * radius;
      System.out.println("Area of the circle is :" + area);
   }
   public void areaOfCircle(float radius ) {
      double area= 0;
      area = PI * radius * radius;
      System.out.println("Area of the circle is :" + area);
   }
}
public class Main {
   public static void main(String args[]) {
      Area Object  = new Area();
      float radius_1 = 7;
      Object.areaOfCircle(radius_1);
      double radius_2 = 3.5;
      Object.areaOfCircle(radius_2);
   }
}
