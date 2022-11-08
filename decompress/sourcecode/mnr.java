import java.util.EnumSet;

// 
// Decompiled by Procyon v0.6.0
// 

public enum mnr
{
    a("ZWIEBACK", 0, 2), 
    b("ANDROID_ID", 1, 4), 
    c("GAIA", 2, 8), 
    d("ACCOUNT_NAME", 3, 16);
    
    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public final int h;
    
    static {
        e = EnumSet.allOf(mnr.class);
        f = EnumSet.noneOf(mnr.class);
        final mnr mnr;
        g = EnumSet.of(mnr);
    }
    
    private mnr(final String s, final int n, final int h) {
        this.h = h;
    }
}
