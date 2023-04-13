package luxhadores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class Evento {
	
	int cantidad = 0;
	private static ArrayList<Luchador> luchadores = new ArrayList<Luchador>();
	private static ArrayList<Integer> cuantosDomina = new ArrayList<Integer>();
	
	public void leerArchivo () throws IOException {
		
		    FileReader fr = null;
	        BufferedReader br = null;

	        fr = new FileReader ("sumo.in"); 
	        br = new BufferedReader(fr);

	        String linea = br.readLine();
	        
	        
	        cantidad = Integer.parseInt(linea);
	        String [] datos;
	        linea = br.readLine();
	        while(linea != null) {
	        	
	        	
	        	datos = linea.split(" ");
	        	//System.out.println(datos[0] + " " + datos[1]);
	        	luchadores.add(new Luchador(Integer.parseInt(datos[0]),Integer.parseInt(datos[1])));
	        	
	        	linea = br.readLine();
	        }
	        
	        br.close();
	}
	
  public void comparar() {
	  
	  
	 
	 for (int i = 0; i < cantidad; i++) {
		 int domina = 0;
		 
		 
		 for (Luchador luchador : luchadores) {
			if(luchadores.get(i).getPeso() > luchador.getPeso() && luchadores.get(i).getAltura() > luchador.getAltura()) {
				domina++;
				
			}
			
			else if(luchadores.get(i).getPeso() == luchador.getPeso() && luchadores.get(i).getAltura() > luchador.getAltura()) {
				
				domina++;
			}
			
			else if(luchadores.get(i).getPeso() > luchador.getPeso() && luchadores.get(i).getAltura() == luchador.getAltura()) {
				
				domina++;
			}
			
			
		}
		 
		 cuantosDomina.add(domina);
		 
		
	} 
	 
 }
	
	 public static void main(String[] args) throws IOException {
		
		Evento evento = new Evento();
		
		evento.leerArchivo();
		evento.comparar();
		
		/* for (Luchador todosLuchadores : luchadores) {
			System.out.println(todosLuchadores);
		} */
	
		for (Integer domina : cuantosDomina) {
			System.out.println(domina);
		}
		
	}
	 

	

}
