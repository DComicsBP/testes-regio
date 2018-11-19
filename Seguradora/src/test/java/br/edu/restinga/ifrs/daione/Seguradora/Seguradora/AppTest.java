package br.edu.restinga.ifrs.daione.Seguradora.Seguradora;

import junit.*;
import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
   @Test
	public void testApp(){
	   
	 this.muitosCaracteres(new Usuario("sdfghjkljhgfd bsdfghjhasdfg fghjkljhgfds fghjhgfd", 23, "F"), 0.0 );
	 this.acrescimoQuinzePorcento(new Usuario("nome 01", 27, "M"), 100.0 );
	 this.descontoDezPorcento(new Usuario("nome 03", 64, "F"), 100.0 );
	 this.adicionalDeCincoPorcento(new Usuario("nome 04", 66, "F"), 100.0 );
	 this.cemAnos(new Usuario("nome 05", 100, "M"), 100.0 );
	 this.nomeVazio(new Usuario("", 45, "F"), 100.0 );
	 this.idadeZero(new Usuario("nome 06", 0, "F"), 100.0 );
	 this.sexoVazio(new Usuario("nome 07 ", 49, ""), 100.0 );
	 this.idadeComMaisDeTresDigito(new Usuario("nome 08", 3456, "F"), 100.0 );
	   
   }
   // region right
   
   @Test
   public void muitosCaracteres(Usuario u, double valor){
	   
	   Calculadora c = new Calculadora(); 
	   double result  = c.calculaValor(u, valor);
	   assertEquals(0, result, 0); 
	   
   }
   
   @Test
   public void acrescimoQuinzePorcento(Usuario u, double valor){
	   
	   Calculadora c = new Calculadora(); 
	   double result  = c.calculaValor(u, valor);
	   assertEquals(115, result, 0); 
	   
   }
   @Test
   public void descontoDezPorcento(Usuario u, double valor){
	   
	   Calculadora c = new Calculadora(); 
	   double result  = c.calculaValor(u, valor);
	   assertEquals(90, result, 0); 
	   
   }

   @Test
   public void cemAnos(Usuario u, double valor){
	   Calculadora c = new Calculadora(); 
	   double result  = c.calculaValor(u, valor);
	   assertEquals(0, result, 0); 
	   
   }

   @Test
   public void adicionalDeCincoPorcento(Usuario u, double valor){
	   Calculadora c = new Calculadora(); 
	   double result  = c.calculaValor(u, valor);
	   assertEquals(105, result, 0); 
	   
   }
   @Test
   public void nomeVazio(Usuario u, double valor){
	   Calculadora c = new Calculadora(); 
	   double result  = c.calculaValor(u, valor);
	   assertEquals(0, result, 0); 
	   
   }
   @Test
   public void idadeZero(Usuario u, double valor){
	   Calculadora c = new Calculadora(); 
	   double result  = c.calculaValor(u, valor);
	   assertEquals(0, result, 0); 
	   
   }
   
   @Test
   public void sexoVazio(Usuario u, double valor){
	   Calculadora c = new Calculadora(); 
	   double result  = c.calculaValor(u, valor);
	   assertEquals(0, result, 0); 
	   
   }
   @Test
   public void idadeComMaisDeTresDigito(Usuario u, double valor){
	   Calculadora c = new Calculadora(); 
	   double result  = c.calculaValor(u, valor);
	   assertEquals(0, result, 0); 
	   
   }

}