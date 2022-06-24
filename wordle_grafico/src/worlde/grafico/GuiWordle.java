package worlde.grafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import wordle.codigo.GestorFicheros;

@SuppressWarnings("unused")
public class GuiWordle {
	
	private JFrame frmJuego;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField C11;
	private JTextField C12;
	private JTextField C13;
	private JTextField C14;
	private JTextField C15;
	private JTextField C25;
	private JTextField C24;
	private JTextField C23;
	private JTextField C22;
	private JTextField C21;
	private JTextField C31;
	private JTextField C32;
	private JTextField C33;
	private JTextField C34;
	private JTextField C35;
	private JTextField C45;
	private JTextField C44;
	private JTextField C43;
	private JTextField C42;
	private JTextField C41;
	private JTextField C51;
	private JTextField C52;
	private JTextField C53;
	private JTextField C54;
	private JTextField C55;
	private JTextField C65;
	private JTextField C64;
	private JTextField C63;
	private JTextField C62;
	private JTextField C61;
	private JTextField txtrespuesta;
	private JButton btnNewButton;
	//Contador para los intentos de respuesta
	private int contador = 0;
	private GestorFicheros gestor = new GestorFicheros();
	//Array de cinco posiciones parra las letras de las palabras
	private JTextField[] linea1 = new JTextField[5];
	private JTextField[] linea2 = new JTextField[5];
	private JTextField[] linea3 = new JTextField[5];
	private JTextField[] linea4 = new JTextField[5];
	private JTextField[] linea5 = new JTextField[5];
	private JTextField[] linea6 = new JTextField[5];
	private String nombre;
	

