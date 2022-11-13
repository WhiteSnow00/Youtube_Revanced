import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class auau
{
    private static final AtomicReference a;
    
    static {
        a = new AtomicReference();
    }
    
    private auau() {
    }
    
    public static auau a() {
        return auau.a.get();
    }
    
    public abstract String b();
    
    public abstract boolean c();
}
