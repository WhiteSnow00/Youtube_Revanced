import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class ateq extends AtomicBoolean implements asku, asln
{
    private static final long serialVersionUID = -7419642935409022375L;
    final asku a;
    final ater b;
    final atep c;
    asln d;
    
    public ateq(final asku a, final ater b, final atep c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.b(t);
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln d) {
        if (asmr.g(this.d, d)) {
            this.d = d;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.d.dispose();
        if (this.compareAndSet(false, true)) {
            final ater b = this.b;
            final atep c = this.c;
            synchronized (b) {
                final atep b2 = b.b;
                if (b2 == null || b2 != c) {
                    return;
                }
                final long c2 = c.c - 1L;
                c.c = c2;
                if (c2 == 0L && c.d) {
                    b.c(c);
                }
            }
        }
    }
    
    @Override
    public final void tt(final Object o) {
        this.a.tt(o);
    }
    
    @Override
    public final void tw() {
        if (this.compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.tw();
        }
    }
    
    @Override
    public final boolean tz() {
        return this.d.tz();
    }
}
