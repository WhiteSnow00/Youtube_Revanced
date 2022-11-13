import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import j$.util.OptionalInt;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzb implements aftz
{
    public final hzc a;
    public final OptionalInt b;
    public final vnu c;
    public final vns d;
    public final Executor e;
    public final boolean f;
    
    public hzb(final hzc a, final OptionalInt b, final vnu c, final vns d, final Executor e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final ListenableFuture a(final Object o) {
        final hzc a = this.a;
        final OptionalInt b = this.b;
        final vnu c = this.c;
        final vns d = this.d;
        final Executor e = this.e;
        final boolean f = this.f;
        ListenableFuture listenableFuture;
        if (o) {
            a.o(b, 5);
            listenableFuture = afsw.f((ListenableFuture)afvk.m(afwm.t(c.h(d, e), a.o.h(45356842L), TimeUnit.MILLISECONDS, a.j)), (Class)TimeoutException.class, (aftz)grs.b, (Executor)afum.a);
        }
        else {
            int n2;
            if (f) {
                final boolean m = a.m;
                final int n = n2 = 6;
                if (m) {
                    n2 = n;
                    if (!((vkk)d).m) {
                        n2 = n;
                        if ("FEwhat_to_watch".equals(d.c)) {
                            n2 = n;
                            if (((tjm)a.h.a()).p()) {
                                listenableFuture = afnd.p((afty)new phf(a, c, d, e, b, 1), a.i);
                                return listenableFuture;
                            }
                        }
                    }
                }
            }
            else {
                n2 = 4;
            }
            a.o(b, n2);
            listenableFuture = c.h(d, e);
        }
        return listenableFuture;
    }
}
