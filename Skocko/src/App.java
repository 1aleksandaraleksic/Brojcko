import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

public class App extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int timesPlay;

	public static int getTimesPlay() {
		return timesPlay;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App() {
		timesPlay++;
		setTitle("Brojcko");
		
		setBounds(100, 100, 600, 700);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent we) {
				String ObjButtons[] = { "Da", "Ne" };
				int PromptResult = JOptionPane.showOptionDialog(null, "Da li ste sigurni da zelite da napustite igru?",
						"Upozorenje", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons,
						ObjButtons[1]);
				if (PromptResult == 0) {
					System.exit(0);
				}
			}
		});
		
		PanelRandomNumbers prn = new PanelRandomNumbers();
		prn.setBounds(10, 10, 300, 62);
		prn.setVisible(true);
		contentPane.add(prn);
		
		int rnd1 = PanelRandomNumbers.getRNum1();
		int rnd2 = PanelRandomNumbers.getRNum2();
		int rnd3 = PanelRandomNumbers.getRNum3();
		int rnd4 = PanelRandomNumbers.getRNum4();
		
		PanelRow row1 = new PanelRow(rnd1,rnd2,rnd3,rnd4,30,1);
		row1.setBounds(10, 75, 545, 80);
		contentPane.add(row1);
		row1.setVisible(true);
		row1.getListeners(ActionListener.class);
		
		PanelRow row2 = new PanelRow(rnd1,rnd2,rnd3,rnd4,30,2);
		row2.setBounds(10, 155, 545, 80);
		contentPane.add(row2);
		row2.setVisible(false);
		row2.setVisible(true);
		
		PanelRow row3 = new PanelRow(rnd1,rnd2,rnd3,rnd4,30,3);
		row3.setBounds(10, 235, 545, 80);
		contentPane.add(row3);
		row3.setVisible(true);
				
		PanelRow row4 = new PanelRow(rnd1,rnd2,rnd3,rnd4,30,4);
		row4.setBounds(10, 315, 545, 80);
		contentPane.add(row4);
		row4.setVisible(true);
				
		PanelRow row5 = new PanelRow(rnd1,rnd2,rnd3,rnd4,30,5);
		row5.setBounds(10, 395, 545, 80);
		contentPane.add(row5);
		row5.setVisible(true);
				
		PanelRow row6 = new PanelRow(rnd1,rnd2,rnd3,rnd4,30,6);
		row6.setBounds(10, 475, 545, 80);
		contentPane.add(row6);
		row6.setVisible(true);
				
		PanelRow row7 = new PanelRow(rnd1,rnd2,rnd3,rnd4,20,7);
		row7.setBounds(10, 555, 545, 80);
		contentPane.add(row7);
		row7.setVisible(true);
		
		JButton statusB = new JButton("Stanje");
		statusB.setBounds(446, 27, 100, 30);
		contentPane.add(statusB);
		statusB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StatsDialog sd = new StatsDialog(1);
				sd.setVisible(true);
			}
		});
			
		JButton restart = new JButton("Igraj ponovo");
		restart.setBounds(306, 27, 120, 30);
		contentPane.add(restart);
		restart.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new App().setVisible(true);	
			}
		});
	}
}
