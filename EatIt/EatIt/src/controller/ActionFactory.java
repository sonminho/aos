package controller;

import controller.action.Action;
import controller.action.PlaceDetailAction;
import controller.action.PlaceLocationAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		if(command.equals("place_location")) {
			action = new PlaceLocationAction();
		} else if(command.equals("place_detail")) {
			action = new PlaceDetailAction();
		}
		
		return action;
	}
}
