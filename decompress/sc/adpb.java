import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpb implements adpl
{
    public final aekp a;
    private final adpx b;
    private final adpq c;
    private final adpc d;
    private final adoi e;
    private final adoc f;
    private final adqa g;
    private final adoa h;
    private final adoy i;
    private final adod j;
    private final adpi k;
    private final adov l;
    private final adnx m;
    private final adoj n;
    private final adom o;
    private final int p;
    
    public adpb(final adpx b, final adpq c, final adpc d, final adoi e, final adoc f, final adqa g, final adoa h, final adoy i, final adod j, final adpi k, final adov l, final adnx m, final adoj n, final adom o, final aekp a, final int p18, final byte[] array, final byte[] array2) {
        this.p = p18;
        this.b = b;
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
        this.n = n;
        this.o = o;
        this.a = a;
    }
    
    public final adpz a(final admv admv) {
        if (this.p != 0) {
            adpz adpz;
            if (admv.w && !admv.A) {
                adpz = this.b.c(admv.k, this.c, (adps)this.d).a((adps)this.e);
            }
            else {
                adpz = this.b.c(admv.k, this.c, (adps)this.e);
            }
            adpz a = adpz;
            if (admv.D) {
                a = adpz.a((adps)this.h);
            }
            final adpz a2 = a.a((adps)this.f);
            final adpz a3 = this.b.a((Iterable)Arrays.asList(a2.a((adps)this.i).a((adps)this.m), a2.a((adps)this.g).a((adps)this.j).a((adps)this.l)), (adps)this.k);
            adpz adpz2;
            if (admv.z) {
                adpz2 = a3.a((adps)this.n).a((adps)this.o);
            }
            else {
                adpz2 = a3.a((adps)this.o);
            }
            adpz2.b((Runnable)new adme(this, 2, (byte[])null));
            return adpz2;
        }
        adpz adpz3;
        if (admv.w && !admv.A) {
            adpz3 = this.b.c(admv.k, this.c, (adps)this.d).a((adps)this.e);
        }
        else {
            adpz3 = this.b.c(admv.k, this.c, (adps)this.e);
        }
        adpz a4 = adpz3;
        if (admv.D) {
            a4 = adpz3.a((adps)this.h);
        }
        final adpz a5 = a4.a((adps)this.f);
        final adpz a6 = this.b.a((Iterable)Arrays.asList(a5.a((adps)this.i).a((adps)this.m), a5.a((adps)this.g).a((adps)this.j).a((adps)this.l)), (adps)this.k);
        adpz adpz4;
        if (admv.z) {
            adpz4 = a6.a((adps)this.n).a((adps)this.o);
        }
        else {
            adpz4 = a6.a((adps)this.o);
        }
        adpz4.b((Runnable)new adme(this, 4));
        return adpz4;
    }
}
