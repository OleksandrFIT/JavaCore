package JC_hm14.TreeSet;

import JC_hm14.ClassExample;
import JC_hm14.SetComparator;

import java.util.Set;
import java.util.TreeSet;

public class AppTreeSet {
    public static void main(String[] args) {

        Set<ClassExample> classExamples = new TreeSet<>();

        classExamples.add(new ClassExample("USA", 350));
        classExamples.add(new ClassExample("Ukraine", 40));
        classExamples.add(new ClassExample("Great Britain", 68));
        classExamples.add(new ClassExample("Germany", 83));
        classExamples.add(new ClassExample("Australia", 26));

        System.out.println(classExamples);

    }
}
