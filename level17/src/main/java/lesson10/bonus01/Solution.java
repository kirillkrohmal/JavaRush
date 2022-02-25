package lesson10.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //String param = args[0];
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        //проверка
            while (true) {                                                                       //проверка
                String param = reader.readLine();                                                //проверка
                if("exit".equals(param))                                                         //проверка
                    break;                                                                       //проверка
                char key = param.charAt(1);
                switch (key) {
                    case 'c': { create(getName(param), getSex(param), convertDate(param)); break; }
                    case 'u': { update(getId(param), getName(param), getSex(param), convertDate(param)); break; }
                    case 'd': { delete(getId(param)); break;}
                    case 'i': {  print(getId(param));  break;}
                    default: System.out.println("Wrong key!");
                } } } catch (IOException e) {}
    }

    private static int getId(String param) {
        if(Character.getNumericValue(param.charAt(3)) < allPeople.size())
            return Character.getNumericValue(param.charAt(3));
        else {
            System.out.println("There is no such person with that id");
            return allPeople.size();
        }
    }

    private static String convertDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
        if(date.equals(null))
            return "";
        else
            return dateFormat.format(date);
    }

    private static Date convertDate(String param) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY", Locale.ENGLISH);
        String[] s = param.split(" ");
        String date;
        if('c' == param.charAt(1))
            date = s[3];
        else
            date = s[4];
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) { System.out.println("Wrong date!"); }
        return null;
    }

    private static char getSex(String param) {
        String[] s = param.split(" ");
        if('c' == (param.charAt(1)))
            return s[2].charAt(0);
        else
            return s[3].charAt(0);
    }

    private static String getName(String param) {
        String[] s = param.split(" ");
        if('c' == (param.charAt(1)))
            return s[1];
        else
            return s[2];
    }

    private static void create(String name, char sex, Date bd) {
        if('м' == sex)
            allPeople.add(Person.createMale(name, bd));
        else
            allPeople.add(Person.createFemale(name, bd));
        System.out.println(allPeople.size() - 1);
    }

    private static void update(int id, String name, char sex, Date bd) {
        Person person;
        if(id < allPeople.size())
            person = allPeople.get(id);
        else {
            return;
        }
        if('м' == sex)
            person.setSex(Sex.MALE);
        else
            person.setSex(Sex.FEMALE);
        person.setName(name);
        person.setBirthDay(bd);
    }

    private static void delete(int id) {
        Person person;
        if(id < allPeople.size())
            person = allPeople.get(id);
        else {
            return;
        }
        person.setBirthDay(null);
    }

    private static void print(int id) {
        Person person;
        if(id < allPeople.size())
            person = allPeople.get(id);
        else
            return;
        try {
            System.out.println(person.getName()+ " " + person.getSex() + " " + convertDate(person.getBirthDay()));
        } catch(NullPointerException e) { System.out.println("Person deleted!"); }
    }
}
