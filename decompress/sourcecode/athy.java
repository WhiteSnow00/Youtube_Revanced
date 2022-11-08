import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class athy implements ashj, asic
{
    final AtomicReference e;
    
    public athy() {
        this.e = new AtomicReference();
    }
    
    public final void d(final asic asic) {
        arxi.g(this.e, asic, this.getClass());
    }
    
    public final void dispose() {
        asjg.b(this.e);
    }
    
    public final boolean tx() {
        return this.e.get() == asjg.a;
    }
}
