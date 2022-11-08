// 
// Decompiled by Procyon v0.6.0
// 

final class bwk
{
    public final buc a;
    public final bwq b;
    public final bar c;
    public bwr d;
    public bwi e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    private final bar k;
    private final bar l;
    
    public bwk(final buc a, final bwr d, final bwi e) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.b = new bwq();
        this.c = new bar();
        this.k = new bar(1);
        this.l = new bar();
        this.c(d, e);
    }
    
    public final int a(int m, int n) {
        final lyp f = this.f();
        if (f == null) {
            return 0;
        }
        int n2 = f.d;
        bar bar;
        if (n2 != 0) {
            bar = this.b.m;
        }
        else {
            final byte[] array = (byte[])baw.L((Object)f.e);
            final bar l = this.l;
            n2 = array.length;
            l.E(array, n2);
            bar = this.l;
        }
        final boolean c = this.b.c(this.f);
        final boolean b = c || n != 0;
        final bar k = this.k;
        final byte[] a = k.a;
        int n3;
        if (!b) {
            n3 = 0;
        }
        else {
            n3 = 128;
        }
        a[0] = (byte)(n3 | n2);
        k.G(0);
        this.a.d(this.k, 1, 1);
        this.a.d(bar, n2, 1);
        if (!b) {
            return n2 + 1;
        }
        if (!c) {
            this.c.C(8);
            final bar c2 = this.c;
            final byte[] a2 = c2.a;
            a2[0] = 0;
            a2[1] = 1;
            a2[2] = 0;
            a2[3] = (byte)n;
            a2[4] = (byte)(m >> 24 & 0xFF);
            a2[5] = (byte)(m >> 16 & 0xFF);
            a2[6] = (byte)(m >> 8 & 0xFF);
            a2[7] = (byte)(m & 0xFF);
            this.a.d(c2, 8, 1);
            return n2 + 9;
        }
        final bar i = this.b.m;
        m = i.m();
        i.H(-2);
        m = m * 6 + 2;
        bar c3 = i;
        if (n != 0) {
            this.c.C(m);
            final byte[] a3 = this.c.a;
            i.B(a3, 0, m);
            n += ((a3[2] & 0xFF) << 8 | (a3[3] & 0xFF));
            a3[2] = (byte)(n >> 8 & 0xFF);
            a3[3] = (byte)(n & 0xFF);
            c3 = this.c;
        }
        this.a.d(c3, m, 1);
        return n2 + 1 + m;
    }
    
    public final long b() {
        long n;
        if (!this.j) {
            n = this.d.b[this.f];
        }
        else {
            n = this.b.f[this.h];
        }
        return n;
    }
    
    public final void c(final bwr d, final bwi e) {
        this.d = d;
        this.e = e;
        this.a.b(d.h.f);
        this.d();
    }
    
    public final void d() {
        final bwq b = this.b;
        b.d = 0;
        b.o = 0L;
        b.p = false;
        b.k = false;
        b.n = false;
        b.q = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.j = false;
    }
    
    public final boolean e() {
        ++this.f;
        if (!this.j) {
            return false;
        }
        final int g = this.g + 1;
        this.g = g;
        final int[] g2 = this.b.g;
        final int h = this.h;
        if (g == g2[h]) {
            this.h = h + 1;
            this.g = 0;
            return false;
        }
        return true;
    }
    
    public final lyp f() {
        if (!this.j) {
            return null;
        }
        final bwi a = this.b.a;
        final int a2 = baw.a;
        final int a3 = a.a;
        lyp lyp = this.b.q;
        if (lyp == null) {
            lyp = this.d.h.b(a3);
        }
        if (lyp != null && lyp.a) {
            return lyp;
        }
        return null;
    }
}
