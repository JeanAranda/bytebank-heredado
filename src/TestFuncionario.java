
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setNombre("Jean Pierre");
		diego.setDocumento("70174400");
		diego.setSalario(2500);
		diego.setTipo(0);
		
		System.out.println("Su salario actual es: S/. "+diego.getSalario());
		System.out.println("La bonificacion de "+diego.getNombre()+" es: S/. "+diego.getBonificacion());
		
		System.out.println("El numero de DNI es: "+diego.getDocumento());
	}
}
