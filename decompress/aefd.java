import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public enum aefd implements aefa
{
    a;
    
    private static final AtomicReference b;
    private static final aefd[] c;
    
    static {
        b = new AtomicReference(null);
    }
    
    @Override
    public final aefb a() {
        return aefd.b.get();
    }
}
