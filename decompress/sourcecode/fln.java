// 
// Decompiled by Procyon v0.6.0
// 

public final class fln
{
    public static final afcw a;
    public final oas b;
    private final vcf c;
    private final zki d;
    
    static {
        a = afcw.m((Object)flm.a, (Object)fan.e);
    }
    
    public fln(final vcf c, final zki d, final oas b) {
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public final asgy a(final flm flm) {
        if (!fln.a.containsKey((Object)flm)) {
            return asgy.t();
        }
        return this.c.a(this.d.c()).f(gkt.bi((agyr)ajhh.b, "")).j((Class)ajhg.class).C((asjc)new fdc(flm, 10)).v((asjd)new fdl(this, 5));
    }
}
