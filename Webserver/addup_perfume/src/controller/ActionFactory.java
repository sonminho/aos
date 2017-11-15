package controller;

import controller.action.copy.Action;
import controller.action.copy.ManagerLoginAction;

public class ActionFactory {
	
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory(){
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		if(command.equals("manager_login")) {
			action = new ManagerLoginAction();
		}
		
		return action;
	}
}
