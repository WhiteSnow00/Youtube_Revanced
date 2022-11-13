import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxd implements cxb
{
    public final String a;
    public final cwp b;
    public final cwq c;
    public final cws d;
    public final cws e;
    public final cwo f;
    public final float g;
    public final List h;
    public final cwo i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    
    public cxd(final String a, final int k, final cwp b, final cwq c, final cws d, final cws e, final cwo f, final int l, final int m, final float g, final List h, final cwo i, final boolean j) {
        this.a = a;
        this.k = k;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.l = l;
        this.m = m;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        return (cuv)new cvb(cui, cxp, this);
    }
}
