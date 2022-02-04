package com.mxgraph.gwt.client;

import com.mxgraph.gwt.client.shape.mxArrow;
import com.mxgraph.gwt.showcase.client.CompositeVertexWidget;
import com.mxgraph.gwt.showcase.client.CustomCellHoverStyle;
import com.mxgraph.gwt.showcase.client.CustomDragPreview;
import com.mxgraph.gwt.showcase.client.CustomEditingBox;
import com.mxgraph.gwt.showcase.client.CustomValidDropTargetWidget;
import com.mxgraph.gwt.showcase.client.CustomValidSourceWidget;
import com.mxgraph.gwt.showcase.client.DragAndDropWidget;
import com.mxgraph.gwt.showcase.client.DynamicLoadingWidget;
import com.mxgraph.gwt.showcase.client.HelloWorldWidget;
import com.mxgraph.gwt.showcase.client.HierarchicalLayoutWidget;
import com.mxgraph.gwt.showcase.client.LabelPositionWidget;
import com.mxgraph.gwt.showcase.client.LayersWidget;
import com.mxgraph.gwt.showcase.client.Showcase;
import com.mxgraph.gwt.showcase.client.UserObjectWidget;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MxGraph1 implements EntryPoint {
	
	public void onModuleLoad() {
		mxArrow ar = new mxArrow(null, null, null, null, null, null, null);
		Showcase sc = new Showcase();
		sc.add(new HelloWorldWidget("Hello world", sc));
		sc.add(new HierarchicalLayoutWidget("Hierarchical Layout", sc));
		sc.add(new LabelPositionWidget("Label Position", sc));
		sc.add(new LayersWidget("Layers", sc));
		sc.add(new DynamicLoadingWidget("Dynamic loading", sc));
		sc.add(new DragAndDropWidget("Drag 'n' Drop", sc));
		sc.add(new CustomValidDropTargetWidget("Custom Valid Drop Target", sc));
		sc.add(new CustomValidSourceWidget("Custom Valid Source/Target", sc));
		sc.add(new CompositeVertexWidget("Composite Vertex", sc));
		sc.add(new UserObjectWidget("User object as cell value", sc));
		sc.add(new CustomEditingBox("Custom editing box", sc));
		sc.add(new CustomCellHoverStyle("Custom cell hover style", sc));
		sc.add(new CustomDragPreview("Custom drag preview", sc));
		
		
		RootPanel.get().add(sc);
		
		Window.alert("hel");
	}
}
