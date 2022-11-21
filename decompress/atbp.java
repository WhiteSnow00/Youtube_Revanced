import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbp implements asku, asln
{
    final asku a;
    final long b;
    final TimeUnit c;
    final asky d;
    asln e;
    asln f;
    volatile long g;
    boolean h;
    
    public atbp(final asku a, final long b, final TimeUnit c, final asky d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.h) {
            aqvq.w(t);
            return;
        }
        final asln f = this.f;
        if (f != null) {
            asmr.b((AtomicReference)f);
        }
        this.h = true;
        this.a.b(t);
        this.d.dispose();
    }
    
    @Override
    public final void d(final asln e) {
        if (asmr.g(this.e, e)) {
            this.e = e;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.e.dispose();
        this.d.dispose();
    }
    
    @Override
    public final void tt(final Object o) {
        if (this.h) {
            return;
        }
        final long g = this.g + 1L;
        this.g = g;
        final asln f = this.f;
        if (f != null) {
            asmr.b((AtomicReference)f);
        }
        final atbo f2 = new atbo(o, g, this);
        asmr.h((AtomicReference)(this.f = f2), this.d.b(f2, this.b, this.c));
    }
    
    @Override
    public final void tw() {
        if (this.h) {
            return;
        }
        this.h = true;
        final asln f = this.f;
        if (f != null) {
            asmr.b((AtomicReference)f);
        }
        if (f != null) {
            ((atbo)f).run();
        }
        this.a.tw();
        this.d.dispose();
    }
    
    @Override
    public final boolean tz() {
        return this.d.tz();
    }
}
