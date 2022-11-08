import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afkz extends afld
{
    public static final afkz a;
    public final AtomicReference b;
    
    static {
        a = new afkz(aflf.a);
    }
    
    public afkz(final afld afld) {
        this.b = new AtomicReference((V)afld);
    }
    
    public final afjt a() {
        return this.b.get().a();
    }
    
    public final aflj b() {
        return this.b.get().b();
    }
    
    public final void c(final String s, final Level level, final boolean b) {
        this.b.get().c(s, level, b);
    }
}
