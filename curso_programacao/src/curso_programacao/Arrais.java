package curso_programacao;

import javax.swing.JOptionPane;

public class Arrais 
{

	public static void main(String[] args) 
	{
		
		
		 String posicao = JOptionPane.showInputDialog("Quantas notas são");
		
		 							// Convetendo para Inteiro 
		double[] notas = new double[Integer.parseInt(posicao)];
		
		for(int pos = 0 ; pos < notas.length; pos ++)
		{
			String valor = JOptionPane.showInputDialog("Digite a nota " + (pos+ 1));
						// Converte de String para Double
			notas[pos] = Double.valueOf(valor);
	
		}
		
		// length sabe o tamanho do array
		for (int pos = 0 ; pos < notas.length ; pos++) 
		{
			System.out.println("Notas: " +(pos+1)+ " = " + notas[pos]);
			
		}
	}

}
