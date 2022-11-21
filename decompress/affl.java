import java.util.Collection;
import java.io.ObjectInputStream;
import java.util.Set;
import java.io.Serializable;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class affl extends AbstractMap implements Serializable, afdu
{
    private final affr a;
    private transient Set b;
    
    public affl(final affr a) {
        this.a = a;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }
    
    @Override
    public final afdu a() {
        throw null;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.a.containsValue(o);
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public final Set entrySet() {
        Set b;
        if ((b = this.b) == null) {
            b = new affm(this.a);
            this.b = b;
        }
        return b;
    }
    
    @Override
    public final Object get(final Object o) {
        final affr a = this.a;
        final int e = a.e(o);
        if (e == -1) {
            return null;
        }
        return a.a[e];
    }
    
    @Override
    public final Set keySet() {
        return this.a.i();
    }
    
    @Override
    public final Object put(final Object o, final Object o2) {
        return this.a.m(o, o2);
    }
    
    @Override
    public final Object remove(Object o) {
        final affr a = this.a;
        final int u = aegu.u(o);
        final int f = a.f(o, u);
        if (f == -1) {
            return null;
        }
        o = a.a[f];
        a.l(f, u);
        return o;
    }
    
    @Override
    public final int size() {
        return this.a.c;
    }
    
    @Override
    public final /* bridge */ Collection values() {
        return this.a.keySet();
    }
}
