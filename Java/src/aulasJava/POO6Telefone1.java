package aulasJava;

public abstract class POO6Telefone1 { //'abstract' para tornar a classe Abstrata

	private String tipo;
	
	abstract public void disca(String numero); //Cria��o do m�todo abstrato.
	abstract public void toca(int numToques); //Cria��o do m�todo abstrato.
	
	public POO6Telefone1(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
