public class ControleBonificacion {

    private double suma;

    public void registrar(Funcionario e) {
        this.suma += e.getBonificacion();
    }

    public double getSuma() {
        return suma;
    }
}