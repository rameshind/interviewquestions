package main.hackerearth;

import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

public class NagaRam {

    long a= 0;
    float f= 100;
    double d= 3000;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Integer test = Integer.parseInt(s.nextLine());



        while (test-- > 0) {
            Map<Long, List<String>> angStrMap = new LinkedHashMap<>();
            Integer strs = Integer.parseInt(s.nextLine());
            while (strs-- > 0) {
                String anaram = s.nextLine();

                char[] charArr = anaram.toCharArray();
                //Arrays.sort(charArr);
               Long power = removeDuplicates(charArr);



                if (!angStrMap.containsKey(power)) {
                    List list = new ArrayList();
                    list.add(anaram);
                    angStrMap.put(power, list);
                } else {
                    angStrMap.get(power).add(anaram);
                }
            }
            Map<Long, List<String>> sortmap = angStrMap.entrySet().stream()/*.map(
                    entry -> {
                        entry.getValue().sort((p1, p2) -> p1.compareTo(p2));
                        Map.Entry<String, List> entry1 =
                                new AbstractMap.SimpleEntry<String, List>(entry.getKey(), entry.getValue());

                        return entry1;

                    }
            )*/
                    .sorted(comparingByKey()).collect(toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (a, b) -> {
                                throw new AssertionError();
                            },
                            LinkedHashMap::new
                    ));
            sortmap.entrySet().stream().forEach(entry -> {
                entry.getValue().sort(Comparator.naturalOrder());
                entry.getValue().forEach(ss-> System.out.print(ss+" "));
                System.out.println();
            });
        }




    }

   static long removeDuplicates(char[] str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length;i++)
            lhs.add(str[i]);

        long power = 0;
        for(Character c : lhs){
           int po =  c-'a';
           power+=Math.pow(2, po);
        }

        return power;

    }

}
