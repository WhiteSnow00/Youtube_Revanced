// 
// Decompiled by Procyon v0.6.0
// 

public final class fli implements fln
{
    public final fln a;
    private final fln b;
    
    public fli(final fln b, final fln a) {
        this.b = b;
        this.a = a;
    }
    
    public static final flm f(final flm flm, final flm flm2) {
        final afel afel = new afel();
        afel.j((Iterable)flm.b);
        afel.j((Iterable)flm2.b);
        return flm.a(flm.a + flm2.a, afel.g());
    }
    
    public final ashc a(final String s) {
        throw new UnsupportedOperationException();
    }
    
    public final ashn b(final String s) {
        return this.b.b(s).M(this.a.b(s));
    }
    
    public final asht c(final fll fll) {
        return asht.n(this.b.c(fll), this.a.c(fll), (asji)new exl(4));
    }
    
    public final asie d() {
        return asht.ab(this.b.d().j((asjr)exp.s), this.a.d().j((asjr)exp.s)).aF().J((asjr)exp.t);
    }
    
    public final asie e(final fll fll) {
        final ajhp ajhp = (ajhp)fll.a.e((Object)ajhp.b);
        final int intValue = (int)fll.b.e((Object)(-1));
        final fln b = this.b;
        final pa a = fll.a();
        a.d(ajhp);
        a.e(intValue);
        a.f(flk.a);
        return b.e(a.c()).E((asjr)new lgg(this, intValue, ajhp, 1));
    }
}
