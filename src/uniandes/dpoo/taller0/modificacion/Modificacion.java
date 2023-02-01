package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		System.out.println("Hola, Mundo!");
	CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
	System.out.println(calc.paisConMasMedallistas());
	/*
	 * En la implementación se imprime tambien una larga lista de deportes ya que se encuentra en la carga del archivo
	 */
	}
}

