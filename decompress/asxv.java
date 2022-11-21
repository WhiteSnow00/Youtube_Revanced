import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxv extends AtomicReference implements askk, asjz, asln
{
    private static final long serialVersionUID = -2177128922851101253L;
    final asjz a;
    final asmn b;
    
    public asxv(final asjz a, final asmn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.h(this, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void tr(final Object o) {
        try {
            final askb askb = (askb)this.b.a(o);
            asng.b(askb, "The mapper returned a null CompletableSource");
            if (!this.tz()) {
                askb.Y(this);
            }
        }
        finally {
            final Throwable t;
            asjv.a(t);
            this.b(t);
        }
    }
    
    @Override
    public final void tw() {
        this.a.tw();
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
