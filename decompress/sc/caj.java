// 
// Decompiled by Procyon v0.6.0
// 

public final class caj implements bta
{
    private final baw a;
    private final bas b;
    private final int c;
    
    public caj(final int c, final baw a) {
        this.c = c;
        this.a = a;
        this.b = new bas();
    }
    
    public final bsz a(final btk btk, long n) {
        final btd btd = (btd)btk;
        final long c = btd.c;
        final int n2 = (int)Math.min(112800L, btd.b - c);
        this.b.C(n2);
        btk.j(this.b.a, 0, n2);
        final bas b = this.b;
        final int c2 = b.c;
        long n3 = -1L;
        long n4 = -9223372036854775807L;
        long n5 = -1L;
        while (b.a() >= 188) {
            final int d = bhu.d(b.a, b.b, c2);
            final int n6 = d + 188;
            if (n6 > c2) {
                break;
            }
            final long e = bhu.e(b, d, this.c);
            long n7 = n5;
            long b2 = n4;
            Label_0231: {
                if (e != -9223372036854775807L) {
                    b2 = this.a.b(e);
                    if (b2 > n) {
                        if (n4 == -9223372036854775807L) {
                            return bsz.a(b2, c);
                        }
                        n = c + n5;
                    }
                    else {
                        if (100000L + b2 <= n) {
                            n7 = d;
                            break Label_0231;
                        }
                        n = c + d;
                    }
                    return bsz.b(n);
                }
            }
            b.G(n6);
            n3 = n6;
            n5 = n7;
            n4 = b2;
        }
        if (n4 != -9223372036854775807L) {
            return bsz.c(n4, c + n3);
        }
        return bsz.a;
    }
    
    public final void b() {
        this.b.D(bax.e);
    }
}
