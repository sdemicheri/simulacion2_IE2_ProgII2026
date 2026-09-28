import java.util.ArrayList;

public class GestorBiblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Socio> socios;
    private ArrayList<Prestamo> prestamos;

    public GestorBiblioteca() {

        libros = new ArrayList<>();
        socios = new ArrayList<>();
        prestamos = new ArrayList<>();

        // ==========================================
        // LIBROS
        // ==========================================

        Libro libro1 = new Libro(
            101,
            "El Principito",
            "Antoine de Saint-Exupéry",
            3
        );

        Libro libro2 = new Libro(
            102,
            "1984",
            "George Orwell",
            0
        );

        Libro libro3 = new Libro(
            103,
            "Rayuela",
            "Julio Cortázar",
            5
        );

        Libro libro4 = new Libro(
            104,
            "Cien años de soledad",
            "Gabriel García Márquez",
            2
        );

        Libro libro5 = new Libro(
            105,
            "El Hobbit",
            "J. R. R. Tolkien",
            0
        );

        Libro libro6 = new Libro(
            106,
            "Fahrenheit 451",
            "Ray Bradbury",
            4
        );

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.add(libro5);
        libros.add(libro6);


        // ==========================================
        // SOCIOS
        // ==========================================

        Socio socio1 = new Socio(
            1,
            "Ana Gómez"
        );

        Socio socio2 = new Socio(
            2,
            "Juan Pérez"
        );

        Socio socio3 = new Socio(
            3,
            "María López"
        );

        Socio socio4 = new Socio(
            4,
            "Carlos Rodríguez"
        );

        Socio socio5 = new Socio(
            5,
            "Laura Fernández"
        );

        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);
        socios.add(socio5);


        // ==========================================
        // PRÉSTAMOS
        // ==========================================

        Prestamo prestamo1 = new Prestamo(
            1001,
            socio1
        );

        prestamo1.agregarDetalle(
            new DetallePrestamo(libro1, 1)
        );

        prestamo1.agregarDetalle(
            new DetallePrestamo(libro2, 1)
        );

        prestamos.add(prestamo1);


        Prestamo prestamo2 = new Prestamo(
            1002,
            socio2
        );

        prestamo2.agregarDetalle(
            new DetallePrestamo(libro3, 2)
        );

        prestamo2.agregarDetalle(
            new DetallePrestamo(libro4, 1)
        );

        prestamo2.agregarDetalle(
            new DetallePrestamo(libro5, 1)
        );

        prestamos.add(prestamo2);



        Prestamo prestamo3 = new Prestamo(
            1003,
            socio3
        );

        prestamo3.agregarDetalle(
            new DetallePrestamo(libro1, 1)
        );

        prestamo3.agregarDetalle(
            new DetallePrestamo(libro3, 1)
        );

        prestamo3.agregarDetalle(
            new DetallePrestamo(libro6, 2)
        );

        prestamos.add(prestamo3);


        Prestamo prestamo4 = new Prestamo(
            1004,
            socio4
        );

        prestamo4.agregarDetalle(
            new DetallePrestamo(libro2, 1)
        );

        prestamos.add(prestamo4);


        Prestamo prestamo5 = new Prestamo(
            1005,
            socio5
        );

        prestamo5.agregarDetalle(
            new DetallePrestamo(libro4, 1)
        );

        prestamo5.agregarDetalle(
            new DetallePrestamo(libro6, 1)
        );

        prestamos.add(prestamo5);
    }


    public Libro obtenerLibro(int codigo) {

        for (Libro libro : libros) {

            if (libro.getCodigo() == codigo) {
                return libro;
            }
        }

        return null;
    }


    public Socio obtenerSocio(int numero) {

        for (Socio socio : socios) {

            if (socio.getNumero() == numero) {
                return socio;
            }
        }

        return null;
    }



}