import java.util.*;
/**
 * Создать новый список, добавить несколько строк и вывести коллекцию на экран.
 * Итерация всех элементов списка цветов и добавления к каждому символа '!'.
 * Вставить элемент в список в первой позиции.
 * Извлечь элемент (по указанному индексу) из заданного списка.
 * Обновить определенный элемент списка по заданному индексу.
 * Удалить третий элемент из списка.
 * Поиска элемента в списке по строке.
 * Создать новый список и добавить в него несколько елементов первого списка.
 * Удалить из первого списка все элементы отсутствующие во втором списке.
 * *Сортировка списка.
 */
public class homeTask03 {
    public static void main(String[] args) {

        // 1 задача Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> listString = new ArrayList<>();
        listString.add("green");
        listString.add("orange");
        listString.add("blue");
        listString.add("red");
        listString.add("yellow");
        listString.add("black");
        listString.add("gray");

        System.out.println(listString);

        // 2 задача Итерация всех элементов списка цветов и добавления к каждому символа '!'.
//        ArrayList<String> listString1 = new ArrayList<>();  // Можно вставит созданием новой колекции
//        for (int i = 0; i < listString.size(); i++) {
//            listString1.add( listString.get(i) + "!");
//        }

        ListIterator<String> listIterator = listString.listIterator();  // Через итератор
        while (listIterator.hasNext()) {
            String str = listIterator.next();
            listIterator.add(str + "!");
        }

        System.out.println(listString);

        for (int i = 0; i < listString.size(); i++) {
            if (listString.get(i).contains("!")) listString.remove(i-1); // удаляем элементы без "!"
        }

        System.out.println(listString);

        // 3 задача Вставить элемент в список в первой позиции.
        listString.add(0, "white!");
        System.out.println(listString);

        // 4 задача Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println(listString.get(4));

        // 5 задача Обновить определенный элемент списка по заданному индексу.
        listString.set(5, "pink!");
        System.out.println(listString);

        // 6 задача Удалить третий элемент из списка.
        listString.remove(3);

        // 7 задача Поиска элемента в списке по строке.
        System.out.println(listString.contains("black!"));

        // 8 задача Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList<String> ltString = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ltString.add(listString.get(i));
        }
        System.out.println(ltString);

        // 9 задача Удалить из первого списка все элементы отсутствующие во втором списке.
        listString.removeAll(ltString);
        System.out.println(listString);

        // 10 задача Сортировка списка.
        Collections.sort(listString);
        System.out.println(listString);
    }
}
