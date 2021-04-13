package JC_hm14.HashSet;

import JC_hm14.ClassExample;

import java.util.*;

public class AppHashSet {
    public static void main(String[] args) {

        Set<ClassExample> classExamples = new HashSet<>();


        classExamples.add(new ClassExample("USA", 350));
        classExamples.add(new ClassExample("Ukraine", 40));
        classExamples.add(new ClassExample("Great Britain", 68));
        classExamples.add(new ClassExample("Germany", 83));
        classExamples.add(new ClassExample("Australia", 26));

        System.out.println(classExamples + "\n=====================================================");

        List<ClassExample> list = new ArrayList<>(classExamples);
        Collections.sort(list);

        System.out.println(list);
    }
}
