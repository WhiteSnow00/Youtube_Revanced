import java.util.concurrent.Executor;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gr extends nq
{
    public final gq a;
    private final fd e;
    
    protected gr() {
        final fd e = new fd();
        this.e = e;
        final gt gt = new gt(this);
        Object a = go.a;
        synchronized (a) {
            if (go.b == null) {
                go.b = Executors.newFixedThreadPool(2);
            }
            monitorexit(a);
            a = new gq((hd)gt, new bx(go.b), null);
            this.a = (gq)a;
            ((gq)a).c.add(e);
        }
    }
    
    public int a() {
        throw null;
    }
    
    public final void b(final List d) {
        final gq a = this.a;
        final int f = a.f + 1;
        a.f = f;
        final List d2 = a.d;
        if (d == d2) {
            return;
        }
        final List e = a.e;
        if (d == null) {
            final int size = d2.size();
            a.d = null;
            a.e = Collections.emptyList();
            a.a.c(0, size);
            a.a();
            return;
        }
        if (d2 == null) {
            a.d = d;
            a.e = Collections.unmodifiableList((List<?>)d);
            a.a.a(0, d.size());
            a.a();
            return;
        }
        ((Executor)a.g.a).execute((Runnable)new gka(a, d2, d, f, 1));
    }
}
