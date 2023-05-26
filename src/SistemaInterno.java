
public class SistemaInterno {
	private String clave = "clave123";
	
	public boolean autentica(FuncionarioAutenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Acceso admitido");
			return true;
		} else {
			System.out.println("Error al ingresar");
			return false;
		}
	}
}
