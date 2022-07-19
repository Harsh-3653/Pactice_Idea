import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Problem_1 {
    public static void main(String[] args) {

        int count = 0;

        Scanner scan = new Scanner(System.in);

        String value = scan.nextLine();
        String noSpaceValue = value.replaceAll("\\s", "").toLowerCase();

        System.out.println(noSpaceValue);
        //System.out.println(noSpaceValue.length());

        ArrayList<Character> list = new ArrayList<Character>();

        HashSet<Character> hSet = new HashSet<Character>();

        CharacterIterator itr = new StringCharacterIterator(noSpaceValue);


        //can use for each
        while (itr.current() != CharacterIterator.DONE) {
            list.add(itr.current());
            hSet.add(itr.current());
            itr.next();

        }

        ArrayList<Character> listConv = new ArrayList<>(hSet);

        System.out.println(listConv);

        for (int i = 0; i < listConv.size(); i++) {
            for (int j = 0; j < noSpaceValue.length(); j++)
            {
                {
                    if ((listConv.get(i)).equals(list.get(j))) {
                        count++;
                    }

                }


            }
            System.out.println(listConv.get(i) + " " + count);
            count = 0;
        }
    }
}
