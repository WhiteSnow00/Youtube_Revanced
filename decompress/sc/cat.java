import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cat implements btj
{
    private btm a;
    private bud b;
    private int c;
    private long d;
    private car e;
    private int f;
    private long g;
    
    public cat() {
        this.c = 0;
        this.d = -1L;
        this.f = -1;
        this.g = -1L;
    }
    
    public final void d(final btm a) {
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
        final car e = this.e;
        if (e != null) {
            e.b(n2);
        }
    }
    
    public final boolean g(final btk btk) {
        return bhu.c(btk);
    }
    
    public final int h(final btk btk, final paq paq) {
        dk.e((Object)this.b);
        final int a = bax.a;
        final int c = this.c;
        boolean b = true;
        if (c == 0) {
            final btd btd = (btd)btk;
            dk.h(btd.c == 0L);
            final int f = this.f;
            if (f != -1) {
                btk.m(f);
                this.c = 4;
            }
            else {
                if (!bhu.c(btk)) {
                    throw aza.a("Unsupported or unrecognized wav file type.", (Throwable)null);
                }
                btk.m((int)(btk.e() - btd.c));
                this.c = 1;
            }
            return 0;
        }
        long n = -1L;
        if (c == 1) {
            final bas bas = new bas(8);
            final ypi e = ypi.e(btk, bas);
            if (e.b != 1685272116) {
                btk.l();
            }
            else {
                btk.g(8);
                bas.G(0);
                btk.j(bas.a, 0, 8);
                n = bas.n();
                btk.m((int)e.a + 8);
            }
            this.d = n;
            this.c = 2;
            return 0;
        }
        if (c == 2) {
            final bas bas2 = new bas(16);
            final ypi f2 = bhu.f(1718449184, btk, bas2);
            dk.h(f2.a >= 16L);
            btk.j(bas2.a, 0, 16);
            bas2.G(0);
            final int g = bas2.g();
            final int g2 = bas2.g();
            final int f3 = bas2.f();
            bas2.f();
            final int g3 = bas2.g();
            final int g4 = bas2.g();
            final int n2 = (int)f2.a - 16;
            byte[] e2;
            if (n2 > 0) {
                e2 = new byte[n2];
                btk.j(e2, 0, n2);
            }
            else {
                e2 = bax.e;
            }
            btk.m((int)(btk.e() - ((btd)btk).c));
            final cau cau = new cau(g, g2, f3, g3, g4, e2);
            final int a2 = cau.a;
            if (a2 == 17) {
                this.e = (car)new caq(this.a, this.b, cau);
            }
            else if (a2 == 6) {
                this.e = (car)new cas(this.a, this.b, cau, "audio/g711-alaw", -1);
            }
            else if (a2 == 7) {
                this.e = (car)new cas(this.a, this.b, cau, "audio/g711-mlaw", -1);
            }
            else {
                final int e3 = cau.e;
                int l = 0;
                Label_0669: {
                    Label_0664: {
                        if (a2 != 1) {
                            if (a2 != 3) {
                                if (a2 == 65534) {
                                    break Label_0664;
                                }
                            }
                            else if (e3 == 32) {
                                l = 4;
                                break Label_0669;
                            }
                            l = 0;
                            break Label_0669;
                        }
                    }
                    l = bax.l(e3);
                }
                if (l == 0) {
                    final StringBuilder sb = new StringBuilder("Unsupported WAV format type: ");
                    sb.append(a2);
                    throw aza.d(sb.toString());
                }
                this.e = (car)new cas(this.a, this.b, cau, "audio/raw", l);
            }
            this.c = 3;
            return 0;
        }
        if (c == 3) {
            btk.l();
            final ypi f4 = bhu.f(1684108385, btk, new bas(8));
            btk.m(8);
            final btd btd2 = (btd)btk;
            final Pair create = Pair.create((Object)btd2.c, (Object)f4.a);
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
            final long b2 = btd2.b;
            if (b2 != -1L && g5 > b2) {
                final StringBuilder sb2 = new StringBuilder("Data exceeds input length: ");
                sb2.append(g5);
                sb2.append(", ");
                sb2.append(b2);
                bap.c("WavExtractor", sb2.toString());
                this.g = b2;
            }
            final car e4 = this.e;
            dk.d((Object)e4);
            e4.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        if (this.g == -1L) {
            b = false;
        }
        dk.h(b);
        final long g6 = this.g;
        final long c2 = ((btd)btk).c;
        final car e5 = this.e;
        dk.d((Object)e5);
        if (e5.c(btk, g6 - c2)) {
            return -1;
        }
        return 0;
    }
}
