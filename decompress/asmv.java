import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asmv extends AtomicReference implements asln
{
    private static final long serialVersionUID = -754898800686245608L;
    
    public asmv() {
    }
    
    public asmv(final asln asln) {
        this.lazySet(asln);
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
