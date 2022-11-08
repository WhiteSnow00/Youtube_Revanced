import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aekb
{
    public final AtomicLong a;
    public final AtomicReference b;
    public final SettableFuture c;
    public final aftb d;
    private final AtomicReference e;
    private final Executor f;
    
    public aekb(final afrx afrx, final Executor executor) {
        this.a = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
        this.b = new AtomicReference(null);
        this.e = new AtomicReference(null);
        this.f = afva.g((Executor)afsl.a);
        (this.c = SettableFuture.create()).addListener((Runnable)(this.d = new aftb(afrx, executor, 1)), (Executor)afsl.a);
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
                future = afva.r(aesm.c((afrx)new pit(this, a, 2)), (Executor)afsl.a);
            }
            else {
                future = afqv.f(listenableFuture, Throwable.class, aesm.d((afry)new xmh(this, a, 3)), this.f);
            }
            create.setFuture(future);
            final aejz aejz = new aejz(this, a);
            create.addListener((Runnable)new aejy(this, create, aejz), (Executor)afsl.a);
            return (ListenableFuture)aejz;
        }
        return (ListenableFuture)this.c;
    }
    
    public final ListenableFuture d(final int n) {
        if (a(this.a.get()) > n) {
            return afva.k();
        }
        final aeka aeka = new aeka(n);
        aeka aeka2;
        do {
            aeka2 = this.b.get();
            if (aeka2 != null && aeka2.a > n) {
                return afva.k();
            }
        } while (!agot.S(this.b, (Object)aeka2, (Object)aeka));
        if (a(this.a.get()) > n) {
            ((afrl)aeka).cancel(true);
            agot.S(this.b, (Object)aeka, (Object)null);
            return (ListenableFuture)aeka;
        }
        final aftb d = this.d;
        final Object a = d.a;
        final Object b = d.b;
        if (a != null && b != null) {
            aeka.setFuture(afva.r(aesm.c((afrx)a), (Executor)b));
        }
        else {
            aeka.setFuture((ListenableFuture)this.c);
        }
        return (ListenableFuture)aeka;
    }
    
    public final boolean e() {
        return this.c.isDone();
    }
}
