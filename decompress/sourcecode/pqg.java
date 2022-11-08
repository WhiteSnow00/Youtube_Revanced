import java.util.concurrent.ScheduledFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqg extends afsy implements afts
{
    public final afts a;
    private final aftr c;
    private final /* synthetic */ int d;
    
    private pqg(final aftr c, final afts a, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public static pqg c(final aftr aftr, final afts afts) {
        return new pqg(aftr, afts, 0);
    }
    
    public static pqg i(final aftr aftr, final afts afts) {
        return new pqg(aftr, afts, 1);
    }
    
    public final aftr b() {
        if (this.d != 0) {
            return this.c;
        }
        return this.c;
    }
    
    public final aftq e(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        if (this.d != 0) {
            final aftp b = aftp.b(runnable);
            afsx afsx;
            if (n <= 0L) {
                afsx = new pqf(this.c.rw(runnable), System.nanoTime(), 1, null);
            }
            else {
                afsx = new ocu((ListenableFuture)b, this.a.e((Runnable)new nlt(this, b, 13, (byte[])null), n, timeUnit));
            }
            return (aftq)afsx;
        }
        final aftp b2 = aftp.b(runnable);
        afsx afsx2;
        if (n <= 0L) {
            afsx2 = new pqf(this.c.rw(runnable), System.nanoTime(), 0);
        }
        else {
            afsx2 = new pqe((ListenableFuture)b2, this.a.e((Runnable)new ojn(this, b2, 9), n, timeUnit));
        }
        return (aftq)afsx2;
    }
    
    public final aftq f(final Callable callable, final long n, final TimeUnit timeUnit) {
        if (this.d != 0) {
            afsx afsx;
            if (n <= 0L) {
                afsx = new pqf(this.c.rt(callable), System.nanoTime(), 1, null);
            }
            else {
                final aftp a = aftp.a(callable);
                afsx = new ocu((ListenableFuture)a, this.a.e((Runnable)new nlt(this, a, 14, (byte[])null), n, timeUnit));
            }
            return (aftq)afsx;
        }
        afsx afsx2;
        if (n <= 0L) {
            afsx2 = new pqf(this.c.rt(callable), System.nanoTime(), 0);
        }
        else {
            final aftp a2 = aftp.a(callable);
            afsx2 = new pqe((ListenableFuture)a2, this.a.e((Runnable)new ojn(this, a2, 10), n, timeUnit));
        }
        return (aftq)afsx2;
    }
    
    public final aftq g(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        if (this.d != 0) {
            final Executor g = afva.g((Executor)this);
            final SettableFuture create = SettableFuture.create();
            return (aftq)new ocu((ListenableFuture)create, this.a.g((Runnable)new ocr(g, runnable, create), n, n2, timeUnit));
        }
        final Executor g2 = afva.g((Executor)this);
        final SettableFuture create2 = SettableFuture.create();
        return (aftq)new pqe((ListenableFuture)create2, this.a.g((Runnable)new pqa(g2, runnable, create2), n, n2, timeUnit));
    }
    
    public final aftq h(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        if (this.d != 0) {
            final SettableFuture create = SettableFuture.create();
            final ocu ocu = new ocu((ListenableFuture)create, null);
            ocu.a = this.a.e((Runnable)new oct(this, runnable, create, ocu, n2, timeUnit, null), n, timeUnit);
            return (aftq)ocu;
        }
        final SettableFuture create2 = SettableFuture.create();
        final pqe pqe = new pqe((ListenableFuture)create2, null);
        pqe.a = this.a.e((Runnable)new pqd(this, runnable, create2, pqe, n2, timeUnit), n, timeUnit);
        return (aftq)pqe;
    }
}
