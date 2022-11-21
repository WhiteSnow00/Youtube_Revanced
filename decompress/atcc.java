import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcc implements asku, asln
{
    final asku a;
    final Object b;
    final boolean c;
    asln d;
    long e;
    boolean f;
    
    public atcc(final asku a, final Object b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.f) {
            aqvq.w(t);
            return;
        }
        this.f = true;
        this.a.b(t);
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
    }
    
    @Override
    public final void tt(final Object o) {
        if (this.f) {
            return;
        }
        final long e = this.e;
        if (e == 0L) {
            this.f = true;
            this.d.dispose();
            this.a.tt(o);
            this.a.tw();
            return;
        }
        this.e = e + 1L;
    }
    
    @Override
    public final void tw() {
        if (!this.f) {
            this.f = true;
            final Object b = this.b;
            if (b == null && this.c) {
                this.a.b(new NoSuchElementException());
                return;
            }
            if (b != null) {
                this.a.tt(b);
            }
            this.a.tw();
        }
    }
    
    @Override
    public final boolean tz() {
        return this.d.tz();
    }
}
