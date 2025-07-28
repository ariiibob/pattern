package abstract_factory;

import abstract_factory.AbstractProduct.Button;
import abstract_factory.AbstractProduct.Checkbox;

public class ConcreteProduct {
	
	public class WindowsButton implements Button {
	    public void paint() {
	        System.out.println("Windows 버튼 렌더링");
	    }
	}

	public class MacButton implements Button {
	    public void paint() {
	        System.out.println("Mac 버튼 렌더링");
	    }
	}

	public class WindowsCheckbox implements Checkbox {
	    public void paint() {
	        System.out.println("Windows 체크박스 렌더링");
	    }
	}

	public class MacCheckbox implements Checkbox {
	    public void paint() {
	        System.out.println("Mac 체크박스 렌더링");
	    }
	}


}
