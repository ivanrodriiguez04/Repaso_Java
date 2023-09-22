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
	}

}
