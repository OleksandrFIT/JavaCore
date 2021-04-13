package JC_hm13;

import java.util.Comparator;

public class ComparatorWeight implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}
