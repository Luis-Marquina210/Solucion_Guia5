package com.senati.eti.data;

import com.senati.eti.model.Calculadora2;
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        float n1 = 0, n2 = 0;
		
		System.out.println("LECTURA DE N�MEROS");
		System.out.println("------------------");
		System.out.print("N�mero 1: ");
		n1 = sc.nextFloat();
		System.out.print("N�mero 2: ");
		n2 = sc.nextFloat();
		
		Calculadora2 objCalc = new Calculadora2(n1, n2);
		
		System.out.println("\n R E S U L T A D O S ");
		System.out.println("-------------------------");
		System.out.println("Suma...........................: " + objCalc.Calcular(1));
		System.out.println("Resta..........................: " + objCalc.Calcular(2));
		System.out.println("Producto.......................: " + objCalc.Calcular(3));
		if (n2 == 0)
			System.out.print("Division.......................: No es posible");
		else
			System.out.print("Divisi�n.......................: " + objCalc.Calcular(4));
		
		if(n2 == 0)
			System.out.print("\nResto Entero...................: No es posible");
		else
			System.out.print("\nResto Entero...................: " + objCalc.Calcular(5));

		System.out.println("\nPromedio.......................: " + objCalc.Calcular(6));
		System.out.println("Suma de cuadrados..............: " + objCalc.Calcular(7));
		System.out.println("Diferencia Porcentual..........: " + objCalc.Calcular(8) + " %");
		System.out.println("N�mero mayor es................: " + objCalc.Calcular(9));
		System.out.println("N�mero menor es................: " + objCalc.Calcular(10));
		
		
		

	}

}
