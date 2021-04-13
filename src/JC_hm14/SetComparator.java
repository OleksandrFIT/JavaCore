package JC_hm14;

import java.util.Comparator;

public class SetComparator implements Comparator<ClassExample> {
    @Override
    public int compare(ClassExample o1, ClassExample o2) {
        int res = o1.getCountry().compareTo(o2.getCountry());
        if (res == 0){
            res = Integer.compare(o1.getCitizens(),o2.getCitizens());
        }
        return res;
    }

}
