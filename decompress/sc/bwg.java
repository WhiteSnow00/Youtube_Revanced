// 
// Decompiled by Procyon v0.6.0
// 

final class bwg implements bwe
{
    private final int a;
    private final int b;
    private final bas c;
    
    public bwg(final bwa bwa, final ayg ayg) {
        final bas a = bwa.a;
        (this.c = a).G(12);
        int l;
        final int n = l = a.l();
        Label_0113: {
            if ("audio/raw".equals(ayg.n)) {
                final int m = bax.m(ayg.C, ayg.A);
                if (n != 0) {
                    l = n;
                    if (n % m == 0) {
                        break Label_0113;
                    }
                }
                final StringBuilder sb = new StringBuilder("Audio sample size mismatch. stsd sample size: ");
                sb.append(m);
                sb.append(", stsz sample size: ");
                sb.append(n);
                bap.c("AtomParsers", sb.toString());
                l = m;
            }
        }
        int a2;
        if ((a2 = l) == 0) {
            a2 = -1;
        }
        this.a = a2;
        this.b = a.l();
    }
    
    public final int a() {
        return this.a;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final int c() {
        int n;
        if ((n = this.a) == -1) {
            n = this.c.l();
        }
        return n;
    }
}
