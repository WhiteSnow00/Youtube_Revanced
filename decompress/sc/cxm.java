import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxm implements cxb
{
    public final String a;
    public final cwo b;
    public final List c;
    public final cwn d;
    public final cwq e;
    public final cwo f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;
    
    public cxm(final String a, final cwo b, final List c, final cwn d, final cwq e, final cwo f, final int i, final int j, final float g, final boolean h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.i = i;
        this.j = j;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        return (cuv)new cvk(cui, cxp, this);
    }
}
