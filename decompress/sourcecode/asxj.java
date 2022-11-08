import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asxj extends ashe
{
    final athv a;
    final asix b;
    final AtomicInteger c;
    
    public asxj(final athv a, final asix b) {
        this.a = a;
        this.b = b;
        this.c = new AtomicInteger();
    }
    
    public final void f(final ashj ashj) {
        ((ashe)this.a).aJ(ashj);
        if (this.c.incrementAndGet() == 1) {
            this.a.a(this.b);
        }
    }
}
