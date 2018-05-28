package java8New;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class Reduce
{

    public static void main(String arg[])
    {
        List<S> d = new ArrayList<S>();
        // d.add(299);
        // d.add(333);
        // d.add(2939);
        // d.add(333);
        // d.add(2939);
        d.add(new S(123444, "zsasddfdfd"));
        d.add(new S(12343433, "asdzfds"));
        d.add(new S(122223, "sad"));
        d.add(new S(1233333, "asdfasdas"));
        DoubleSummaryStatistics t = d.stream().map(s -> s.i).filter(c -> c > 1999).limit(2).collect(Collectors.summarizingDouble(dd -> dd));
        // t.accept(298767689);
        // t.accept(4);
        Map<Integer, String> testMap = new LinkedHashMap<>();
        testMap = d.stream().collect(Collectors.toMap(p -> p.i, p -> p.name));
        Comparator<String> s = (ss, yy) -> {
            return ss.compareTo(yy);
        };
        Map<String, Integer> testMas = new TreeMap<String, Integer>(s);
        // testMas = testMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        testMas = testMap.entrySet().stream().collect(Collectors.toMap(p -> p.getValue(), p -> p.getKey()));
        System.out.println(testMap);
        System.out.println(testMas);
        TreeMap<String, Integer> tes = new TreeMap<String, Integer>(s);
        testMas.forEach((x, ddd) -> {
            tes.put(x, ddd);
        });
        System.out.println(tes);
    }
}


class S
{

    S(int i, String name)
    {
        this.i = i;
        this.name = name;
    }

    int i;
    String name;
}