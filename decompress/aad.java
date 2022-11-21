import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.BlockingQueue;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aad extends aaf implements Runnable
{
    public volatile ListenableFuture a;
    private aac c;
    private final BlockingQueue d;
    private final CountDownLatch e;
    private ListenableFuture f;
    
    public aad(final aac c, final ListenableFuture f) {
        this.d = new LinkedBlockingQueue(1);
        this.e = new CountDownLatch(1);
        afc.j(c);
        this.c = c;
        afc.j(f);
        this.f = f;
    }
    
    private static final void c(final Future future, final boolean b) {
        if (future != null) {
            future.cancel(b);
        }
    }
    
    public final boolean cancel(final boolean b) {
        final boolean cancel = super.cancel(b);
        int n = 0;
        if (cancel) {
            final BlockingQueue d = this.d;
            while (true) {
                try {
                    d.put(b);
                    if (n != 0) {
                        Thread.currentThread().interrupt();
                    }
                    c((Future)this.f, b);
                    c((Future)this.a, b);
                    return true;
                }
                catch (final InterruptedException ex) {
                    n = 1;
                    continue;
                }
                finally {
                    if (n != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            }
        }
        return false;
    }
    
    public final Object get() {
        if (!this.isDone()) {
            final ListenableFuture f = this.f;
            if (f != null) {
                f.get();
            }
            this.e.await();
            final ListenableFuture a = this.a;
            if (a != null) {
                a.get();
            }
        }
        return super.get();
    }
    
    public final Object get(long nanoTime, final TimeUnit timeUnit) {
        long n = nanoTime;
        TimeUnit timeUnit2 = timeUnit;
        if (!this.isDone()) {
            long convert = nanoTime;
            TimeUnit nanoseconds;
            if ((nanoseconds = timeUnit) != TimeUnit.NANOSECONDS) {
                convert = TimeUnit.NANOSECONDS.convert(nanoTime, timeUnit);
                nanoseconds = TimeUnit.NANOSECONDS;
            }
            final ListenableFuture f = this.f;
            nanoTime = convert;
            if (f != null) {
                nanoTime = System.nanoTime();
                f.get(convert, nanoseconds);
                nanoTime = convert - Math.max(0L, System.nanoTime() - nanoTime);
            }
            final long nanoTime2 = System.nanoTime();
            if (!this.e.await(nanoTime, nanoseconds)) {
                throw new TimeoutException();
            }
            nanoTime -= Math.max(0L, System.nanoTime() - nanoTime2);
            final ListenableFuture a = this.a;
            n = nanoTime;
            timeUnit2 = nanoseconds;
            if (a != null) {
                a.get(nanoTime, nanoseconds);
                n = nanoTime;
                timeUnit2 = nanoseconds;
            }
        }
        return super.get(n, timeUnit2);
    }
    
    public final void run() {
        int n = 0;
        try {
            try {
                try {
                    Object a = this.c.a(sg.g((Future)this.f));
                    this.a = (ListenableFuture)a;
                    Label_0119: {
                        if (!this.isCancelled()) {
                            break Label_0119;
                        }
                        final Object d = this.d;
                        while (true) {
                            try {
                                final Boolean take = ((BlockingQueue<Boolean>)d).take();
                                if (n != 0) {
                                    Thread.currentThread().interrupt();
                                }
                                ((ListenableFuture)a).cancel((boolean)take);
                                this.a = null;
                                this.c = null;
                                this.f = null;
                                a = this.e;
                                ((CountDownLatch)a).countDown();
                                return;
                            }
                            catch (final InterruptedException ex) {
                                n = 1;
                                continue;
                            }
                            finally {
                                if (n != 0) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                            break;
                        }
                    }
                    final Object d = new vt(this, (ListenableFuture)a, 7);
                    ((ListenableFuture)a).addListener((Runnable)d, zv.a());
                    this.c = null;
                    this.f = null;
                    a = this.e;
                }
                finally {
                    this.c = null;
                    this.f = null;
                    this.e.countDown();
                    while (true) {}
                    final Error error;
                    this.b((Throwable)error);
                    this.c = null;
                    this.f = null;
                    final CountDownLatch e = this.e;
                }
            }
            catch (final Error error2) {}
            catch (final Exception ex2) {}
            catch (final UndeclaredThrowableException ex3) {}
        }
        catch (final ExecutionException ex4) {}
        catch (final CancellationException ex5) {}
    }
}
