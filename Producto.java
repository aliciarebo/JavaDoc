/**
 * Clase que guarda una serie de métodos relacionado con las multiplicaciones y
 * las potencias.
 * 
 * @author aliciarebo
 * @version 1.0
 */
public class Producto {

  /**
   * Método que contiene dos valores de entrada de tipo {double} y que devulve la
   * multiplicación de estos dos números.
   * 
   * @param realUno {double}
   * @param realDos {double}
   * @return resultado de multiplicar realUno y realDos;
   */
  public double productoReales(double realUno, double realDos) {
    return realUno * realDos;
  }

  /**
   * Método que acepta dos valores de entrada {int} y que devulve el resultado de
   * multiplicar estos dos números.
   * 
   * @param enteroUno {int}
   * @param enteroDos {int}
   * @return resultado de multiplicar enteroUno y enteroDos.
   */
  public int productoEntero(int enteroUno, int enteroDos) {
    return enteroUno * enteroDos;
  }

  /**
   * Método que acepta tres valores de entrada {int} y que devulve el resultado de
   * la multiplicacion entre estos tres valores.
   * 
   * @param realUno {double}
   * @param realDos {double}
   * @param realTres {double}
   * @return resultado de multiplicar realUno, realDos y realTres.
   */
  public double productoTresReales(double realUno, double realDos, double realTres) {
    return realUno * realDos * realTres;
  }

  /**
   * 
   * @param base      valor de entrada {double} que será la base, es decir el
   *                  número que queremos elevar.
   * @param exponente valor de entrada {double} que será el exponente, es decir el
   *                  elevado.
   * @return resultado de elevar la base al exponente.
   */
  public double Potencia(double base, double exponente) {
    return Math.pow(base, exponente);
  }

}
