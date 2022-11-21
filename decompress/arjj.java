// 
// Decompiled by Procyon v0.6.0
// 

public final class arjj
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    public arjj() {
    }
    
    public arjj(final byte[] array) {
        this.d = 0;
    }
    
    static final int f(final int n, final int n2) {
        if (n > n2) {
            return 1;
        }
        if (n == n2) {
            return 2;
        }
        return 4;
    }
    
    final int a() {
        int n;
        if (this.b == 0) {
            n = 2;
        }
        else {
            n = 0;
        }
        return n + 7;
    }
    
    public final void b(final int n) {
        this.d |= n;
    }
    
    public final void c() {
        this.d = 0;
    }
    
    public final void d(final int c, final int a, final int b, final int e) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public final boolean e() {
        final int d = this.d;
        return ((d & 0x7) == 0x0 || (f(this.b, this.c) & d) != 0x0) && ((d & 0x70) == 0x0 || (f(this.b, this.a) << 4 & d) != 0x0) && ((d & 0x700) == 0x0 || (f(this.e, this.c) << 8 & d) != 0x0) && ((d & 0x7000) == 0x0 || (d & f(this.e, this.a) << 12) != 0x0);
    }
}
