import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.AbstractExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odd extends AbstractExecutorService
{
    public static final Object a;
    public static final Object b;
    public final ConcurrentLinkedQueue c;
    public final AtomicInteger d;
    public final AtomicInteger e;
    public final AtomicInteger f;
    public boolean g;
    public final AtomicBoolean h;
    public final ThreadFactory i;
    public final boolean j;
    public final Runnable k;
    public final Runnable l;
    public final odb[] m;
    public final odb[] n;
    public final CountDownLatch o;
    public final AtomicReference p;
    private final int q;
    private boolean r;
    private final boolean s;
    private final odc[] t;
    
    static {
        a = new Object();
        b = new Object();
    }
    
    private odd(final int n, final ThreadFactory i, final boolean b, final Runnable runnable, final Runnable runnable2) {
        this.c = new ConcurrentLinkedQueue();
        this.d = new AtomicInteger();
        this.e = new AtomicInteger();
        this.f = new AtomicInteger();
        this.h = new AtomicBoolean();
        if (n > 0) {
            this.q = Integer.MAX_VALUE;
            this.i = i;
            this.j = b;
            Object d;
            if ((d = runnable) == null) {
                d = mrw.d;
            }
            this.k = (Runnable)d;
            Object e;
            if ((e = runnable2) == null) {
                e = mrw.e;
            }
            this.l = (Runnable)e;
            this.s = b;
            this.o = new CountDownLatch(n);
            final int n2 = n + 1;
            final odb[] m = new odb[n2];
            final odb[] n3 = new odb[n2];
            final int n4 = 0;
            for (int j = 0; j < n2; ++j) {
                m[j] = new odb(odd.b, j);
                n3[j] = new odb(odd.a, j);
            }
            this.m = m;
            this.n = n3;
            final odc[] t = new odc[n];
            odb odb = m[0];
            for (int k = n4; k < n; ++k) {
                odb = new odb(odb, k);
                t[k] = new odc(this, k);
            }
            this.t = t;
            this.p = new AtomicReference(odb);
            return;
        }
        final StringBuilder sb = new StringBuilder("numThreads must be positive: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static odd b(final int n, final ThreadFactory threadFactory, final boolean b, final Runnable runnable, final Runnable runnable2) {
        return new odd(n, threadFactory, b, runnable, runnable2);
    }
    
    private final void c(final boolean b) {
        this.r = true;
        while (true) {
            final odb odb = this.p.get();
            final Object a = odb.a;
            if (a == odd.a) {
                break;
            }
            odb odb2;
            if (a == odd.b && !b) {
                odb2 = this.n[odb.b];
            }
            else {
                odb2 = this.n[0];
            }
            if (!oaw.f(this.p, odb, odb2)) {
                continue;
            }
            for (odb odb3 = odb; odb3.a != odd.b; odb3 = (odb)odb3.a) {
                final odc odc = this.t[odb3.b];
                final Thread b2 = odc.b;
                odc.i = 3;
                if (b2 != null) {
                    LockSupport.unpark(b2);
                }
                else {
                    odc.a();
                }
            }
        }
    }
    
    public final void a() {
        if (this.s) {
            this.d.decrementAndGet();
        }
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.o.await(n, timeUnit);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        runnable.getClass();
        if (!this.r) {
            if (this.s) {
                if (this.q != Integer.MAX_VALUE) {
                    int value;
                    do {
                        value = this.d.get();
                        if (value != this.q) {
                            continue;
                        }
                        throw new RejectedExecutionException();
                    } while (!this.d.compareAndSet(value, value + 1));
                }
                else {
                    this.d.incrementAndGet();
                }
            }
            final odb odb = new odb(runnable, -1);
            this.c.add(odb);
            int b2 = 0;
            Block_9: {
                Label_0181: {
                    while (true) {
                        final odb odb2 = this.p.get();
                        final Object a = odb2.a;
                        if (a == odd.b) {
                            final int b = odb2.b;
                            final int min = Math.min(b + 1, this.t.length);
                            if (min == b) {
                                break;
                            }
                            if (oaw.f(this.p, odb2, this.m[min])) {
                                break;
                            }
                            continue;
                        }
                        else if (a == odd.a) {
                            if (!this.c.remove(odb)) {
                                break;
                            }
                            break Label_0181;
                        }
                        else {
                            b2 = odb2.b;
                            if (oaw.f(this.p, odb2, a)) {
                                break Block_9;
                            }
                            continue;
                        }
                    }
                    return;
                }
                this.a();
                throw new RejectedExecutionException();
            }
            final odc odc = this.t[b2];
            final Thread b3 = odc.b;
            odc.i = 1;
            if (b3 != null) {
                LockSupport.unpark(b3);
                return;
            }
            odc.h.e.incrementAndGet();
            odc.b();
            return;
        }
        throw new RejectedExecutionException();
    }
    
    @Override
    public final boolean isShutdown() {
        return this.p.get().a == odd.a;
    }
    
    @Override
    public final boolean isTerminated() {
        return this.o.getCount() == 0L;
    }
    
    @Override
    public final void shutdown() {
        this.c(false);
    }
    
    @Override
    public final List shutdownNow() {
        this.c(true);
        final ArrayList list = new ArrayList();
        final AtomicBoolean h = this.h;
        int i = 0;
        if (h.compareAndSet(false, true)) {
            while (true) {
                final odb odb = this.c.poll();
                if (odb == null) {
                    break;
                }
                this.a();
                list.add(odb.a);
            }
            this.g = true;
            for (odc[] t = this.t; i < t.length; ++i) {
                final Thread c = t[i].c;
                if (c != null) {
                    c.interrupt();
                }
            }
        }
        return list;
    }
}
