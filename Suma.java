/**
 * El objetivo de esta <b>clase<b> es la de <b>sumar<b> números reales y números
 * enteros para darle
 * funcionalidad a la calculadora que estamos creando.
 * 
 * La clase contará con cuatro <b>métodos<b> uno que sumará dos valores reales,
 * otro que sumará tres
 * valores reales, otro que sumará dos valores enteros y un úlitmo método que
 * guardará el valor acumulado
 * pero no devolverá nada (void).
 * 
 * @author aliciarebollo
 * @version 1.0
 */
public class Suma {
  double acumulado;

  /**
   * Método que acepta dos valores reales y que devulve la suma de estos dos
   * valores.
   * 
   * @param realUno {double} Primer parámetro de entrada, debe ser un número real.
   * @param realDos {double} Segundo parámetro de entrada, debe ser un número
   *                real.
   * @return {double} Resultado de sumar realUno y realDos.
   */
  public double sumaReales(double realUno, double realDos) {
    return realUno + realDos;
  }

  /**
   * Método que acepta dos número enteros y devuelve la suma de esos dos valores.
   * 
   * @param enteroUno {int} Primer parámetro de entrada. Debe ser un número
   *                  entero.
   * @param enteroDos {int} Segundo parámetro de entrada. Debe ser un número
   *                  entero.
   * @return {int} Resultado de la suma entre enteroUno y enteroDos.
   */
  public int sumaEnteros(int enteroUno, int enteroDos) {
    return enteroUno + enteroDos;
  }

  /**
   * Método que devuelve la suma de tres números reales.
   * 
   * @param realUno  {double} Primer parámetro de entrada.
   * @param realDos  {double} Segundo parámetro de entrada.
   * @param realTres {double} Tercer parámetro de entrada.
   * @return {double} Resultado de la suma entre realUno, realDos, realTres.
   */
  public double sumaTresReales(double realUno, double realDos, double realTres) {
    return realUno + realDos + realTres;
  }

  /**
   * 
   * @param realUno {double} Parámetro de entrada.
   */
  public void valorAcumulado(double realUno) {
    acumulado += realUno;
  }

}
