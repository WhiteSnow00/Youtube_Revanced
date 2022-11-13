import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class abv
{
    static final abv a;
    final Runnable b;
    final Executor c;
    abv next;
    
    static {
        a = new abv(null, null);
    }
    
    public abv(final Runnable b, final Executor c) {
        this.b = b;
        this.c = c;
    }
}
