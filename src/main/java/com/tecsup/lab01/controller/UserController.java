package com.tecsup.lab01.controller;

import com.tecsup.lab01.model.User;

public class UserController {
	
	User usuario=new User();
	
	public String insertarnombre(String nombres) {
        return("El nombre es: "+nombres);
	}
}
