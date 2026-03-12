public class Pokemon{
	
	public int id;
	public String nombre;
	public String[] tipos;
	public double puntosVida;
	public int nivel;

	public void consumirVida(int cantidad){
		puntosVida = puntosVida - cantidad;
	}

	public void recargarVida(int cantidad){
		puntosVida = puntosVida + cantidad;
	}

	public double obtenerVida(){
		return puntosVida;
	}

	public String[] obtenerTipos(){
		return tipos;
	}
}