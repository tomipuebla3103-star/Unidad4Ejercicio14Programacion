public class TesisPrestamo implements Prestable{
    @Override
    public double calcularMultaDemora(int diasAtraso) {

        if (diasAtraso > 0) {
            return diasAtraso * 800;
        }

        return 0;
    }
}
