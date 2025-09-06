package estructuraDatos;

public class Participante {
    int folio;
    String nombre;
    String lugar;

    public Participante(int folio, String nombre, String lugar) {
        this.folio = folio;
        this.nombre = nombre;
        this.lugar = lugar;
    }
    
    public Participante(String nombre, String lugar) {
        
        this.nombre = nombre;
        this.lugar = lugar;
    }
    
}
