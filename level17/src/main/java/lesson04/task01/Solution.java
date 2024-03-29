package lesson04.task01;

import java.util.ArrayList;
import java.util.List;

/* Синхронизированные заметки
1. Класс Note будет использоваться нитями. Поэтому сделай так, чтобы обращения к листу notes блокировали
мютекс notes, не this
2. Все System.out.println не должны быть заблокированы (синхронизированы), т.е. не должны находиться в
блоке synchronized
*/

public class Solution {
    public static class Note {
        public List<String> notes = new ArrayList<String>();

        public  void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            synchronized(notes) {
                notes.add(note);
            }
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public synchronized void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = null;
            synchronized(notes) {
                note = notes.remove(index);
            }
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}
