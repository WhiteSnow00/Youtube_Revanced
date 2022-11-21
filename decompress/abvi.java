import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Map;
import java.util.Collections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abvi implements thj
{
    public volatile float a;
    public boolean b;
    private final vko c;
    private final abqz d;
    private final Set e;
    private final aslm f;
    
    public abvi(final vko c, final abqz d) {
        this.f = new aslm();
        this.c = c;
        this.d = d;
        this.e = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
    }
    
    public final void a(final abvh abvh) {
        if (abvh != null) {
            this.e.add(abvh);
        }
    }
    
    public final void b(final yre yre) {
        final FormatStreamModel f = yre.f();
        if (f == null) {
            return;
        }
        int i = f.i();
        final int d = f.d();
        int n;
        if (i < 0 || (n = d) < 0) {
            i = 1280;
            n = 720;
        }
        final int v = f.V();
        final ango c = this.c.b().c;
        final int c2 = c.c;
        final boolean b = true;
        final float n2 = 0.0f;
        float h;
        if ((c2 & 0x1) != 0x0) {
            apsf apsf;
            if ((apsf = c.u) == null) {
                apsf = apsf.a;
            }
            h = apsf.h;
        }
        else {
            h = 0.0f;
        }
        boolean b2 = b;
        if (v != 3) {
            b2 = b;
            if (v != 4) {
                b2 = (v == 5 && b);
            }
        }
        this.b = b2;
        int n3 = i;
        if (b2) {
            n3 = i;
            if (h != 0.0f) {
                n3 = (int)(n * h);
            }
        }
        float a = n2;
        if (n > 0) {
            a = n2;
            if (n3 > 0) {
                a = n3 / (float)n;
            }
        }
        this.a = a;
        final Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((abvh)iterator.next()).f(n3, n);
        }
    }
    
    public final void c() {
        this.f.b();
    }
    
    public final void d() {
        this.f.f(this.d.H((afax)abro.o, (afax)abro.p).j(aana.s(this.d.bM(), 1073741824L)).j(aana.q(1)).an(new abtk(this, 9), (asmi)abgj.r), this.d.H((afax)abro.o, (afax)abro.q).j(aana.s(this.d.bM(), 1073741824L)).j(aana.q(1)).an(new abtk(this, 9), (asmi)abgj.r));
    }
    
    public final void f(final abvh abvh) {
        if (abvh != null) {
            this.e.remove(abvh);
        }
    }
    
    public final boolean g() {
        return this.a <= 1.01f && this.a > 0.0f;
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            this.b((yre)o);
            array = null;
        }
        else {
            array = new Class[] { yre.class };
        }
        return array;
    }
}
