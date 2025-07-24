package pattern;

public class FactoryMethod1 {
	
	public interface Product {
		void use();
	}
	
	public class ConcreteProductA implements Product {
		@Override
		public void use() {
			System.out.println("A 생성");
		}
	}
	
	public class ConcreteProductB implements Product {
		@Override
		public void use() {
			System.out.println("B 생성");
		}
	}
	
	public abstract class Creator {
		public abstract Product CreateProduct() ;
		
		
	}

}
