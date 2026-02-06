public class Exitpress {
	public static void main(java.lang.String[] args) {
		javax.swing.JFrame Swing_frame = new javax.swing.JFrame("ExitPress Dev Build 0.0.0.1");
		Swing_frame.setSize(300, 200);
		Swing_frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		}
		catch (java.lang.Exception exception) {
			exception.printStackTrace();
		}
		javax.swing.JPanel Panel_Main = new javax.swing.JPanel();
		javax.swing.JLabel instruction = new javax.swing.JLabel("Press this JButton to kill the current Process ID.");
		javax.swing.JButton exit = new javax.swing.JButton("KILL PROCESS ID");
		exit.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent actionevent) {
				java.lang.System.exit(0);
			}
		});
		Panel_Main.add(instruction);
		Panel_Main.add(exit);
		Swing_frame.add(Panel_Main, java.awt.BorderLayout.CENTER);
		Swing_frame.setVisible(true);
	}
}