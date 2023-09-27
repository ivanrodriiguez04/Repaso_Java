package Controladores;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidades.Empleados;
import Servicios.InterfazMenu;
import Servicios.ImplementacionMenu;
import Servicios.InterfazEmpleados;
import Servicios.ImplementacionEmpleados;

public class Menu 
{
	public static void main(String[] args) 
	{
		// Variables para el bucle 
		int opcion;
		Boolean ok=false;
		
		//Creacion de objetos
		InterfazMenu iM = new ImplementacionMenu();
		InterfazEmpleados iE= new ImplementacionEmpleados();
		
		//Scanner,listas y ficheros
		Scanner sc=new Scanner(System.in);
		List<Empleados> listaEmpleados=new ArrayList();
		
		//Hacemos un try catch para la comprobacion de errores
		try 
		{
			//Creamos un bucle while para poder volver a utilizar el menu de pendiendo de la opcion
			while(!ok) 
			{
				iM.mostrarMenu();
				opcion=sc.nextInt();
				//Con la opcion dado por el usuario creamos un switch con un caso para cada opcion
				switch(opcion) 
				{
					case 1:
						//Registro de empleados
						iE.registroEmpleados(listaEmpleados);
						break;
					case 2:
						//modificacion de empleados
						System.out.println("Registro de empleados");
						break;
					case 3:
						//Exportar ficheros
						System.out.println("Registro de empleados");
						break;
					case 4:
						//Cerrar la app
						System.out.println("Saliendo de la app");
						ok=true;//Señalizamos ok como true para poder salir
						break;
				}
						
			}
		}
		catch (NumberFormatException e) 
		{
			System.out.println("Error: Opción inválida. Por favor, introduce un número válido.");
		}
		catch (Exception e) 
		{
			System.out.println("Se produjo un error" + e.getMessage());
		}
	}

}
