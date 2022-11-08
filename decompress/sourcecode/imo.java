import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imo
{
    public static final long a;
    public static final long b;
    public static final long c;
    public final fml d;
    public final atjj e;
    public final atjj f;
    private final thh g;
    private final oas h;
    private final alm i;
    
    static {
        a = TimeUnit.DAYS.toSeconds(30L);
        b = TimeUnit.DAYS.toSeconds(1L);
        c = TimeUnit.MINUTES.toSeconds(10L);
    }
    
    public imo(final thh g, final oas h, final fml d, final alm i, final atjj e, final atjj f, final byte[] array, final byte[] array2, final byte[] array3) {
        this.g = g;
        this.h = h;
        this.d = d;
        this.i = i;
        this.e = e;
        this.f = f;
    }
    
    public final void b(long c) {
        if (this.g.o() && !this.c(c)) {
            if (((zzu)this.e.a()).h()) {
                final aadb aadb = (aadb)this.f.a();
                final ListenableFuture g = aadb.g;
                if (g == null || g.isCancelled() || aadb.g.isDone()) {
                    tcp.k(aadb.g = afrp.f((ListenableFuture)aftj.m(afrp.e(afrp.f((ListenableFuture)aftj.m(afva.m(((zzu)aadb.e.a()).a())), (afry)aada.b, (Executor)aadb.a), (aexg)new zqp(aadb, 14), (Executor)afsl.a)), (afry)new aacz(aadb, 2), (Executor)afsl.a), (Executor)afsl.a, (tcn)new zqg(9), (tco)new zmd(aadb, 6));
                }
                final alm i = this.i;
                c = this.h.c();
                tcp.m(((tku)i.b).b((aexg)new fmp(c, 0)), (tcn)idu.k);
            }
        }
    }
    
    public final boolean c(final long n) {
        return this.h.c() - ((fmu)((tku)this.i.b).c()).f < TimeUnit.SECONDS.toMillis(n);
    }
}
