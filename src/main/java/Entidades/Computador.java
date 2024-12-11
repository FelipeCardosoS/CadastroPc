package Entidades;

public class Computador {
	
	private int id;
	private String modelo;
	private String marca;
	private String processador;
	private int armazenamento;
	private int ram;
	private Colaboradores colaboradores;
	
	public Computador() {
		this.colaboradores = new Colaboradores();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Colaboradores getColaboradores() {
		return colaboradores;
	}
	public void setColaboradores(Colaboradores colaboradores) {
		this.colaboradores = colaboradores;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public int getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	

}
