import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aesu implements Callable
{
    public final long a;
    
    public aesu(final long a) {
        this.a = a;
    }
    
    @Override
    public final Object call() {
        return this.a;
    }
}
