import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahcu
{
    protected final Map a;
    boolean b;
    boolean c;
    
    protected ahcu() {
        this.a = new HashMap();
        this.c = true;
    }
    
    public final aegg a() {
        return this.b().a();
    }
    
    public final ahcv b() {
        if (this.a.isEmpty()) {
            ahcv ahcv;
            if (this.b) {
                ahcv = ahcv.b;
            }
            else {
                ahcv = ahcv.a;
            }
            return ahcv;
        }
        return new ahcv(new HashMap(this.a), this.b);
    }
    
    public final void c(ahcx ahcx) {
        this.g(ahcx.d);
        final Iterator<Object> iterator = ((List<Object>)ahcx.c).iterator();
        while (iterator.hasNext()) {
            this.a.put((int)iterator.next(), ahcv.b);
        }
        for (final ahcw ahcw : ahcx.b) {
            final Map a = this.a;
            final int b = ahcw.b;
            if ((ahcx = ahcw.c) == null) {
                ahcx = ahcx.a;
            }
            final ahcu b2 = ahcv.b();
            b2.c(ahcx);
            a.put(b, b2.b());
        }
    }
    
    public final void d(final int n) {
        this.f(n, ahcv.a);
    }
    
    public final void e(final int... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            this.f(array[i], ahcv.b);
        }
    }
    
    public final void f(final int n, final ahcv ahcv) {
        ahcv f = ahcv;
        if (this.b) {
            f = ahcv.f();
        }
        if (!ahcv.a.equals(f)) {
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
