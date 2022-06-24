package worlde.grafico;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMenu {

	private JFrame frmWordleMenu;
	private String nombre;
	
	
	/**
	 * Create the application.
	 */
	public GuiMenu(String nombre) {
		initialize();
		this.nombre=nombre;
		frmWordleMenu.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWordleMenu = new JFrame();
		frmWordleMenu.setTitle("WORDLE -- MENU");
		frmWordleMenu.setBounds(100, 100, 600, 500);
		frmWordleMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWordleMenu.getContentPane().setLayout(null);
		frmWordleMenu.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 584, 461);
		frmWordleMenu.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(0, 0, 584, 173);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WORDLE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(133, 32, 305, 85);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(0, 171, 584, 290);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("JUGAR");
		btnNewButton.addActionListener(new ActionListener() {
		//Boton que abre la ventana de juego de wordle
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				GuiWordle jugar = new GuiWordle(nombre);
				frmWordleMenu.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(127, 11, 350, 80);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RANKING");
		btnNewButton_1.addActionListener(new ActionListener() {
			//Boton que abre la ventana de ranking
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				GuiRanking ranking = new GuiRanking(nombre);
				frmWordleMenu.setVisible(false);

			
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(127, 96, 350, 80);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CERRAR SESION");
		btnNewButton_2.addActionListener(new ActionListener() {
			//Boton que abre la ventana de inicio de sesion para cambiar de cuenta
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				GuiInicio inicio = new GuiInicio();
				frmWordleMenu.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(127, 187, 350, 80);
		panel_2.add(btnNewButton_2);
	}

}
