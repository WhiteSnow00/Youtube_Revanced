import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class askx extends CountDownLatch implements ashy, asir
{
    Object a;
    Throwable b;
    asir c;
    volatile boolean d;
    
    public askx() {
        super(1);
    }
    
    @Override
    public final void b(final Throwable b) {
        if (this.a == null) {
            this.b = b;
        }
        this.countDown();
    }
    
    @Override
    public final void d(final asir c) {
        this.c = c;
        if (this.d) {
            c.dispose();
        }
    }
    
    @Override
    public final void dispose() {
        this.d = true;
        final asir c = this.c;
        if (c != null) {
            c.dispose();
        }
    }
    
    public final Object f() {
        if (this.getCount() != 0L) {
            try {
                final boolean x = atqx.x;
                this.await();
            }
            catch (final InterruptedException ex) {
                this.dispose();
                throw atih.b((Throwable)ex);
            }
        }
        final Throwable b = this.b;
        if (b == null) {
            return this.a;
        }
        throw atih.b(b);
    }
    
    @Override
    public final boolean tA() {
        return this.d;
    }
    
    @Override
    public final void tu(final Object a) {
        if (this.a == null) {
            this.a = a;
            this.c.dispose();
            this.countDown();
        }
    }
    
    @Override
    public final void tx() {
        this.countDown();
    }
}
