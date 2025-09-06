package estructuraDatos;

public class Participante {
    private int folio;
    private String nombre;
    private String lugar;

    public Participante(int folio, String nombre, String lugar) {
        this.folio = folio;
        this.nombre = nombre;
        this.lugar = lugar;
    }
    
    public Participante(String nombre, String lugar) {
        
        this.nombre = nombre;
        this.lugar = lugar;
    }

	public int getFolio() {
		return this.folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
    
    
    
}
