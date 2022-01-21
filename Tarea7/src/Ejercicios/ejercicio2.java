package Ejercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Double> lista = new ArrayList<Double>();
		Boolean finalizado = false;
		int cant;
		double precioIVA = 0;
		double pagar;
		
		do {
			lista.add(Double.parseDouble(JOptionPane.showInputDialog("Precio del producto: ")));
			if (JOptionPane.showConfirmDialog(null, "Has finalizado?", "WARNING",
			        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
			    finalizado = true;
		} while(!finalizado);
		cant = lista.size();
		
		for(int i = 0; i < cant; i++)
			precioIVA += lista.get(i);
		
		pagar = Double.parseDouble(JOptionPane.showInputDialog("Cantidad con la que vas a pagar"));
		
		JOptionPane.showConfirmDialog(null, "Precio con IVA: " + precioIVA + "\nPrecio sin IVA: " + (precioIVA/1.21) + "\nNumero de articulos: " + cant + "\nCantidad pagada" + pagar + "\nCambio" + (pagar - precioIVA));
	}

}
