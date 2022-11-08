import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

final class afnp implements afsz
{
    private final Level a;
    private final String b;
    
    public afnp(final Level a, final String b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Object o) {
    }
    
    public final void rz(final Throwable t) {
        ((afii)((afii)afnq.a.l(this.a).i(t)).j("com/google/common/labs/concurrent/LabsFutures$LogFailureCallback", "onFailure", 218, "LabsFutures.java")).t("%s", (Object)this.b);
    }
}
