import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adqg implements adqz
{
    public final aheu a;
    private final adrm b;
    private final adpx c;
    private final adpq d;
    private final adqn e;
    private final adqh f;
    private final adpp g;
    private final adrq h;
    private final adqf i;
    private final adqw j;
    private final adpk k;
    private final adpy l;
    private final adqb m;
    private final adrf n;
    
    public adqg(final adrm b, final adrf n, final adpx c, final adpq d, final adqn e, final adqh f, final adpp g, final adrq h, final adqf i, final adqw j, final adpk k, final adpy l, final adqb m, final aheu a, final byte[] array, final byte[] array2, final byte[] array3) {
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
    
    @Override
    public final adrp a(final adoj adoj) {
        final adrp a = this.b.a(Arrays.asList(this.b.c(adoj.k, this.n, (adrh)this.c), this.b.c(adoj.k, this.n, (adrh)this.f).a((adrh)this.g)), (adrh)this.d);
        final adrp a2 = this.b.a(Arrays.asList(a.a((adrh)this.h).a((adrh)this.i), a.a((adrh)this.e)), (adrh)this.k).a((adrh)this.j);
        adrp adrp;
        if (adoj.z) {
            adrp = a2.a((adrh)this.l).a(this.m);
        }
        else {
            adrp = a2.a(this.m);
        }
        adrp.b(new adps(this, 2));
        return adrp;
    }
}