	/**
	 * Create the application.
	 */
	public GuiWordle(String nombre) {
		initialize();
		this.nombre=nombre;
		frmJuego.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String secreto = gestor.getPalabra();
		frmJuego = new JFrame();
		frmJuego.setResizable(false);
		frmJuego.setTitle("WORDLE -- JUEGO");
		frmJuego.setBounds(100, 100, 600, 700);
		frmJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJuego.getContentPane().setLayout(null);
		frmJuego.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 584, 661);
		frmJuego.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(0, 0, 584, 140);
		panel.add(panel_1);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 139, 584, 522);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		C11 = new JTextField();
		C11.setEditable(false);
		C11.setColumns(10);
		C11.setBounds(126, 11, 50, 50);
		panel_2.add(C11);
		
		C12 = new JTextField();
		C12.setEditable(false);
		C12.setColumns(10);
		C12.setBounds(199, 11, 50, 50);
		panel_2.add(C12);
		
		C13 = new JTextField();
		C13.setEditable(false);
		C13.setColumns(10);
		C13.setBounds(267, 11, 50, 50);
		panel_2.add(C13);
		
		C14 = new JTextField();
		C14.setEditable(false);
		C14.setColumns(10);
		C14.setBounds(336, 11, 50, 50);
		panel_2.add(C14);
		
		C15 = new JTextField();
		C15.setEditable(false);
		C15.setColumns(10);
		C15.setBounds(408, 11, 50, 50);
		panel_2.add(C15);
		
		C25 = new JTextField();
		C25.setEditable(false);
		C25.setColumns(10);
		C25.setBounds(408, 72, 50, 50);
		panel_2.add(C25);
		
		C24 = new JTextField();
		C24.setEditable(false);
		C24.setColumns(10);
		C24.setBounds(336, 72, 50, 50);
		panel_2.add(C24);
		
		C23 = new JTextField();
		C23.setEditable(false);
		C23.setColumns(10);
		C23.setBounds(267, 72, 50, 50);
		panel_2.add(C23);
		
		C22 = new JTextField();
		C22.setEditable(false);
		C22.setColumns(10);
		C22.setBounds(199, 72, 50, 50);
		panel_2.add(C22);
		
		C21 = new JTextField();
		C21.setEditable(false);
		C21.setColumns(10);
		C21.setBounds(126, 72, 50, 50);
		panel_2.add(C21);
		
		C31 = new JTextField();
		C31.setEditable(false);
		C31.setColumns(10);
		C31.setBounds(126, 133, 50, 50);
		panel_2.add(C31);
		
		C32 = new JTextField();
		C32.setEditable(false);
		C32.setColumns(10);
		C32.setBounds(199, 133, 50, 50);
		panel_2.add(C32);
		
		C33 = new JTextField();
		C33.setEditable(false);
		C33.setColumns(10);
		C33.setBounds(267, 133, 50, 50);
		panel_2.add(C33);
		
		C34 = new JTextField();
		C34.setEditable(false);
		C34.setColumns(10);
		C34.setBounds(336, 133, 50, 50);
		panel_2.add(C34);
		
		C35 = new JTextField();
		C35.setEditable(false);
		C35.setColumns(10);
		C35.setBounds(408, 133, 50, 50);
		panel_2.add(C35);
		
		C45 = new JTextField();
		C45.setEditable(false);
		C45.setColumns(10);
		C45.setBounds(408, 194, 50, 50);
		panel_2.add(C45);
		
		C44 = new JTextField();
		C44.setEditable(false);
		C44.setColumns(10);
		C44.setBounds(336, 194, 50, 50);
		panel_2.add(C44);
		
		C43 = new JTextField();
		C43.setEditable(false);
		C43.setColumns(10);
		C43.setBounds(267, 194, 50, 50);
		panel_2.add(C43);
		
		C42 = new JTextField();
		C42.setEditable(false);
		C42.setColumns(10);
		C42.setBounds(199, 194, 50, 50);
		panel_2.add(C42);
		
		C41 = new JTextField();
		C41.setEditable(false);
		C41.setColumns(10);
		C41.setBounds(126, 194, 50, 50);
		panel_2.add(C41);
		
		C51 = new JTextField();
		C51.setEditable(false);
		C51.setColumns(10);
		C51.setBounds(126, 255, 50, 50);
		panel_2.add(C51);
		
		C52 = new JTextField();
		C52.setEditable(false);
		C52.setColumns(10);
		C52.setBounds(199, 255, 50, 50);
		panel_2.add(C52);
		
		C53 = new JTextField();
		C53.setEditable(false);
		C53.setColumns(10);
		C53.setBounds(267, 255, 50, 50);
		panel_2.add(C53);
		
		C54 = new JTextField();
		C54.setEditable(false);
		C54.setColumns(10);
		C54.setBounds(336, 255, 50, 50);
		panel_2.add(C54);
		
		C55 = new JTextField();
		C55.setEditable(false);
		C55.setColumns(10);
		C55.setBounds(408, 255, 50, 50);
		panel_2.add(C55);
		
		C65 = new JTextField();
		C65.setEditable(false);
		C65.setColumns(10);
		C65.setBounds(408, 316, 50, 50);
		panel_2.add(C65);
		
		C64 = new JTextField();
		C64.setEditable(false);
		C64.setColumns(10);
		C64.setBounds(336, 316, 50, 50);
		panel_2.add(C64);
		
		C63 = new JTextField();
		C63.setEditable(false);
		C63.setColumns(10);
		C63.setBounds(267, 316, 50, 50);
		panel_2.add(C63);
		
		C62 = new JTextField();
		C62.setEditable(false);
		C62.setColumns(10);
		C62.setBounds(199, 316, 50, 50);
		panel_2.add(C62);
		
		C61 = new JTextField();
		C61.setEditable(false);
		C61.setColumns(10);
		C61.setBounds(126, 316, 50, 50);
		panel_2.add(C61);
		/*Boton que si pulsado te lleva al menu de nuevo*/
		btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiMenu menu = new GuiMenu(nombre);
				frmJuego.setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 476, 89, 23);
		panel_2.add(btnNewButton);
		
		txtrespuesta = new JTextField();
		txtrespuesta.setBounds(126, 390, 336, 20);
		panel_2.add(txtrespuesta);
		txtrespuesta.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Respuesta:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(27, 393, 89, 14);
		panel_2.add(lblNewLabel);
		
		//Posicion de las letras de la palabra para que se puedan comparar con el array y se muestren en los campos del juego
		
		linea1[0]= C11;
		linea1[1]= C12;
		linea1[2]= C13;
		linea1[3]= C14;
		linea1[4]= C15;
		
		linea2[0]= C21;
		linea2[1]= C22;
		linea2[2]= C23;
		linea2[3]= C24;
		linea2[4]= C25;
		
		linea3[0]= C31;
		linea3[1]= C32;
		linea3[2]= C33;
		linea3[3]= C34;
		linea3[4]= C35;
		
		linea4[0]= C41;
		linea4[1]= C42;
		linea4[2]= C43;
		linea4[3]= C44;
		linea4[4]= C45;
		
		linea5[0]= C51;
		linea5[1]= C52;
		linea5[2]= C53;
		linea5[3]= C54;
		linea5[4]= C55;
		
		linea6[0]= C61;
		linea6[1]= C62;
		linea6[2]= C63;
		linea6[3]= C64;
		linea6[4]= C65;
		
		/*Al pulsar el boton se realiza una comprobacion y se aumenta un contador de intentos en caso de que se acaben 
		 * el numero de intentos se muestra un pop-up que da un mensaje de derrota*/
		JButton btnResponder = new JButton("Responder");
		btnResponder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contador==0) {
					comprobar(linea1,secreto,txtrespuesta);
					txtrespuesta.setText(null);
					contador++;
				}else if(contador==1) {
					comprobar(linea2,secreto,txtrespuesta);
					txtrespuesta.setText(null);
					contador++;
				}else if(contador==2) {
					comprobar(linea3,secreto,txtrespuesta);
					txtrespuesta.setText(null);
					contador++;
				}else if(contador==3) {
					comprobar(linea4,secreto,txtrespuesta);
					txtrespuesta.setText(null);
					contador++;
				}else if(contador==4) {
					comprobar(linea5,secreto,txtrespuesta);
					txtrespuesta.setText(null);
					contador++;
				}else if(contador==5) {
					comprobar(linea6,secreto,txtrespuesta);
					txtrespuesta.setText(null);
					JOptionPane.showMessageDialog(null, "VAYA!!! Intentalo otra vez", "DERROTA", JOptionPane.INFORMATION_MESSAGE);
					contador++;
				}
			}
		});
		btnResponder.setBounds(221, 421, 148, 23);
		panel_2.add(btnResponder);
	
	
	}
	/*Si se cumple la condicion de victoria y antes de que se supere el numero de intentos se
	 * muestra un mensaje de victoria y se guarda el nombre de el jugador en el archivo ranking
	 * y se abre la ventana de GuiRanking*/

	public void ganarPartida(String secreto, String palabraConjetura) {
		if(secreto.compareTo(palabraConjetura)==0) {
			gestor.actualizar(nombre);
			JOptionPane.showMessageDialog(null, "¡Felicidades!, has sido un digno oponente", "VICTORIA", JOptionPane.INFORMATION_MESSAGE);
			GuiRanking rank = new GuiRanking(nombre);
			frmJuego.setVisible(false);
		}		
	}
	/*Este metodo realiza la comprobacion de letra por letra de la palabra introducida
	 *  y la compara letra por letra con la palabra secreto,en caso de que la letra este en el lugar correcto 
	 *  se pone el fondo del textfield en verde,si la letra esta en la palabra pero no en el lugar correcto se pone en 
	 *  color amarillo,y si la palabra no esta en la palabra no se colorea de ningun color */
	public void comprobar(JTextField[] array, String secreto, JTextField conjetura) {
		String palabraRespuesta = txtrespuesta.getText();
		for(int i = 0; i<palabraRespuesta.length();i++) {
			if(palabraRespuesta.charAt(i)==secreto.charAt(i)) {
				array[i].setBackground(Color.GREEN);
			}else {
				for(int j = 0; j< secreto.length();j++) {
					if(palabraRespuesta.charAt(i)==secreto.charAt(j)) {
						array[i].setBackground(Color.yellow);
					}
				}
			}array[i].setText((palabraRespuesta.charAt(i)+"").toUpperCase());
		}ganarPartida(secreto, palabraRespuesta);
	}
	//Comprueba que la longitud de la palabra introducida es igual a 5
	private boolean comprobarRespuesta(String palabraRespuesta) {
		boolean resultado = false;
		if(palabraRespuesta.length()==5) {
			resultado = true;
		}
		return resultado;
	}
	
}
