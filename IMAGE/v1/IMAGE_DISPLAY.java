public class IMAGE_DISPLAY {
	private static javax.swing.ImageIcon sonic_static = new javax.swing.ImageIcon("Sonic_blast_sprite.jpg");
	public static void main(java.lang.String[] args) {
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		}
		catch (java.lang.Exception exception) {
			exception.printStackTrace();
		}
		javax.swing.JFrame frame = new javax.swing.JFrame("Image Display Dev Build 0.0.0.1");
		javax.swing.JLabel image = new javax.swing.JLabel(sonic_static);
		image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		image.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
		frame.add(image);
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 480);
		frame.setVisible(true);
	}
}