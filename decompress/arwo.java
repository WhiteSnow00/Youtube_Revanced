import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arwo
{
    public static final arwo a;
    private static final IdentityHashMap c;
    public final IdentityHashMap b;
    
    static {
        a = new arwo(c = new IdentityHashMap());
    }
    
    public arwo(final IdentityHashMap b) {
        this.b = b;
    }
    
    public static aupd b() {
        return new aupd(arwo.a);
    }
    
    public final Object a(final arwn arwn) {
        return this.b.get(arwn);
    }
    
    public final aupd c() {
        return new aupd(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final arwo arwo = (arwo)o;
        if (this.b.size() != arwo.b.size()) {
            return false;
        }
        for (final Map.Entry<Object, V> entry : this.b.entrySet()) {
            if (!arwo.b.containsKey(entry.getKey())) {
                return false;
            }
            if (!aexq.c(entry.getValue(), arwo.b.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final Iterator iterator = this.b.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator.next();
            n += Arrays.hashCode(new Object[] { entry.getKey(), entry.getValue() });
        }
        return n;
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
