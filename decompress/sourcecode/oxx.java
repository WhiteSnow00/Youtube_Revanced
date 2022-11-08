// 
// Decompiled by Procyon v0.6.0
// 

public enum oxx
{
    a("VISIBLE_50_PERCENT", 0, 1, 0, 0), 
    b("VIEWABLE", 1, 0, 1, 1), 
    c("AUDIBLE_MEASURABLE", 2, 2, 2, 2), 
    d("AUDIBLE", 3, 4, 4, 4), 
    e("FULLSCREEN", 4, 8, 8, 8), 
    f("BACKGROUNDED_MEASURABLE", 5, 16, 16, 16), 
    g("BACKGROUNDED", 6, 32, 32, 32), 
    h("AUDIBLE_AND_VISIBLE_50_PERCENT", 7, 64, 0, 0), 
    i("AUDIBLE_AND_VIEWABLE", 8, 0, 64, 64), 
    j("COVERAGE_MEASURABLE", 9, 128, 128, 128), 
    k("PARTIALLY_VIEWABLE", 10, 256, 256, 256), 
    l("GROUPM_DURATION_REACHED", 11, 0, 512, 512), 
    m("PMX_VIEWABLE", 12, 0, 16777216, 16777216), 
    n("MUTED", 13, 33554432, 33554432, 33554432), 
    o("UNMUTED_AND_BACKGROUNDED", 14, 67108864, 67108864, 67108864);
    
    public final int p;
    public final int q;
    public final int r;
    
    private oxx(final String s, final int n, final int p5, final int q, final int r) {
        this.p = p5;
        this.q = q;
        this.r = r;
    }
}
