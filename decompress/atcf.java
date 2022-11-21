import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcf implements asku, asln
{
    final aslb a;
    final Object b;
    asln c;
    long d;
    boolean e;
    
    public atcf(final aslb a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.e) {
            aqvq.w(t);
            return;
        }
        this.e = true;
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln c) {
        if (asmr.g(this.c, c)) {
            this.c = c;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.c.dispose();
    }
    
    @Override
    public final void tt(final Object o) {
        if (this.e) {
            return;
        }
        final long d = this.d;
        if (d == 0L) {
            this.e = true;
            this.c.dispose();
            this.a.tr(o);
            return;
        }
        this.d = d + 1L;
    }
    
    @Override
    public final void tw() {
        if (!this.e) {
            this.e = true;
            final Object b = this.b;
            if (b != null) {
                this.a.tr(b);
                return;
            }
            this.a.b(new NoSuchElementException());
        }
    }
    
    @Override
    public final boolean tz() {
        return this.c.tz();
    }
}
