import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class athx implements asgo, asic
{
    final AtomicReference b;
    
    public athx() {
        this.b = new AtomicReference();
    }
    
    public final void d(final asic asic) {
        arxi.g(this.b, asic, this.getClass());
    }
    
    public final void dispose() {
        asjg.b(this.b);
    }
    
    public final boolean tx() {
        return this.b.get() == asjg.a;
    }
}
