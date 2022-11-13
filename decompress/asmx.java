import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asmx extends AtomicReference implements Runnable, asir
{
    private static final long serialVersionUID = 3167244060586201109L;
    final ashd a;
    
    public asmx(final ashd a) {
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final void run() {
        this.a.tx();
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
}
