public class Libro {
    private int codigo;
    private String titulo;
    private String autor;
    private int ejemplaresDisponibles;

    public Libro(int codigo, String titulo, String autor, int ejemplaresDisponibles) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }
}