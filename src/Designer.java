
public class Designer extends Funcionario{
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Diseñador");
		return 250;
	}
}
