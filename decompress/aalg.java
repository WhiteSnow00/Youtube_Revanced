import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aalg implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final atnb d;
    
    public aalg(final atnb a, final atnb b, final atnb c, final atnb d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static aalg b(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4) {
        return new aalg(atnb, atnb2, atnb3, atnb4);
    }
    
    public static List d(final abnw abnw, final abnw abnw2, final abnw abnw3, final abnw abnw4) {
        final afgh u = afgh.u(abnw, abnw2, abnw3, abnw4);
        u.getClass();
        return u;
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final List c() {
        return d(((aalh)this.a).c(), ((aalh)this.b).c(), ((aalh)this.c).c(), ((aalh)this.d).c());
    }
}
