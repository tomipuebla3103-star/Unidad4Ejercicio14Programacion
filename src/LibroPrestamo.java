public class LibroPrestamo implements Prestable{

    @Override
    public double calcularMultaDemora(int diasAtraso) {

        if (diasAtraso > 0) {
            return diasAtraso * 500;
        }

        return 0;
    }
}
