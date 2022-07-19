package colleccton_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_1
{
    public static void main(String[] args) {

      ArrayList<String> list=new ArrayList<String>();
      list.add("harsh");
      list.add("karan");
      list.add("ishavinder");
      list.add("deepak");
      list.add("param");

      //sorting list
        Collections.sort(list);


      Iterator <String> itr=list.iterator();
        //System.out.println(list);


        while (itr.hasNext())
      {
          System.out.println(itr.next());

      }


    }
}
