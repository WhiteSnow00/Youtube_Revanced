import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aslq implements asln
{
    final AtomicReference a;
    
    public aslq() {
        this.a = new AtomicReference();
    }
    
    public final void a(final asln asln) {
        asmr.d(this.a, asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this.a);
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.a.get());
    }
}
