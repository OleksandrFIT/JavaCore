package JC_hm14.LinkedHashSet;

import JC_hm14.ClassExample;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppLinkedHashSet {

    public static void main(String[] args) {

        Set<ClassExample> classExamples = new LinkedHashSet<>();


        classExamples.add(new ClassExample("USA", 350));
        classExamples.add(new ClassExample("Ukraine", 40));
        classExamples.add(new ClassExample("Great Britain", 68));
        classExamples.add(new ClassExample("Germany", 83));
        classExamples.add(new ClassExample("Australia", 26));

        System.out.println(classExamples + "\n=====================================================");

        Set<ClassExample> classExampleTreeSet = new TreeSet<>(classExamples);
        System.out.println(classExampleTreeSet);

    }

}
