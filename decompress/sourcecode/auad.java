import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class auad
{
    private static final AtomicReference a;
    
    static {
        a = new AtomicReference();
    }
    
    private auad() {
    }
    
    public static auad a() {
        return auad.a.get();
    }
    
    public abstract String b();
    
    public abstract boolean c();
}
