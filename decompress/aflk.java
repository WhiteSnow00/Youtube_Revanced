// 
// Decompiled by Procyon v0.6.0
// 

public enum aflk
{
    a("STRING", 0, 's', aflm.a, "-#", true), 
    b("BOOLEAN", 1, 'b', aflm.b, "-", true), 
    c("CHAR", 2, 'c', aflm.c, "-", true), 
    d("DECIMAL", 3, 'd', aflm.d, "-0+ ,(", false), 
    e("OCTAL", 4, 'o', aflm.d, "-#0(", false), 
    f("HEX", 5, 'x', aflm.d, "-#0(", true), 
    g("FLOAT", 6, 'f', aflm.e, "-#0+ ,(", false), 
    h("EXPONENT", 7, 'e', aflm.e, "-#0+ (", true), 
    i("GENERAL", 8, 'g', aflm.e, "-0+ ,(", true), 
    j("EXPONENT_HEX", 9, 'a', aflm.e, "-#0+ ", true);
    
    public static final aflk[] k;
    private static final aflk[] p;
    public final char l;
    public final aflm m;
    public final int n;
    public final String o;
    
    static {
        int l = 0;
        final aflk aflk;
        final aflk aflk2;
        final aflk aflk3;
        final aflk aflk4;
        final aflk aflk5;
        final aflk aflk6;
        final aflk aflk7;
        final aflk aflk8;
        final aflk aflk9;
        final aflk aflk10;
        p = new aflk[] { aflk, aflk2, aflk3, aflk4, aflk5, aflk6, aflk7, aflk8, aflk9, aflk10 };
        k = new aflk[26];
        for (aflk[] values = values(); l < values.length; ++l) {
            final aflk aflk11 = values[l];
            aflk.k[a(aflk11.l)] = aflk11;
        }
    }
    
    private aflk(final String s, final int n, final char l, final aflm m, final String s2, final boolean b) {
        this.l = l;
        this.m = m;
        this.n = afll.a(s2, b);
        final StringBuilder sb = new StringBuilder("%");
        sb.append(l);
        this.o = sb.toString();
    }
    
    public static int a(final char c) {
        return (c | ' ') - 97;
    }
}
