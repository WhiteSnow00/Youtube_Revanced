import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aten extends AtomicReference implements asku, asln
{
    private static final long serialVersionUID = 854110278590336484L;
    final asku a;
    asln b;
    
    public aten(final asku a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        asmr.b(this);
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln b) {
        if (asmr.g(this.b, b)) {
            this.b = b;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.b.dispose();
        asmr.b(this);
    }
    
    @Override
    public final void tt(final Object o) {
        this.a.tt(o);
    }
    
    @Override
    public final void tw() {
        asmr.b(this);
        this.a.tw();
    }
    
    @Override
    public final boolean tz() {
        return this.b.tz();
    }
}
