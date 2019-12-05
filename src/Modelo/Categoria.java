package Modelo;

public class Categoria {

	private int codigo;
	private String categoria;

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(int codigo, String categoria) {
		super();
		this.codigo = codigo;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
