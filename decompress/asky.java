import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asky extends CountDownLatch implements asif, ashd, asho
{
    Object a;
    Throwable b;
    asir c;
    volatile boolean d;
    
    public asky() {
        super(1);
    }
    
    @Override
    public final void b(final Throwable b) {
        this.b = b;
        this.countDown();
    }
    
    public final Object c() {
        if (this.getCount() != 0L) {
            try {
                final boolean x = atqx.x;
                this.await();
            }
            catch (final InterruptedException ex) {
                this.d = true;
                final asir c = this.c;
                if (c != null) {
                    c.dispose();
                }
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
    public final void d(final asir c) {
        this.c = c;
        if (this.d) {
            c.dispose();
        }
    }
    
    @Override
    public final void ts(final Object a) {
        this.a = a;
        this.countDown();
    }
    
    @Override
    public final void tx() {
        this.countDown();
    }
}
