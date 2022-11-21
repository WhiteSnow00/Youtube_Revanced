import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asnu extends CountDownLatch implements aslb, asjz, askk
{
    Object a;
    Throwable b;
    asln c;
    volatile boolean d;
    
    public asnu() {
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
                final boolean x = aqvq.x;
                this.await();
            }
            catch (final InterruptedException ex) {
                this.d = true;
                final asln c = this.c;
                if (c != null) {
                    c.dispose();
                }
                throw atle.b(ex);
            }
        }
        final Throwable b = this.b;
        if (b == null) {
            return this.a;
        }
        throw atle.b(b);
    }
    
    @Override
    public final void d(final asln c) {
        this.c = c;
        if (this.d) {
            c.dispose();
        }
    }
    
    @Override
    public final void tr(final Object a) {
        this.a = a;
        this.countDown();
    }
    
    @Override
    public final void tw() {
        this.countDown();
    }
}
