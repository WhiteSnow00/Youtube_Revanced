// 
// Decompiled by Procyon v0.6.0
// 

public final class fuc extends aclz
{
    private final arkg b;
    
    public fuc(final arkg b) {
        this.b = b;
    }
    
    public final void a() {
        ((aclu)this.b.a()).a();
    }
    
    public final void b() {
        ((aclu)this.b.a()).b();
    }
    
    protected final boolean c() {
        final aclt a = super.a;
        final ahaz g = ((fud)a.a).g;
        final ahaz g2 = ((fud)a.b).g;
        if (g != null) {
            if (g2 != null) {
                ajut ajut;
                if ((ajut = ((aikr)g.instance).f) == null) {
                    ajut = ajut.a;
                }
                ajut ajut2;
                if ((ajut2 = ((aikr)g2.instance).f) == null) {
                    ajut2 = ajut.a;
                }
                if (!((ahbh)ajut).equals((Object)ajut2)) {
                    final aclu aclu = (aclu)this.b.a();
                    final acls a2 = aclt.a();
                    a2.j(a.a);
                    a2.g(a.b);
                    a2.b(a.c);
                    a2.i(a.d);
                    a2.h(a.e);
                    a2.f(a.f);
                    a2.e(a.g);
                    a2.c(a.h);
                    a2.d(a.i);
                    a2.k(a.j);
                    a2.l(a.k);
                    return aclu.d(a2.a());
                }
            }
        }
        return false;
    }
}
