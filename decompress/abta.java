// 
// Decompiled by Procyon v0.6.0
// 

public final class abta implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final atnb d;
    private final atnb e;
    private final atnb f;
    private final atnb g;
    private final atnb h;
    
    public abta(final atnb a, final atnb b, final atnb c, final atnb d, final atnb e, final atnb f, final atnb g, final atnb h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static abta c(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6, final atnb atnb7, final atnb atnb8) {
        return new abta(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, atnb7, atnb8);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final absz b() {
        return new absz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
