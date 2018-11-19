package br.edu.restinga.ifrs.daione.Seguradora.Seguradora;

public class Calculadora {
	private double valor; 
	
	
	public void setValor(double valor){
		this.valor = valor; 
	}
	
	public double getValor(){
		return this.valor;
	}
	
	
	public double calculaValor(Usuario u, double valor){
		if(u.getSexo().equalsIgnoreCase("F") && u.getIdade() <= 65){
			return valor - valor*0.1; 
		}else{
			if(u.getSexo().equalsIgnoreCase("M") && u.getIdade()< 30){
				return valor + valor*0.15; 
			}else{
				if(u.getIdade() > 65){
					return valor + valor*0.05; 
				}
			}
		}
		
		if(u.getNome().length() >= 40){
			return 0; 
		}else if(u.getIdade()+"".length() > 3){
			return 0; 
		}else if(u.getNome().isEmpty() || u.getSexo().isEmpty() || u.getIdade() == 0){
			return 0; 
		}
		if(u.getIdade() >= 100){
			return 0; 
		}
		
		return valor; 
	}
	
	 
		
}
 