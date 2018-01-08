package com.ty.utills;

import java.util.UUID;

public class IdUtills {
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-","");
	}
}
