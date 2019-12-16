package Modelo;

/*
 * Várias características de uma central telefônica podem conter capacidade 
 * mínima e máxima
 */
public class Capacidade {

	private int minima;
	private int maxima;

	public Capacidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Capacidade(int minima, int maxima) {
		super();
		this.minima = minima;
		this.maxima = maxima;
	}

	public int getMinima() {
		return minima;
	}

	public void setMinima(int minima) {
		this.minima = minima;
	}

	public int getMaxima() {
		return maxima;
	}

	public void setMaxima(int maxima) {
		this.maxima = maxima;
	}

}
