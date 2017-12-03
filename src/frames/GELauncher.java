package frames;

public class GELauncher {
	public static void main(String[] args){
		// for singleton
		GEMainFrame frame = GEMainFrame.getInstance();
		frame.init();
	}
}