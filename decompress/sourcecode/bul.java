// 
// Decompiled by Procyon v0.6.0
// 

final class bul
{
    protected final buc a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long[] i;
    public int[] j;
    private final long k;
    private final int l;
    
    public bul(int d, int n, final long k, final int l, final buc a) {
        int n2 = n;
        if (n != 1) {
            n2 = 2;
        }
        dk.f(true);
        this.k = k;
        this.l = l;
        this.a = a;
        if (n2 == 2) {
            n = 1667497984;
        }
        else {
            n = 1651965952;
        }
        this.b = d(d, n);
        if (n2 == 2) {
            d = d(d, 1650720768);
        }
        else {
            d = -1;
        }
        this.c = d;
        this.i = new long[512];
        this.j = new int[512];
    }
    
    private static int d(final int n, final int n2) {
        return n / 10 + 48 | n % 10 + 48 << 8 | n2;
    }
    
    private final bua e(final int n) {
        return new bua(this.j[n] * this.b(), this.i[n]);
    }
    
    public final long a(final int n) {
        return this.k * n / this.l;
    }
    
    public final long b() {
        return this.a(1);
    }
    
    public final btx c(final long n) {
        final int n2 = (int)(n / this.b());
        final int b = baw.b(this.j, n2, true, true);
        if (this.j[b] == n2) {
            final bua e = this.e(b);
            return new btx(e, e);
        }
        final bua e2 = this.e(b);
        final int n3 = b + 1;
        if (n3 < this.i.length) {
            return new btx(e2, this.e(n3));
        }
        return new btx(e2, e2);
    }
}
