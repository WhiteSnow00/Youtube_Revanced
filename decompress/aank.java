// 
// Decompiled by Procyon v0.6.0
// 

public final class aank implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final atnb d;
    private final atnb e;
    
    public aank(final atnb a, final atnb b, final atnb c, final atnb d, final atnb e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static aank c(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5) {
        return new aank(atnb, atnb2, atnb3, atnb4, atnb5);
    }
    
    public static aanj d(final oco oco, final xbu xbu, final aefs aefs) {
        return new aanj(oco, xbu, aefs, null, null, null, null, null, null, null);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final aanj b() {
        final aanj d = d((oco)this.a.a(), (xbu)this.b.a(), (aefs)this.c.a());
        d.a((aske)this.d.a(), (aske)this.e.a());
        return d;
    }
}
