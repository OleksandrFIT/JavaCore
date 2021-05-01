package JC_hm17;

import java.util.Comparator;

public class ComparatorLength implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return Integer.compare(o1.getLength(), o2.getLength());
    }
}
