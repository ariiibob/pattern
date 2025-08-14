package prototype;

//Prototype 인터페이스
public abstract class Shape implements Cloneable {
 private String id;
 protected String type;

 abstract void draw();

 public String getType(){
     return type;
 }

 public String getId() {
     return id;
 }
 public void setId(String id) {
     this.id = id;
 }

 // 핵심: clone() 메서드 재정의
 @Override
 public Object clone() {
     Object clone = null;
     try {
         clone = super.clone(); // 얕은 복사
     } catch (CloneNotSupportedException e) {
         e.printStackTrace();
     }
     return clone;
 }
}



