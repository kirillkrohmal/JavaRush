package lesson10.home02;

public @interface Author {
    //напиши свой код
    String value() default "";
    Position position() default Position.OTHER;
}
