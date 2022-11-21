import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszg extends AtomicReference implements askk
{
    private static final long serialVersionUID = 8663801314800248617L;
    final askk a;
    
    public aszg(final askk a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void tr(final Object o) {
        this.a.tr(o);
    }
    
    @Override
    public final void tw() {
        this.a.tw();
    }
}
