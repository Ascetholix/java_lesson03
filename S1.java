import java.util.ArrayList;
import java.util.Random;

public class S1 {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        ArrayList<Integer> listInteger = new ArrayList<>();
        listString.add("Hello_all!");
        listString.add("Hello!");
        listString.add("Java");
        listString.add("Random!");
        listString.add("1111!");

        Random rnd = new Random();
        for (int i = 0; i < listString.size(); i++) {
            listInteger.add(rnd.nextInt(10));
        }
        System.out.println(listString);
        System.out.println(listInteger);

//        System.out.println(listString.get(0).length());
//        System.out.println(listInteger.get(0));
        ArrayList<String> tmp = new ArrayList<>();

        for (int i = 0; i <listString.size() ; i++) {
            if (listString.get(i).length() > listInteger.get(i)) {

                tmp.add(listString.get(i));
//                listString.remove(i);
//                listInteger.remove(i);
            }
        }
        System.out.println(tmp);
        listString.removeAll(tmp);
        System.out.println(listString);
    }
}
