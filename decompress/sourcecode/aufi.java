// 
// Decompiled by Procyon v0.6.0
// 

public final class aufi extends IllegalArgumentException
{
    private static final long serialVersionUID = 2858712538216L;
    
    public aufi(final long n, String string) {
        final String a = auhq.a("yyyy-MM-dd'T'HH:mm:ss.SSS").a((aufp)new aufj(n));
        final StringBuilder sb = new StringBuilder(" (");
        sb.append(string);
        sb.append(")");
        string = sb.toString();
        final StringBuilder sb2 = new StringBuilder("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ");
        sb2.append(a);
        sb2.append(string);
        super(sb2.toString());
    }
    
    public aufi(final String s) {
        super(s);
    }
}
