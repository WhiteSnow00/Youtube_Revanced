import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asjz extends AtomicReference implements asir
{
    private static final long serialVersionUID = -754898800686245608L;
    
    public asjz() {
    }
    
    public asjz(final asir asir) {
        this.lazySet(asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b(this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.get());
    }
}
