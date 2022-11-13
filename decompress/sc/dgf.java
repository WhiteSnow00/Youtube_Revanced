import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class dgf
{
    private final Queue a;
    
    public dgf() {
        this.a = dph.i(20);
    }
    
    public abstract dgq a();
    
    final dgq b() {
        dgq a;
        if ((a = this.a.poll()) == null) {
            a = this.a();
        }
        return a;
    }
    
    public final void c(final dgq dgq) {
        if (this.a.size() < 20) {
            this.a.offer(dgq);
        }
    }
}
