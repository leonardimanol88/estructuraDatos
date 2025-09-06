package estructuraDatos;

import java.util.Scanner;

public class Main {
    	
    	 public static void main(String[] args) {
    	        
    		 Scanner scanner = new Scanner(System.in);
    	        Expo expo = new Expo();
    	        
    	        
    	        int folio = 001;
    	        System.out.println("\nSolo ingresa 'fin' cuando quieras terminar):");

    	        while (true) {
     	           

    	        	
    	            System.out.println("Ingresa el nombre del participante: ");
    	            String nombre = scanner.nextLine();
    	            if (nombre.equalsIgnoreCase("fin")) {
    	                break;
    	            }

    	            System.out.println("Ingresa el lugar :");
    	            String lugar = scanner.nextLine();
    	            if (lugar.equalsIgnoreCase("fin")) {
    	                break;
    	            }

    	            Participante nuevoParticipante = new Participante(folio, nombre, lugar);
    	           
    	            if (expo.agregarParticipante(nuevoParticipante)) {
    	            	
    	                System.out.println("Registrado participante "+nombre+" con folio "+folio);
    	                folio++;
    	            } else {
    	                System.out.println("No hay espacio disponible ");
    	                
    	                System.out.println(expo.mostrarNombreParticipantes());
    	                break;
    	            }
    	        }

    	       
    	        scanner.close();
    	    }
    
    
}

