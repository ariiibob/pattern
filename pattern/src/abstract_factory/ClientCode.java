package abstract_factory;

import abstract_factory.AbstractFactory.GUIFactory;
import abstract_factory.AbstractProduct.Button;
import abstract_factory.AbstractProduct.Checkbox;

public class ClientCode {
	
	public class Application {
	    private Button button;
	    private Checkbox checkbox;

	    public Application(GUIFactory factory) {
	        button = factory.createButton();
	        checkbox = factory.createCheckbox();
	    }

	    public void render() {
	        button.paint();
	        checkbox.paint();
	    }
	}


}
