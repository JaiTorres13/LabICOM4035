package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object args) {
		IOComponent io = IOComponent.getComponent(); 
		DMComponent dm = (DMComponent) args; 
		String name = io.getInput("Enter the name of the list to remove: ");
		int value = Integer.parseInt(io.getInput("Enter a value to remove: ")); 
		dm.removeElementFromList(name, value); 	

	}

}
