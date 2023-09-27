package Servicios;

import java.util.List;
import java.util.Scanner;

import Entidades.Empleados;

public class ImplementacionEmpleados implements InterfazEmpleados 
{
	//Creamos el metodo de registro de los empleados
	@Override
	public void registroEmpleados(List<Empleados> listaEmpleados) 
	{
		//Creamos un scanner para guardar la informacion
		Scanner sc=new Scanner(System.in);
		//Comenzamos a pedir la informacion del usuario
		System.out.println("Indique el nombre del empleado:");
		String nombre=sc.next();
		System.out.println("Indique los apellidos del empleado:");
		String apellidos=sc.next();
		System.out.println("Indique el dni el empleado:");
		String dni=sc.next();
		System.out.println("Indique su fecha de cumpleaños:");
		String fechaNacimiento=sc.next();
		System.out.println("Indique la titulacion mas alta adquiridas:");
		String titulacion=sc.next();
		System.out.println("Indique el numero de la seguirdad social:");
		int numeroSS=sc.nextInt();
		System.out.println("Indique el numero de cuenta:");
		int numeroCuenta=sc.nextInt();
		//Creamos un objeto para guardar toda la informacion recibida
		Empleados empleados= new Empleados(nombre,apellidos,dni,fechaNacimiento,
				titulacion,numeroSS,numeroCuenta);
		//Añadimos el objeto a la lista
		listaEmpleados.add(empleados);
	}

}
