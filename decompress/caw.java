import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class caw implements btm
{
    private btp a;
    private bug b;
    private int c;
    private long d;
    private cau e;
    private int f;
    private long g;
    
    public caw() {
        this.c = 0;
        this.d = -1L;
        this.f = -1;
        this.g = -1L;
    }
    
    public final void d(final btp a) {
        this.a = a;
        this.b = a.q(0, 1);
        a.r();
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        int c;
        if (n == 0L) {
            c = 0;
        }
        else {
            c = 4;
        }
        this.c = c;
        final cau e = this.e;
        if (e != null) {
            e.b(n2);
        }
    }
    
    public final boolean g(final btn btn) {
        return cba.b(btn);
    }
    
    public final int h(final btn btn, final pbg pbg) {
        bad.c(this.b);
        final int a = baz.a;
        final int c = this.c;
        boolean b = true;
        if (c == 0) {
            final btg btg = (btg)btn;
            bad.f(btg.c == 0L);
            final int f = this.f;
            if (f != -1) {
                btn.m(f);
                this.c = 4;
            }
            else {
                if (!cba.b(btn)) {
                    throw azb.a("Unsupported or unrecognized wav file type.", null);
                }
                btn.m((int)(btn.e() - btg.c));
                this.c = 1;
            }
            return 0;
        }
        long n = -1L;
        if (c == 1) {
            final bat bat = new bat(8);
            final yrd e = yrd.e(btn, bat);
            if (e.b != 1685272116) {
                btn.l();
            }
            else {
                btn.g(8);
                bat.G(0);
                btn.j(bat.a, 0, 8);
                n = bat.n();
                btn.m((int)e.a + 8);
            }
            this.d = n;
            this.c = 2;
            return 0;
        }
        if (c == 2) {
            final bat bat2 = new bat(16);
            final yrd e2 = cba.e(1718449184, btn, bat2);
            bad.f(e2.a >= 16L);
            btn.j(bat2.a, 0, 16);
            bat2.G(0);
            final int g = bat2.g();
            final int g2 = bat2.g();
            final int f2 = bat2.f();
            bat2.f();
            final int g3 = bat2.g();
            final int g4 = bat2.g();
            final int n2 = (int)e2.a - 16;
            byte[] e3;
            if (n2 > 0) {
                e3 = new byte[n2];
                btn.j(e3, 0, n2);
            }
            else {
                e3 = baz.e;
            }
            btn.m((int)(btn.e() - ((btg)btn).c));
            final cax cax = new cax(g, g2, f2, g3, g4, e3);
            final int a2 = cax.a;
            if (a2 == 17) {
                this.e = new cat(this.a, this.b, cax);
            }
            else if (a2 == 6) {
                this.e = new cav(this.a, this.b, cax, "audio/g711-alaw", -1);
            }
            else if (a2 == 7) {
                this.e = new cav(this.a, this.b, cax, "audio/g711-mlaw", -1);
            }
            else {
                final int e4 = cax.e;
                int l = 0;
                Label_0662: {
                    Label_0657: {
                        if (a2 != 1) {
                            if (a2 != 3) {
                                if (a2 == 65534) {
                                    break Label_0657;
                                }
                            }
                            else if (e4 == 32) {
                                l = 4;
                                break Label_0662;
                            }
                            l = 0;
                            break Label_0662;
                        }
                    }
                    l = baz.l(e4);
                }
                if (l == 0) {
                    final StringBuilder sb = new StringBuilder("Unsupported WAV format type: ");
                    sb.append(a2);
                    throw azb.d(sb.toString());
                }
                this.e = new cav(this.a, this.b, cax, "audio/raw", l);
            }
            this.c = 3;
            return 0;
        }
        if (c == 3) {
            btn.l();
            final yrd e5 = cba.e(1684108385, btn, new bat(8));
            btn.m(8);
            final btg btg2 = (btg)btn;
            final Pair create = Pair.create((Object)btg2.c, (Object)e5.a);
            this.f = ((Long)create.first).intValue();
            final long longValue = (long)create.second;
            final long d = this.d;
            long n3 = longValue;
            if (d != -1L) {
                n3 = longValue;
                if (longValue == 4294967295L) {
                    n3 = d;
                }
            }
            final long g5 = this.f + n3;
            this.g = g5;
            final long b2 = btg2.b;
            if (b2 != -1L && g5 > b2) {
                final StringBuilder sb2 = new StringBuilder("Data exceeds input length: ");
                sb2.append(g5);
                sb2.append(", ");
                sb2.append(b2);
                baq.c("WavExtractor", sb2.toString());
                this.g = b2;
            }
            final cau e6 = this.e;
            bad.b(e6);
            e6.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        if (this.g == -1L) {
            b = false;
        }
        bad.f(b);
        final long g6 = this.g;
        final long c2 = ((btg)btn).c;
        final cau e7 = this.e;
        bad.b(e7);
        if (e7.c(btn, g6 - c2)) {
            return -1;
        }
        return 0;
    }
}
