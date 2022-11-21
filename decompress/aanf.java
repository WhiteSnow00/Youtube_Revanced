import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aanf implements zdc
{
    public final AtomicLong a;
    public final AtomicInteger b;
    private final AtomicLong c;
    
    public aanf() {
        this.c = new AtomicLong();
        this.a = new AtomicLong();
        this.b = new AtomicInteger();
    }
    
    public final void a(final zdr zdr) {
        if (zdr.a == 1) {
            this.a.addAndGet(zdr.c);
            this.b.addAndGet(zdr.b);
        }
    }
    
    public final void b(final Exception ex) {
    }
    
    public final void c(final int n) {
    }
    
    public final void d(final zdr zdr) {
    }
    
    public final long f() {
        return this.c.get();
    }
    
    public final void g() {
        this.c.set(0L);
        this.a.set(0L);
        this.b.set(0);
    }
    
    public final void td(final long n) {
        this.c.addAndGet(n);
    }
}
