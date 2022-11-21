import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asnt extends CountDownLatch implements asku, asln
{
    Object a;
    Throwable b;
    asln c;
    volatile boolean d;
    
    public asnt() {
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
    public final void d(final asln c) {
        this.c = c;
        if (this.d) {
            c.dispose();
        }
    }
    
    @Override
    public final void dispose() {
        this.d = true;
        final asln c = this.c;
        if (c != null) {
            c.dispose();
        }
    }
    
    public final Object f() {
        if (this.getCount() != 0L) {
            try {
                final boolean x = aqvq.x;
                this.await();
            }
            catch (final InterruptedException ex) {
                this.dispose();
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
    public final void tt(final Object a) {
        if (this.a == null) {
            this.a = a;
            this.c.dispose();
            this.countDown();
        }
    }
    
    @Override
    public final void tw() {
        this.countDown();
    }
    
    @Override
    public final boolean tz() {
        return this.d;
    }
}
