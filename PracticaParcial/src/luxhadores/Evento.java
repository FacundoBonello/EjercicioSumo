package luxhadores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Evento {
	
	
	private static ArrayList<Luchador> luchadores = new ArrayList<Luchador>();
	
	public void leerArchivo () throws IOException {
		
		    FileReader fr = null;
	        BufferedReader br = null;

	        fr = new FileReader ("sumo.in"); 
	        br = new BufferedReader(fr);

	        String linea = br.readLine();
	        
	        int cantidad = 0;
	        cantidad = Integer.parseInt(linea);
	        String [] datos;
	        linea = br.readLine();
	        while(linea != null) {
	        	
	        	
	        	datos = linea.split(" ");
	        	System.out.println(datos[0] + " " + datos[1]);
	        	luchadores.add(new Luchador(Integer.parseInt(datos[0]),Integer.parseInt(datos[1])));
	        	
	        	linea = br.readLine();
	        }
	        
	        br.close();
	}
	
	 public static void main(String[] args) throws IOException {
		
		Evento evento = new Evento();
		
		evento.leerArchivo();
		
		
		
	} 

	

}
