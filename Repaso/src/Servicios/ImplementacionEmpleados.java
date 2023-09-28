package Servicios;

import java.util.List;
import java.util.Scanner;

import Entidades.Empleados;

public class ImplementacionEmpleados implements InterfazEmpleados {
	// Creamos el metodo de registro de los empleados
	@Override
	public void registroEmpleados(List<Empleados> listaEmpleados) {
		// Creamos un scanner para guardar la informacion
		Scanner sc = new Scanner(System.in);
		Empleados empleado = new Empleados();
		try {
			//Le añadimos un id al empleado
			empleado.setId(calcularId(listaEmpleados));
			// Comenzamos a pedir la informacion del usuario
			System.out.println("Indique el nombre del empleado:");
			empleado.setNombre(sc.next());
			System.out.println("Indique los apellidos del empleado:");
			empleado.setApellidos(sc.next());
			System.out.println("Indique el dni el empleado:");
			empleado.setDni(sc.next());
			System.out.println("Indique su fecha de cumpleaños:");
			empleado.setFechaNacimiento(sc.next());
			System.out.println("Indique la titulacion mas alta adquiridas:");
			empleado.setTitulacion(sc.next());
			System.out.println("Indique el numero de la seguirdad social:");
			empleado.setNumeroSS(sc.nextInt());
			System.out.println("Indique el numero de cuenta:");
			empleado.setNumeroCuenta(sc.nextInt());
		} catch (Exception e) {
			System.err.println("***ERROR***No se guardo correctamente.");
		}

		// Añadimos el objeto a la lista
		listaEmpleados.add(empleado);
	}
	
	
	//Creamos un metodo para calcular el id para cada usuario
	private int calcularId(List<Empleados> listaEmpleadosAntigua) 
	{
		int auxiliar = 0;
		for(int i = 0; i< listaEmpleadosAntigua.size(); i++) {
			int j = listaEmpleadosAntigua.get(i).getId();
			if(auxiliar<j) {
				auxiliar = j;
			}
		}
		return auxiliar + 1;
	}

}
