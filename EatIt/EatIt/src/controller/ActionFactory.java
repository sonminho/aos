package controller;

import controller.action.Action;
import controller.action.CartDeleteAction;
import controller.action.CartInsertAction;
import controller.action.CartListAction;
import controller.action.PlaceDetailAction;
import controller.action.PlaceLocationAction;
import controller.action.PlaceTemaAction;
import controller.action.PlaceTypeAction;
import controller.action.UserLoginAction;
import controller.action.UserLogoutAction;

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
		} else if(command.equals("user_login")) {
			action = new UserLoginAction();
		} else if(command.equals("user_logout")) {
			action = new UserLogoutAction();
		} else if(command.equals("cart_insert")) {
			action = new CartInsertAction();
		} else if(command.equals("cart_list")) {
			action = new CartListAction();
		} else if(command.equals("cart_delete")) {
			action = new CartDeleteAction();
		} else if(command.equals("place_type")) {
			action = new PlaceTypeAction();
		} else if(command.equals("place_tema")) {
			action = new PlaceTemaAction();
		}
		
		return action;
	}
}