
public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario jeanp = new Funcionario();
		jeanp.setSalario(2000);
		
		Gerente annie = new Gerente();
		annie.setSalario(10000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(jeanp);
		controlBonificacion.registrarSalario(annie);
	}
}