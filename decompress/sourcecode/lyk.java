// 
// Decompiled by Procyon v0.6.0
// 

final class lyk
{
    public final buc a;
    public final lyq b;
    public final bar c;
    public lyo d;
    public lyj e;
    public int f;
    public int g;
    public int h;
    public int i;
    private final bar j;
    private final bar k;
    
    public lyk(final buc a) {
        this.a = a;
        this.b = new lyq();
        this.c = new bar();
        this.j = new bar(1);
        this.k = new bar();
    }
    
    public final int a(int m, int n) {
        final lyp b = this.b();
        if (b == null) {
            return 0;
        }
        int n2 = b.d;
        bar bar;
        if (n2 != 0) {
            bar = this.b.p;
        }
        else {
            final byte[] e = b.e;
            final bar k = this.k;
            n2 = e.length;
            k.E(e, n2);
            bar = this.k;
        }
        final boolean c = this.b.c(this.f);
        final boolean b2 = c || n != 0;
        final bar j = this.j;
        final byte[] a = j.a;
        int n3;
        if (!b2) {
            n3 = 0;
        }
        else {
            n3 = 128;
        }
        a[0] = (byte)(n3 | n2);
        j.G(0);
        this.a.c(this.j, 1);
        this.a.c(bar, n2);
        if (!b2) {
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
            this.a.c(c2, 8);
            return n2 + 9;
        }
        final bar p2 = this.b.p;
        m = p2.m();
        p2.H(-2);
        m = m * 6 + 2;
        bar c3 = p2;
        if (n != 0) {
            this.c.C(m);
            this.c.B(p2.a, 0, m);
            p2.H(m);
            c3 = this.c;
            final byte[] a3 = c3.a;
            n += ((a3[2] & 0xFF) << 8 | (a3[3] & 0xFF));
            a3[2] = (byte)(n >> 8 & 0xFF);
            a3[3] = (byte)(n & 0xFF);
        }
        this.a.c(c3, m);
        return n2 + 1 + m;
    }
    
    public final lyp b() {
        final lyq b = this.b;
        final int a = b.a.a;
        lyp lyp = b.o;
        if (lyp == null) {
            lyp = this.d.a(a);
        }
        if (lyp != null && lyp.a) {
            return lyp;
        }
        return null;
    }
    
    public final void c(final lyo d, final lyj e) {
        dk.d((Object)d);
        this.d = d;
        dk.d((Object)e);
        this.e = e;
        this.a.b(d.f);
        this.d();
    }
    
    public final void d() {
        final lyq b = this.b;
        b.d = 0;
        b.r = 0L;
        b.m = false;
        b.q = false;
        b.o = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
    }
    
    public final boolean e() {
        ++this.f;
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
}
