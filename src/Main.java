//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    LibroPrestamo libro = new LibroPrestamo();

    RevistaPrestamo revista = new RevistaPrestamo();

    TesisPrestamo tesis = new TesisPrestamo();

    ControlVencimientos control = new ControlVencimientos();

    System.out.println("SISTEMA DE PRESTAMOS DE BIBLIOTECA");
    System.out.println("----------------------");

    System.out.println("DEVOLUCION DE LIBRO");
    control.procesarDevolucion(libro, 5);

    System.out.println("DEVOLUCION DE REVISTA");
    control.procesarDevolucion(revista, 3);

    System.out.println("DEVOLUCION DE TESIS");
    control.procesarDevolucion(tesis, 7);
}
