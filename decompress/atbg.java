import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbg extends AtomicReference implements asku
{
    private static final long serialVersionUID = 2620149119579502636L;
    final asku a;
    final atbh b;
    
    public atbg(final asku a, final atbh b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        final atbh b = this.b;
        if (atle.e(b.c, t)) {
            final boolean e = b.e;
            b.g.dispose();
            b.h = false;
            b.f();
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.h(this, asln);
    }
    
    @Override
    public final void tt(final Object o) {
        this.a.tt(o);
    }
    
    @Override
    public final void tw() {
        final atbh b = this.b;
        b.h = false;
        b.f();
    }
}
