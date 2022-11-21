// 
// Decompiled by Procyon v0.6.0
// 

public final class cam implements btd
{
    private final bay a;
    private final bat b;
    private final int c;
    
    public cam(final int c, final bay a) {
        this.c = c;
        this.a = a;
        this.b = new bat();
    }
    
    public final btc a(final btn btn, long n) {
        final btg btg = (btg)btn;
        final long c = btg.c;
        final int n2 = (int)Math.min(112800L, btg.b - c);
        this.b.C(n2);
        btn.j(this.b.a, 0, n2);
        final bat b = this.b;
        final int c2 = b.c;
        long n3 = -1L;
        long n4 = -9223372036854775807L;
        long n5 = -1L;
        while (b.a() >= 188) {
            final int c3 = bhx.c(b.a, b.b, c2);
            final int n6 = c3 + 188;
            if (n6 > c2) {
                break;
            }
            final long d = bhx.d(b, c3, this.c);
            long n7 = n5;
            long b2 = n4;
            Label_0231: {
                if (d != -9223372036854775807L) {
                    b2 = this.a.b(d);
                    if (b2 > n) {
                        if (n4 == -9223372036854775807L) {
                            return btc.a(b2, c);
                        }
                        n = c + n5;
                    }
                    else {
                        if (100000L + b2 <= n) {
                            n7 = c3;
                            break Label_0231;
                        }
                        n = c + c3;
                    }
                    return btc.b(n);
                }
            }
            b.G(n6);
            n3 = n6;
            n5 = n7;
            n4 = b2;
        }
        if (n4 != -9223372036854775807L) {
            return btc.c(n4, c + n3);
        }
        return btc.a;
    }
    
    public final void b() {
        this.b.D(baz.e);
    }
}
