import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aemc
{
    public final AtomicLong a;
    public final AtomicReference b;
    public final SettableFuture c;
    public final afvc d;
    private final AtomicReference e;
    private final Executor f;
    
    public aemc(final afty afty, final Executor executor) {
        this.a = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
        this.b = new AtomicReference(null);
        this.e = new AtomicReference(null);
        this.f = afwm.g((Executor)afum.a);
        (this.c = SettableFuture.create()).addListener((Runnable)(this.d = new afvc(afty, executor, 1)), (Executor)afum.a);
    }
    
    public static int a(final long n) {
        return (int)(n >>> 32);
    }
    
    public static long b(final int n, final int n2) {
        return ((long)n2 & 0xFFFFFFFFL) | (long)n << 32;
    }
    
    public final ListenableFuture c() {
        if (!this.c.isDone()) {
            long value;
            int a;
            do {
                value = this.a.get();
                a = a(value);
            } while (!this.a.compareAndSet(value, b(a, (int)value + 1)));
            final SettableFuture create = SettableFuture.create();
            final ListenableFuture listenableFuture = this.e.getAndSet(create);
            ListenableFuture future;
            if (listenableFuture == null) {
                future = afwm.r(aeun.c((afty)new pke(this, a, 2)), (Executor)afum.a);
            }
            else {
                future = afsw.f(listenableFuture, (Class)Throwable.class, aeun.d((aftz)new xof(this, a, 3)), this.f);
            }
            create.setFuture(future);
            final aema aema = new aema(this, a);
            create.addListener((Runnable)new aelz(this, create, aema), (Executor)afum.a);
            return (ListenableFuture)aema;
        }
        return (ListenableFuture)this.c;
    }
    
    public final ListenableFuture d(final int n) {
        if (a(this.a.get()) > n) {
            return afwm.k();
        }
        final aemb aemb = new aemb(n);
        aemb aemb2;
        do {
            aemb2 = this.b.get();
            if (aemb2 != null && aemb2.a > n) {
                return afwm.k();
            }
        } while (!adkp.ag(this.b, aemb2, aemb));
        if (a(this.a.get()) > n) {
            ((aftm)aemb).cancel(true);
            adkp.ag(this.b, aemb, null);
            return (ListenableFuture)aemb;
        }
        final afvc d = this.d;
        final Object a = d.a;
        final Object b = d.b;
        if (a != null && b != null) {
            aemb.setFuture(afwm.r(aeun.c((afty)a), (Executor)b));
        }
        else {
            aemb.setFuture((ListenableFuture)this.c);
        }
        return (ListenableFuture)aemb;
    }
    
    public final boolean e() {
        return this.c.isDone();
    }
}
