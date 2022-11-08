// 
// Decompiled by Procyon v0.6.0
// 

final class j extends k
{
    private static final long serialVersionUID = 7766999779862263523L;
    
    public j(final l l, final l i) {
        super(l, i);
    }
    
    public final boolean a(final m m) {
        return this.a.a(m) && this.b.a(m);
    }
    
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" and ");
        sb.append(string2);
        return sb.toString();
    }
}
