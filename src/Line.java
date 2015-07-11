import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * Created by blayhem on 10/07/15.
 */
public class Line {
    public static String WhoIsNext(String[] names, int n){
        //ArrayList<String> list = new ArrayList<>();
        //Collections.addAll(list, names);
        /*
        String name;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        for (int i = 1; i < n; i++) {
            name = list.get(0);
            list.add(name);
            list.add(name);
            list.remove(0);
        }
        return list.get(0);
        */
        Stream<String> one = Arrays.stream(names);
        Stream<String> two = Arrays.stream(new String[n * 2]);
        int a = names.length;
        String[] queue = Stream.concat(one, two).toArray(size -> new String[a+n*2]);
        int q = queue.length;
        int i = 0;

        while (i < q) {
            queue[a+(2*i)] = queue[i];
            queue[a+1+(2*i)] = queue[i];
            i++;
        }
        return queue[i];
    }
}