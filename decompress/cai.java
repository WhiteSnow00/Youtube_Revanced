// 
// Decompiled by Procyon v0.6.0
// 

public final class cai implements btd
{
    private final bay a;
    private final bat b;
    
    public cai(final bay a) {
        this.a = a;
        this.b = new bat();
    }
    
    public final btc a(final btn btn, long n) {
        final btg btg = (btg)btn;
        final long c = btg.c;
        final int n2 = (int)Math.min(20000L, btg.b - c);
        this.b.C(n2);
        btn.j(this.b.a, 0, n2);
        final bat b = this.b;
        int b2 = -1;
        long n3 = -9223372036854775807L;
        int n4 = -1;
        while (b.a() >= 4) {
            if (egn.e(b.a, b.b) != 442) {
                b.H(1);
            }
            else {
                b.H(4);
                final long b3 = can.b(b);
                int b4 = n4;
                long b5 = n3;
                Label_0211: {
                    if (b3 != -9223372036854775807L) {
                        b5 = this.a.b(b3);
                        if (b5 > n) {
                            if (n3 == -9223372036854775807L) {
                                return btc.a(b5, c);
                            }
                            n = n4;
                        }
                        else {
                            if (100000L + b5 <= n) {
                                b4 = b.b;
                                break Label_0211;
                            }
                            n = b.b;
                        }
                        return btc.b(c + n);
                    }
                }
                final int c2 = b.c;
                Label_0441: {
                    if (b.a() < 10) {
                        b.G(c2);
                    }
                    else {
                        b.H(9);
                        final int n5 = b.i() & 0x7;
                        if (b.a() < n5) {
                            b.G(c2);
                        }
                        else {
                            b.H(n5);
                            if (b.a() < 4) {
                                b.G(c2);
                            }
                            else {
                                if (egn.e(b.a, b.b) == 443) {
                                    b.H(4);
                                    final int m = b.m();
                                    if (b.a() < m) {
                                        b.G(c2);
                                        break Label_0441;
                                    }
                                    b.H(m);
                                }
                                while (b.a() >= 4) {
                                    final int e = egn.e(b.a, b.b);
                                    if (e == 442 || e == 441 || e >>> 8 != 1) {
                                        break;
                                    }
                                    b.H(4);
                                    if (b.a() < 2) {
                                        b.G(c2);
                                        break;
                                    }
                                    b.G(Math.min(b.c, b.b + b.m()));
                                }
                            }
                        }
                    }
                }
                b2 = b.b;
                n4 = b4;
                n3 = b5;
            }
        }
        if (n3 != -9223372036854775807L) {
            return btc.c(n3, c + b2);
        }
        return btc.a;
    }
    
    public final void b() {
        this.b.D(baz.e);
    }
}
