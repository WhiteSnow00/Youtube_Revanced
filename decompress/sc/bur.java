// 
// Decompiled by Procyon v0.6.0
// 

public final class bur implements bta
{
    private final btp a;
    private final int b;
    private final paq c;
    
    public bur(final btp a, final int b) {
        this.a = a;
        this.b = b;
        this.c = new paq((char[])null, (byte[])null);
    }
    
    private final long c(final btk btk) {
        btd btd;
        while (true) {
            final long e = btk.e();
            btd = (btd)btk;
            if (e >= btd.b - 6L) {
                break;
            }
            final btp a = this.a;
            final int b = this.b;
            final paq c = this.c;
            final long e2 = btk.e();
            final byte[] array = new byte[2];
            btk.j(array, 0, 2);
            if (((array[0] & 0xFF) << 8 | (array[1] & 0xFF)) != b) {
                btk.l();
                btk.g((int)(e2 - btd.c));
            }
            else {
                final bas bas = new bas(16);
                System.arraycopy(array, 0, bas.a, 0, 2);
                bas.F(bly.b(btk, bas.a, 2, 14));
                btk.l();
                btk.g((int)(e2 - btd.c));
                if (bma.j(bas, a, b, c)) {
                    break;
                }
            }
            btk.g(1);
        }
        final long e3 = btk.e();
        final long b2 = btd.b;
        if (e3 >= -6L + b2) {
            btk.g((int)(b2 - btk.e()));
            return this.a.j;
        }
        return this.c.a;
    }
    
    public final bsz a(final btk btk, final long n) {
        final long c = ((btd)btk).c;
        final long c2 = this.c(btk);
        final long e = btk.e();
        btk.g(Math.max(6, this.a.c));
        final long c3 = this.c(btk);
        final long e2 = btk.e();
        if (c2 <= n && c3 > n) {
            return bsz.b(e);
        }
        if (c3 <= n) {
            return bsz.c(c3, e2);
        }
        return bsz.a(c2, c);
    }
    
    public final void b() {
    }
}
