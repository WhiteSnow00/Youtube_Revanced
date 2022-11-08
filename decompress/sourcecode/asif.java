import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asif implements asic
{
    final AtomicReference a;
    
    public asif() {
        this.a = new AtomicReference();
    }
    
    public final void a(final asic asic) {
        asjg.d(this.a, asic);
    }
    
    public final void dispose() {
        asjg.b(this.a);
    }
    
    public final boolean tx() {
        return asjg.c(this.a.get());
    }
}
