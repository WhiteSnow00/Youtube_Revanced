import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Map;
import java.util.Collections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abty implements tgg
{
    public volatile float a;
    public boolean b;
    private final vjg c;
    private final abpu d;
    private final Set e;
    private final asiq f;
    
    public abty(final vjg c, final abpu d) {
        this.f = new asiq();
        this.c = c;
        this.d = d;
        this.e = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
    }
    
    public final void a(final abtx abtx) {
        if (abtx != null) {
            this.e.add(abtx);
        }
    }
    
    public final void b(final ypj ypj) {
        final FormatStreamModel f = ypj.f();
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
        final aneh c = this.c.b().c;
        final int c2 = c.c;
        final boolean b = true;
        final float n2 = 0.0f;
        float j;
        if ((c2 & 0x1) != 0x0) {
            appt appt;
            if ((appt = c.u) == null) {
                appt = appt.a;
            }
            j = appt.i;
        }
        else {
            j = 0.0f;
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
            if (j != 0.0f) {
                n3 = (int)(n * j);
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
            ((abtx)iterator.next()).f(n3, n);
        }
    }
    
    public final void c() {
        this.f.b();
    }
    
    public final void d() {
        this.f.f(this.d.H((aezf)abpk.p, (aezf)abpk.q).j(aale.s(this.d.bM(), 1073741824L)).j(aale.q(1)).an(new absa(this, 4), (asjm)abfd.o), this.d.H((aezf)abpk.p, (aezf)abpk.r).j(aale.s(this.d.bM(), 1073741824L)).j(aale.q(1)).an(new absa(this, 4), (asjm)abfd.o));
    }
    
    public final void f(final abtx abtx) {
        if (abtx != null) {
            this.e.remove(abtx);
        }
    }
    
    public final boolean g() {
        return this.a <= 1.01f && this.a > 0.0f;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            this.b((ypj)o);
            array = null;
        }
        else {
            array = new Class[] { ypj.class };
        }
        return array;
    }
}
