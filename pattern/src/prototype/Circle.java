package prototype;

//구체 클래스 1
public class Circle extends Shape {
public Circle(){
   type = "Circle";
}
@Override
public void draw() {
   System.out.println("Drawing Circle");
}
}
