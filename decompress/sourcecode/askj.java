import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class askj extends CountDownLatch implements ashq, asgo, asgz
{
    Object a;
    Throwable b;
    asic c;
    volatile boolean d;
    
    public askj() {
        super(1);
    }
    
    public final void b(final Throwable b) {
        this.b = b;
        this.countDown();
    }
    
    public final Object c() {
        if (this.getCount() != 0L) {
            try {
                final boolean x = aulo.x;
                this.await();
            }
            catch (final InterruptedException ex) {
                this.d = true;
                final asic c = this.c;
                if (c != null) {
                    c.dispose();
                }
                throw athp.b(ex);
            }
        }
        final Throwable b = this.b;
        if (b == null) {
            return this.a;
        }
        throw athp.b(b);
    }
    
    public final void d(final asic c) {
        this.c = c;
        if (this.d) {
            c.dispose();
        }
    }
    
    public final void tp(final Object a) {
        this.a = a;
        this.countDown();
    }
    
    public final void tu() {
        this.countDown();
    }
}
