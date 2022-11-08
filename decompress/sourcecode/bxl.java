import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bxl extends bdd implements bxh
{
    private bxh a;
    private long b;
    
    public final int a() {
        final bxh a = this.a;
        dk.d((Object)a);
        return a.a();
    }
    
    public final int b(final long n) {
        final bxh a = this.a;
        dk.d((Object)a);
        return a.b(n - this.b);
    }
    
    public final long c(final int n) {
        final bxh a = this.a;
        dk.d((Object)a);
        return a.c(n) + this.b;
    }
    
    public final void clear() {
        super.clear();
        this.a = null;
    }
    
    public final List d(final long n) {
        final bxh a = this.a;
        dk.d((Object)a);
        return a.d(n - this.b);
    }
    
    public final void e(long n, final bxh a, final long n2) {
        this.timeUs = n;
        this.a = a;
        if (n2 != Long.MAX_VALUE) {
            n = n2;
        }
        this.b = n;
    }
}
