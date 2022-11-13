import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asxy extends asht
{
    final atin a;
    final asjm b;
    final AtomicInteger c;
    
    public asxy(final atin a, final asjm b) {
        this.a = a;
        this.b = b;
        this.c = new AtomicInteger();
    }
    
    public final void f(final ashy ashy) {
        ((asht)this.a).aP(ashy);
        if (this.c.incrementAndGet() == 1) {
            this.a.a(this.b);
        }
    }
}
