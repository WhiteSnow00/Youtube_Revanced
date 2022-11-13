import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahes
{
    protected final Map a;
    boolean b;
    boolean c;
    
    protected ahes() {
        this.a = new HashMap();
        this.c = true;
    }
    
    public final aeih a() {
        return this.b().a();
    }
    
    public final ahet b() {
        if (this.a.isEmpty()) {
            ahet ahet;
            if (this.b) {
                ahet = ahet.b;
            }
            else {
                ahet = ahet.a;
            }
            return ahet;
        }
        return new ahet(new HashMap(this.a), this.b);
    }
    
    public final void c(ahev ahev) {
        this.g(ahev.d);
        final Iterator<Object> iterator = ((List<Object>)ahev.c).iterator();
        while (iterator.hasNext()) {
            this.a.put((int)iterator.next(), ahet.b);
        }
        for (final aheu aheu : ahev.b) {
            final Map a = this.a;
            final int b = aheu.b;
            if ((ahev = aheu.c) == null) {
                ahev = ahev.a;
            }
            final ahes b2 = ahet.b();
            b2.c(ahev);
            a.put(b, b2.b());
        }
    }
    
    public final void d(final int n) {
        this.f(n, ahet.a);
    }
    
    public final void e(final int... array) {
        for (int i = 0; i < array.length; ++i) {
            this.f(array[i], ahet.b);
        }
    }
    
    public final void f(final int n, final ahet ahet) {
        ahet f = ahet;
        if (this.b) {
            f = ahet.f();
        }
        if (!ahet.a.equals(f)) {
            this.a.put(n, f);
        }
        else {
            this.a.remove(n);
        }
        this.c = false;
    }
    
    public final void g(final boolean b) {
        if (this.c) {
            this.b = b;
            return;
        }
        throw new IllegalStateException("setInverted cannot be called on a builder that has fields.");
    }
}
