// 
// Decompiled by Procyon v0.6.0
// 

public enum acwz
{
    a("LIGHT", 0, "Light", 300), 
    b("REGULAR", 1, "Regular", 400), 
    c("MEDIUM", 2, "Medium", 500), 
    d("SEMIBOLD", 3, "SemiBold", 600), 
    e("BOLD", 4, "Bold", 700), 
    f("EXTRABOLD", 5, "ExtraBold", 800), 
    g("BLACK", 6, "Black", 900);
    
    private static final acwz[] j;
    final String h;
    final int i;
    
    private acwz(final String s, final int n, final String h, final int i) {
        this.h = h;
        this.i = i;
    }
}
