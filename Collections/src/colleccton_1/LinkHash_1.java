package colleccton_1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHash_1
{

    public static void main(String[] args)
    {
        LinkedHashSet<String> set=new LinkedHashSet<String>();

        set.add("A");
        set.add("V");
        set.add("R");
        set.add("Z");
        set.add("C");   
        set.add("M");
        set.add("R");
        set.add("D");


        Iterator<String> itr=set.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
