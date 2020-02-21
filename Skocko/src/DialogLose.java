import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DialogLose extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogLose dialog = new DialogLose();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogLose() {
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBounds(0, 0, 357, 100);
		setBounds(100, 100, 371, 200);
		getContentPane().setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		setTitle("Kraj igre");

		JLabel label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(38, 10, 299, 65);
		label.setVisible(true);
		contentPanel.setLayout(null);
		label.setText("Izgubili ste u ovoj igri");
		contentPanel.add(label);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setBounds(0, 110, 357, 50);
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
		}
	}

}
