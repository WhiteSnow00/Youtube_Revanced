// 
// Decompiled by Procyon v0.6.0
// 

public final class cxh implements cxb
{
    public final String a;
    public final cwo b;
    public final cwo c;
    public final cwx d;
    public final boolean e;
    
    public cxh(final String a, final cwo b, final cwo c, final cwx d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        return (cuv)new cvi(cui, cxp, this);
    }
}
