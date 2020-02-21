import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class DialogWin extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int points;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogWin dialog = new DialogWin(points);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogWin(int points) {
		DialogWin.points = points;
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBounds(0, 0, 357, 100);
		setBounds(100, 100, 371, 294);
		getContentPane().setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		setTitle("Cestitiamo");

		JLabel label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(22, 10, 299, 65);
		label.setVisible(true);
		contentPanel.setLayout(null);
		label.setText("Pobedili ste u ovoj igri");
		contentPanel.add(label);
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 213, 357, 44);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("U redu");
				okButton.setBounds(36, 5, 150, 30);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						dispose();					
					}
				});
				
			}
			{
				JButton cancelButton = new JButton("Izadji iz igre");
				cancelButton.setBounds(196, 5, 150, 30);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						StatsDialog sd = new StatsDialog(2);
						sd.setVisible(true);
						sd.setTitle("Kraj Igre");
					}
				});
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 102, 436, 111);
				getContentPane().add(panel);
				panel.setLayout(null);
				
				JLabel winLabel = new JLabel("Osvojeno poena u ovoj igri: ");
				winLabel.setHorizontalAlignment(SwingConstants.CENTER);
				winLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				winLabel.setBounds(10, 8, 344, 35);
				panel.add(winLabel);
				
				String s = Integer.toString(PanelRow.getWinPoints());
				
				JLabel wins = new JLabel();
				wins.setHorizontalAlignment(SwingConstants.CENTER);
				wins.setFont(new Font("Tahoma", Font.PLAIN, 16));
				wins.setBounds(149, 46, 51, 35);
				wins.setText(s);
				panel.add(wins);
				
			}
		}
	}
}