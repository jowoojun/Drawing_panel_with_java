package constants;

public class GEConstants {
	//GEMainFrame
	public static final int WIDTH_MAINFRAME = 400;
	public static final int HEIGHT_MAINFRAME = 600;
	public static final String TITLE_MAINFRAME = "Graphic Editor - 02";
	
	//GEMenu
	public static final String TITLE_FILEMENU = "����"; //
	public static final String TITLE_EDITMENU = "����"; //
	public static final String TITLE_COLORMENU = "�÷�"; //
	
	//GEMenuItems
	public static enum EFileMenuItems {���θ����, ����, ����, 
		�ٸ��̸���������, ����}
	public static enum EEditMenuItems {undo, redo, ����, �߶󳻱�, ����,
		���̱�, group, ungroup}
	public static enum EColorMenuItems {setLineColor, ClearLineColor, 
		SetFillColor, ClearFileColor}
}
