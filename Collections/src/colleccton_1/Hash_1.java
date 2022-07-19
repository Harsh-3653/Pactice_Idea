package colleccton_1;

import javax.swing.text.html.HTMLDocument;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_1
{
    public static void main(String[] args)
    {
        HashSet<String> set=new HashSet<String>();

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
