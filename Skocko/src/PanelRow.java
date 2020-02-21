import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelRow extends JPanel {
	/**
	 * 
	 */
	public static int proba = 0;
	private static final long serialVersionUID = 1L;
	private static int countRed = 0;
	private int countYellow =0;
	private ArrayList<Integer> randomArray, pickedArray;
	private static int numberWin =0;
	private static int numberLose = 0;
	private static int winPoints;
	
	public static int getNumberOfWin() {
		return numberWin;
	}
	
	public static int getNumberOfLose() {
		return numberLose;
	}
	
	public static int getWinPoints() {
		return winPoints;
	}
	
//	public static int getPercentage() { 
//		int per = 0;
//		try {
//			per = (numberWin/numberLose)*100;
//			
//		} catch (Exception ignore) {
//
//		}
//		if(per<=0) {
//			return 0;
//		} else {
//			return per;
//		}
//		
//	}

	/**
	 * Create the panel.
	 */
	public PanelRow(int num1, int num2, int num3, int num4, int winPoints, int SerialNumOfRow) {
		setLayout(null);
		
		randomArray = new ArrayList<Integer>(4);
		pickedArray = new ArrayList<Integer>(4);
		String[] numbers = {"","1","2","3","4","5","6"};
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel<String>(numbers));
		comboBox.setBounds(10, 10, 45, 45);
		comboBox.setVisible(true);
		add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setModel(new DefaultComboBoxModel<String>(numbers));
		comboBox_1.setBounds(65, 10, 45, 45);
		comboBox_1.setVisible(true);
		add(comboBox_1);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_2.setModel(new DefaultComboBoxModel<String>(numbers));
		comboBox_2.setBounds(120, 10, 45, 45);
		comboBox_2.setVisible(true);
		add(comboBox_2);
		
		JComboBox<String> comboBox_3 = new JComboBox<String>();
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_3.setModel(new DefaultComboBoxModel<String>(numbers));
		comboBox_3.setBounds(175, 10, 45, 45);
		comboBox_3.setVisible(true);
		add(comboBox_3);
		
		JLabel colorField1 = new JLabel();
		colorField1.setHorizontalAlignment(SwingConstants.CENTER);
		colorField1.setBounds(330, 17, 30, 30);
		add(colorField1);
		
		JLabel colorField2 = new JLabel();
		colorField2.setHorizontalAlignment(SwingConstants.CENTER);
		colorField2.setBounds(365, 17, 30, 30);
		add(colorField2);
		
		JLabel colorField3 = new JLabel();
		colorField3.setHorizontalAlignment(SwingConstants.CENTER);
		colorField3.setBounds(400, 17, 30, 30);
		add(colorField3);
		
		JLabel field4 = new JLabel();
		field4.setHorizontalAlignment(SwingConstants.CENTER);
		field4.setBounds(435, 17, 30, 30);
		add(field4);
		
		JLabel fieldEntered1 = new JLabel();
		fieldEntered1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fieldEntered1.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntered1.setBounds(10, 10, 45, 45);
		fieldEntered1.setVisible(false);
		add(fieldEntered1);
		
		JLabel fieldEntered2 = new JLabel();
		fieldEntered2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fieldEntered2.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntered2.setBounds(65, 10, 45, 45);
		fieldEntered2.setVisible(false);
		add(fieldEntered2);
		
		JLabel fieldEntered3 = new JLabel();
		fieldEntered3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fieldEntered3.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntered3.setBounds(120, 10, 45, 45);
		fieldEntered3.setVisible(false);
		add(fieldEntered3);
		
		JLabel fieldEntered4 = new JLabel();
		fieldEntered4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fieldEntered4.setHorizontalAlignment(SwingConstants.CENTER);
		fieldEntered4.setBounds(175, 10, 45, 45);
		fieldEntered4.setVisible(false);
		add(fieldEntered4);
		
		JButton button2 = new JButton("Proveri");
		button2.setBounds(230, 12, 90, 40);
		add(button2);	
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				countRed = 0;
				countYellow = 0;

				if(comboBox.getSelectedIndex() != 0
				&& comboBox_2.getSelectedIndex() !=0
				&& comboBox_1.getSelectedIndex() !=0
				&& comboBox_3.getSelectedIndex() !=0) {
					int combo1= Integer.parseInt(comboBox.getSelectedItem().toString());
					int combo2= Integer.parseInt(comboBox_1.getSelectedItem().toString());
					int combo3= Integer.parseInt(comboBox_2.getSelectedItem().toString());
					int combo4= Integer.parseInt(comboBox_3.getSelectedItem().toString());
						
					randomArray.add(num1);
					randomArray.add(num2);
					randomArray.add(num3);
					randomArray.add(num4);
							
					pickedArray.add(combo1);
					pickedArray.add(combo2);
					pickedArray.add(combo3);
					pickedArray.add(combo4);					
					
					ArrayList<Integer> helpRandomArray = new ArrayList<Integer>();
					ArrayList<Integer> helpPickedArray = new ArrayList<Integer>();					
					
					for(int i =0;i<randomArray.size();i++) {
						if(randomArray.get(i) == pickedArray.get(i)) {
							countRed++;
						} else {
							helpRandomArray.add(randomArray.get(i));
							helpPickedArray.add(pickedArray.get(i));
						}
					}
					
					
					for(int i =0;i<helpRandomArray.size();i++) {
						if(helpRandomArray.size()==0) {
							
						}
						else if(helpRandomArray.size()==1) {
//							if(niz2Pom.get(0) == pomNiz.get(i)) {
//								countYellow++;
//							}
						}
						else if(helpRandomArray.size()==2) {
							if(helpPickedArray.get(0) == helpRandomArray.get(i)) {
								countYellow++;
								helpPickedArray.set(0, 0);
							}
							else if(helpPickedArray.get(1)== helpRandomArray.get(i)) {
								countYellow++;
								helpPickedArray.set(1, 0);
							}
						}
						else if(helpRandomArray.size()==3) {
							if(helpPickedArray.get(0) == helpRandomArray.get(i)) {
								countYellow++;
								helpPickedArray.set(0, 0);
							}
							else if(helpPickedArray.get(1)== helpRandomArray.get(i)) {
								countYellow++;
								helpPickedArray.set(1, 0);
							}
							else if(helpPickedArray.get(2)== helpRandomArray.get(i)) {
								countYellow++;
								helpPickedArray.set(2, 0);
							}
						}
						else if(helpRandomArray.size()==4) {
							if(helpPickedArray.get(0) == helpRandomArray.get(i)) {
								countYellow++;
								helpPickedArray.set(0, 0);
							}
							else if(helpPickedArray.get(1)== helpRandomArray.get(i)) {
								countYellow++;
								helpPickedArray.set(1, 0);
							}
							else if(helpPickedArray.get(2)== helpRandomArray.get(i)) {
								countYellow++;
								helpPickedArray.set(2, 0);
							}
							else if(helpPickedArray.get(3)== helpRandomArray.get(i)) {
								countYellow++;
								helpPickedArray.set(3, 0);
							}
						}
						
					}
						
					color(countRed, countYellow, colorField1, colorField2, colorField3, field4);
					
					button2.setVisible(false);
					comboBox.setVisible(false);
					comboBox_1.setVisible(false);
					comboBox_2.setVisible(false);
					comboBox_3.setVisible(false);
					
					fieldEntered1.setText(comboBox.getSelectedItem().toString());
					fieldEntered1.setVisible(true);
					fieldEntered2.setText(comboBox_1.getSelectedItem().toString());
					fieldEntered2.setVisible(true);
					fieldEntered3.setText(comboBox_2.getSelectedItem().toString());
					fieldEntered3.setVisible(true);
					fieldEntered4.setText(comboBox_3.getSelectedItem().toString());
					fieldEntered4.setVisible(true);
					
					
					if(countRed == 4) {
						numberWin++;
						PanelRow.winPoints = winPoints;	
						DialogWin d = new DialogWin(winPoints);
						d.setVisible(true);	
						PanelRandomNumbers.removeQuestionmark();
					}
					
					if(SerialNumOfRow == 7 && countRed !=4) {
						numberLose++;
						DialogLose dl = new DialogLose();
						dl.setVisible(true);
						PanelRandomNumbers.removeQuestionmark();
					}
					
				} else {
					JDialog d = new JDialog();
					d.setVisible(true);
					d.setTitle("Upozorenje");
					d.setBounds(300, 250, 200, 150);
					JLabel l = new JLabel("Morate izabrati sva polja");
					l.setVisible(true);
					d.getContentPane().add(l);
				}
				proba =1;
			}
		});
	}
	
	public void color (int red, int yellow, JLabel lable, JLabel lable2, JLabel lable3, JLabel lable4) {
		if(yellow == 1 && red == 0) {
			lable.setOpaque(true);
			lable.setBackground(Color.YELLOW);
		}
		if(yellow == 2 && red == 0) {
			lable.setOpaque(true);
			lable.setBackground(Color.YELLOW);
			lable2.setOpaque(true);
			lable2.setBackground(Color.YELLOW);
		}
		if(yellow == 3 && red == 0) {
			lable.setOpaque(true);
			lable.setBackground(Color.YELLOW);
			lable2.setOpaque(true);
			lable2.setBackground(Color.YELLOW);
			lable3.setOpaque(true);
			lable3.setBackground(Color.YELLOW);
		}
		if(yellow == 4 && red == 0) {
			lable.setOpaque(true);
			lable.setBackground(Color.YELLOW);
			lable2.setOpaque(true);
			lable2.setBackground(Color.YELLOW);
			lable3.setOpaque(true);
			lable3.setBackground(Color.YELLOW);
			lable4.setOpaque(true);
			lable4.setBackground(Color.YELLOW);
		}
		if(yellow == 0 && red == 1) {
			lable.setOpaque(true);
			lable.setBackground(Color.RED);
		}
		if(yellow == 1 && red == 1) {
			lable.setOpaque(true);
			lable.setBackground(Color.RED);
			lable2.setOpaque(true);
			lable2.setBackground(Color.YELLOW);
		}
		if(yellow == 2 && red == 1) {
			lable.setOpaque(true);
			lable.setBackground(Color.RED);
			lable2.setOpaque(true);
			lable2.setBackground(Color.YELLOW);
			lable3.setOpaque(true);
			lable3.setBackground(Color.YELLOW);
		}
		if(yellow == 3 && red == 1) {
			lable.setOpaque(true);
			lable.setBackground(Color.RED);
			lable2.setOpaque(true);
			lable2.setBackground(Color.YELLOW);
			lable3.setOpaque(true);
			lable3.setBackground(Color.YELLOW);
			lable4.setOpaque(true);
			lable4.setBackground(Color.YELLOW);
		}
		if(yellow == 0 && red == 2) {
			lable.setOpaque(true);
			lable.setBackground(Color.RED);
			lable2.setOpaque(true);
			lable2.setBackground(Color.RED);
		}
		if(yellow == 1 && red == 2) {
			lable.setOpaque(true);
			lable.setBackground(Color.RED);
			lable2.setOpaque(true);
			lable2.setBackground(Color.RED);
			lable3.setOpaque(true);
			lable3.setBackground(Color.YELLOW);
		}
		if(yellow == 2 && red == 2) {
			lable.setOpaque(true);
			lable.setBackground(Color.RED);
			lable2.setOpaque(true);
			lable2.setBackground(Color.RED);
			lable3.setOpaque(true);
			lable3.setBackground(Color.YELLOW);
			lable4.setOpaque(true);
			lable4.setBackground(Color.YELLOW);
		}
		if(yellow == 0 && red == 3) {
			lable.setOpaque(true);
			lable.setBackground(Color.RED);
			lable2.setOpaque(true);
			lable2.setBackground(Color.RED);
			lable3.setOpaque(true);
			lable3.setBackground(Color.RED);
		}
		if(yellow == 1 && red == 3) {
			lable.setOpaque(true);
			lable.setBackground(Color.RED);
			lable2.setOpaque(true);
			lable2.setBackground(Color.RED);
			lable3.setOpaque(true);
			lable3.setBackground(Color.RED);
			lable4.setOpaque(true);
			lable4.setBackground(Color.YELLOW);
		}
		if(yellow == 0 && red == 4) {
			lable.setOpaque(true);
			lable.setBackground(Color.RED);
			lable2.setOpaque(true);
			lable2.setBackground(Color.RED);
			lable3.setOpaque(true);
			lable3.setBackground(Color.RED);
			lable4.setOpaque(true);
			lable4.setBackground(Color.RED);
		}
	}

	
}
