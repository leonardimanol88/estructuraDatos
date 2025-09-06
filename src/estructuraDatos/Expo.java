package estructuraDatos;

public class Expo {
	
	Participante[] plantaAlta = new Participante[5];
    Participante[] plantaBaja = new Participante[3];
	
    
    int indiceAlta = 0;
    int indiceBaja = 0;

    
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
    
}
