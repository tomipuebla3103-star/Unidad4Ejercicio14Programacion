public class RevistaPrestamo implements Prestable{
    @Override
    public double calcularMultaDemora(int diasAtraso) {

        if (diasAtraso > 0) {
            return diasAtraso * 300;
        }

        return 0;
    }
}
