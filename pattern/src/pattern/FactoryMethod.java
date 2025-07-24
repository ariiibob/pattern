package pattern;

public class FactoryMethod {
	
	public interface Product {
		void use();
	}
	
	public class ConcreteProductA implements Product {
		@Override
		public void use() {
			System.out.println("Product A 사용");
		}
	}
	
	public class ConcreteProductB implements Product {
		@Override
		public void use() {
			System.out.println("Product B 사용");
		}
	}
	
	public abstract class Creator {
		public abstract Product createProduct();
		
		public void someOperation() {
			Product product = createProduct();
			product.use();
		}
	}
	
	public class ConcreteCreatorA extends Creator {
		@Override
		public Product createProduct() {
			return new ConcreteProductA();
		}
	}
	
	public class ConcreteCreatorB extends Creator {
		@Override
		public Product createProduct() {
			return new ConcreteProductB();
		}
	}

	
//	public class Main {
//	    public static void main(String[] args) {
//	        Creator creatorA = new ConcreteCreatorA();
//	        creatorA.someOperation(); // Product A 사용
//
//	        Creator creatorB = new ConcreteCreatorB();
//	        creatorB.someOperation(); // Product B 사용
//	    }
//	}
	
}
