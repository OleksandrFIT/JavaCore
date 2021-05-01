package JC_hm17;

import java.util.Comparator;

public class ComparatorWidth implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return Integer.compare(o1.getWidth(), o2.getWidth());
    }
}
