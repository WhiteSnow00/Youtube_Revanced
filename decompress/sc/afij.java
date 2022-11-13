import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class afij extends afft
{
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient afev d;
    
    public afij(final afev d, final Object[] a, final int b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int c(final Object[] array, final int n) {
        return ((afeh)((afeh)this).g()).c(array, n);
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
    
    public final afeq h() {
        return new afii(this);
    }
    
    public final /* bridge */ Iterator iterator() {
        return this.k();
    }
    
    public final afke k() {
        return (afke)((afeh)this).g().D();
    }
    
    public final boolean l() {
        return true;
    }
    
    public final int size() {
        return this.c;
    }
}
