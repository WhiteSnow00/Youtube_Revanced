import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adqq implements adqz
{
    public final aheu a;
    private final adrm b;
    private final adrf c;
    private final adqr d;
    private final adpx e;
    private final adpq f;
    private final adrq g;
    private final adpo h;
    private final adqn i;
    private final adpr j;
    private final adqw k;
    private final adqk l;
    private final adpk m;
    private final adpy n;
    private final adqb o;
    private final int p;
    
    public adqq(final adrm b, final adrf c, final adqr d, final adpx e, final adpq f, final adrq g, final adpo h, final adqn i, final adpr j, final adqw k, final adqk l, final adpk m, final adpy n, final adqb o, final aheu a, final int p19, final byte[] array, final byte[] array2, final byte[] array3) {
        this.p = p19;
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
    
    @Override
    public final adrp a(final adoj adoj) {
        if (this.p != 0) {
            adrp adrp;
            if (adoj.w && !adoj.A) {
                adrp = this.b.c(adoj.k, this.c, (adrh)this.d).a((adrh)this.e);
            }
            else {
                adrp = this.b.c(adoj.k, this.c, (adrh)this.e);
            }
            adrp a = adrp;
            if (adoj.D) {
                a = adrp.a((adrh)this.h);
            }
            final adrp a2 = a.a((adrh)this.f);
            final adrp a3 = this.b.a(Arrays.asList(a2.a((adrh)this.i).a((adrh)this.m), a2.a((adrh)this.g).a((adrh)this.j).a((adrh)this.l)), (adrh)this.k);
            adrp adrp2;
            if (adoj.z) {
                adrp2 = a3.a((adrh)this.n).a(this.o);
            }
            else {
                adrp2 = a3.a(this.o);
            }
            adrp2.b(new adps(this, 0, null));
            return adrp2;
        }
        adrp adrp3;
        if (adoj.w && !adoj.A) {
            adrp3 = this.b.c(adoj.k, this.c, (adrh)this.d).a((adrh)this.e);
        }
        else {
            adrp3 = this.b.c(adoj.k, this.c, (adrh)this.e);
        }
        adrp a4 = adrp3;
        if (adoj.D) {
            a4 = adrp3.a((adrh)this.h);
        }
        final adrp a5 = a4.a((adrh)this.f);
        final adrp a6 = this.b.a(Arrays.asList(a5.a((adrh)this.i).a((adrh)this.m), a5.a((adrh)this.g).a((adrh)this.j).a((adrh)this.l)), (adrh)this.k);
        adrp adrp4;
        if (adoj.z) {
            adrp4 = a6.a((adrh)this.n).a(this.o);
        }
        else {
            adrp4 = a6.a(this.o);
        }
        adrp4.b(new adps(this, 3));
        return adrp4;
    }
}
