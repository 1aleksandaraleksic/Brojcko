import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelRandomNumbers extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JLabel label1, label1_1, label2, label2_1,label3,label3_1, label4, label4_1;
	private MyRandom n1, n2, n3, n4;
	
	public static int getRNum1() {
		int rn1 = Integer.parseInt(label1.getText().toString());
		return rn1;
	}
	
	public static int getRNum2() {
		int rn2 = Integer.parseInt(label2.getText().toString());
		return rn2;	
	}
	
	public static int getRNum3() {
		int rn3 = Integer.parseInt(label3.getText().toString());
		return rn3;	
	}
	
	public static int getRNum4() {
		int rn4 = Integer.parseInt(label4.getText().toString());
		return rn4;	
	}

	/**
	 * Create the panel.
	 */
	public PanelRandomNumbers() {
		n1 = new MyRandom();
		n2 = new MyRandom();
		n3 = new MyRandom();
		n4 = new MyRandom();
		
		label1 = new JLabel();
		label1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label1.setBounds(10, 10, 50, 50);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setText(n1.giveMeRandomNumberWhoIsString());
		label1.setVisible(false);
		setLayout(null);
		add(label1);
		
		label1_1 = new JLabel("?");
		label1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label1_1.setBounds(10, 10, 50, 50);	
		label1_1.setVisible(true);
		add(label1_1);

		label2 = new JLabel();
		label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label2.setBounds(70, 10, 50, 50);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setText(n2.giveMeRandomNumberWhoIsString());
		label2.setVisible(false);
		add(label2);
		
		label2_1 = new JLabel("?");
		label2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label2_1.setBounds(70, 10, 50, 50);
		label2_1.setHorizontalAlignment(SwingConstants.CENTER);
		label2_1.setVisible(true);
		add(label2_1);
		
		label3 = new JLabel();
		label3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label3.setBounds(130, 10, 50, 50);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setText(n3.giveMeRandomNumberWhoIsString());
		label3.setVisible(false);
		add(label3);

		label3_1 = new JLabel("?");
		label3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label3_1.setBounds(130, 10, 50, 50);
		label3_1.setHorizontalAlignment(SwingConstants.CENTER);
		label3_1.setVisible(true);
		add(label3_1);
		
		label4 = new JLabel();
		label4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label4.setBounds(190, 10, 50, 50);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setText(n4.giveMeRandomNumberWhoIsString());
		label4.setVisible(false);
		add(label4);
		
		label4_1 = new JLabel("?");
		label4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label4_1.setBounds(190, 10, 50, 50);
		label4_1.setHorizontalAlignment(SwingConstants.CENTER);
		label4_1.setVisible(true);
		add(label4_1);
	}
	
	public static void removeQuestionmark() {
		label1.setVisible(true);
		label1_1.setVisible(false);
	
		label2.setVisible(true);
		label2_1.setVisible(false);
		
		label3.setVisible(true);
		label3_1.setVisible(false);
		
		label4.setVisible(true);
		label4_1.setVisible(false);
	}

}
