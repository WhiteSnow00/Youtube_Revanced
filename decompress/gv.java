import android.util.SparseBooleanArray;

// 
// Decompiled by Procyon v0.6.0
// 

final class gv implements hj
{
    final SparseBooleanArray a;
    public int b;
    public int c;
    public int d;
    public int e;
    final gw f;
    public rk g;
    
    public gv(final gw f) {
        this.f = f;
        this.a = new SparseBooleanArray();
    }
    
    public final int a(final int n) {
        return n - n % this.f.b;
    }
    
    public final void b(final int n) {
        this.a.delete(n);
        ((hf)this.f.c).a(hi.a(3, this.b, n));
    }
    
    public final void c(final int n, final int n2, final int n3, final boolean b) {
        for (int i = n; i <= n2; i += this.f.b) {
            int n4;
            if (b) {
                n4 = n2 + n - i;
            }
            else {
                n4 = i;
            }
            ((hh)this.f.d).a(hi.a(3, n4, n3));
        }
    }
    
    public final void d(final rk rk) {
        throw null;
    }
}
