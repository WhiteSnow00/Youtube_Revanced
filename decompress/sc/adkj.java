import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public enum adkj implements adkh
{
    a("UNKNOWN", 0, 0), 
    b("LEGACY", 1, 1), 
    c("EXTERNAL", 2, 2), 
    d("SHORTS", 3, 3);
    
    static final SparseArray e;
    private static final adkj[] f;
    private final int g;
    
    static {
        int i = 0;
        e = new SparseArray();
        for (adkj[] values = values(); i < values.length; ++i) {
            final adkj adkj = values[i];
            adkj.e.put(adkj.g, (Object)adkj);
        }
    }
    
    private adkj(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static String c(final aphp aphp) {
        final int ordinal = aphp.ordinal();
        if (ordinal == 0) {
            return adkj.a.d();
        }
        if (ordinal == 1) {
            return adkj.b.d();
        }
        if (ordinal == 2) {
            return adkj.c.d();
        }
        if (ordinal != 3) {
            return adkj.a.d();
        }
        return adkj.d.d();
    }
    
    @Override
    public final /* bridge */ adkh a(final int n) {
        return (adkj)adkj.e.get(n);
    }
    
    @Override
    public final String b() {
        return "cf";
    }
    
    public final String d() {
        final int g = this.g;
        final StringBuilder sb = new StringBuilder("cf=");
        sb.append(g);
        return sb.toString();
    }
}
