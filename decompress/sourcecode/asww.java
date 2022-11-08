import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asww extends AtomicReference implements asgo
{
    private static final long serialVersionUID = -8003404460084760287L;
    final aswx a;
    
    public asww(final aswx a) {
        this.a = a;
    }
    
    public final void b(Throwable d) {
        final aswx a = this.a;
        if (arxj.i(a.e, this, null) && athp.e(a.d, d)) {
            a.dispose();
            d = athp.d(a.d);
            if (d != athp.a) {
                a.b.b(d);
            }
            return;
        }
        aulo.r(d);
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void tu() {
        final aswx a = this.a;
        if (arxj.i(a.e, this, null) && a.f) {
            final Throwable d = athp.d(a.d);
            if (d == null) {
                a.b.tu();
                return;
            }
            a.b.b(d);
        }
    }
}
