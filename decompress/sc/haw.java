import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class haw implements Callable
{
    public final ula a;
    public final int b;
    
    public haw(final ula a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object call() {
        return this.a.c(this.b);
    }
}
