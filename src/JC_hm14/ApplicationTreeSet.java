package JC_hm14;

import java.util.*;

public class ApplicationTreeSet {
    public static void main(String[] args) {

        List<ClassExample> classExamples = new LinkedList<>();
        classExamples.add(new ClassExample("USA", 350));
        classExamples.add(new ClassExample("Ukraine", 40));
        classExamples.add(new ClassExample("Great Britain", 68));
        classExamples.add(new ClassExample("Germany", 83));

        System.out.println(classExamples);

        Collections.sort(classExamples);

        System.out.println(classExamples);

    }


}
