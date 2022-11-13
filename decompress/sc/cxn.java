// 
// Decompiled by Procyon v0.6.0
// 

public final class cxn implements cxb
{
    public final cwo a;
    public final cwo b;
    public final cwo c;
    public final boolean d;
    public final int e;
    
    public cxn(final int e, final cwo a, final cwo b, final cwo c, final boolean d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final cuv a(final cui cui, final cxp cxp) {
        return (cuv)new cvl(cxp, this);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("Trim Path: {start: ");
        sb.append(value);
        sb.append(", end: ");
        sb.append(value2);
        sb.append(", offset: ");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
