package wordle.codigo;

import java.util.ArrayList;
import java.util.Random;

import wordle.io.*;


public class GestorFicheros {
	/*Rutas de los archivos a leer*/
	private final String FICHERO_JUGADORES="./data/archivos/jugadores.dat";
	private final String FICHERO_RANKING="./data/archivos/resultados.dat";
	private final String FICHERO_PALABRAS="./data/archivos/palabras5letras.dat";
	/*Escrritores de los archivos*/
	private EscritorLineas escritorRanking;
	private EscritorLineas escritorPalabra;
	private EscritorLineas escritorJugador;
	/*Lectores de los archivos*/
	private LectorLineas lectorRanking;
	private LectorLineas lectorPalabra;
	private LectorLineas lectorJugador;
	
	public GestorFicheros() {
		/*Se crean los escritores y lectores y se les asigna un archivo especifico*/
		escritorRanking = new EscritorLineas(FICHERO_RANKING);
		lectorRanking = new LectorLineas(FICHERO_RANKING);
		escritorPalabra = new EscritorLineas(FICHERO_PALABRAS);
		lectorPalabra = new LectorLineas(FICHERO_PALABRAS);
		escritorJugador = new EscritorLineas(FICHERO_JUGADORES);
		lectorJugador = new LectorLineas(FICHERO_JUGADORES);
	}
	
	/*Metod que lee los jugadore del archivo jugadores*/
	public ArrayList<String> leerJugadores() {
		return lectorJugador.leerLineas();
	}
	/**/
	public boolean getJugador(String nombre) {
		ArrayList<String> jugadores = lectorJugador.leerLineas();
		boolean j = false;
		for (int i = 0; i < jugadores.size(); i++) {
			String[] trozos = separarCadena(jugadores.get(i), '#');
			if(nombre.compareTo(trozos[0])==0) {
				j = true;
			}
		}
		return j;
	}
	//Metodo que guarda usuario
	public void guardarJugador(String usuario) {
		escritorJugador.escribirLinea(usuario);
	}
	//Metodo que almacena el ranking en un arraylist
	public ArrayList<String> getRanking(){
		return lectorRanking.leerLineas();
	}
	//Metodo que ordena el arraylist del ranking
	public void ordenar(ArrayList<String> orden) {
		for (int i = 0; i < orden.size()-1; i++) {
			String trozos1[] = separarCadena(orden.get(i), '#');
			String[] trozos2 = separarCadena(orden.get(i+1), '#');
			if(Integer.parseInt(trozos1[1])<Integer.parseInt(trozos2[1])) {
					String aux = orden.get(i);
					orden.remove(i);
					orden.add(i+1, aux);
			}
		}
	}
	//Metodo que actualiza el esatdo del ranking
	public void actualizar(String rango) {
		ArrayList<String> ranking = getRanking();
		for (int i = 0; i < ranking.size(); i++) {
			String[] trozos = separarCadena(ranking.get(i), '#');
			if(ranking.size()==0) {
				ranking.add(rango+"#"+1);
			}else if(trozos[0].compareTo(rango)==0) {
				int victorias = Integer.parseInt(trozos[1])+1;
				ranking.remove(i);
				ranking.add(i, rango+"#"+victorias);
				i=ranking.size();
			}else if(i==ranking.size()-1) {
				ranking.add(rango+"#"+1);
			}
		}
		ordenar(ranking);
		escritorRanking.resetearFichero();
		for (int i = 0; i < ranking.size(); i++) {
			escritorRanking.escribirLinea(ranking.get(i));
		}
	}
	

	/**
	 * Debería comprobarse que se devuelve una palabra de cinco letras y,
	 * de no ser así, tratarlo con excepciones.
	 * @return
	 */
	public String getPalabra() {
		ArrayList<String> arrayPalabras = lectorPalabra.leerLineas();
		Random r = new Random();
		int numPalabra = r.nextInt(arrayPalabras.size());
		return arrayPalabras.get(numPalabra);
	}
	//Metodo que almacena las palabras en un arraylist
	public ArrayList<String> getPalabras() {
		ArrayList<String> arrayPalabras = lectorPalabra.leerLineas();
		return arrayPalabras;
	}
	
	/**
	 * Debería añadir al fichero de palabras una palabra, comprobando también
	 * que tiene cinco letras y, si no, tratarlo con excepciones.
	 * @param palabra
	 */
	public void guardarPalabra(String palabra) {
		escritorPalabra.escribirLinea(palabra);
	}
	/*Comprueba la contraseña*/
	public boolean comprobarPasswd(String pass) {
		
		ArrayList<String> jugadores = leerJugadores();
		boolean j = false;
	
		for (int i = 0; i < jugadores.size(); i++) {
			String[] trozos = separarCadena(jugadores.get(i), '#');
			if(pass.compareTo(trozos[1])==0) {
				j = true;
			}
		}
		return j;
	}
	//Separa una cadena mediante el simbolo '#',se usa para los usuarios y el ranking
	public String[] separarCadena(String cadena, char c) {
		String[] trozos = cadena.split("#");
		return trozos;
	}
}
