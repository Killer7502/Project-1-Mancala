package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;

/**
 * Basic Mancala board GUI.
 * @author Natalie Williams
 * @version 1.0
 */
public class MancalaGUI {

	private JFrame frmMancala;
	private JTextField txtLeftMancala;
	private JTextField txtRightMancala;
	private JTextField txtPocketA1;
	private RoundedTextField txtPocketA2;
	private RoundedTextField txtPocketA3;
	private RoundedTextField txtPocketA4;
	private RoundedTextField txtPocketA5;
	private RoundedTextField txtPocketA6;
	private RoundedTextField txtPocketB1;
	private RoundedTextField txtPocketB2;
	private RoundedTextField txtPocketB3;
	private RoundedTextField txtPocketB4;
	private RoundedTextField txtPocketB5;
	private RoundedTextField txtPocketB6;
	private JButton btnExit;
	private JButton btnStart;
	private JButton btnA1;
	private JButton btnA2;
	private JButton btnA3;
	private JButton btnA4;
	private JButton btnA5;
	private JButton btnA6;
	private JButton btnB1;
	private JButton btnB2;
	private JButton btnB3;
	private JButton btnB4;
	private JButton btnB5;
	private JButton btnB6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MancalaGUI window = new MancalaGUI();
					window.frmMancala.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MancalaGUI() {
		initialize();
		eventHandler();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	// EVENT HANDLER
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * Handles events.
	 */
	private void eventHandler() {
		
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////
	// INITIALIZER
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMancala = new JFrame();
		frmMancala.setTitle("Mancala");
		frmMancala.setBounds(100, 100, 1049, 632);
		frmMancala.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		btnStart = new JButton("Start");
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout groupLayout = new GroupLayout(frmMancala.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
								.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(414)
							.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addGap(60)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnExit)
						.addComponent(btnStart))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		txtLeftMancala = new RoundedTextField(15);
		txtLeftMancala.setColumns(10);
		txtLeftMancala.setEditable(false);
		txtLeftMancala.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLeftMancala.setText("        0");
		txtLeftMancala.setBackground(SystemColor.textHighlightText);
		
		txtRightMancala = new RoundedTextField(15);
		txtRightMancala.setColumns(10);
		txtRightMancala.setEditable(false);
		txtRightMancala.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtRightMancala.setText("        0");
		txtRightMancala.setBackground(SystemColor.textHighlightText);
		
		txtPocketA1 = new RoundedTextField(15);
		txtPocketA1.setColumns(10);
		txtPocketA1.setEditable(false);
		txtPocketA1.setBackground(SystemColor.textHighlightText);
		txtPocketA1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketA1.setText("      4");
		
		txtPocketA2 = new RoundedTextField(15);
		txtPocketA2.setColumns(10);
		txtPocketA2.setEditable(false);
		txtPocketA2.setBackground(SystemColor.textHighlightText);
		txtPocketA2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketA2.setText("      4");
		
		txtPocketA3 = new RoundedTextField(15);
		txtPocketA3.setColumns(10);
		txtPocketA3.setEditable(false);
		txtPocketA3.setBackground(SystemColor.textHighlightText);
		txtPocketA3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketA3.setText("      4");
		
		txtPocketA4 = new RoundedTextField(15);
		txtPocketA4.setColumns(10);
		txtPocketA4.setEditable(false);
		txtPocketA4.setBackground(SystemColor.textHighlightText);
		txtPocketA4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketA4.setText("      4");
		
		txtPocketA5 = new RoundedTextField(15);
		txtPocketA5.setColumns(10);
		txtPocketA5.setEditable(false);
		txtPocketA5.setBackground(SystemColor.textHighlightText);
		txtPocketA5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketA5.setText("      4");
		
		txtPocketA6 = new RoundedTextField(15);
		txtPocketA6.setColumns(10);
		txtPocketA6.setEditable(false);
		txtPocketA6.setBackground(SystemColor.textHighlightText);
		txtPocketA6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketA6.setText("      4");
		
		txtPocketB1 = new RoundedTextField(15);
		txtPocketB1.setColumns(10);
		txtPocketB1.setEditable(false);
		txtPocketB1.setBackground(SystemColor.textHighlightText);
		txtPocketB1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketB1.setText("      4");
		
		txtPocketB2 = new RoundedTextField(15);
		txtPocketB2.setColumns(10);
		txtPocketB2.setEditable(false);
		txtPocketB2.setBackground(SystemColor.textHighlightText);
		txtPocketB2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketB2.setText("      4");
		
		txtPocketB3 = new RoundedTextField(15);
		txtPocketB3.setColumns(10);
		txtPocketB3.setEditable(false);
		txtPocketB3.setBackground(SystemColor.textHighlightText);
		txtPocketB3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketB3.setText("      4");
		
		txtPocketB4 = new RoundedTextField(15);
		txtPocketB4.setColumns(10);
		txtPocketB4.setEditable(false);
		txtPocketB4.setBackground(SystemColor.textHighlightText);
		txtPocketB4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketB4.setText("      4");
		
		txtPocketB5 = new RoundedTextField(15);
		txtPocketB5.setColumns(10);
		txtPocketB5.setEditable(false);
		txtPocketB5.setBackground(SystemColor.textHighlightText);
		txtPocketB5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketB5.setText("      4");
		
		txtPocketB6 = new RoundedTextField(15);
		txtPocketB6.setColumns(10);
		txtPocketB6.setEditable(false);
		txtPocketB6.setBackground(SystemColor.textHighlightText);
		txtPocketB6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPocketB6.setText("      4");
		
		btnA1 = new JButton("A-1");
		btnA1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnA2 = new JButton("A-2");
		btnA2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnA3 = new JButton("A-3");
		btnA3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnA4 = new JButton("A-4");
		btnA4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnA5 = new JButton("A-5");
		btnA5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnA6 = new JButton("A-6");
		btnA6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnB1 = new JButton("B-1");
		btnB1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnB2 = new JButton("B-2");
		btnB2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnB3 = new JButton("B-3");
		btnB3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnB4 = new JButton("B-4");
		btnB4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnB5 = new JButton("B-5");
		btnB5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnB6 = new JButton("B-6");
		btnB6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(31)
					.addComponent(txtLeftMancala, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnA1, 0, 0, Short.MAX_VALUE)
							.addGroup(Alignment.LEADING, gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtPocketA1, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
								.addComponent(txtPocketB1, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
						.addComponent(btnB1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtPocketA2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPocketB2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnA2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnB2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtPocketA3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPocketB3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnA3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnB3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addGap(59)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtPocketA4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPocketB4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnA4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnB4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addGap(57)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtPocketA5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPocketB5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnA5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnB5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnB6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnA6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPocketA6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPocketB6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(txtRightMancala, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtLeftMancala, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtRightMancala, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(20, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtPocketB1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocketB2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocketB3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocketB4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocketB5, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocketB6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnB1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnB2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnB3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnB4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnB5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnB6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtPocketA1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocketA2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocketA3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocketA4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocketA5, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocketA6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnA1)
									.addComponent(btnA2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnA3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnA4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnA5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnA6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(23))))
		);
		panel.setLayout(gl_panel);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		frmMancala.getContentPane().setLayout(groupLayout);
	}
}
