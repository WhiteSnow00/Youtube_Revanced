import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ador implements adpl
{
    public final aekp a;
    private final adpx b;
    private final adoi c;
    private final adoc d;
    private final adoy e;
    private final ados f;
    private final adob g;
    private final adqa h;
    private final adoq i;
    private final adpi j;
    private final adnx k;
    private final adoj l;
    private final adom m;
    private final adpq n;
    
    public ador(final adpx b, final adpq n, final adoi c, final adoc d, final adoy e, final ados f, final adob g, final adqa h, final adoq i, final adpi j, final adnx k, final adoj l, final adom m, final aekp a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.n = n;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.a = a;
    }
    
    public final adpz a(final admv admv) {
        final adpz a = this.b.a((Iterable)Arrays.asList(this.b.c(admv.k, this.n, (adps)this.c), this.b.c(admv.k, this.n, (adps)this.f).a((adps)this.g)), (adps)this.d);
        final adpz a2 = this.b.a((Iterable)Arrays.asList(a.a((adps)this.h).a((adps)this.i), a.a((adps)this.e)), (adps)this.k).a((adps)this.j);
        adpz adpz;
        if (admv.z) {
            adpz = a2.a((adps)this.l).a((adps)this.m);
        }
        else {
            adpz = a2.a((adps)this.m);
        }
        adpz.b((Runnable)new adme(this, 3));
        return adpz;
    }
}
