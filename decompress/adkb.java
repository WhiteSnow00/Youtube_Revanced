import java.util.ArrayDeque;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkb
{
    public long a;
    public long b;
    public long c;
    public Queue d;
    public boolean e;
    public boolean f;
    public int g;
    
    public adkb(final long b) {
        this.a = -1L;
        this.c = -1L;
        this.d = new ArrayDeque();
        this.g = 1;
        this.b = b;
    }
    
    public final long a() {
        return Math.max(0L, this.a - this.c);
    }
    
    public final Long b() {
        return this.d.peek();
    }
    
    public final void c(final long n) {
        this.b = Math.min(this.b, n);
    }
}
