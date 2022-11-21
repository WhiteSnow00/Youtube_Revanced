import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class audq
{
    private static final AtomicReference a;
    
    static {
        a = new AtomicReference();
    }
    
    private audq() {
    }
    
    public static audq a() {
        return audq.a.get();
    }
    
    public abstract String b();
    
    public abstract boolean c();
}
