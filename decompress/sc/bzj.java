// 
// Decompiled by Procyon v0.6.0
// 

public final class bzj implements btj
{
    private final bas a;
    private boolean b;
    private final int c;
    private final Object d;
    
    public bzj(final int c) {
        this.c = c;
        this.d = new bzk(null);
        this.a = new bas(16384);
    }
    
    public bzj(final int c, final byte[] array) {
        this.c = c;
        this.d = new bzi();
        this.a = new bas(2786);
    }
    
    public final void d(final btm btm) {
        if (this.c != 0) {
            ((bzi)this.d).b(btm, new cao(0, 1));
            btm.r();
            btm.x((bua)new btz(-9223372036854775807L));
            return;
        }
        ((bzk)this.d).b(btm, new cao(0, 1));
        btm.r();
        btm.x((bua)new btz(-9223372036854775807L));
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        if (this.c != 0) {
            this.b = false;
            ((bzi)this.d).e();
            return;
        }
        this.b = false;
        ((bzk)this.d).e();
    }
    
    public final boolean g(final btk btk) {
        final int c = this.c;
        boolean b = true;
        if (c != 0) {
            final bas bas = new bas(10);
            int n = 0;
            while (true) {
                btk.j(bas.a, 0, 10);
                bas.G(0);
                if (bas.k() != 4801587) {
                    break;
                }
                bas.H(3);
                final int h = bas.h();
                n += h + 10;
                btk.g(h);
            }
            btk.l();
            btk.g(n);
            int n2 = n;
            int n3 = 0;
            while (true) {
                btk.j(bas.a, 0, 6);
                bas.G(0);
                if (bas.m() != 2935) {
                    btk.l();
                    if (++n2 - n >= 8192) {
                        break;
                    }
                    btk.g(n2);
                    n3 = 0;
                }
                else {
                    final int n4 = n3 + 1;
                    if (n4 >= 4) {
                        return b;
                    }
                    final byte[] a = bas.a;
                    final int[] a2 = bss.a;
                    int a3;
                    if (a.length < 6) {
                        a3 = -1;
                    }
                    else if ((a[5] & 0xF8) >> 3 > 10) {
                        final int n5 = ((a[3] & 0xFF) | (a[2] & 0x7) << 8) + 1;
                        a3 = n5 + n5;
                    }
                    else {
                        final byte b2 = a[4];
                        a3 = bss.a((b2 & 0xC0) >> 6, b2 & 0x3F);
                    }
                    if (a3 == -1) {
                        break;
                    }
                    btk.g(a3 - 6);
                    n3 = n4;
                }
            }
            b = false;
            return b;
        }
        final bas bas2 = new bas(10);
        int n6 = 0;
        int n7;
        int n8;
        int n9;
        while (true) {
            n7 = 1;
            n8 = 2;
            n9 = 8192;
            btk.j(bas2.a, 0, 10);
            bas2.G(0);
            if (bas2.k() != 4801587) {
                break;
            }
            bas2.H(3);
            final int h2 = bas2.h();
            n6 += h2 + 10;
            btk.g(h2);
        }
        btk.l();
        btk.g(n6);
        int n10 = n6;
        int n11 = 0;
        while (true) {
            btk.j(bas2.a, 0, 7);
            bas2.G(0);
            final int m = bas2.m();
            int n13;
            int n14;
            if (m != 44096 && m != 44097) {
                btk.l();
                if (++n10 - n6 >= n9) {
                    break;
                }
                btk.g(n10);
                final int n12 = 0;
                n13 = n7;
                n14 = n12;
            }
            else {
                final int n15 = n11 + n7;
                if (n15 >= 4) {
                    return n7 != 0;
                }
                final byte[] a4 = bas2.a;
                final int a5 = bst.a;
                int n16;
                if (a4.length < 7) {
                    n16 = -1;
                }
                else {
                    int n17 = (a4[n8] & 0xFF) << 8 | (a4[3] & 0xFF);
                    int n18;
                    if (n17 == 65535) {
                        n17 = ((a4[4] & 0xFF) << 16 | (a4[5] & 0xFF) << 8 | (a4[6] & 0xFF));
                        n18 = 7;
                    }
                    else {
                        n18 = 4;
                    }
                    int n19 = n18;
                    if (m == 44097) {
                        n19 = n18 + 2;
                    }
                    n16 = n17 + n19;
                }
                if (n16 == -1) {
                    break;
                }
                btk.g(n16 - 7);
                n9 = 8192;
                n8 = 2;
                final int n20 = 1;
                n14 = n15;
                n13 = n20;
            }
            n11 = n14;
            n7 = n13;
        }
        n7 = 0;
        return n7 != 0;
    }
    
    public final int h(final btk btk, final paq paq) {
        final int c = this.c;
        int n = -1;
        if (c != 0) {
            final int a = btk.a(this.a.a, 0, 2786);
            if (a != -1) {
                this.a.G(0);
                this.a.F(a);
                if (!this.b) {
                    ((bzi)this.d).d(0L, 4);
                    this.b = true;
                }
                ((bzi)this.d).a(this.a);
                n = 0;
            }
            return n;
        }
        final int a2 = btk.a(this.a.a, 0, 16384);
        if (a2 != -1) {
            this.a.G(0);
            this.a.F(a2);
            if (!this.b) {
                ((bzk)this.d).d(0L, 4);
                this.b = true;
            }
            ((bzk)this.d).a(this.a);
            n = 0;
        }
        return n;
    }
}
