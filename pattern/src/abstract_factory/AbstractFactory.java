package abstract_factory;

import abstract_factory.AbstractProduct.Button;
import abstract_factory.AbstractProduct.Checkbox;

public class AbstractFactory {
	
	public interface GUIFactory {
	    Button createButton();
	    Checkbox createCheckbox();
	}


}
