
public class TestReferencias {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Jean Pierre");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Annie");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("2222");
		
		EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacion controle = new ControleBonificacion();
        controle.registrar(gerente);
        controle.registrar(ev);
        controle.registrar(d);

        System.out.println(controle.getSuma());
	}
}
