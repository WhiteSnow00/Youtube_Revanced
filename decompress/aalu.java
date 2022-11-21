// 
// Decompiled by Procyon v0.6.0
// 

public final class aalu implements arom
{
    private final atnb a;
    
    public aalu(final atnb a) {
        this.a = a;
    }
    
    public static aalu b(final atnb atnb) {
        return new aalu(atnb);
    }
    
    public static abtj d(final adgg adgg) {
        final abtj q = ((abqz)adgg.a).q();
        q.getClass();
        return q;
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final abtj c() {
        return d((adgg)this.a.a());
    }
}
