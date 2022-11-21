import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrz implements arom
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
    
    public abrz(final atnb a, final atnb b, final atnb c, final atnb d, final atnb e, final atnb f, final atnb g, final atnb h, final atnb i, final atnb j) {
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
    }
    
    public static abrz b(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final atnb atnb5, final atnb atnb6, final atnb atnb7, final atnb atnb8, final atnb atnb9, final atnb atnb10) {
        return new abrz(atnb, atnb2, atnb3, atnb4, atnb5, atnb6, atnb7, atnb8, atnb9, atnb10);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return new abry(vku.a, (abqc)this.a.a(), (abos)this.b.a(), (agnl)this.c.a(), (Executor)this.d.a(), (Executor)this.e.a(), (arzb)this.f.a(), ((abrc)this.g).c(), (abmo)this.h.a(), (absv)this.i.a(), ((abrd)this.j).c(), null, null, null, null, null);
    }
}
