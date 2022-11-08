import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dun implements dvj
{
    public final Map a;
    private final Executor b;
    
    public dun(final Executor b) {
        this.a = new HashMap();
        this.b = b;
    }
    
    public final void a(final Runnable runnable) {
        synchronized (this.a) {
            this.a.remove(runnable);
        }
    }
    
    public final void b() {
    }
    
    public final void c(final Runnable runnable) {
        synchronized (this.a) {
            final Integer n = this.a.get(runnable);
            final Map a = this.a;
            int n2 = 1;
            if (n != null) {
                n2 = 1 + n;
            }
            a.put(runnable, n2);
            monitorexit(this.a);
            this.b.execute((Runnable)new cog(this, runnable, 12));
        }
    }
}
