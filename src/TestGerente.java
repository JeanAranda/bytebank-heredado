
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		//gerente.setSalario(10000);
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(15000);
		gerente.setClave("MiclavePersonal");
		gerente.setTipo(1);
		
		System.out.println("La bonificacion del gerente es: "+gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("MiclavePersonal"));
	}
}
