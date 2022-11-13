import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atip implements ashd, asir
{
    final AtomicReference b;
    
    public atip() {
        this.b = new AtomicReference();
    }
    
    @Override
    public final void d(final asir asir) {
        aucl.l(this.b, asir, (Class)this.getClass());
    }
    
    @Override
    public final void dispose() {
        asjv.b(this.b);
    }
    
    @Override
    public final boolean tA() {
        return this.b.get() == asjv.a;
    }
}
