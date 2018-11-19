package br.edu.restinga.daione.teste.teste;

public class Calculadora {

	/*
	 * Caso o cargo seja TESTADOR, o funcionário terá desconto de 25% caso o
	 * salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário
	 * seja menor que isso.
	 */

	public void calc(Funcionario f) {
		
		if (f.cargo.equals("cargo")) {

			if (f.salarioBase >= 3000.00) {
				f.salarioBase = f.salarioBase - (f.salarioBase * 0.20);
			} else {
				f.salarioBase = f.salarioBase - (f.salarioBase * 0.10);
			}

		}
		if (f.cargo.equals("dba")) {
			if (f.salarioBase >= 2000.00) {
				f.salarioBase = f.salarioBase - ( f.salarioBase * 0.20);
			}else {
				f.salarioBase = f.salarioBase - (f.salarioBase * 0.15);
			}
		}
		if(f.cargo.equals("testador")){
			if (f.salarioBase >= 2000.00) {
				f.salarioBase = f.salarioBase - ( f.salarioBase * 0.20);
			}
		}

	}

}
