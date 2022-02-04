package com.mxgraph.gwt.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.mxgraph.gwt.showcase.client.HelloWorldWidget;
import com.mxgraph.gwt.showcase.client.Showcase;




public class MxGraph implements EntryPoint {
	
	public void onModuleLoad() {
		Showcase sc = new Showcase();
		sc.add(new HelloWorldWidget("Hello world", sc));
		
		
		
		
		Window.alert("hel");
		
		//RootLayoutPanel.get().add(sc);

		
	}
}
