import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public enum aebj implements aebg
{
    a;
    
    private static final AtomicReference b;
    
    static {
        b = new AtomicReference(null);
    }
    
    public final aebh a() {
        return aebj.b.get();
    }
}
