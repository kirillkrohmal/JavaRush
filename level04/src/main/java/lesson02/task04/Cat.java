package lesson02.task04;

/* Реализовать метод setName
Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной
private String fullName равное значению локальной переменной String fullName.
*/

public class Cat {
    private String fullName;
    public void setName(String firstName, String lastName) {
        //add your code here
        fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }
}
