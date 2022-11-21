// 
// Decompiled by Procyon v0.6.0
// 

public final class aald implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    
    public aald(final atnb a, final atnb b, final atnb c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static aald c(final atnb atnb, final atnb atnb2, final atnb atnb3) {
        return new aald(atnb, atnb2, atnb3);
    }
    
    public static zff d(final abkq abkq, abww a, final absv absv) {
        if (!((vbs)absv.g).f(45365185L)) {
            a = (abww)abkq.a;
        }
        a.getClass();
        return (zff)a;
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final zff b() {
        return d(((aalj)this.a).c(), (abww)this.b.a(), (absv)this.c.a());
    }
}
