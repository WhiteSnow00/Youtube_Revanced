// 
// Decompiled by Procyon v0.6.0
// 

public final class cxg implements cxb
{
    public final String a;
    public final cwy b;
    public final cwy c;
    public final cwo d;
    public final boolean e;
    
    public cxg(final String a, final cwy b, final cwy c, final cwo d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        return (cuv)new cvh(cui, cxp, this);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("RectangleShape{position=");
        sb.append(value);
        sb.append(", size=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
