import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arrs
{
    public static final arrn a;
    
    static {
        a = (arrn)new arrp();
    }
    
    public static arrl a(arrl arrl, final List list) {
        arrl.getClass();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrl = (arrl)new arrr(arrl, (arro)iterator.next());
        }
        return arrl;
    }
    
    public static arrl b(final arrl arrl, final arro... array) {
        return a(arrl, Arrays.asList(array));
    }
}
