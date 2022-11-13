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

public final class asle extends CountDownLatch implements Future, asif, asir
{
    Object a;
    Throwable b;
    final AtomicReference c;
    
    public asle() {
        super(1);
        this.c = new AtomicReference();
    }
    
    @Override
    public final void b(final Throwable b) {
        asir asir;
        do {
            asir = this.c.get();
            if (asir == asjv.a) {
                atqx.j(b);
                return;
            }
            this.b = b;
        } while (!atok.e(this.c, (Object)asir, (Object)this));
        this.countDown();
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        asir asir;
        do {
            asir = this.c.get();
            if (asir != this && asir != asjv.a) {
                continue;
            }
            return false;
        } while (!atok.e(this.c, (Object)asir, (Object)asjv.a));
        if (asir != null) {
            asir.dispose();
        }
        this.countDown();
        return true;
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this.c, asir);
    }
    
    @Override
    public final void dispose() {
    }
    
    @Override
    public final Object get() {
        if (this.getCount() != 0L) {
            final boolean x = atqx.x;
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
            final boolean x = atqx.x;
            if (!this.await(n, timeUnit)) {
                throw new TimeoutException(atih.c(n, timeUnit));
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
        return asjv.c((asir)this.c.get());
    }
    
    @Override
    public final boolean isDone() {
        return this.getCount() == 0L;
    }
    
    @Override
    public final boolean tA() {
        return this.isDone();
    }
    
    @Override
    public final void ts(final Object a) {
        final asir asir = this.c.get();
        if (asir == asjv.a) {
            return;
        }
        this.a = a;
        atok.e(this.c, (Object)asir, (Object)this);
        this.countDown();
    }
}
