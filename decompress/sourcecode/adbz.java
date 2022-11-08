import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Predicate;
import j$.util.DesugarArrays;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbz implements adbq
{
    private final boolean a;
    private final ListenableFuture b;
    private final ListenableFuture c;
    private final ListenableFuture d;
    
    public adbz(final uyf uyf, final uyi uyi, final tmd tmd, final tme tme, final Context context, final ScheduledExecutorService scheduledExecutorService, final asho asho) {
        amhi amhi;
        if ((amhi = uyf.b().m) == null) {
            amhi = amhi.a;
        }
        final boolean q = amhi.q;
        ListenableFuture b;
        if (!(this.a = q)) {
            b = afva.m(aewp.a);
        }
        else {
            b = afva.t(afva.q(aesm.i((Callable)new adbx(context, 2)), scheduledExecutorService), 10L, TimeUnit.SECONDS, scheduledExecutorService);
        }
        this.b = b;
        final boolean b2 = false;
        ListenableFuture c;
        if (!q) {
            c = afva.m(aewp.a);
        }
        else {
            c = afva.t(afva.q(aesm.i((Callable)new adbx(tmd, 0)), scheduledExecutorService), 10L, TimeUnit.SECONDS, scheduledExecutorService);
        }
        this.c = c;
        int n = b2 ? 1 : 0;
        Label_0169: {
            if (q) {
                if (!uyi.T()) {
                    n = (b2 ? 1 : 0);
                    if (!uyi.U()) {
                        break Label_0169;
                    }
                }
                n = 1;
            }
        }
        final boolean u = uyi.U();
        ListenableFuture d;
        if (n == 0) {
            d = afva.m(afcr.q());
        }
        else if (!u) {
            d = afva.t(afva.q(aesm.i((Callable)xmm.e), scheduledExecutorService), 10L, TimeUnit.SECONDS, scheduledExecutorService);
        }
        else {
            d = afva.t(sl.c((acd)new aav(tme.g(tme.a), asho, 8)), 30L, TimeUnit.SECONDS, scheduledExecutorService);
        }
        this.d = d;
    }
    
    public static afcr f(final File[] array) {
        return (afcr)DesugarArrays.stream((Object[])array).filter((Predicate)acbk.f).flatMap((Function)acfd.e).collect(afaj.a);
    }
    
    private final aexq g() {
        if (this.b.isDone()) {
            return (aexq)tcp.h((Future)this.b, (Object)aewp.a);
        }
        return aewp.a;
    }
    
    private static final long h(int n) {
        if (--n == 1) {
            return 912680550L;
        }
        if (n == 2) {
            return 1825361100L;
        }
        if (n != 4) {
            return 3650722200L;
        }
        return 2738041650L;
    }
    
    @Override
    public final ListenableFuture a() {
        return this.d;
    }
    
    @Override
    public final ListenableFuture b() {
        return this.c;
    }
    
    @Override
    public final ListenableFuture c() {
        return this.b;
    }
    
    @Override
    public final boolean d(final ahmg ahmg) {
        final int b = ahmg.b;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = b2;
        if ((b & 0x2) != 0x0) {
            ahme ahme;
            if ((ahme = ahmg.c) == null) {
                ahme = ahme.a;
            }
            final int b5 = ahme.b;
            if ((b5 & 0x1) != 0x0) {
                int r;
                if ((r = aeda.R(ahme.c)) == 0) {
                    r = 1;
                }
                boolean b6;
                if (r == 1) {
                    b6 = b3;
                }
                else {
                    final aexq g = this.g();
                    if (!g.h()) {
                        b6 = b3;
                    }
                    else {
                        b6 = b3;
                        if ((long)g.c() < h(r)) {
                            b6 = false;
                        }
                    }
                }
                return b6;
            }
            b4 = b2;
            if ((b5 & 0x2) != 0x0) {
                final int d = ahme.d;
                if (d <= 0) {
                    b4 = b2;
                }
                else {
                    aexq a;
                    if (this.c.isDone()) {
                        a = (aexq)tcp.h((Future)this.c, (Object)aewp.a);
                    }
                    else {
                        a = aewp.a;
                    }
                    if (!a.h()) {
                        b4 = b2;
                    }
                    else {
                        b4 = b2;
                        if ((long)a.c() >= d) {
                            b4 = false;
                        }
                    }
                }
            }
        }
        return b4;
    }
    
    @Override
    public final int e() {
        final aexq g = this.g();
        if (!g.h()) {
            return 1;
        }
        final long longValue = (long)g.c();
        if (longValue >= h(4)) {
            return 4;
        }
        if (longValue >= h(5)) {
            return 5;
        }
        if (longValue >= h(3)) {
            return 3;
        }
        if (longValue >= h(2)) {
            return 2;
        }
        return 1;
    }
}
