import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atab extends AtomicReference implements askk
{
    private static final long serialVersionUID = -3051469169682093892L;
    final atac a;
    
    public atab(final atac a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final atac a = this.a;
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
        final atac a = this.a;
        a.i = i;
        a.j = 2;
        a.f();
    }
    
    @Override
    public final void tw() {
        final atac a = this.a;
        a.j = 0;
        a.f();
    }
}
