// 
// Decompiled by Procyon v0.6.0
// 

public final class aalj implements arom
{
    private final atnb a;
    
    public aalj(final atnb a) {
        this.a = a;
    }
    
    public static aalj b(final atnb atnb) {
        return new aalj(atnb);
    }
    
    public static abkq d(final adgg adgg) {
        final abkq e = ((abqz)adgg.a).e();
        e.getClass();
        return e;
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final abkq c() {
        return d((adgg)this.a.a());
    }
}
