// 
// Decompiled by Procyon v0.6.0
// 

public final class cah implements cas
{
    private final bzs a;
    private int b;
    private int c;
    private bay d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private boolean j;
    private final atlj k;
    
    public cah(final bzs a) {
        this.a = a;
        this.k = new atlj(new byte[10], null);
        this.b = 0;
    }
    
    private final void d(final int b) {
        this.b = b;
        this.c = 0;
    }
    
    private final boolean e(final bat bat, final byte[] array, final int n) {
        final int min = Math.min(bat.a(), n - this.c);
        if (min <= 0) {
            return true;
        }
        if (array == null) {
            bat.H(min);
        }
        else {
            bat.B(array, this.c, min);
        }
        final int c = this.c + min;
        this.c = c;
        return c == n;
    }
    
    @Override
    public final void a(final bat bat, int g) {
        bad.c(this.d);
        int n = -1;
        final int n2 = 1;
        if ((g & 0x1) != 0x0) {
            final int b = this.b;
            if (b != 0 && b != 1) {
                if (b != 2) {
                    final int i = this.i;
                    if (i != -1) {
                        final StringBuilder sb = new StringBuilder("Unexpected start indicator: expected ");
                        sb.append(i);
                        sb.append(" more bytes");
                        baq.c("PesReader", sb.toString());
                    }
                    this.a.c();
                }
                else {
                    baq.c("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.d(1);
        }
        int n3 = g;
        g = n2;
        while (bat.a() > 0) {
            final int b2 = this.b;
            if (b2 != 0) {
                int n4 = 0;
                int n6;
                int n7;
                if (b2 != g) {
                    if (b2 != 2) {
                        final int a = bat.a();
                        final int j = this.i;
                        if (j != n) {
                            n4 = a - j;
                        }
                        int n5 = a;
                        if (n4 > 0) {
                            n5 = a - n4;
                            bat.F(bat.b + n5);
                        }
                        this.a.a(bat);
                        final int k = this.i;
                        n6 = n;
                        n7 = g;
                        if (k != n) {
                            final int l = k - n5;
                            this.i = l;
                            n6 = n;
                            n7 = g;
                            if (l == 0) {
                                this.a.c();
                                this.d(g);
                                n6 = n;
                                n7 = g;
                            }
                        }
                    }
                    else {
                        final int min = Math.min(10, this.h);
                        n6 = n;
                        n7 = g;
                        if (this.e(bat, (byte[])this.k.d, min)) {
                            n6 = n;
                            n7 = g;
                            if (this.e(bat, null, this.h)) {
                                this.k.m(0);
                                long b3;
                                if (this.e) {
                                    this.k.o(4);
                                    final long n8 = this.k.g(3);
                                    this.k.o(g);
                                    final int n9 = this.k.g(15) << 15;
                                    this.k.o(g);
                                    final long n10 = this.k.g(15);
                                    this.k.o(g);
                                    if (!this.g && this.f) {
                                        this.k.o(4);
                                        final long n11 = this.k.g(3);
                                        this.k.o(g);
                                        final int g2 = this.k.g(15);
                                        this.k.o(g);
                                        final long n12 = this.k.g(15);
                                        this.k.o(g);
                                        this.d.b(n11 << 30 | (long)(g2 << 15) | n12);
                                        this.g = true;
                                    }
                                    b3 = this.d.b(n8 << 30 | (long)n9 | n10);
                                }
                                else {
                                    b3 = -9223372036854775807L;
                                }
                                if (!this.j) {
                                    g = 0;
                                }
                                else {
                                    g = 4;
                                }
                                n3 |= g;
                                this.a.d(b3, n3);
                                this.d(3);
                                n = -1;
                                g = 1;
                                continue;
                            }
                        }
                    }
                }
                else {
                    if (this.e(bat, (byte[])this.k.d, 9)) {
                        final atlj m = this.k;
                        g = 0;
                        m.m(0);
                        final int g3 = this.k.g(24);
                        final int n13 = 1;
                        if (g3 != 1) {
                            final StringBuilder sb2 = new StringBuilder("Unexpected start code prefix: ");
                            sb2.append(g3);
                            baq.c("PesReader", sb2.toString());
                            this.i = -1;
                        }
                        else {
                            this.k.o(8);
                            g = this.k.g(16);
                            this.k.o(5);
                            this.j = this.k.q();
                            this.k.o(2);
                            this.e = this.k.q();
                            this.f = this.k.q();
                            this.k.o(6);
                            final int g4 = this.k.g(8);
                            this.h = g4;
                            if (g == 0) {
                                this.i = -1;
                            }
                            else {
                                g = g - 3 - g4;
                                if ((this.i = g) < 0) {
                                    final StringBuilder sb3 = new StringBuilder("Found negative packet payload size: ");
                                    sb3.append(g);
                                    baq.c("PesReader", sb3.toString());
                                    this.i = -1;
                                }
                            }
                            g = 2;
                        }
                        n = -1;
                        this.d(g);
                        g = n13;
                        continue;
                    }
                    n6 = -1;
                    n7 = 1;
                }
                n = n6;
                g = n7;
            }
            else {
                bat.H(bat.a());
            }
        }
    }
    
    @Override
    public final void b(final bay d, final btp btp, final car car) {
        this.d = d;
        this.a.b(btp, car);
    }
    
    @Override
    public final void c() {
        this.b = 0;
        this.c = 0;
        this.g = false;
        this.a.e();
    }
}
