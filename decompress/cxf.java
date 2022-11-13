// 
// Decompiled by Procyon v0.6.0
// 

public final class cxf implements cxb
{
    public final String a;
    public final cwo b;
    public final cwy c;
    public final cwo d;
    public final cwo e;
    public final cwo f;
    public final cwo g;
    public final cwo h;
    public final boolean i;
    public final int j;
    
    public cxf(final String a, final int j, final cwo b, final cwy c, final cwo d, final cwo e, final cwo f, final cwo g, final cwo h, final boolean i) {
        this.a = a;
        this.j = j;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        return (cuv)new cvg(cui, cxp, this);
    }
}
