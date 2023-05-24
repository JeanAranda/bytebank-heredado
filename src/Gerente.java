public class Gerente extends Funcionario{
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "clave123";
	}
	
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return super.getSalario() + 
				super.getBonificacion(); 	
	}
}
