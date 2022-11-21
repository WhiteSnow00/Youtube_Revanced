// 
// Decompiled by Procyon v0.6.0
// 

public final class bzl implements bzs
{
    private final bat a;
    private final String b;
    private String c;
    private bug d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private ayh i;
    private int j;
    private long k;
    private final atlj l;
    
    public bzl() {
        this(null);
    }
    
    public bzl(final String b) {
        final atlj l = new atlj(new byte[128], null);
        this.l = l;
        this.a = new bat((byte[])l.d);
        this.e = 0;
        this.k = -9223372036854775807L;
        this.b = b;
    }
    
    public final void a(final bat bat) {
        bad.c(this.d);
        while (bat.a() > 0) {
            final int e = this.e;
            if (e != 0) {
                if (e != 1) {
                    final int min = Math.min(bat.a(), this.j - this.f);
                    this.d.c(bat, min);
                    final int f = this.f + min;
                    this.f = f;
                    final int j = this.j;
                    if (f != j) {
                        continue;
                    }
                    final long k = this.k;
                    if (k != -9223372036854775807L) {
                        this.d.e(k, 1, j, 0, (buf)null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
                else {
                    final byte[] a = this.a.a;
                    final int min2 = Math.min(bat.a(), 128 - this.f);
                    bat.B(a, this.f, min2);
                    if ((this.f += min2) != 128) {
                        continue;
                    }
                    this.l.m(0);
                    final atlj l = this.l;
                    final int[] a2 = bsv.a;
                    final int f2 = l.f();
                    l.o(40);
                    final int g = l.g(5);
                    l.m(f2);
                    int y = -1;
                    String m;
                    int n9;
                    int a3;
                    int x;
                    if (g > 10) {
                        l.o(16);
                        final int g2 = l.g(2);
                        if (g2 != 0) {
                            if (g2 != 1) {
                                if (g2 == 2) {
                                    y = 2;
                                }
                            }
                            else {
                                y = 1;
                            }
                        }
                        else {
                            y = 0;
                        }
                        l.o(3);
                        final int n = l.g(11) + 1;
                        final int g3 = l.g(2);
                        int n2;
                        int n3;
                        int g4;
                        if (g3 == 3) {
                            n2 = bsv.c[l.g(2)];
                            n3 = 6;
                            g4 = 3;
                        }
                        else {
                            g4 = l.g(2);
                            n3 = bsv.a[g4];
                            n2 = bsv.b[g3];
                        }
                        int g5 = l.g(3);
                        final int q = l.q() ? 1 : 0;
                        final int n4 = bsv.d[g5] + q;
                        l.o(10);
                        if (l.q()) {
                            l.o(8);
                        }
                        int n5;
                        if (g5 == 0) {
                            l.o(5);
                            if (l.q()) {
                                l.o(8);
                            }
                            n5 = 0;
                            g5 = 0;
                        }
                        else {
                            n5 = g5;
                        }
                        int n6 = y;
                        if (y == 1) {
                            if (l.q()) {
                                l.o(16);
                            }
                            n6 = 1;
                        }
                        int n7 = 0;
                        Label_0957: {
                            if (l.q()) {
                                if (n5 > 2) {
                                    l.o(2);
                                }
                                if ((n5 & 0x1) != 0x0 && n5 > 2) {
                                    l.o(6);
                                }
                                if ((n5 & 0x4) != 0x0) {
                                    l.o(6);
                                }
                                if (q != 0 && l.q()) {
                                    l.o(5);
                                }
                                if (n6 == 0) {
                                    if (l.q()) {
                                        l.o(6);
                                    }
                                    if (n5 == 0 && l.q()) {
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
                                    if (n5 < 2) {
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
                                            n6 = 0;
                                            n7 = 0;
                                            break Label_0957;
                                        }
                                        for (int i = 0; i < n3; ++i) {
                                            if (l.q()) {
                                                l.o(5);
                                            }
                                        }
                                    }
                                    n7 = g4;
                                    n6 = 0;
                                    break Label_0957;
                                }
                            }
                            n7 = g4;
                        }
                        if (l.q()) {
                            l.o(5);
                            int n8;
                            if ((n8 = n5) == 2) {
                                l.o(4);
                                n8 = 2;
                            }
                            if (n8 >= 6) {
                                l.o(2);
                            }
                            if (l.q()) {
                                l.o(8);
                            }
                            if (n8 == 0 && l.q()) {
                                l.o(8);
                            }
                            if (g3 < 3) {
                                l.n();
                            }
                        }
                        if (n6 == 0 && n7 != 3) {
                            l.n();
                        }
                        if (n6 == 2 && (n7 == 3 || l.q())) {
                            l.o(6);
                        }
                        if (l.q() && l.g(6) == 1 && l.g(8) == 1) {
                            m = "audio/eac3-joc";
                        }
                        else {
                            m = "audio/eac3";
                        }
                        n9 = n3 * 256;
                        a3 = n + n;
                        y = n2;
                        x = n4;
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
                        a3 = bsv.a(g8, l.g(6));
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
                            y = bsv.b[g8];
                        }
                        x = bsv.d[g9] + (l.q() ? 1 : 0);
                        n9 = 1536;
                    }
                    final ayh i2 = this.i;
                    if (i2 == null || x != i2.A || y != i2.B || !baz.aa(m, i2.n)) {
                        final ayg ayg = new ayg();
                        ayg.a = this.c;
                        ayg.k = m;
                        ayg.x = x;
                        ayg.y = y;
                        ayg.c = this.b;
                        final ayh a4 = ayg.a();
                        this.i = a4;
                        this.d.b(a4);
                    }
                    this.j = a3;
                    this.h = n9 * 1000000L / this.i.B;
                    this.a.G(0);
                    this.d.c(this.a, 128);
                    this.e = 2;
                }
            }
            else {
                while (bat.a() > 0) {
                    if (!this.g) {
                        this.g = (bat.i() == 11);
                    }
                    else {
                        final int i3 = bat.i();
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
    
    public final void b(final btp btp, final car car) {
        car.c();
        this.c = car.b();
        this.d = btp.q(car.a(), 1);
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
