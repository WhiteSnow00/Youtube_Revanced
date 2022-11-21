import android.util.Pair;
import java.util.Collections;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzu implements bzs
{
    private static final double[] a;
    private String b;
    private bug c;
    private final bat d;
    private final caf e;
    private final boolean[] f;
    private final bzt g;
    private long h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;
    private final eae q;
    
    static {
        a = new double[] { 23.976023976023978, 24.0, 25.0, 29.97002997002997, 30.0, 50.0, 59.94005994005994, 60.0 };
    }
    
    public bzu() {
        this(null, null, null, null);
    }
    
    public bzu(final eae q, final byte[] array, final byte[] array2, final byte[] array3) {
        this.q = q;
        this.f = new boolean[4];
        this.g = new bzt();
        bat d;
        if (q != null) {
            this.e = new caf(178);
            d = new bat();
        }
        else {
            d = null;
            this.e = null;
        }
        this.d = d;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
    
    public final void a(final bat bat) {
        bad.c(this.c);
        int b = bat.b;
        final int c = bat.c;
        final byte[] a = bat.a;
        this.h += bat.a();
        this.c.c(bat, bat.a());
        while (true) {
            final int a2 = bua.a(a, b, c, this.f);
            if (a2 == c) {
                break;
            }
            final byte[] a3 = bat.a;
            final int n = a2 + 3;
            final int n2 = a3[n] & 0xFF;
            final int n3 = a2 - b;
            int n18 = 0;
            Label_0712: {
                if (!this.j) {
                    if (n3 > 0) {
                        this.g.a(a, b, a2);
                    }
                    int n4;
                    if (n3 < 0) {
                        n4 = -n3;
                    }
                    else {
                        n4 = 0;
                    }
                    final bzt g = this.g;
                    if (g.b) {
                        final int n5 = g.c - n4;
                        g.c = n5;
                        if (g.d != 0 || n2 != 181) {
                            g.b = false;
                            final String b2 = this.b;
                            bad.b(b2);
                            final byte[] copy = Arrays.copyOf(g.e, g.c);
                            final byte b3 = copy[4];
                            final int n6 = copy[5] & 0xFF;
                            final byte b4 = copy[6];
                            final byte b5 = copy[7];
                            final int p = (b3 & 0xFF) << 4 | n6 >> 4;
                            final int n7 = (b5 & 0xF0) >> 4;
                            final int q = (n6 & 0xF) << 8 | (b4 & 0xFF);
                            float t = 0.0f;
                            Label_0433: {
                                int n8;
                                int n9;
                                if (n7 != 2) {
                                    if (n7 != 3) {
                                        if (n7 != 4) {
                                            t = 1.0f;
                                            break Label_0433;
                                        }
                                        n8 = q * 121;
                                        n9 = p * 100;
                                    }
                                    else {
                                        n8 = q * 16;
                                        n9 = p * 9;
                                    }
                                }
                                else {
                                    n8 = q * 4;
                                    n9 = p * 3;
                                }
                                t = n8 / (float)n9;
                            }
                            final ayg ayg = new ayg();
                            ayg.a = b2;
                            ayg.k = "video/mpeg2";
                            ayg.p = p;
                            ayg.q = q;
                            ayg.t = t;
                            ayg.m = Collections.singletonList(copy);
                            final ayh a4 = ayg.a();
                            final int n10 = (copy[7] & 0xF) - 1;
                            long n11 = 0L;
                            if (n10 >= 0) {
                                n11 = n11;
                                if (n10 < 8) {
                                    final double n12 = bzu.a[n10];
                                    final byte b6 = copy[g.d + 9];
                                    final int n13 = (b6 & 0x60) >> 5;
                                    final int n14 = b6 & 0x1F;
                                    double n15 = n12;
                                    if (n13 != n14) {
                                        final double n16 = n13;
                                        Double.isNaN(n16);
                                        final double n17 = n14 + 1;
                                        Double.isNaN(n17);
                                        n15 = n12 * ((n16 + 1.0) / n17);
                                    }
                                    n11 = (long)(1000000.0 / n15);
                                }
                            }
                            final Pair create = Pair.create((Object)a4, (Object)n11);
                            this.c.b((ayh)create.first);
                            this.k = (long)create.second;
                            this.j = true;
                            n18 = n2;
                            break Label_0712;
                        }
                        g.d = n5;
                        n18 = 181;
                    }
                    else if ((n18 = n2) == 179) {
                        g.b = true;
                        n18 = 179;
                    }
                    g.a(bzt.a, 0, 3);
                }
                else {
                    n18 = n2;
                }
            }
            final caf e = this.e;
            int n19 = n18;
            if (e != null) {
                int n20;
                if (n3 > 0) {
                    e.a(a, b, a2);
                    n20 = 0;
                }
                else {
                    n20 = -n3;
                }
                if (this.e.d(n20)) {
                    final caf e2 = this.e;
                    final int b7 = bua.b(e2.b, e2.c);
                    final bat d = this.d;
                    final int a5 = baz.a;
                    d.E(this.e.b, b7);
                    this.q.j(this.n, this.d);
                }
                if ((n19 = n18) == 178) {
                    if (bat.a[a2 + 2] == 1) {
                        this.e.c(178);
                    }
                    n19 = 178;
                }
            }
            if (n19 != 0 && n19 != 179) {
                if (n19 == 184) {
                    this.o = true;
                }
            }
            else {
                final int n21 = c - a2;
                if (this.p && this.j) {
                    final long n22 = this.n;
                    if (n22 != -9223372036854775807L) {
                        this.c.e(n22, (int)(this.o ? 1 : 0), (int)(this.h - this.m) - n21, n21, (buf)null);
                    }
                }
                if (!this.i || this.p) {
                    this.m = this.h - n21;
                    long l = this.l;
                    if (l == -9223372036854775807L) {
                        final long n23 = this.n;
                        if (n23 != -9223372036854775807L) {
                            l = n23 + this.k;
                        }
                        else {
                            l = -9223372036854775807L;
                        }
                    }
                    this.n = l;
                    this.o = false;
                    this.l = -9223372036854775807L;
                    this.i = true;
                }
                this.p = (n19 == 0);
            }
            b = n;
        }
        if (!this.j) {
            this.g.a(a, b, c);
        }
        final caf e3 = this.e;
        if (e3 != null) {
            e3.a(a, b, c);
        }
    }
    
    public final void b(final btp btp, final car car) {
        car.c();
        this.b = car.b();
        this.c = btp.q(car.a(), 2);
        final eae q = this.q;
        if (q != null) {
            q.k(btp, car);
        }
    }
    
    public final void c() {
    }
    
    public final void d(final long l, final int n) {
        this.l = l;
    }
    
    public final void e() {
        bua.d(this.f);
        final bzt g = this.g;
        g.b = false;
        g.c = 0;
        g.d = 0;
        final caf e = this.e;
        if (e != null) {
            e.b();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
}
