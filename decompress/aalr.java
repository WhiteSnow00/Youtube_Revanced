// 
// Decompiled by Procyon v0.6.0
// 

public final class aalr implements arom
{
    private final atnb a;
    
    public aalr(final atnb a) {
        this.a = a;
    }
    
    public static aalr b(final atnb atnb) {
        return new aalr(atnb);
    }
    
    public static adfa d(final adgg adgg) {
        final adfa cf = ((abqz)adgg.a).cf();
        cf.getClass();
        return cf;
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final adfa c() {
        return d((adgg)this.a.a());
    }
}
