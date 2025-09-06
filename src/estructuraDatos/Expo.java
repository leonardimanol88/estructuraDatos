package estructuraDatos;

public class Expo {
	
	Participante[] plantaAlta = new Participante[5];
    Participante[] plantaBaja = new Participante[3];
	
    
    public int indiceAlta = 0;
    public int indiceBaja = 0;

    
    public boolean agregarParticipante(Participante participante) {
        
        if (indiceAlta < 5) {
            plantaAlta[indiceAlta] = participante;
            indiceAlta++; 
            return true; 
        }
        
        else if (indiceBaja < 3) {
            plantaBaja[indiceBaja] = participante;
            indiceBaja++; 
            return true; 
        }
     
        else {
            return false; 
        }   
    } 
    
    
    public String mostrarNombreParticipantes() {
    	
    	StringBuilder nombres = new StringBuilder();
    	for(int i=0;i< plantaAlta.length;i++) {
    		
    		Participante part = plantaAlta[i];
    		nombres.append(part.getNombre());
    		
    		if (i < plantaAlta.length - 1) {
                nombres.append(", ");
            }
    	}
    	return nombres.toString();
    	
    }
    
}
