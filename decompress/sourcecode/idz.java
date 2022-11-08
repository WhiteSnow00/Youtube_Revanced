import java.util.concurrent.Callable;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idz extends icy
{
    private final zvp a;
    private final zki b;
    private final Executor c;
    
    public idz(final zvp a, final zki b, final Executor c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final ListenableFuture o(final vdv vdv, final zzl zzl) {
        return (ListenableFuture)aete.f(this.a.b(this.b.c(), zzl.a())).g((aexg)new hwh(vdv, 10), this.c);
    }
    
    private static amtv p(final zzk zzk) {
        if (zzk == null) {
            return null;
        }
        final amtv d = amtw.d(gkt.bo(zzk.a));
        d.f(zzk.b.toByteString());
        int cn;
        if ((cn = aqql.cN(zzk.b.h)) == 0) {
            cn = 1;
        }
        amtu amtu;
        if (--cn != 1) {
            if (cn != 3) {
                amtu = amtu.a;
            }
            else {
                amtu = amtu.c;
            }
        }
        else {
            amtu = amtu.b;
        }
        d.b(amtu);
        d.c(Long.valueOf(zzk.b()));
        amry amry;
        if ((amry = zzk.b.l) == null) {
            amry = amry.a;
        }
        d.e(amry);
        d.d(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(zzk.d)));
        final amth b = zzk.b;
        if (b.c == 15) {
            d.g((amrx)b.d);
        }
        return d;
    }
    
    private static void q(final vdv vdv, final zzl zzl) {
        final amtv p2 = p(zzl.j);
        if (p2 != null) {
            vdv.j((vdj)p2);
        }
    }
    
    @Deprecated
    public final afdu a(final aack aack) {
        final afds i = afdu.i();
        for (final zzl zzl : aack.l().j()) {
            if (zzl != null) {
                final amtv p = p(zzl.j);
                if (p == null) {
                    continue;
                }
                i.h(p);
            }
        }
        return i.g();
    }
    
    @Deprecated
    public final void b(final vdv vdv, final zzl zzl) {
        q(vdv, zzl);
    }
    
    public final ListenableFuture c(final aack aack) {
        return this.a.a(this.b.c());
    }
    
    public final ListenableFuture g(final vdv vdv, final String s) {
        return afld.k((Callable)new hlc(vdv, s, 16), this.c);
    }
    
    public final ListenableFuture i(final vdv vdv, final zzl zzl) {
        return this.o(vdv, zzl);
    }
    
    public final ListenableFuture j(final vdv vdv, final zzl zzl) {
        return this.o(vdv, zzl);
    }
    
    @Deprecated
    public final void l(final vdv vdv, final String s) {
        vdv.g(gkt.bo(s));
    }
    
    @Deprecated
    public final void n(final vdv vdv, final zzl zzl) {
        q(vdv, zzl);
    }
}
