import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class abu
{
    static final abu a;
    final Runnable b;
    final Executor c;
    abu next;
    
    static {
        a = new abu(null, null);
    }
    
    public abu(final Runnable b, final Executor c) {
        this.b = b;
        this.c = c;
    }
}
