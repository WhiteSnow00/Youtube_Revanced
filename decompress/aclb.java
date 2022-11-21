import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class aclb
{
    public final int a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    
    public aclb(final int a, final List b, final int c, final int d, final int e, final int f, final int g) {
        adme.K(a > 0);
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final Object a(final int n) {
        if (n >= 0 && n < this.b.size()) {
            return this.b.get(n);
        }
        return null;
    }
}
