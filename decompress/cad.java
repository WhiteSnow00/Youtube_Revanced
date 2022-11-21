import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cad implements bzs
{
    private final String a;
    private final bat b;
    private bug c;
    private String d;
    private ayh e;
    private int f;
    private int g;
    private int h;
    private int i;
    private long j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private long p;
    private int q;
    private long r;
    private int s;
    private String t;
    private final atlj u;
    
    public cad(final String a) {
        this.a = a;
        final bat b = new bat(1024);
        this.b = b;
        this.u = new atlj(b.a, null);
        this.j = -9223372036854775807L;
    }
    
    private final int f(final atlj atlj) {
        final int d = atlj.d();
        final ikm b = bsu.b(atlj, true);
        this.t = (String)b.c;
        this.q = b.b;
        this.s = b.a;
        return d - atlj.d();
    }
    
    private static long g(final atlj atlj) {
        return atlj.g((atlj.g(2) + 1) * 8);
    }
    
    public final void a(final bat bat) {
        bad.c(this.c);
        while (bat.a() > 0) {
            final int f = this.f;
            if (f != 0) {
                if (f != 1) {
                    if (f != 2) {
                        final int min = Math.min(bat.a(), this.h - this.g);
                        bat.B((byte[])this.u.d, this.g, min);
                        if ((this.g += min) != this.h) {
                            continue;
                        }
                        this.u.m(0);
                        final atlj u = this.u;
                        Label_0781: {
                            if (!u.q()) {
                                this.k = true;
                                int g = u.g(1);
                                int g2;
                                if (g == 1) {
                                    g2 = u.g(1);
                                    g = 1;
                                }
                                else {
                                    g2 = 0;
                                }
                                this.l = g2;
                                if (g2 != 0) {
                                    throw azb.a(null, null);
                                }
                                int n;
                                if ((n = g) == 1) {
                                    g(u);
                                    n = 1;
                                }
                                if (!u.q()) {
                                    throw azb.a(null, null);
                                }
                                this.m = u.g(6);
                                final int g3 = u.g(4);
                                final int g4 = u.g(3);
                                if (g3 != 0 || g4 != 0) {
                                    throw azb.a(null, null);
                                }
                                if (n == 0) {
                                    final int f2 = u.f();
                                    final int f3 = this.f(u);
                                    u.m(f2);
                                    final byte[] array = new byte[(f3 + 7) / 8];
                                    u.r(array, f3);
                                    final ayg ayg = new ayg();
                                    ayg.a = this.d;
                                    ayg.k = "audio/mp4a-latm";
                                    ayg.h = this.t;
                                    ayg.x = this.s;
                                    ayg.y = this.q;
                                    ayg.m = Collections.singletonList(array);
                                    ayg.c = this.a;
                                    final ayh a = ayg.a();
                                    if (!a.equals((Object)this.e)) {
                                        this.e = a;
                                        this.r = 1024000000L / a.B;
                                        this.c.b(a);
                                    }
                                }
                                else {
                                    u.o((int)g(u) - this.f(u));
                                }
                                final int g5 = u.g(3);
                                if ((this.n = g5) != 0) {
                                    if (g5 != 1) {
                                        if (g5 != 3 && g5 != 4 && g5 != 5) {
                                            if (g5 != 6 && g5 != 7) {
                                                throw new IllegalStateException();
                                            }
                                            u.o(1);
                                        }
                                        else {
                                            u.o(6);
                                        }
                                    }
                                    else {
                                        u.o(9);
                                    }
                                }
                                else {
                                    u.o(8);
                                }
                                final boolean q = u.q();
                                this.o = q;
                                this.p = 0L;
                                if (q) {
                                    if (n != 1) {
                                        boolean q2;
                                        do {
                                            q2 = u.q();
                                            this.p = (this.p << 8) + u.g(8);
                                        } while (q2);
                                    }
                                    else {
                                        this.p = g(u);
                                    }
                                }
                                if (u.q()) {
                                    u.o(8);
                                }
                            }
                            else if (!this.k) {
                                break Label_0781;
                            }
                            if (this.l != 0) {
                                throw azb.a(null, null);
                            }
                            if (this.m != 0) {
                                throw azb.a(null, null);
                            }
                            if (this.n != 0) {
                                throw azb.a(null, null);
                            }
                            int n2 = 0;
                            int g6;
                            do {
                                g6 = u.g(8);
                                n2 += g6;
                            } while (g6 == 255);
                            final int f4 = u.f();
                            if ((f4 & 0x7) == 0x0) {
                                this.b.G(f4 >> 3);
                            }
                            else {
                                u.r(this.b.a, n2 * 8);
                                this.b.G(0);
                            }
                            this.c.c(this.b, n2);
                            final long j = this.j;
                            if (j != -9223372036854775807L) {
                                this.c.e(j, 1, n2, 0, (buf)null);
                                this.j += this.r;
                            }
                            if (this.o) {
                                u.o((int)this.p);
                            }
                        }
                        this.f = 0;
                    }
                    else {
                        final int h = (this.i & 0xFFFFFF1F) << 8 | bat.i();
                        this.h = h;
                        final bat b = this.b;
                        if (h > b.a.length) {
                            b.C(h);
                            this.u.k(this.b.a);
                        }
                        this.g = 0;
                        this.f = 3;
                    }
                }
                else {
                    final int i = bat.i();
                    if ((i & 0xE0) == 0xE0) {
                        this.i = i;
                        this.f = 2;
                    }
                    else {
                        if (i == 86) {
                            continue;
                        }
                        this.f = 0;
                    }
                }
            }
            else {
                if (bat.i() != 86) {
                    continue;
                }
                this.f = 1;
            }
        }
    }
    
    public final void b(final btp btp, final car car) {
        car.c();
        this.c = btp.q(car.a(), 1);
        this.d = car.b();
    }
    
    public final void c() {
    }
    
    public final void d(final long j, final int n) {
        if (j != -9223372036854775807L) {
            this.j = j;
        }
    }
    
    public final void e() {
        this.f = 0;
        this.j = -9223372036854775807L;
        this.k = false;
    }
}
