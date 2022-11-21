import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Future;
import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asoa extends CountDownLatch implements Future, aslb, asln
{
    Object a;
    Throwable b;
    final AtomicReference c;
    
    public asoa() {
        super(1);
        this.c = new AtomicReference();
    }
    
    @Override
    public final void b(final Throwable b) {
        asln asln;
        do {
            asln = this.c.get();
            if (asln == asmr.a) {
                aqvq.w(b);
                return;
            }
            this.b = b;
        } while (!asbp.n(this.c, (Object)asln, (Object)this));
        this.countDown();
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        asln asln;
        do {
            asln = this.c.get();
            if (asln != this && asln != asmr.a) {
                continue;
            }
            return false;
        } while (!asbp.n(this.c, (Object)asln, (Object)asmr.a));
        if (asln != null) {
            asln.dispose();
        }
        this.countDown();
        return true;
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this.c, asln);
    }
    
    @Override
    public final void dispose() {
    }
    
    @Override
    public final Object get() {
        if (this.getCount() != 0L) {
            final boolean x = aqvq.x;
            this.await();
        }
        if (this.isCancelled()) {
            throw new CancellationException();
        }
        final Throwable b = this.b;
        if (b == null) {
            return this.a;
        }
        throw new ExecutionException(b);
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        if (this.getCount() != 0L) {
            final boolean x = aqvq.x;
            if (!this.await(n, timeUnit)) {
                throw new TimeoutException(atle.c(n, timeUnit));
            }
        }
        if (this.isCancelled()) {
            throw new CancellationException();
        }
        final Throwable b = this.b;
        if (b == null) {
            return this.a;
        }
        throw new ExecutionException(b);
    }
    
    @Override
    public final boolean isCancelled() {
        return asmr.c(this.c.get());
    }
    
    @Override
    public final boolean isDone() {
        return this.getCount() == 0L;
    }
    
    @Override
    public final void tr(final Object a) {
        final asln asln = this.c.get();
        if (asln == asmr.a) {
            return;
        }
        this.a = a;
        asbp.n(this.c, (Object)asln, (Object)this);
        this.countDown();
    }
    
    @Override
    public final boolean tz() {
        return this.isDone();
    }
}
