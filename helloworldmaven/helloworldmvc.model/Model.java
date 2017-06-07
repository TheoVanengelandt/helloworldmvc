package helloworldmvc.model;
import helloworldmvc.Contract.IModel;

public class Model implements IModel{
	
	public String getHelloWorld(){
		getInstance();
		return getHelloWorldMessage();
	}

}
