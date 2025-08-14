package prototype;


//구체 클래스 2
public class Rectangle extends Shape {
public Rectangle(){
   type = "Rectangle";
}
@Override
public void draw() {
   System.out.println("Drawing Rectangle");
}
}