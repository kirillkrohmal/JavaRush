package lesson06.task02;

/* Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        try
        {
            String s = null;
            String m = s.toLowerCase();
        }

        //напишите тут ваш код
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
