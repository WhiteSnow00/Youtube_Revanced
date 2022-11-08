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

public final class askp extends CountDownLatch implements Future, ashq, asic
{
    Object a;
    Throwable b;
    final AtomicReference c;
    
    public askp() {
        super(1);
        this.c = new AtomicReference();
    }
    
    public final void b(final Throwable b) {
        asic asic;
        do {
            asic = this.c.get();
            if (asic == asjg.a) {
                aulo.r(b);
                return;
            }
            this.b = b;
        } while (!asgk.b(this.c, (Object)asic, (Object)this));
        this.countDown();
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        asic asic;
        do {
            asic = this.c.get();
            if (asic != this && asic != asjg.a) {
                continue;
            }
            return false;
        } while (!asgk.b(this.c, (Object)asic, (Object)asjg.a));
        if (asic != null) {
            asic.dispose();
        }
        this.countDown();
        return true;
    }
    
    public final void d(final asic asic) {
        asjg.f(this.c, asic);
    }
    
    public final void dispose() {
    }
    
    @Override
    public final Object get() {
        if (this.getCount() != 0L) {
            final boolean x = aulo.x;
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
            final boolean x = aulo.x;
            if (!this.await(n, timeUnit)) {
                throw new TimeoutException(athp.c(n, timeUnit));
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
        return asjg.c(this.c.get());
    }
    
    @Override
    public final boolean isDone() {
        return this.getCount() == 0L;
    }
    
    public final void tp(final Object a) {
        final asic asic = this.c.get();
        if (asic == asjg.a) {
            return;
        }
        this.a = a;
        asgk.b(this.c, (Object)asic, (Object)this);
        this.countDown();
    }
    
    public final boolean tx() {
        return this.isDone();
    }
}
