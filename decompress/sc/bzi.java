// 
// Decompiled by Procyon v0.6.0
// 

public final class bzi implements bzp
{
    private final bas a;
    private final String b;
    private String c;
    private bud d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private ayg i;
    private int j;
    private long k;
    private final atim l;
    
    public bzi() {
        this(null);
    }
    
    public bzi(final String b) {
        final atim l = new atim(new byte[128], (byte[])null);
        this.l = l;
        this.a = new bas((byte[])l.d);
        this.e = 0;
        this.k = -9223372036854775807L;
        this.b = b;
    }
    
    public final void a(final bas bas) {
        dk.e((Object)this.d);
        while (bas.a() > 0) {
            final int e = this.e;
            if (e != 0) {
                if (e != 1) {
                    final int min = Math.min(bas.a(), this.j - this.f);
                    this.d.c(bas, min);
                    final int f = this.f + min;
                    this.f = f;
                    final int j = this.j;
                    if (f != j) {
                        continue;
                    }
                    final long k = this.k;
                    if (k != -9223372036854775807L) {
                        this.d.e(k, 1, j, 0, (buc)null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
                else {
                    final byte[] a = this.a.a;
                    final int min2 = Math.min(bas.a(), 128 - this.f);
                    bas.B(a, this.f, min2);
                    if ((this.f += min2) != 128) {
                        continue;
                    }
                    this.l.m(0);
                    final atim l = this.l;
                    final int[] a2 = bss.a;
                    final int f2 = l.f();
                    l.o(40);
                    final int g = l.g(5);
                    l.m(f2);
                    int n = -1;
                    String m;
                    int n10;
                    int j2;
                    int y;
                    int x;
                    if (g > 10) {
                        l.o(16);
                        final int g2 = l.g(2);
                        if (g2 != 0) {
                            if (g2 != 1) {
                                if (g2 == 2) {
                                    n = 2;
                                }
                            }
                            else {
                                n = 1;
                            }
                        }
                        else {
                            n = 0;
                        }
                        l.o(3);
                        final int n2 = l.g(11) + 1;
                        final int g3 = l.g(2);
                        int n3;
                        int n4;
                        int g4;
                        if (g3 == 3) {
                            n3 = bss.c[l.g(2)];
                            n4 = 6;
                            g4 = 3;
                        }
                        else {
                            g4 = l.g(2);
                            n4 = bss.a[g4];
                            n3 = bss.b[g3];
                        }
                        int g5 = l.g(3);
                        final int q = l.q() ? 1 : 0;
                        final int n5 = bss.d[g5] + q;
                        l.o(10);
                        if (l.q()) {
                            l.o(8);
                        }
                        int n6;
                        if (g5 == 0) {
                            l.o(5);
                            if (l.q()) {
                                l.o(8);
                            }
                            n6 = 0;
                            g5 = 0;
                        }
                        else {
                            n6 = g5;
                        }
                        int n7 = n;
                        if (n == 1) {
                            if (l.q()) {
                                l.o(16);
                            }
                            n7 = 1;
                        }
                        int n8 = 0;
                        Label_0957: {
                            if (l.q()) {
                                if (n6 > 2) {
                                    l.o(2);
                                }
                                if ((n6 & 0x1) != 0x0 && n6 > 2) {
                                    l.o(6);
                                }
                                if ((n6 & 0x4) != 0x0) {
                                    l.o(6);
                                }
                                if (q != 0 && l.q()) {
                                    l.o(5);
                                }
                                if (n7 == 0) {
                                    if (l.q()) {
                                        l.o(6);
                                    }
                                    if (n6 == 0 && l.q()) {
                                        l.o(6);
                                    }
                                    if (l.q()) {
                                        l.o(6);
                                    }
                                    final int g6 = l.g(2);
                                    if (g6 == 1) {
                                        l.o(5);
                                    }
                                    else if (g6 == 2) {
                                        l.o(12);
                                    }
                                    else if (g6 == 3) {
                                        final int g7 = l.g(5);
                                        if (l.q()) {
                                            l.o(5);
                                            if (l.q()) {
                                                l.o(4);
                                            }
                                            if (l.q()) {
                                                l.o(4);
                                            }
                                            if (l.q()) {
                                                l.o(4);
                                            }
                                            if (l.q()) {
                                                l.o(4);
                                            }
                                            if (l.q()) {
                                                l.o(4);
                                            }
                                            if (l.q()) {
                                                l.o(4);
                                            }
                                            if (l.q()) {
                                                l.o(4);
                                            }
                                            if (l.q()) {
                                                if (l.q()) {
                                                    l.o(4);
                                                }
                                                if (l.q()) {
                                                    l.o(4);
                                                }
                                            }
                                        }
                                        if (l.q()) {
                                            l.o(5);
                                            if (l.q()) {
                                                l.o(7);
                                                if (l.q()) {
                                                    l.o(8);
                                                }
                                            }
                                        }
                                        l.o((g7 + 2) * 8);
                                        l.j();
                                    }
                                    if (n6 < 2) {
                                        if (l.q()) {
                                            l.o(14);
                                        }
                                        if (g5 == 0 && l.q()) {
                                            l.o(14);
                                        }
                                    }
                                    if (l.q()) {
                                        if (g4 == 0) {
                                            l.o(5);
                                            n7 = 0;
                                            n8 = 0;
                                            break Label_0957;
                                        }
                                        for (int i = 0; i < n4; ++i) {
                                            if (l.q()) {
                                                l.o(5);
                                            }
                                        }
                                    }
                                    n8 = g4;
                                    n7 = 0;
                                    break Label_0957;
                                }
                            }
                            n8 = g4;
                        }
                        if (l.q()) {
                            l.o(5);
                            int n9;
                            if ((n9 = n6) == 2) {
                                l.o(4);
                                n9 = 2;
                            }
                            if (n9 >= 6) {
                                l.o(2);
                            }
                            if (l.q()) {
                                l.o(8);
                            }
                            if (n9 == 0 && l.q()) {
                                l.o(8);
                            }
                            if (g3 < 3) {
                                l.n();
                            }
                        }
                        if (n7 == 0 && n8 != 3) {
                            l.n();
                        }
                        if (n7 == 2 && (n8 == 3 || l.q())) {
                            l.o(6);
                        }
                        if (l.q() && l.g(6) == 1 && l.g(8) == 1) {
                            m = "audio/eac3-joc";
                        }
                        else {
                            m = "audio/eac3";
                        }
                        n10 = n4 * 256;
                        j2 = n2 + n2;
                        y = n3;
                        x = n5;
                    }
                    else {
                        l.o(32);
                        final int g8 = l.g(2);
                        if (g8 == 3) {
                            m = null;
                        }
                        else {
                            m = "audio/ac3";
                        }
                        final int a3 = bss.a(g8, l.g(6));
                        l.o(8);
                        final int g9 = l.g(3);
                        if ((g9 & 0x1) != 0x0 && g9 != 1) {
                            l.o(2);
                        }
                        if ((g9 & 0x4) != 0x0) {
                            l.o(2);
                        }
                        if (g9 == 2) {
                            l.o(2);
                        }
                        if (g8 < 3) {
                            n = bss.b[g8];
                        }
                        x = bss.d[g9] + (l.q() ? 1 : 0);
                        n10 = 1536;
                        y = n;
                        j2 = a3;
                    }
                    final ayg i2 = this.i;
                    if (i2 == null || x != i2.A || y != i2.B || !bax.aa((Object)m, (Object)i2.n)) {
                        final ayf ayf = new ayf();
                        ayf.a = this.c;
                        ayf.k = m;
                        ayf.x = x;
                        ayf.y = y;
                        ayf.c = this.b;
                        final ayg a4 = ayf.a();
                        this.i = a4;
                        this.d.b(a4);
                    }
                    this.j = j2;
                    this.h = n10 * 1000000L / this.i.B;
                    this.a.G(0);
                    this.d.c(this.a, 128);
                    this.e = 2;
                }
            }
            else {
                while (bas.a() > 0) {
                    if (!this.g) {
                        this.g = (bas.i() == 11);
                    }
                    else {
                        final int i3 = bas.i();
                        if (i3 == 119) {
                            this.g = false;
                            this.e = 1;
                            final byte[] a5 = this.a.a;
                            a5[0] = 11;
                            a5[1] = 119;
                            this.f = 2;
                            break;
                        }
                        this.g = (i3 == 11);
                    }
                }
            }
        }
    }
    
    public final void b(final btm btm, final cao cao) {
        cao.c();
        this.c = cao.b();
        this.d = btm.q(cao.a(), 1);
    }
    
    public final void c() {
    }
    
    public final void d(final long k, final int n) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
    
    public final void e() {
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.k = -9223372036854775807L;
    }
}
