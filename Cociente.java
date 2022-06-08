/**
 * Clase que guarda una serie de métodos relacionados con las divisiones y con
 * las raices cuadradras.
 * 
 * @author aliciarebollo
 * @version 1.0
 */
public class Cociente {

  /**
   * Método que acepta dos valores de entrada{double} y que devuelve el resultado
   * de la división entre esos dos números.
   * 
   * @param realUno {double}
   * @param realDos {double}
   * @return resultado de dividir realUno entre realDos.
   */
  public double divisionReales(double realUno, double realDos) {
    return realUno / realDos;
  }

  /**
   * Método que acepta dos valores de entrada{int} y que devulve el resultado de
   * dividir esos dos valores.
   * 
   * @param enteroUno {int}
   * @param enteroDos {int}
   * @return resultado de dividir enteroUno entre enteroDos.
   */
  public int divisionEnteros(int enteroUno, int enteroDos) {
    return enteroUno / enteroDos;
  }

  /**
   * Método que acepta un número y mientras este sea mayor que 0 le devolverá su
   * invertido.
   * 
   * @param realUno {double}
   * @return resultado de invertir realUno {double}.
   */
  public double inversoNumero(double realUno) {
    double cifra, inverso = 0;
    while (realUno != 0) {
      cifra = realUno % 10;
      inverso = (inverso * 10) + cifra;
      realUno /= 10;
    }

    return inverso;
  }

  /**
   * Método que acepta un número real y devuelve su raiz cuadrada.
   * 
   * @param realUno {double}
   * @return resultado de hacer la raiz cuadrada de realUno.
   */
  public double raizCuadrada(double realUno) {
    return realUno = Math.sqrt(realUno);
  }
}
