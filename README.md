<img width="381" height="339" alt="image" src="https://github.com/user-attachments/assets/a102f04d-d79a-4ccb-8878-029719a79240" />

Sistema de Gestión de Préstamos en Biblioteca

 Descripción

Este proyecto consiste en desarrollar un sistema de gestión de préstamos de una biblioteca digital utilizando Java.

El sistema permite calcular las multas por demora en la devolución de diferentes materiales bibliográficos, como libros, revistas y tesis. Cada tipo de publicación tiene una tarifa de penalización diferente por cada día de atraso.

 Objetivo

Implementar una interfaz llamada Prestable para establecer un método general de cálculo de multas y utilizar el polimorfismo para procesar distintos tipos de materiales sin importar su clase concreta.

 Clases utilizadas

Prestable: interfaz que declara el método calcularMultaDemora(int diasAtraso).

LibroPrestamo: calcula la multa correspondiente al préstamo de un libro.

RevistaPrestamo: calcula la multa correspondiente al préstamo de una revista.

TesisPrestamo: calcula la multa correspondiente al préstamo de una tesis.

ControlVencimientos: procesa las devoluciones y calcula las multas utilizando cualquier objeto que implemente Prestable.

Main: contiene el método principal y permite probar el funcionamiento del sistema.

Conceptos aplicados

Interfaces: permiten establecer un comportamiento común para los distintos materiales.

Polimorfismo: permite trabajar con diferentes tipos de publicaciones mediante una misma interfaz.

Sobrescritura de métodos: cada clase implementa su propia versión de calcularMultaDemora().

Programación Orientada a Objetos (POO): organización del sistema mediante clases e interfaces.

 Funcionamiento

Se define la interfaz Prestable con el método para calcular las multas.

Se crean las clases LibroPrestamo, RevistaPrestamo y TesisPrestamo.

Cada clase establece una tarifa diferente por día de atraso.

La clase ControlVencimientos recibe cualquier material que implemente Prestable.

El método procesarDevolucion() calcula la multa según el tipo de publicación.

En el Main se simulan distintas devoluciones y se muestran los resultados por consola.

Tecnologías utilizadas

Java

IntelliJ IDEA

Programación Orientada a Objetos (POO)

 Resultado esperado

El sistema permite procesar devoluciones de diferentes materiales bibliográficos utilizando un único método. Cada publicación calcula su multa de manera independiente según su tarifa por día de atraso, demostrando el funcionamiento del polimorfismo mediante interfaces.
