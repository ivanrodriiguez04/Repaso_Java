package Servicios;

public class ImplementacionMenu implements InterfazMenu {
	
	//Creamos un menu para mostrar las diferentes opciones que se pueden utilizar
	public void mostrarMenu() 
	{
		System.out.println("1. Registro de empleado");
		System.out.println("2. Modificacion de empleado");
		System.out.println("3. Exportar informacion a ficheros");
		System.out.println("4. Cerrar app");
		System.out.println("¿Que opcion desea utilizar?");
	}


}
