package JC_hm17;

import java.util.Comparator;

public interface AnonymousLength extends Comparator<Commodity> {
    @Override
    int compare(Commodity o1, Commodity o2);
}
