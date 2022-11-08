import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asjk extends AtomicReference implements asic
{
    private static final long serialVersionUID = -754898800686245608L;
    
    public asjk() {
    }
    
    public asjk(final asic asic) {
        this.lazySet(asic);
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
