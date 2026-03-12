public class Principal{
	public static void main(String[] args){
		Pokemon p1 = new Pokemon();
		p1.id = 1;
		p1.nombre = "Pikachu";
		p1.tipos = new String[]{"Electrico"};
		p1.puntosVida = 100;

		Pokemon p2 = new Pokemon();
		p2.id = 2;
		p2.nombre = "Charizard";
		p2.tipos = new String[]{"Fuego", "Volador"};
		p2.puntosVida = 150;
	}
}