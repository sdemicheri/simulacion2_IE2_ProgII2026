import java.util.ArrayList;

public class Prestamo {
    private int numero;
    private Socio socio;
    private ArrayList<DetallePrestamo> detalles;

    public Prestamo(int numero, Socio socio) {
        this.numero = numero;
        this.socio = socio;
        this.detalles = new ArrayList<>();
    }


    public void agregarDetalle(DetallePrestamo detalle) {
        detalles.add(detalle);
    }
}