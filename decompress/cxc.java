import android.graphics.Path$FillType;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxc implements cxb
{
    public final Path$FillType a;
    public final cwp b;
    public final cwq c;
    public final cws d;
    public final cws e;
    public final String f;
    public final boolean g;
    public final int h;
    
    public cxc(final String f, final int h, final Path$FillType a, final cwp b, final cwq c, final cws d, final cws e, final boolean g) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        return (cuv)new cva(cui, cxp, this);
    }
}
