import java.util.Arrays;
import java.util.ArrayList;
import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dzr
{
    protected static void b(final int n, final BitSet set, final String[] array) {
        int i = 0;
        if (set.nextClearBit(0) < n) {
            final ArrayList list = new ArrayList();
            while (i < n) {
                if (!set.get(i)) {
                    list.add(array[i]);
                }
                ++i;
            }
            throw new IllegalStateException("The following props are not marked as optional and were not supplied: ".concat(String.valueOf(Arrays.toString(list.toArray()))));
        }
    }
    
    public abstract dzs a();
}
