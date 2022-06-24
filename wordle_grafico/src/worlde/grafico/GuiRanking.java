package worlde.grafico;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import wordle.codigo.GestorFicheros;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GuiRanking {

	private JFrame frmWordleRanking;
	//Array de dos posiciones para el usuario y la puntuacion
	private JLabel[] p1 = new JLabel[2];
	private JLabel[] p2 = new JLabel[2];
	private JLabel[] p3 = new JLabel[2];
	private JLabel[] p4 = new JLabel[2];
	private JLabel[] p5 = new JLabel[2];
	private GestorFicheros gestor = new GestorFicheros();
	private String nombre;

	/**
	 * Create the application.
	 */
	public GuiRanking(String nombre) {
		initialize();
		this.nombre=nombre;
		frmWordleRanking.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWordleRanking = new JFrame();
		frmWordleRanking.setTitle("WORDLE -- RANKING");
		frmWordleRanking.setBounds(100, 100, 600, 500);
		frmWordleRanking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWordleRanking.getContentPane().setLayout(null);
		frmWordleRanking.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 584, 461);
		frmWordleRanking.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(0, 0, 584, 133);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RANKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(168, 11, 253, 54);
		panel_1.add(lblNewLabel);
		
		JLabel lblTop = new JLabel("TOP 5");
		lblTop.setHorizontalAlignment(SwingConstants.CENTER);
		lblTop.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTop.setBounds(168, 57, 253, 54);
		panel_1.add(lblTop);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(168, 57, 253, 2);
		panel_1.add(separator);
		
		
		JLabel U1 = new JLabel("");
		U1.setFont(new Font("Tahoma", Font.BOLD, 20));
		U1.setHorizontalAlignment(SwingConstants.CENTER);
		U1.setBounds(31, 193, 180, 38);
		panel.add(U1);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsuario.setBounds(31, 144, 180, 38);
		panel.add(lblUsuario);
		
		JLabel U2 = new JLabel("");
		U2.setHorizontalAlignment(SwingConstants.CENTER);
		U2.setFont(new Font("Tahoma", Font.BOLD, 20));
		U2.setBounds(31, 234, 180, 38);
		panel.add(U2);
		
		JLabel U3 = new JLabel("");
		U3.setHorizontalAlignment(SwingConstants.CENTER);
		U3.setFont(new Font("Tahoma", Font.BOLD, 20));
		U3.setBounds(31, 275, 180, 38);
		panel.add(U3);
		
		JLabel U4 = new JLabel("");
		U4.setHorizontalAlignment(SwingConstants.CENTER);
		U4.setFont(new Font("Tahoma", Font.BOLD, 20));
		U4.setBounds(31, 317, 180, 38);
		panel.add(U4);
		
		JLabel U5 = new JLabel("");
		U5.setHorizontalAlignment(SwingConstants.CENTER);
		U5.setFont(new Font("Tahoma", Font.BOLD, 20));
		U5.setBounds(31, 364, 180, 38);
		panel.add(U5);
		
		JLabel P1 = new JLabel("");
		P1.setHorizontalAlignment(SwingConstants.CENTER);
		P1.setFont(new Font("Tahoma", Font.BOLD, 20));
		P1.setBounds(221, 193, 180, 38);
		panel.add(P1);
		
		JLabel P2 = new JLabel("");
		P2.setHorizontalAlignment(SwingConstants.CENTER);
		P2.setFont(new Font("Tahoma", Font.BOLD, 20));
		P2.setBounds(221, 234, 180, 38);
		panel.add(P2);
		
		JLabel P3 = new JLabel("");
		P3.setHorizontalAlignment(SwingConstants.CENTER);
		P3.setFont(new Font("Tahoma", Font.BOLD, 20));
		P3.setBounds(221, 275, 180, 38);
		panel.add(P3);
		
		JLabel P4 = new JLabel("");
		P4.setHorizontalAlignment(SwingConstants.CENTER);
		P4.setFont(new Font("Tahoma", Font.BOLD, 20));
		P4.setBounds(221, 317, 180, 38);
		panel.add(P4);
		
		JLabel P5 = new JLabel("");
		P5.setHorizontalAlignment(SwingConstants.CENTER);
		P5.setFont(new Font("Tahoma", Font.BOLD, 20));
		P5.setBounds(221, 364, 180, 38);
		panel.add(P5);
		
		JLabel lblPuntuacion = new JLabel("Puntuacion");
		lblPuntuacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntuacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPuntuacion.setBounds(221, 144, 180, 38);
		panel.add(lblPuntuacion);
		//Asignacion de posiciones para el usuario y su puntuacion
		p1[0]=U1;
		p1[1]=P1;
		
		p2[0]=U2;
		p2[1]=P2;
		
		p3[0]=U3;
		p3[1]=P3;
		
		p4[0]=U4;
		p4[1]=P4;
		
		p5[0]=U5;
		p5[1]=P5;
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.addActionListener(new ActionListener() {
			//Boton que abre la ventana del menu
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				GuiMenu menu = new GuiMenu(nombre);
				frmWordleRanking.setVisible(false);
				
			}
			
		});
		btnNewButton.setBounds(463, 353, 111, 37);
		panel.add(btnNewButton);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			
			//Boton que abre la ventana inicio para cambiar de cuenta
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				GuiInicio inicio = new GuiInicio();
				frmWordleRanking.setVisible(false);
			}
			
		});
		btnCerrarSesion.setBounds(463, 406, 111, 37);
		panel.add(btnCerrarSesion);

		JButton btnNewButton_1 = new JButton("Sugerir Palabra");
		btnNewButton_1.addActionListener(new ActionListener() {
			//Boton que abre la ventana de sugerir palabra
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				GuiPalabraNueva npalabra = new GuiPalabraNueva(nombre);
				frmWordleRanking.setVisible(false);
			}	
		});
		btnNewButton_1.setBounds(449, 11, 125, 38);
		panel_1.add(btnNewButton_1);
		//Ordena el ranking y asigna la posicion
		for (int i = 0; i < gestor.getRanking().size(); i++) {
			if(i==0) {
				guardarRanking(p1, i);
			}else if(i==1) {
				guardarRanking(p2, i);
			}else if(i==2) {
				guardarRanking(p3, i);
			}else if(i==3) {
				guardarRanking(p4, i);
			}else if(i==4) {
				guardarRanking(p5, i);
			break;
			}
		}
	}
		//Guarda el array de ranking ordenado en el archivo resultados
		public void guardarRanking(JLabel[] R1, int i) {
			ArrayList<String> ranking = gestor.getRanking();
			for (int j = 0; j < ranking.size(); j++) {
				while(i<=ranking.size()) {
					String[] trozos = gestor.separarCadena(ranking.get(i), '#');
					R1[0].setText(trozos[0]);
					R1[1].setText(trozos[1]);
					break;
				}
			}
		}
}
