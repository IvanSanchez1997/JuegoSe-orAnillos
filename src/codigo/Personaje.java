package codigo;


public class Personaje { //SE DECLARAN LOS ATRIBUTOS PRIVADOS
	
	private String nombre;
	private int salud;
	private int nivel;

	public Personaje(String nom, int s, int niv) { //CONSTRUCTOR DE PERSONAJE
		
		this.setNombre(nom);
		this.setSalud(s);
		this.setNivel(niv);
	}

	public String getNombre() { //GET Y SET 'ers de los atributos:
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
