// 
// Decompiled by Procyon v0.6.0
// 

public final class aewz extends aeww
{
    static final int a;
    public static final aewz b;
    
    static {
        a = Integer.numberOfLeadingZeros(31);
        b = new aewz();
    }
    
    public aewz() {
        super("CharMatcher.whitespace()");
    }
    
    public final boolean b(final char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001\u202f \f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000".charAt(1682554634 * c >>> aewz.a) == c;
    }
}
