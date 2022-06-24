package worlde.grafico;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import wordle.codigo.GestorFicheros;
public class GuiPalabraNueva {

	private JFrame frmWordleaadirPalabra;
	private static JTextField txtSugerencia;
	private GestorFicheros gestor = new GestorFicheros();
	private String nombre;
	

	/**
	 * Create the application.
	 */
	public GuiPalabraNueva(String nombre) {
		initialize();
		this.nombre=nombre;
		frmWordleaadirPalabra.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWordleaadirPalabra = new JFrame();
		frmWordleaadirPalabra.setTitle("WORDLE--A\u00D1ADIR PALABRA");
		frmWordleaadirPalabra.setBounds(100, 100, 600, 500);
		frmWordleaadirPalabra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWordleaadirPalabra.setLocationRelativeTo(null);
		frmWordleaadirPalabra.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 584, 461);
		frmWordleaadirPalabra.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(0, 0, 584, 181);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAadirPalabra = new JLabel("A\u00D1ADIR PALABRA");
		lblAadirPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		lblAadirPalabra.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAadirPalabra.setBounds(120, 57, 350, 44);
		panel_1.add(lblAadirPalabra);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(130, 112, 333, 2);
		panel_1.add(separator);
		
		txtSugerencia = new JTextField();
		txtSugerencia.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtSugerencia.setHorizontalAlignment(SwingConstants.CENTER);
		txtSugerencia.setBounds(159, 247, 271, 63);
		panel.add(txtSugerencia);
		txtSugerencia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("INTRODUZCA UNA PALABRA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(113, 192, 350, 44);
		panel.add(lblNewLabel);
		
		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comprobarPalabra(txtSugerencia.getText())) {
					gestor.guardarPalabra(txtSugerencia.getText());
					JOptionPane.showMessageDialog(null, "Palabra añdida con éxito.", "EXITO", JOptionPane.INFORMATION_MESSAGE);
					txtSugerencia.setText(null);
					}
			}
				
			
		});
		btnAnadir.setBounds(248, 321, 89, 23);
		panel.add(btnAnadir);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setBounds(472, 400, 102, 38);
		panel.add(btnNewButton);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			@SuppressWarnings({ "unused" })
			public void actionPerformed(ActionEvent e) {
				GuiMenu menu = new GuiMenu(nombre);
				frmWordleaadirPalabra.setVisible(false);

			
			}
		});
		btnMenu.setBounds(472, 356, 102, 38);
		panel.add(btnMenu);
	}
	
	public boolean comprobarPalabra(String palabra) {
		ArrayList<String> listaPalabras = gestor.getPalabras();
		boolean esValida = true;
		if (palabra.length()!=5) {
			JOptionPane.showMessageDialog(null, "La palabra que quieres añadir debe ser de 5 letras.", "ERROR", JOptionPane.ERROR_MESSAGE);
			txtSugerencia.setText(null);
			esValida = false;
		}
		for (int i = 0; i < listaPalabras.size(); i++) {
			if(listaPalabras.get(i).compareTo(palabra)==0) {
				esValida = false;
				JOptionPane.showMessageDialog(null, "Palabra ya existe,introduce otra palabra.", "ERROR", JOptionPane.ERROR_MESSAGE);
				txtSugerencia.setText(null);
			}
		}
		return esValida;
	}
	
	}
