package codigo;

// import codigo.Guerrero;

public class PJugador extends Personaje implements Guerrero {
	private int edad;
	private int ataque;
	private int defensa;
	
	public PJugador (String nom, int s, int niv, int a, int def) { //CONSTRUCTOR DE PERSONAJE JUGADOR
		super(nom, s, niv); //LLAMADA AL SUPERCONSTRUCTOR
		this.setAtaque(a);
		this.setDefensa(def);
	}
		

	public PJugador (String nom, int s, int niv, int e, int a, int def) { // SOBRECARGA DEL CONSTRUCTOR, PARA QUE PJUGADOR PUEDA O NO TENER EDAD
		super(nom, s, niv); //LLAMADA AL SUPERCONSTRUCTOR
		this.setEdad(e);
		this.setAtaque(a);
		this.setDefensa(def);
	}
	
	// IMPLEMENTO LOS METODOS DE LA INTERFAZ POR CONTRATO
    @Override
    public void atacar() {
       
    }
    
    @Override
    public void defender() {
        
    }

	public int getEdad() {        //GETTERS Y SETTERS
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	// MÉTODO ATACAR
	public void atacar(Personaje Personaje) {
		int dano = this.getNivel() * this.getAtaque();
		if (dano >= Personaje.getSalud()) { //aqui se accede a los metodos de salud del Personaje instanciado
			Personaje.setSalud(0); // ...ya que es el parámetro del método atacar
		}
		else {
			int disminuirSalud = Personaje.getSalud() - dano;
			Personaje.setSalud(disminuirSalud);
		}
		
	}
	
	//MÉTODO DEFENDER
	
	public void defender(Personaje personaje) {
	    int dano = personaje.getNivel() - this.getDefensa();
	    if (dano > 0) {
	        int disminuirSalud = this.getSalud() - dano;
	        if (disminuirSalud<= 0) {
	            this.setSalud(0);
	        } else {
	            this.setSalud(disminuirSalud);
	        }
	    }
	}}


