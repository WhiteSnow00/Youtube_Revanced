import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atiq implements ashy, asir
{
    final AtomicReference e;
    
    public atiq() {
        this.e = new AtomicReference();
    }
    
    @Override
    public final void d(final asir asir) {
        aucl.l(this.e, asir, (Class)this.getClass());
    }
    
    @Override
    public final void dispose() {
        asjv.b(this.e);
    }
    
    @Override
    public final boolean tA() {
        return this.e.get() == asjv.a;
    }
}
