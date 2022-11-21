import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class abw
{
    static final abw a;
    final Runnable b;
    final Executor c;
    abw next;
    
    static {
        a = new abw(null, null);
    }
    
    public abw(final Runnable b, final Executor c) {
        this.b = b;
        this.c = c;
    }
}
