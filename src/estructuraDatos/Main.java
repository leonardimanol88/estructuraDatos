package estructuraDatos;

import java.util.Scanner;

public class Main {
    	
    	 public static void main(String[] args) {
    	        
    		 Scanner scanner = new Scanner(System.in);
    	        Expo expo = new Expo();

    	        while (true) {
//    	            System.out.println("\nIngresa el folio del participante (3 dígitos, o 'fin' para terminar):");
//    	            String folio = scanner.nextLine();
//
//    	            if (folio.equalsIgnoreCase("fin")) {
//    	                break;
//    	            }

    	            System.out.println("Ingresa el nombre del participante: ");
    	            String nombre = scanner.nextLine();

    	            System.out.println("Ingresa el lugar :");
    	            String lugar = scanner.nextLine();

    	            Participante nuevoParticipante = new Participante(nombre, lugar);

    	            if (expo.agregarParticipante(nuevoParticipante)) {
    	                System.out.println("Registrado ");
    	            } else {
    	                System.out.println("No hay espacio disponible ");
    	                break;
    	            }
    	        }

    	       
    	        scanner.close();
    	    }
    
    
}

