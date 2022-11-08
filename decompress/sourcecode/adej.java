import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adej implements arjd
{
    private final atjj a;
    private final atjj b;
    
    public adej(final atjj a, final atjj b) {
        this.a = a;
        this.b = b;
    }
    
    public static adej b(final atjj atjj, final atjj atjj2) {
        return new adej(atjj, atjj2);
    }
    
    public final Executor c() {
        return adio.L(((szi)this.a).c(), this.b);
    }
}
