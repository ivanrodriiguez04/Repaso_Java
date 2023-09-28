package Entidades;

public class Empleados {
	// Atributos
	private String nombre, apellidos, dni, fechaNacimiento,titulacion;
	private int id,numeroSS, numeroCuenta;
	// Constructores
	public Empleados() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Empleados(String nombre, String apellidos, String dni, String fechaNacimiento, String titulacion,
			int id,int numeroSS, int numeroCuenta) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.titulacion = titulacion;
		this.id = id;
		this.numeroSS = numeroSS;
		this.numeroCuenta = numeroCuenta;
	}
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroSS() {
		return numeroSS;
	}
	public void setNumeroSS(int numeroSS) {
		this.numeroSS = numeroSS;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + " |Nombre=" + nombre +" "+ apellidos + " |Fecha de nacimiento= " + fechaNacimiento+ " |Titulo= " + titulacion
				+ " |dni= " + dni + " |Numero Seguridad Social=" + numeroSS+ " |Numero Cuenta=" + numeroCuenta +"]";
	}
}
