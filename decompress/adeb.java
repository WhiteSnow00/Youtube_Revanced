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

public final class adeb implements addt
{
    private final boolean a;
    private final ListenableFuture b;
    private final ListenableFuture c;
    private final ListenableFuture d;
    
    public adeb(final vaf vaf, final vai vai, final toj toj, final tok tok, final Context context, final ScheduledExecutorService scheduledExecutorService, final asid asid) {
        amjm amjm;
        if ((amjm = vaf.b().m) == null) {
            amjm = amjm.a;
        }
        final boolean q = amjm.q;
        ListenableFuture b;
        if (!(this.a = q)) {
            b = afwm.m((Object)aeyo.a);
        }
        else {
            b = afwm.t(afwm.q(aeun.i((Callable)new zup(context, 10)), (Executor)scheduledExecutorService), 10L, TimeUnit.SECONDS, scheduledExecutorService);
        }
        this.b = b;
        ListenableFuture c;
        if (!q) {
            c = afwm.m((Object)aeyo.a);
        }
        else {
            c = afwm.t(afwm.q(aeun.i((Callable)new zup(toj, 9)), (Executor)scheduledExecutorService), 10L, TimeUnit.SECONDS, scheduledExecutorService);
        }
        this.c = c;
        int n = 0;
        Label_0171: {
            if (q) {
                if (!vai.U()) {
                    n = n;
                    if (!vai.V()) {
                        break Label_0171;
                    }
                }
                n = 1;
            }
        }
        final boolean v = vai.V();
        ListenableFuture d;
        if (n == 0) {
            d = afwm.m((Object)afeq.q());
        }
        else if (!v) {
            d = afwm.t(afwm.q(aeun.i((Callable)xok.e), (Executor)scheduledExecutorService), 10L, TimeUnit.SECONDS, scheduledExecutorService);
        }
        else {
            d = afwm.t(sl.c((ace)new aaw(tok.g(tok.a), asid, 8)), 30L, TimeUnit.SECONDS, scheduledExecutorService);
        }
        this.d = d;
    }
    
    public static afeq f(final File[] array) {
        return (afeq)DesugarArrays.stream((Object[])array).filter((Predicate)acdl.f).flatMap((Function)achg.e).collect(afci.a);
    }
    
    private final aezp g() {
        if (this.b.isDone()) {
            return (aezp)teu.h((Future)this.b, (Object)aeyo.a);
        }
        return (aezp)aeyo.a;
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
    
    public final ListenableFuture a() {
        return this.d;
    }
    
    public final ListenableFuture b() {
        return this.c;
    }
    
    public final ListenableFuture c() {
        return this.b;
    }
    
    public final boolean d(final ahoe ahoe) {
        final int b = ahoe.b;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = b2;
        if ((b & 0x2) != 0x0) {
            ahoc ahoc;
            if ((ahoc = ahoe.c) == null) {
                ahoc = ahoc.a;
            }
            final int b5 = ahoc.b;
            if ((b5 & 0x1) != 0x0) {
                int w;
                if ((w = adyf.W(ahoc.c)) == 0) {
                    w = 1;
                }
                boolean b6;
                if (w == 1) {
                    b6 = b3;
                }
                else {
                    final aezp g = this.g();
                    if (!g.h()) {
                        b6 = b3;
                    }
                    else {
                        b6 = b3;
                        if ((long)g.c() < h(w)) {
                            b6 = false;
                        }
                    }
                }
                return b6;
            }
            b4 = b2;
            if ((b5 & 0x2) != 0x0) {
                final int d = ahoc.d;
                if (d <= 0) {
                    b4 = b2;
                }
                else {
                    Object a;
                    if (this.c.isDone()) {
                        a = teu.h((Future)this.c, (Object)aeyo.a);
                    }
                    else {
                        a = aeyo.a;
                    }
                    if (!((aezp)a).h()) {
                        b4 = b2;
                    }
                    else {
                        b4 = b2;
                        if ((long)((aezp)a).c() >= d) {
                            b4 = false;
                        }
                    }
                }
            }
        }
        return b4;
    }
    
    public final int e() {
        final aezp g = this.g();
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
