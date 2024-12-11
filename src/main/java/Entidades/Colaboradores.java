package Entidades;

public class Colaboradores {
	
	private int id;
	private String nome;
	private String cargo;
	private boolean ativo;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	@Override
	public String toString() {
		return "\n" + id + " - " + nome + " - " + cargo;
	}
	
}
