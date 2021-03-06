package constants;

import java.awt.Color;

public class GEConstants {
	//GEMainFrame
	public static final int WIDTH_MAINFRAME = 400;
	public static final int HEIGHT_MAINFRAME = 600;
	public static final String TITLE_MAINFRAME = "Graphic Editor";
	
	//GEMenu
	public static final String TITLE_FILEMENU = "File"; //
	public static final String TITLE_EDITMENU = "Edit"; //
	public static final String TITLE_COLORMENU = "Color"; //
	
	//GEMenuItems
	public static enum EFileMenuItems {New, Open, Save, 
		Sava_as, Exit}
	public static enum EEditMenuItems {Undo, Redo, Remove, Cut, Copy,
		Paste, Group, Ungroup}
	public static enum EColorMenuItems {SetLineColor, ClearLineColor, 
		SetFillColor, ClearFillColor}
	
	//GEToolBar
	public static final String TITLE_TOOLBAR = "Shape Tools";
	public static enum EToolBarButtons{ Select, Rectangle, Line, Ellipse, Polygon}
	public static final String IMG_URL = "images/";
	public static final String TOOLBAR_BTN = ".gif";
	public static final String TOOLBAR_BTN_SLT = "SLT.gif";
	
	// GEDraingPanel
	public static final Color FOREGROUND_COLOR = Color.BLACK; 
	public static final Color BACKGROUND_COLOR = Color.white; 
	public static enum EState {Idle, TwoPointsDrawing, NPointsDrawing, Moving, Resizing}
	public static final Color COLOR_LINE_DEFAULT = Color.black;
	public static final Color COLOR_FILL_DEFAULT = Color.white;
	
	//GEAnchorList
	public static final int ANCHOR_W = 6;
	public static final int ANCHOR_H = 6;
	public static final int RR_OFFSET = 30;
	public static final Color ANCHOR_LINECOLOR = Color.black;
	public static final Color ANCHOR_FILLCOLOR = Color.white;
	public static enum EAnchorTypes { NW, NN, NE, WW, EE, SW, SS, SE, RR, NONE}
	
	//GEMenuColor
	public static final String FILL_COOR_TITLE = "Select fill color";
	public static final String LINE_COLOR_TITLE = "Select line color";

	// GETransformer
	public static final int DEFAULT_DASH_OFFSET = 4;
	public static final int DEFAULT_DASHEDLINE_WIDTH = 1;
		
	
}