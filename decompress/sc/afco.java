import java.util.Iterator;
import java.util.Map;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class afco extends AbstractSet
{
    final afct a;
    
    public afco(final afct a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        final Map l = this.a.l();
        if (l != null) {
            return l.entrySet().contains(o);
        }
        if (o instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)o;
            final int d = this.a.d(entry.getKey());
            if (d != -1 && adkp.ae(this.a.j(d), entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.k();
    }
    
    @Override
    public final boolean remove(final Object o) {
        final Map l = this.a.l();
        if (l != null) {
            return l.entrySet().remove(o);
        }
        if (!(o instanceof Map.Entry)) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)o;
        final afct a = this.a;
        if (a.q()) {
            return false;
        }
        final int c = a.c();
        final int x = aefb.x(entry.getKey(), entry.getValue(), c, this.a.i(), this.a.r(), this.a.s(), this.a.t());
        if (x == -1) {
            return false;
        }
        this.a.o(x, c);
        final afct a2 = this.a;
        --a2.f;
        a2.m();
        return true;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
