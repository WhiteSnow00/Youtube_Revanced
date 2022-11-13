// 
// Decompiled by Procyon v0.6.0
// 

public final class cxa implements cxb
{
    public final String a;
    public final cwy b;
    public final cws c;
    public final boolean d;
    public final boolean e;
    
    public cxa(final String a, final cwy b, final cws c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        return (cuv)new cuy(cui, cxp, this);
    }
}
