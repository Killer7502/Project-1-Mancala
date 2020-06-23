package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;

/**
 * Basic Mancala board GUI.
 * @author Natalie Williams
 * @version 0.2
 */
public class MancalaGUI {

	private JFrame frmMancala;

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
		GroupLayout groupLayout = new GroupLayout(frmMancala.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
					.addGap(59)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		frmMancala.getContentPane().setLayout(groupLayout);
	}
}
