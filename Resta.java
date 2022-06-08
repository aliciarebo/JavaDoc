/**
 * Esta clase implementará una serie de métodos relacionados con las restas,
 * donde encontraremos una serie de métodos que tendrán valores de entrada
 * de tipo {double} e {int} y que devolverán el resultado de la resta de esos
 * números, por otro lado, tendremos un último método que no devolverá nada
 * (void) y guardará el valor acumulado.
 * 
 * @author aliciarebollo
 * @version 1.0
 */
public class Resta {

  double acumulado = 0;

  /**
   * Método que permite dos valores de entrada de tipo {double} y que devuelve el
   * resultado
   * de la resta de estos dos números.
   * 
   * @param realUno {double} Primer valor de entrada.
   * @param realDos {double} Segundo valor de entrada.
   * @return {double} Resultado de la resta entre realUno y realDos.
   */
  public double restaReales(double realUno, double realDos) {
    return realUno - realDos;
  }

  /**
   * Método que permite dos valores de entrada de tipo {int} y que devuelve el
   * resultado de la resta de estos dos números.
   * 
   * @param enteroUno {int}
   * @param enteroDos {int}
   * @return Resultado de la resta entre enteroUno y enteroDos.
   */
  public int restaEnteros(int enteroUno, int enteroDos) {
    return enteroUno - enteroDos;
  }

  /**
   * Método que permite tres valores de entrada de tipo {double} y que devuelve el
   * resultado de la resta de estos tres números.
   * 
   * @param realUno  {int}
   * @param realDos  {int}
   * @param realTres {int}
   * @return Resultado de la resta entre realUno, realDos y realTres.
   */
  public double restaTresReales(double realUno, double realDos, double realTres) {
    return realUno - realDos - realTres;
  }

  /**
   * Método que no devuelve nada (void) y que resta el valor acumulado.
   * 
   * @param realUno {double}
   */
  public void valorAcumulado(double realUno) {
    acumulado -= realUno;
  }

}
