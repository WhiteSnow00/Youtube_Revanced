// 
// Decompiled by Procyon v0.6.0
// 

public final class aalp implements arom
{
    private final atnb a;
    
    public aalp(final atnb a) {
        this.a = a;
    }
    
    public static aalp b(final atnb atnb) {
        return new aalp(atnb);
    }
    
    public static abkr d(final adgg adgg) {
        final abkr f = ((abqz)adgg.a).f();
        f.getClass();
        return f;
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final abkr c() {
        return d((adgg)this.a.a());
    }
}
