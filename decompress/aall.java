// 
// Decompiled by Procyon v0.6.0
// 

public final class aall implements arom
{
    private final atnb a;
    
    public aall(final atnb a) {
        this.a = a;
    }
    
    public static aall b(final atnb atnb) {
        return new aall(atnb);
    }
    
    public static abqz d(final adgg adgg) {
        final Object a = adgg.a;
        a.getClass();
        return (abqz)a;
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final abqz c() {
        return d((adgg)this.a.a());
    }
}
