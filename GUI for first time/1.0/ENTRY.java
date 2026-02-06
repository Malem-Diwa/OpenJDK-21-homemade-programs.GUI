public class ENTRY {
	public static void main(java.lang.String[] args) {
		javax.swing.JFrame SwingFrame = new javax.swing.JFrame("Demo Swing DEV_VER_01");
		SwingFrame.setSize(400, 200);
		SwingFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		javax.swing.JLabel SwingLabel = new javax.swing.JLabel("DEV_VER_0");
		javax.swing.JButton SwingButton = new javax.swing.JButton("KILL CURRENT PID");
		SwingFrame.setLayout(new java.awt.FlowLayout());
		SwingFrame.add(SwingLabel);
		SwingFrame.add(SwingButton);
		SwingFrame.setVisible(true);
	}
}