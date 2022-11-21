import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmc implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final atnb d;
    private final atnb e;
    private final atnb f;
    private final atnb g;
    private final atnb h;
    private final atnb i;
    private final atnb j;
    private final atnb k;
    
    public abmc(final atnb a, final atnb b, final atnb c, final atnb d, final atnb e, final atnb f, final atnb g, final atnb h, final atnb i, final atnb j, final atnb k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public static abmc c(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6, final atnb atnb7, final atnb atnb8, final atnb atnb9, final atnb atnb10, final atnb atnb11) {
        return new abmc(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, atnb7, atnb8, atnb9, atnb10, atnb11);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final abmb b() {
        return new abmb(((tvd)this.a).c(), (abmg)this.b.a(), (ablv)this.c.a(), (aapu)this.d.a(), (abnd)this.e.a(), (ablv)this.f.a(), ((abmx)this.g).c(), (abls)this.h.a(), (arzb)this.i.a(), (absv)this.j.a(), (Executor)this.k.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
