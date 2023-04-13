package luxhadores;

public class Luchador {
	
	private int peso;
	private int altura;
	
	public Luchador(int peso, int altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	private int getPeso() {
		return peso;
	}

	private int getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "Luchador [peso=" + peso + ", altura=" + altura + "]";
	}
	
	
	

}
