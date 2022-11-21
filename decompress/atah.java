import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atah extends AtomicReference implements asjz
{
    private static final long serialVersionUID = -8003404460084760287L;
    final atai a;
    
    public atah(final atai a) {
        this.a = a;
    }
    
    @Override
    public final void b(Throwable d) {
        final atai a = this.a;
        if (arxu.t(a.e, this, null) && atle.e(a.d, d)) {
            a.dispose();
            d = atle.d(a.d);
            if (d != atle.a) {
                a.b.b(d);
            }
            return;
        }
        aqvq.w(d);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void tw() {
        final atai a = this.a;
        if (arxu.t(a.e, this, null) && a.f) {
            final Throwable d = atle.d(a.d);
            if (d == null) {
                a.b.tw();
                return;
            }
            a.b.b(d);
        }
    }
}
