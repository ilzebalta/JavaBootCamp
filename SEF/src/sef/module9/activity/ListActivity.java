package sef.module9.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //1 - Type code to create a list of names. Use ArrayList.
        //2 - Call print method to print the list passed as its parameter.
        //3 - Type code to print this list
        //Notice the order in which elements get printed.

        List list = new ArrayList();
        list.add("John");
        list.add("Jane");
        list.add("Ilze");

        ListActivity listActivity = new ListActivity();
        listActivity.print(list);
    }

    void print(List list) {
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
