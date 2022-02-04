package com.home.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Wajeeha implements EntryPoint {

	public void onModuleLoad() {
		
		Bedroom xc = new Bedroom();
		
		System.out.println(xc.x);
		int a = xc.plus();
		Window.alert(a+"");
		
	}
}
