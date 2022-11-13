import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asiu implements asir
{
    final AtomicReference a;
    
    public asiu() {
        this.a = new AtomicReference();
    }
    
    public final void a(final asir asir) {
        asjv.d(this.a, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b(this.a);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.a.get());
    }
}
