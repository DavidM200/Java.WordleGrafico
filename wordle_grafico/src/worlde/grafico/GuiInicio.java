package worlde.grafico;


import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import wordle.codigo.GestorFicheros;

@SuppressWarnings("unused")
public class GuiInicio {

	private JFrame frmWordleInicio;
	private JTextField usuario;
	private JPasswordField pass;
	private GestorFicheros gestor = new GestorFicheros();
	private JCheckBox chckbxNewCheckBox;
	/**
	 *Esta es la ventana inicial del proyecto y es la que se debe lanzar primero
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiInicio window = new GuiInicio();
					window.frmWordleInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiInicio() {
		initialize();
		frmWordleInicio.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmWordleInicio = new JFrame();
		frmWordleInicio.setTitle("WORDLE -- INICIO DE SESION");
		frmWordleInicio.setResizable(false);
		frmWordleInicio.setBounds(100, 100, 600, 500);
		frmWordleInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWordleInicio.getContentPane().setLayout(null);
		frmWordleInicio.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 584, 461);
		frmWordleInicio.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(363, 0, 221, 468);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INICIAR SESION");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 355, 74);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USUARIO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(37, 133, 69, 14);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(37, 176, 213, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_1_1 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(37, 223, 79, 14);
		panel.add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(37, 266, 213, 2);
		panel.add(separator_1);
		
		usuario = new JTextField();
		usuario.setBorder(null);
		usuario.setForeground(new Color(128, 128, 128));
		usuario.setBounds(37, 158, 203, 14);
		panel.add(usuario);
		usuario.setColumns(10);
		
		JButton IniciarSesion = new JButton("Iniciar Sesion");
		IniciarSesion.addActionListener(new ActionListener() {
			/*Una vez pulsado el boton comprueba que el usuario y la contraseña introducida en los campos coinciden con
			 * el usuario y contraseña almacenados en le archivo jugadores,en caso de que no coincidan dara un pop-up de error*/
			public void actionPerformed(ActionEvent e) {
				if(comprobarUsuario(usuario) && comprobarPasswd(pass)) {
				GuiMenu inicio = new GuiMenu(usuario.getText());
				frmWordleInicio.setVisible(false);

				}else {
					JOptionPane.showMessageDialog(null,"Contraseña o Usuario incorrectos.","ERROR", JOptionPane.ERROR_MESSAGE);
					usuario.setText(null);
					pass.setText(null);
					chckbxNewCheckBox.setSelected(false);
					
				}
			}
		});
		IniciarSesion.setBackground(new Color(245, 245, 245));
		IniciarSesion.setBounds(37, 347, 125, 23);
		panel.add(IniciarSesion);
		//Al pulsar el boton vacia los campos
		JButton btnRestaurar = new JButton("Restaurar");
		btnRestaurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usuario.setText(null);
				pass.setText(null);
			}
		});
		btnRestaurar.setBackground(new Color(245, 245, 245));
		btnRestaurar.setBounds(172, 347, 125, 23);
		panel.add(btnRestaurar);
	
		
		JLabel lblNewLabel_2 = new JLabel("\u00BFNo tienes cuenta?Crea una");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			
			//Al pulsar el boton te lleva a la ventana de crear cuenta
			public void mouseClicked(MouseEvent e) {
				GuiCrearCuenta crear = new GuiCrearCuenta();
				frmWordleInicio.setVisible(false);
			}
		});
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setBounds(37, 287, 192, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Introduzca la contrase\u00F1a");
		lblNewLabel_3.setForeground(new Color(128, 128, 128));
		lblNewLabel_3.setBounds(47, 248, 213, 14);
		panel.add(lblNewLabel_3);
		
		pass = new JPasswordField();
		pass.setEchoChar('*');
		pass.setBorder(null);
		pass.setBounds(37, 248, 213, 14);
		panel.add(pass);
		
		JLabel lblNewLabel_3_1 = new JLabel("Introduzca el nombre de usuario");
		lblNewLabel_3_1.setForeground(Color.GRAY);
		lblNewLabel_3_1.setBounds(47, 158, 213, 14);
		panel.add(lblNewLabel_3_1);
		
		
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(37, 300, 156, 2);
		panel.add(separator_2);
		/*Checkbosx que permite mostrar la contraseña escrita en el campo pass*/
		chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setToolTipText("Click para mostrar la contrase\u00F1a");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					pass.setEchoChar((char)0);
				}else {
					pass.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBounds(256, 244, 23, 23);
		panel.add(chckbxNewCheckBox);
		
		
	}
	/*Realiza una comprobacion de del usuario del juagdor mediante el gestor de archivos y devuelve un boolean*/
	public boolean comprobarUsuario(JTextField usuario) {
		boolean resultado=false;
		resultado = gestor.getJugador(usuario.getText());
		return resultado;
	}
	/*Realiza una comprobacion de de la contraseña del juagdor mediante el gestor de archivos y devuelve un boolean*/
	public boolean comprobarPasswd(JPasswordField pass){
		boolean resultado=false;
			if(new String(pass.getPassword()) != null) {
				resultado = gestor.comprobarPasswd(new String(pass.getPassword()));
			}
		return resultado;
	}

}
