// 
// Decompiled by Procyon v0.6.0
// 

public final class cxl implements cxb
{
    public final cwu a;
    public final boolean b;
    private final String c;
    private final int d;
    
    public cxl(final String c, final int d, final cwu a, final boolean b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        return (cuv)new cvj(cui, cxp, this);
    }
    
    @Override
    public final String toString() {
        final String c = this.c;
        final int d = this.d;
        final StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(c);
        sb.append(", index=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
