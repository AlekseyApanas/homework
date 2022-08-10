package home_work_4;

import java.util.Arrays;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

        DataContainer<String> container = new DataContainer<>(new String[8]);
        ComparatorContainerString comparatorContainerString = new ComparatorContainerString();
        Iterator<String> stringIterator = container.iterator();
        System.out.println(Arrays.toString(container.getItems()));

        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        int index5 = container.add("Давай");

        System.out.println(Arrays.toString(container.getItems()));

        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        String text5 = container.get(index5);
        String text6 = container.get(5);

        System.out.println(text1); //Привет
        System.out.println(text2);//Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        System.out.println(text5); //Давай
        System.out.println(text6); //null

        System.out.println(container.delete(3));
        System.out.println(Arrays.toString(container.getItems()));

        System.out.println(container.delete(text1));
        System.out.println(Arrays.toString(container.getItems()));

        System.out.println(container.get(index1)); //Как дела
        System.out.println(container.get(index2)); //Работаю
        System.out.println(container.get(index3)); //Давай
        System.out.println(container.get(index4)); //null
        System.out.println(container.get(index5)); //null
        System.out.println(container.get(5)); //null

        container.sort(comparatorContainerString);
        System.out.println(Arrays.toString(container.getItems()));//[Давай, Работаю, Как дела, null, null, null]

        System.out.println(container);// data= [Давай, Работаю, Как дела]

        DataContainer.sort(container);
        System.out.println(container);// data= [Давай, Как дела, Работаю]

        DataContainer.sort(container, comparatorContainerString);
        System.out.println(container);// data= [Давай, Работаю, Как дела]

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }

}
