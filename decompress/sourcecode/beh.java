import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class beh
{
    final Context a;
    bac b;
    public aeyr c;
    public aeyr d;
    aeyr e;
    aeyr f;
    aeyr g;
    aexg h;
    public Looper i;
    axt j;
    int k;
    boolean l;
    bfu m;
    public long n;
    long o;
    boolean p;
    public boolean q;
    bdz r;
    public agmd s;
    
    public beh(final Context context) {
        this(context, new beg(context, 6), new beg(context, 8));
    }
    
    private beh(final Context context, final aeyr aeyr, final aeyr aeyr2) {
        this(context, aeyr, aeyr2, new beg(context, 5), fkp.a, new beg(context, 7), (aexg)bwn.b);
    }
    
    private beh(final Context a, final aeyr c, final aeyr d, final aeyr e, final aeyr f, final aeyr g, final aexg h) {
        dk.d((Object)a);
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = baw.H();
        this.j = axt.a;
        this.k = 1;
        this.l = true;
        this.m = bfu.c;
        this.r = new bdz(baw.w(20L), baw.w(500L));
        this.b = bac.a;
        this.n = 500L;
        this.o = 2000L;
        this.p = true;
    }
    
    public beh(final Context context, final bft bft) {
        this(context, new beg(bft, 3), new beg(context, 4));
        dk.d((Object)bft);
    }
    
    public beh(final Context context, final bft bft, final bnv bnv, final bra bra, final bfb bfb, final brd brd, final bfz bfz) {
        this(context, new beg(bft, 10), new beg(bnv, 11), new beg(bra, 12), new beg(bfb, 13), new beg(brd, 14), (aexg)new bwj(bfz, 1));
        dk.d((Object)bft);
        dk.d((Object)bnv);
        dk.d((Object)bra);
        dk.d((Object)brd);
        dk.d((Object)bfz);
    }
    
    public final bei a() {
        dk.h(this.q ^ true);
        this.q = true;
        return (bei)new bew(this);
    }
    
    public final void b(final bfb bfb) {
        dk.h(this.q ^ true);
        this.f = new beg(bfb, 1);
    }
    
    public final void c(final bra bra) {
        dk.h(this.q ^ true);
        dk.d((Object)bra);
        this.e = new beg(bra, 0);
    }
}
