// 
// Decompiled by Procyon v0.6.0
// 

public final class bzm implements btm
{
    private final bat a;
    private boolean b;
    private final int c;
    private final Object d;
    
    public bzm(final int c) {
        this.c = c;
        this.d = new bzn(null);
        this.a = new bat(16384);
    }
    
    public bzm(final int c, final byte[] array) {
        this.c = c;
        this.d = new bzl();
        this.a = new bat(2786);
    }
    
    public final void d(final btp btp) {
        if (this.c != 0) {
            ((bzl)this.d).b(btp, new car(0, 1));
            btp.r();
            btp.x((bud)new buc(-9223372036854775807L));
            return;
        }
        ((bzn)this.d).b(btp, new car(0, 1));
        btp.r();
        btp.x((bud)new buc(-9223372036854775807L));
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        if (this.c != 0) {
            this.b = false;
            ((bzl)this.d).e();
            return;
        }
        this.b = false;
        ((bzn)this.d).e();
    }
    
    public final boolean g(final btn btn) {
        final int c = this.c;
        boolean b = true;
        if (c != 0) {
            final bat bat = new bat(10);
            int n = 0;
            while (true) {
                btn.j(bat.a, 0, 10);
                bat.G(0);
                if (bat.k() != 4801587) {
                    break;
                }
                bat.H(3);
                final int h = bat.h();
                n += h + 10;
                btn.g(h);
            }
            btn.l();
            btn.g(n);
            int n2 = n;
            int n3 = 0;
            while (true) {
                btn.j(bat.a, 0, 6);
                bat.G(0);
                if (bat.m() != 2935) {
                    btn.l();
                    if (++n2 - n >= 8192) {
                        break;
                    }
                    btn.g(n2);
                    n3 = 0;
                }
                else {
                    final int n4 = n3 + 1;
                    if (n4 >= 4) {
                        return b;
                    }
                    final byte[] a = bat.a;
                    final int[] a2 = bsv.a;
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
                        a3 = bsv.a((b2 & 0xC0) >> 6, b2 & 0x3F);
                    }
                    if (a3 == -1) {
                        break;
                    }
                    btn.g(a3 - 6);
                    n3 = n4;
                }
            }
            b = false;
            return b;
        }
        final bat bat2 = new bat(10);
        int n6 = 0;
        int n7;
        int n8;
        int n9;
        while (true) {
            n7 = 1;
            n8 = 2;
            n9 = 8192;
            btn.j(bat2.a, 0, 10);
            bat2.G(0);
            if (bat2.k() != 4801587) {
                break;
            }
            bat2.H(3);
            final int h2 = bat2.h();
            n6 += h2 + 10;
            btn.g(h2);
        }
        btn.l();
        btn.g(n6);
        int n10 = n6;
        int n11 = 0;
        while (true) {
            btn.j(bat2.a, 0, 7);
            bat2.G(0);
            final int m = bat2.m();
            int n13;
            int n14;
            if (m != 44096 && m != 44097) {
                btn.l();
                if (++n10 - n6 >= n9) {
                    break;
                }
                btn.g(n10);
                final int n12 = 0;
                n13 = n7;
                n14 = n12;
            }
            else {
                final int n15 = n11 + n7;
                if (n15 >= 4) {
                    return n7 != 0;
                }
                final byte[] a4 = bat2.a;
                final int a5 = bsw.a;
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
                btn.g(n16 - 7);
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
    
    public final int h(final btn btn, final pbg pbg) {
        final int c = this.c;
        int n = -1;
        if (c != 0) {
            final int a = btn.a(this.a.a, 0, 2786);
            if (a != -1) {
                this.a.G(0);
                this.a.F(a);
                if (!this.b) {
                    ((bzl)this.d).d(0L, 4);
                    this.b = true;
                }
                ((bzl)this.d).a(this.a);
                n = 0;
            }
            return n;
        }
        final int a2 = btn.a(this.a.a, 0, 16384);
        if (a2 != -1) {
            this.a.G(0);
            this.a.F(a2);
            if (!this.b) {
                ((bzn)this.d).d(0L, 4);
                this.b = true;
            }
            ((bzn)this.d).a(this.a);
            n = 0;
        }
        return n;
    }
}
