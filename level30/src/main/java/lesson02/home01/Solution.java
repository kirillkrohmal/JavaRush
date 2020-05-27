package lesson02.home01;

import java.math.BigInteger;

/* Конвертер систем счислений
Реализуйте логику метода convertNumberToOtherNumerationSystem, который должен переводить число number.getDigit()
из одной системы счисления(numerationSystem) в другую (expectedNumerationSystem)
бросьте NumberFormatException, если переданное число некорректно, например, число "120" с системой счисления 2
Валидация для - number.getDigit() - целое не отрицательное
Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        java.lang.Number number = new java.lang.Number(NumerationSystemType._10, "6");
        java.lang.Number result = convertNumberToOtherNumerationSystem(number, NumerationSystemType._2);
        System.out.println(result);    //expected 110
    }

    public static java.lang.Number convertNumberToOtherNumerationSystem(java.lang.Number number, NumerationSystem expectedNumerationSystem) {
        BigInteger b = new BigInteger(number.getDigit(), number.getNumerationSystem().getNumerationSystemIntValue());
        return new java.lang.Number(expectedNumerationSystem, b.toString(expectedNumerationSystem.getNumerationSystemIntValue()));
    }
}
