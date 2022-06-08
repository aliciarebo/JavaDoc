public class Test {
  public static void main(String[] args) {
    // Pruebas de la clase suma
    System.out.println("PRUEBAS DE LA CLASE SUMA");
    Suma suma = new Suma();
    System.out.println("Suma de DOS reales: " + suma.sumaReales(3.5, 2)); // 5.5
    System.out.println("Suma de DOS enteros: " + suma.sumaEnteros(4, 6)); // 10
    System.out.println("Suma de TRES reales: " + suma.sumaTresReales(1.5, 4.5, 3.5));// 9.5
    suma.valorAcumulado(5);
    System.out.println("Acumulado: " + suma.acumulado);

    // Pruebas de la clase resta
    System.out.println("PRUEBAS DE LA CLASE RESTA");
    Resta resta = new Resta();
    System.out.println("Resta de DOS reales: " + resta.restaReales(5.5, 1.5));// 4
    System.out.println("Resta de DOS enteros: " + resta.restaEnteros(4, 2)); // 2
    System.out.println("Resta de TRES reales: " + resta.restaTresReales(10, 2.5, 2.5)); // 5
    resta.valorAcumulado(5);
    System.out.println("Acumulado: " + resta.acumulado);

    // Pruebas de la clase producto
    System.out.println("PRUEBAS DE LA CLASE PRODUCTO");
    Producto producto = new Producto();
    System.out.println("Producto de DOS reales: " + producto.productoReales(2.5, 2));// 5
    System.out.println("Producto de DOS enteros: " + producto.productoEntero(5, 5));// 25
    System.out.println("Producto de TRES reales: " + producto.productoTresReales(2, 2, 3)); // 12
    System.out.println("Potencia: " + producto.Potencia(2, 1)); // 2

    // Pruebas de la clase Cociente
    System.out.println("PRUEBAS DE LA CLASE COCIENTE");
    Cociente cociente = new Cociente();
    System.out.println("División de DOS reales: " + cociente.divisionReales(10, 2.5)); // 4
    System.out.println("Division de DOS enteros: " + cociente.divisionEnteros(4, 2));// 2
    System.out.println("Inverso de un número: " + cociente.inversoNumero(5));
    System.out.println("Raiz cuadrada de un número: " + cociente.raizCuadrada(25)); // 5
  }

}
