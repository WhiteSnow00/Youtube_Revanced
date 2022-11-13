import android.graphics.Path$FillType;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxj implements cxb
{
    public final Path$FillType a;
    public final String b;
    public final cwn c;
    public final cwq d;
    public final boolean e;
    private final boolean f;
    
    public cxj(final String b, final boolean f, final Path$FillType a, final cwn c, final cwq d, final boolean e) {
        this.b = b;
        this.f = f;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        return (cuv)new cuz(cui, cxp, this);
    }
    
    @Override
    public final String toString() {
        final boolean f = this.f;
        final StringBuilder sb = new StringBuilder("ShapeFill{color=, fillEnabled=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
