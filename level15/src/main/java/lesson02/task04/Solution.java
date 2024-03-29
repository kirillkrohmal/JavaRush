package lesson02.task04;
import java.util.List;
import java.util.LinkedList;
/* ООП - книги
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].
Параметр конструктора - имя книги.
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook расширьте тип возвращаемого результата.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    public abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getName();

        private String getOutputByBookType() {

            return null;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {
        public String bookName=null;

        public MarkTwainBook(String bookName)
        {
            super("Mark Twain");
            this.bookName = bookName;
        }

        @Override
        public MarkTwainBook getBook()
        {
            return this;
        }

        @Override
        public String getName()
        {
            return this.bookName;
        }
    }

    public static class AgathaChristieBook extends  Book {


        public AgathaChristieBook(String author) {
            super(author);
        }

        @Override
        public Book getBook() {
            return null;
        }

        @Override
        public String getName() {
            return null;
        }
    }

}