import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arwz
{
    public static final arwu a;
    
    static {
        a = (arwu)new arww();
    }
    
    public static arws a(arws arws, final List list) {
        arws.getClass();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arws = (arws)new arwy(arws, (arwv)iterator.next());
        }
        return arws;
    }
    
    public static arws b(final arws arws, final arwv... array) {
        return a(arws, Arrays.asList(array));
    }
}
