package br.edu.restinga.ifrs.daione.Seguradora.Seguradora;

public class Usuario {
	private String nome; 
	private int idade; 
	private String sexo;
	
	public Usuario(String nome, int idade, String sexo){

		this.nome = nome; 
		this.idade = idade; 
		this.sexo = sexo; 
	}

	public void setIdade(int idade){
		this.idade= idade; 
	}
	public void setNome(String nome){
		this.nome = nome; 
		
	}
	
	public void setSexo(String Sexo){
		this.sexo = sexo; 
	}
	
	public String getSexo(){
		return this.sexo; 
	}
	
	public int getIdade(){
		return this.idade; 
	}
	
	public String getNome(){
		return this.nome; 
	}
}
