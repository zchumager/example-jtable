package me.programming.table_example;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
		/*
		 * http://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
		 */
		
		View view = new View();
		
		int numFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de filas", "Calculadora de matrices", JOptionPane.PLAIN_MESSAGE));
		int numColumnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de Columnas", "Calculadora de matrices", JOptionPane.PLAIN_MESSAGE));
		
		double[][] matrix = view.createMatrix(numFilas, numColumnas);
		
		view.createTable(matrix);
	}
	
	public static void mostrarMatriz(Object[][] matrix)
	{
		for(int i= 0; i< matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
