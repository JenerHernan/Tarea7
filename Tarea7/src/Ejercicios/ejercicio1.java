package Ejercicios;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import java.util.Enumeration;

public class ejercicio1 {
	
	public static void main(String[] args) {
		final int SIZE = 10;
		Random rand = new Random();
		String nombres[] = {"Ana","Pablo","Aranzuzu","Carlos","Rut","Mario","Carla","Tomas","Paula","Izan"};
		ArrayList<ArrayList<Integer>> notas = new ArrayList<ArrayList<Integer>>();
		Hashtable<String,Double> notasMedia = new Hashtable<String,Double>();
		Enumeration<String> e;
		
		for(int i = 0; i < SIZE; i++) {
			notas.add(new ArrayList<Integer>());
			for(int j = 0; j < 3; j++)
				notas.get(i).add(rand.nextInt(11));
		}
		
		
		for(int i = 0; i < SIZE; i++) {
			double aux = 0;
			for(int j = 0; j < 3; j++)
				aux += notas.get(i).get(j);
			notasMedia.put(nombres[i],aux/3);
		}
		
		e = notasMedia.keys();
		
		while(e.hasMoreElements()) {
			String key = e.nextElement();
			System.out.println("Alumno/a: " + key + " Nota media: " + notasMedia.get(key));
		}
	}

}
