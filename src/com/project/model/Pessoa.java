package com.project.model;

public class Pessoa {
	private String nome;
	private String cor;
	private int idade;
	
	
	public Pessoa(String nome, String cor, int idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}


	public Pessoa() {}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Pessoa [Nome = " + nome + ", Cor = " + cor + ", Idade= " + idade + "]";
	}
	
	/*public Pessoa(String nome, String cor, int idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}*/
	
	
	
}
