package colleccton_1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_1
{
    public static void main(String[] args)
    {
        LinkedList<String> list=new LinkedList<String>();

        list.add("harsh");
        list.add("karan");
        list.add("ishavinder");
        list.add("deepak");
        list.add("param");

        Iterator<String> itr=list.descendingIterator();

        for(String name:list)
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }

    }
}
