package worlde.grafico;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import wordle.codigo.GestorFicheros;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuiCrearCuenta {

	private JFrame frmCrearCuenta;
	private JTextField usuario;
	private JPasswordField pass1;
	private JPasswordField pass2;
	private JCheckBox check1;
	private JCheckBox check2;
	private GestorFicheros gestor = new GestorFicheros();
	

	/**
	 * Create the application.
	 */
	public GuiCrearCuenta() {
		initialize();
		frmCrearCuenta.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrearCuenta = new JFrame();
		frmCrearCuenta.setResizable(false);
		frmCrearCuenta.setTitle("WORDLE -- CREAR CUENTA");
		frmCrearCuenta.setResizable(false);
		frmCrearCuenta.setBounds(100, 100, 600, 500);
		frmCrearCuenta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrearCuenta.getContentPane().setLayout(null);
		frmCrearCuenta.setLocationRelativeTo(null);
	
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 584, 461);
		frmCrearCuenta.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Introduce un nombre de usuario");
		lblNewLabel_2.setForeground(new Color(105, 105, 105));
		lblNewLabel_2.setBounds(47, 152, 226, 14);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(389, 0, 195, 461);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panelAyuda = new JPanel();
		panelAyuda.setVisible(false);
		panelAyuda.setBounds(10, 222, 175, 125);
		panel_1.add(panelAyuda);
		panelAyuda.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Requisitos");
		lblNewLabel_3.setBounds(0, 11, 111, 14);
		panelAyuda.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_3_1 = new JLabel("- La contrase\u00F1a ha de contener:");
		lblNewLabel_3_1.setBounds(0, 36, 175, 14);
		panelAyuda.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("-Al menos una mayuscula");
		lblNewLabel_3_1_1.setBounds(0, 49, 175, 14);
		panelAyuda.add(lblNewLabel_3_1_1);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("-Al menos un numero");
		lblNewLabel_3_1_1_1.setBounds(0, 61, 175, 14);
		panelAyuda.add(lblNewLabel_3_1_1_1);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("-Al menos un caracter especial,");
		lblNewLabel_3_1_1_1_1.setBounds(0, 74, 195, 14);
		panelAyuda.add(lblNewLabel_3_1_1_1_1);
		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("menos '#'");
		lblNewLabel_3_1_1_1_1_1.setBounds(5, 86, 111, 14);
		panelAyuda.add(lblNewLabel_3_1_1_1_1_1);
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_3_1_1_1_1_2 = new JLabel("-Tener longitud entre 8 y 16");
		lblNewLabel_3_1_1_1_1_2.setBounds(0, 99, 195, 14);
		panelAyuda.add(lblNewLabel_3_1_1_1_1_2);
		lblNewLabel_3_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel = new JLabel("CREAR CUENTA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(84, 11, 240, 70);
		panel.add(lblNewLabel);
		
		usuario = new JTextField();
		usuario.setBorder(null);
		usuario.setBounds(37, 149, 220, 20);
		panel.add(usuario);
		usuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nuevo Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(37, 133, 124, 14);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(35, 174, 233, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(35, 248, 233, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nueva Contrase\u00F1a");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(37, 207, 124, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Introduce una contrase\u00F1a");
		lblNewLabel_2_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_2_1.setBounds(47, 226, 195, 14);
		panel.add(lblNewLabel_2_1);
		
		pass1 = new JPasswordField();
		pass1.setEchoChar('*');
		pass1.setBorder(null);
		pass1.setBounds(37, 223, 220, 20);
		panel.add(pass1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Repite la Contrase\u00F1a");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(39, 274, 124, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Introduce de nuevo la contrase\u00F1a");
		lblNewLabel_2_1_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_2_1_1.setBounds(49, 293, 195, 14);
		panel.add(lblNewLabel_2_1_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(37, 315, 233, 2);
		panel.add(separator_1_1);
		
		pass2 = new JPasswordField();
		pass2.setEchoChar('*');
		pass2.setBorder(null);
		pass2.setBounds(39, 290, 220, 20);
		panel.add(pass2);
		//CheckBox que permite mostrar la contraseña en el campo pass1
		JCheckBox check1 = new JCheckBox("New check box");
		check1.setToolTipText("Click para mostrar la contrase\u00F1a");
		check1.setForeground(new Color(0, 0, 0));
		check1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check1.isSelected()) {
					pass1.setEchoChar((char)0);
				}else {
					pass1.setEchoChar('*');
				}
			}
		});
		check1.setBounds(286, 227, 21, 23);
		panel.add(check1);
		//CheckBox que permite mostrar la contraseña en el campo pass2
		JCheckBox check2 = new JCheckBox("New check box");
		check2.setToolTipText("Click para mostrar la contrase\u00F1a");
		check2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check2.isSelected()) {
					pass2.setEchoChar((char)0);
				}else {
					pass2.setEchoChar('*');
				}
			}
		});
		check2.setBounds(286, 289, 21, 23);
		panel.add(check2);
		/*
		 * Al pulsar el boton.si se cumplen las condiciones de usuario y contraseña se guarda al usuario  en el 
		 * archivo jugadores separando el usuario de la contraseña con un '#' ,muestra un mensaje de exitoy abre la ventana de GuiMenu,
		 * en el caso contrario muestra un mensaje de error
		 * */
		JButton btnNewButton = new JButton("Crear Cuenta");
		btnNewButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				if(comprobarUsuario(usuario) && comprobarPass(pass1)) {
					gestor.guardarJugador(usuario.getText()+"#"+new String(pass1.getPassword()));
					JOptionPane.showMessageDialog(null,"El usuario se ha creado con exito.","EXITO", JOptionPane.INFORMATION_MESSAGE);
					@SuppressWarnings("unused")
					GuiMenu menu= new GuiMenu(usuario.getText());
					frmCrearCuenta.setVisible(false);
					
				}else {
					JOptionPane.showMessageDialog(null,"Los datos introducidos no son validos","ERROR", JOptionPane.ERROR_MESSAGE);
					
				}
			
			}
		});
		btnNewButton.setBackground(new Color(245, 245, 245));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(103, 362, 124, 23);
		panel.add(btnNewButton);
		
		JButton Atras = new JButton("Atras");
		Atras.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				GuiInicio inicio = new GuiInicio();
				inicio.main(null);
				frmCrearCuenta.dispose();
			}
		});
		Atras.setForeground(Color.BLACK);
		Atras.setBackground(new Color(245, 245, 245));
		Atras.setBounds(6, 11, 68, 23);
		panel.add(Atras);
		//Boton que muestra los requistos minimos de la contraseña
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnAyuda.setForeground(Color.BLACK);
		btnAyuda.setBackground(new Color(245, 245, 245));
		btnAyuda.setBounds(103, 396, 124, 23);
		panel.add(btnAyuda);
	}
	//Este metodo realiza una comprobacion de los requistos minimos del usuario
	public boolean comprobarUsuario(JTextField usu) {
		boolean esCorrecto=true;
		if(usu.getText().contains("#")) {
			esCorrecto=false;
		}
		return esCorrecto;
	}
	
	public boolean comprobarPass(JPasswordField password){
		boolean resultado=false;
			if(comprobarPass(new String(password.getPassword()))) {
				resultado = true;
			}else {
				JOptionPane.showMessageDialog(null,"Contraseña con formato incorrecto.","Error", JOptionPane.ERROR_MESSAGE);
				usuario.setText(null);
				pass1.setText(null);
				pass2.setText(null);
				check1.setSelected(false);
				check2.setSelected(false);
			}
		return resultado;
	}
	//Este metodo realiza una comprobacion de los requistos minimos de la contraseña y devuelve un boolean
	public boolean comprobarPass(String pass) {
		boolean esCorrecto=false;
		int minCaps= 1;
		int minNums= 1;
		int minEspChar = 1;
		int numCaps=0;
		int numNums=0;
		int numEspChars=0;
		for (int i = 0; i < pass.length(); i++) {
			if(pass.contains("#")) {
				esCorrecto=false;
				break;
			}if(pass.length()<8 || pass.length()>16) {
				esCorrecto=false;
				break;
			}if(Character.isDigit(pass.charAt(i))) {
				numNums++;
			}if(Character.isUpperCase(pass.charAt(i))) {
				numCaps++;
			}if(pass.charAt(i)==33 || pass.charAt(i)==36 || pass.charAt(i)==64) {
				numEspChars++;
			}
		}if(numCaps>=minCaps && numNums>=minNums && numEspChars>=minEspChar) {
			esCorrecto=true;
		}
		return esCorrecto;
	}
	
}
