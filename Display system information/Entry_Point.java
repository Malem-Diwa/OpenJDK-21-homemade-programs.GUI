public class Entry_Point {
	public static void main(java.lang.String[] args) {
		java.util.Properties properties = java.lang.System.getProperties();
		javax.swing.DefaultListModel<java.lang.String> PROPS_LIST = new javax.swing.DefaultListModel<>();
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		}
		catch (java.lang.Exception exception) {
			exception.printStackTrace();
		}
		javax.swing.JFrame main_frame = new javax.swing.JFrame("Debug output Dev Build 0.0.0.1");
		for (java.lang.Object Keyobject : properties.keySet()) {
			java.lang.String CURRENT_KEY = (java.lang.String) Keyobject;
			java.lang.String VALUE = properties.getProperty(CURRENT_KEY);
			PROPS_LIST.addElement(CURRENT_KEY + " [" + VALUE + "]");
		}
		javax.swing.JList<java.lang.String> INFO_LIST = new javax.swing.JList<>(PROPS_LIST);
		javax.swing.JScrollPane Scrollpane = new javax.swing.JScrollPane(INFO_LIST);
		main_frame.add(Scrollpane);
		main_frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		main_frame.setSize(600, 400);
		main_frame.setVisible(true);
	}
}