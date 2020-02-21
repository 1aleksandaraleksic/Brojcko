import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class StatsDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			StatsDialog dialog = new StatsDialog(1);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public StatsDialog(int wichOption) {
		
		JPanel contentPanel = new JPanel();
		setBounds(100, 100, 300, 200);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 286, 122);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		setTitle("Stanje");
		contentPanel.setLayout(null);
		
			JLabel winLabel = new JLabel("Broj pobeda: ");
			winLabel.setBounds(10, 10, 97, 20);
			winLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			contentPanel.add(winLabel);
		
			String win = Integer.toString(PanelRow.getNumberOfWin());
			
			JLabel wins = new JLabel();
			wins.setBounds(115, 10, 21, 20);
			wins.setText(win);
			wins.setFont(new Font("Tahoma", Font.PLAIN, 16));
			contentPanel.add(wins);
		
			JLabel gamesL = new JLabel("Broj poraza:");
			gamesL.setFont(new Font("Tahoma", Font.PLAIN, 16));
			gamesL.setBounds(10, 40, 97, 20);
			contentPanel.add(gamesL);
		
			String lose = Integer.toString(PanelRow.getNumberOfLose());
			
			JLabel showGamesL = new JLabel(lose);
			showGamesL.setFont(new Font("Tahoma", Font.PLAIN, 16));
			showGamesL.setBounds(115, 40, 21, 20);
			contentPanel.add(showGamesL);
		
//			JLabel performance = new JLabel("Uspesnost: ");
//			performance.setFont(new Font("Tahoma", Font.PLAIN, 16));
//			performance.setBounds(10, 70, 97, 20);
//			contentPanel.add(performance);
//			
//			String percentage = Integer.toString(PanelRow.getPercentage());
//			
//			JLabel perfomancePercentage = new JLabel();
//			perfomancePercentage.setText(percentage);
//			perfomancePercentage.setFont(new Font("Tahoma", Font.PLAIN, 16));
//			perfomancePercentage.setBounds(115, 70, 21, 20);
//			contentPanel.add(perfomancePercentage);
			
			JLabel pointsText = new JLabel("Broj ostvarenih poena: ");
			pointsText.setFont(new Font("Tahoma", Font.PLAIN, 16));
			pointsText.setBounds(10, 100, 167, 20);
			contentPanel.add(pointsText);
			
			String pointS = Integer.toString(PanelRow.getWinPoints());
			
			JLabel points = new JLabel();
			points.setText(pointS);
			points.setFont(new Font("Tahoma", Font.PLAIN, 16));
			points.setBounds(184, 100, 21, 20);
			contentPanel.add(points);
				
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 132, 286, 31);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("OK");
				okButton.setBounds(90, 0, 80, 31);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(wichOption == 1) {
							dispose();
						} else {
							System.exit(0);
						}
					}
				});
			}
		}
	}
}
