import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aski extends CountDownLatch implements ashj, asic
{
    Object a;
    Throwable b;
    asic c;
    volatile boolean d;
    
    public aski() {
        super(1);
    }
    
    public final void b(final Throwable b) {
        if (this.a == null) {
            this.b = b;
        }
        this.countDown();
    }
    
    public final void d(final asic c) {
        this.c = c;
        if (this.d) {
            c.dispose();
        }
    }
    
    public final void dispose() {
        this.d = true;
        final asic c = this.c;
        if (c != null) {
            c.dispose();
        }
    }
    
    public final Object f() {
        if (this.getCount() != 0L) {
            try {
                final boolean x = aulo.x;
                this.await();
            }
            catch (final InterruptedException ex) {
                this.dispose();
                throw athp.b(ex);
            }
        }
        final Throwable b = this.b;
        if (b == null) {
            return this.a;
        }
        throw athp.b(b);
    }
    
    public final void tr(final Object a) {
        if (this.a == null) {
            this.a = a;
            this.c.dispose();
            this.countDown();
        }
    }
    
    public final void tu() {
        this.countDown();
    }
    
    public final boolean tx() {
        return this.d;
    }
}
