package constants;

public class GEConstants {
	//GEMainFrame
	public static final int WIDTH_MAINFRAME = 400;
	public static final int HEIGHT_MAINFRAME = 600;
	public static final String TITLE_MAINFRAME = "Graphic Editor - 02";
	
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
		SetFillColor, ClearFileColor}
}
