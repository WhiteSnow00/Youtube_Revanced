import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgj extends afdu
{
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient afcw d;
    
    public afgj(final afcw d, final Object[] a, final int b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int c(final Object[] array, final int n) {
        return ((afci)((afci)this).g()).c(array, n);
    }
    
    public final boolean contains(Object key) {
        if (key instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)key;
            key = entry.getKey();
            final Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }
    
    public final afcr h() {
        return new afgi(this);
    }
    
    public final afie k() {
        return (afie)((afci)this).g().D();
    }
    
    public final boolean l() {
        return true;
    }
    
    public final int size() {
        return this.c;
    }
}
