import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afyn
{
    public static final afyn a;
    private final AtomicReference b;
    
    static {
        a = new afyn();
    }
    
    public afyn() {
        this.b = new AtomicReference();
    }
    
    public final void a() {
        final aesy aesy = this.b.get();
    }
}
