import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aalj implements zbi
{
    public final AtomicLong a;
    public final AtomicInteger b;
    private final AtomicLong c;
    
    public aalj() {
        this.c = new AtomicLong();
        this.a = new AtomicLong();
        this.b = new AtomicInteger();
    }
    
    public final void a(final zbx zbx) {
        if (zbx.a == 1) {
            this.a.addAndGet(zbx.c);
            this.b.addAndGet(zbx.b);
        }
    }
    
    public final void b(final Exception ex) {
    }
    
    public final void c(final int n) {
    }
    
    public final void d(final zbx zbx) {
    }
    
    public final long f() {
        return this.c.get();
    }
    
    public final void g() {
        this.c.set(0L);
        this.a.set(0L);
        this.b.set(0);
    }
    
    public final void te(final long n) {
        this.c.addAndGet(n);
    }
}
