// 
// Decompiled by Procyon v0.6.0
// 

public final class aalq implements arom
{
    private final atnb a;
    
    public aalq(final atnb a) {
        this.a = a;
    }
    
    public static aalq b(final atnb atnb) {
        return new aalq(atnb);
    }
    
    public static abqb d(final adgg adgg) {
        final Object a = adgg.a;
        a.getClass();
        return (abqb)a;
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final abqb c() {
        return d((adgg)this.a.a());
    }
}
