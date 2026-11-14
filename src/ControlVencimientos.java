public class ControlVencimientos {
    public void procesarDevolucion(Prestable material, int dias) {

        double multa = material.calcularMultaDemora(dias);

        System.out.println("Dias de atraso: " + dias);
        System.out.println("Multa a pagar: $" + multa);

        System.out.println("----------------------");
    }

}
