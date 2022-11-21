import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atae extends AtomicReference implements aslb
{
    private static final long serialVersionUID = -3051469169682093892L;
    final ataf a;
    
    public atae(final ataf a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final ataf a = this.a;
        if (atle.e(a.c, t)) {
            final int k = a.k;
            a.f.dispose();
            a.j = 0;
            a.f();
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.h(this, asln);
    }
    
    @Override
    public final void tr(final Object i) {
        final ataf a = this.a;
        a.i = i;
        a.j = 2;
        a.f();
    }
}
