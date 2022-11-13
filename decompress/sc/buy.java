// 
// Decompiled by Procyon v0.6.0
// 

final class buy extends bux
{
    private final bas a;
    private final bas b;
    private int c;
    private boolean e;
    private boolean f;
    private int g;
    
    public buy(final bud bud) {
        super(bud);
        this.a = new bas(btx.a);
        this.b = new bas(4);
    }
    
    protected final boolean a(final bas bas) {
        final int i = bas.i();
        final int g = i >> 4;
        final int n = i & 0xF;
        if (n == 7) {
            this.g = g;
            return g != 5;
        }
        final StringBuilder sb = new StringBuilder("Video format not supported: ");
        sb.append(n);
        throw new buw(sb.toString());
    }
    
    protected final boolean b(final bas bas, final long n) {
        final int i = bas.i();
        final byte[] a = bas.a;
        final int b = bas.b;
        final int b2 = b + 1;
        bas.b = b2;
        final byte b3 = a[b];
        final int b4 = b2 + 1;
        bas.b = b4;
        final byte b5 = a[b2];
        bas.b = b4 + 1;
        final byte b6 = a[b4];
        if (i == 0) {
            if (!this.e) {
                final bas bas2 = new bas(new byte[bas.a()]);
                bas.B(bas2.a, 0, bas.a());
                final bsu a2 = bsu.a(bas2);
                this.c = a2.b;
                final ayf ayf = new ayf();
                ayf.k = "video/avc";
                ayf.h = a2.f;
                ayf.p = a2.c;
                ayf.q = a2.d;
                ayf.t = a2.e;
                ayf.m = a2.a;
                this.d.b(ayf.a());
                this.e = true;
                return false;
            }
        }
        else if (i == 1 && this.e) {
            int n2;
            if (this.g == 1) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (!this.f && n2 == 0) {
                return false;
            }
            final byte[] a3 = this.b.a;
            a3[0] = 0;
            a3[2] = (a3[1] = 0);
            final int c = this.c;
            int n3 = 0;
            while (bas.a() > 0) {
                bas.B(this.b.a, 4 - c, this.c);
                this.b.G(0);
                final int l = this.b.l();
                this.a.G(0);
                this.d.c(this.a, 4);
                this.d.c(bas, l);
                n3 = n3 + 4 + l;
            }
            this.d.e(n + ((b3 & 0xFF) << 24 >> 8 | (b5 & 0xFF) << 8 | (b6 & 0xFF)) * 1000L, n2, n3, 0, (buc)null);
            return this.f = true;
        }
        return false;
    }
}
