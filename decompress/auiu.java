// 
// Decompiled by Procyon v0.6.0
// 

public final class auiu extends IllegalArgumentException
{
    private static final long serialVersionUID = 6305711765985447737L;
    public String a;
    
    public auiu(final auil auil, final Number n, final Number n2, final Number n3) {
        super(a(auil.y, n, n2, n3, null));
        this.a = super.getMessage();
    }
    
    public auiu(final auil auil, final Number n, final String s) {
        super(a(auil.y, n, null, null, s));
        this.a = super.getMessage();
    }
    
    public auiu(final auil auil, final String s) {
        final String y = auil.y;
        final StringBuffer sb = new StringBuffer("Value \"");
        sb.append(s);
        sb.append("\" for ");
        sb.append(y);
        sb.append(" is not supported");
        super(sb.toString());
        this.a = super.getMessage();
    }
    
    private static String a(final String s, final Number n, final Number n2, final Number n3, final String s2) {
        final StringBuilder sb = new StringBuilder("Value ");
        sb.append(n);
        sb.append(" for ");
        sb.append(s);
        sb.append(' ');
        if (n2 == null) {
            if (n3 == null) {
                sb.append("is not supported");
            }
            else {
                sb.append("must not be larger than ");
                sb.append(n3);
            }
        }
        else if (n3 == null) {
            sb.append("must not be smaller than ");
            sb.append(n2);
        }
        else {
            sb.append("must be in the range [");
            sb.append(n2);
            sb.append(',');
            sb.append(n3);
            sb.append(']');
        }
        if (s2 != null) {
            sb.append(": ");
            sb.append(s2);
        }
        return sb.toString();
    }
    
    @Override
    public final String getMessage() {
        return this.a;
    }
}
