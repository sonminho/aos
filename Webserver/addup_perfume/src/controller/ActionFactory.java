package controller;

import controller.action.Action;
import controller.action.ManagerDeleteAction;
import controller.action.ManagerListAction;
import controller.action.ManagerLoginAction;
import controller.action.ManagerRegisterAction;
import controller.action.ManagerUpdateAction;
import controller.action.ManagerUpdateAction2;
import controller.action.ManagerUploadAction;

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
		} else if(command.equals("manager_register")) {
			action = new ManagerRegisterAction();
		} else if(command.equals("manager_upload")) {
			action = new ManagerUploadAction();
		} else if(command.equals("manager_list")) {
			action = new ManagerListAction();
		} else if(command.equals("manager_delete")) {
			action = new ManagerDeleteAction();
		} else if(command.equals("manager_update")) {
			action = new ManagerUpdateAction();
		} else if(command.equals("manager_update2")) {
			action = new ManagerUpdateAction2();
		}
		
		return action;
	}
}
