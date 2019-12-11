package Modelo;

/**
 * @author Senai
 * 
 * As categorias que uilizaremos inicialmente são: 
 *  - Centrais Híbricas 
 *  - Centrais IP
 *
 */
public class Categoria {

	private String categoria;

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(String categoria) {
		super();
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
