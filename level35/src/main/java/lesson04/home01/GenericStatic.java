package lesson04.home01;

public class GenericStatic {
    public static <T> T someStaticMethod(Object genericObject) {
        System.out.println(genericObject);
        return (T) genericObject;
    }
}
