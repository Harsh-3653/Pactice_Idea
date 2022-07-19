package colleccton_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Conversion
{
    public static void main(String[] args)
    {
        //convert array to list


        String[] array={"Java","Python","PHP","C++"};

        ArrayList<String>list=new ArrayList<String>();
        for(String abc:array)
        {
            list.add(abc);
        }

        for(String abc:list)
        {
            System.out.println(abc);
        }
    }
}
