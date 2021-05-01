package JC_hm17;

import java.util.Comparator;

public interface AnonymousWeight extends Comparator<Commodity> {
    @Override
    default int compare(Commodity o1, Commodity o2){
        int result = Integer.compare(o1.getWeight(), o2.getWeight());
        return result;
    }
}
