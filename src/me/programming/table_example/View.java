package me.programming.table_example;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class View extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8202710506522113448L;
	
	private Panel panel;
	private Double[][] matrix;
	
	public void initialize(){
		this.matrix = null;
		this.panel = new Panel();
		this.panel.setSize(500, 500);
		this.panel.setLayout(new BorderLayout());
	}
	
	//Constructor de la clase
	public View(){}
	
	public double[][] createMatrix(int numFilas, int numColumnas){
		double[][] matrix = new double[numFilas][numColumnas];
		
		for(int i= 0; i< matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length; j++)
			{
				matrix[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa el valor de la posición "+(i+1)+","+(j+1), "Calculadora de matrices", JOptionPane.INFORMATION_MESSAGE)); 
			}
		}
		
		return matrix;
	}
	
	public Double[][] toDoubleMatrix(double[][] matrix){
		Double[][] converted = new Double[matrix.length][matrix[0].length];
		
		for(int i= 0; i< matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length; j++)
			{
				converted[i][j] = Double.valueOf(matrix[i][j]); 
			}
		}
		
		return converted;
	}
	
	public void createTable(double[][] matrix){
		this.initialize();
		
		this.matrix = this.toDoubleMatrix(matrix);
		
		JTable jtable = new JTable(this.matrix, this.matrix[0]);
		this.panel.add(jtable, BorderLayout.CENTER);
		
		this.getContentPane().add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
