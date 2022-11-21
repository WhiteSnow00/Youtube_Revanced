import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxz implements askk
{
    final AtomicReference a;
    private final int b;
    
    public asxz(final asxx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public asxz(final asya a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b != 0) {
            ((asxx)this.a).a.b(t);
            return;
        }
        ((asya)this.a).a.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        if (this.b != 0) {
            asmr.f(this.a, asln);
            return;
        }
        asmr.f(this.a, asln);
    }
    
    @Override
    public final void tr(final Object o) {
        if (this.b != 0) {
            ((asxx)this.a).a.tr(o);
            return;
        }
        ((asya)this.a).a.tr(o);
    }
    
    @Override
    public final void tw() {
        if (this.b != 0) {
            ((asxx)this.a).a.tw();
            return;
        }
        ((asya)this.a).a.tw();
    }
}
