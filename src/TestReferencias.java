
public class TestReferencias {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Jean Pierre");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Annie");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("2222");
	}
}
