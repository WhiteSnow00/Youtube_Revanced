// 
// Decompiled by Procyon v0.6.0
// 

public final class ftu extends acjw
{
    private final arhr b;
    
    public ftu(final arhr b) {
        this.b = b;
    }
    
    public final void a() {
        ((acjr)this.b.a()).a();
    }
    
    public final void b() {
        ((acjr)this.b.a()).b();
    }
    
    @Override
    protected final boolean c() {
        final acjq a = super.a;
        final agza g = ((ftv)a.a).g;
        final agza g2 = ((ftv)a.b).g;
        if (g != null) {
            if (g2 != null) {
                ajsq ajsq;
                if ((ajsq = ((aiit)g.instance).f) == null) {
                    ajsq = ajsq.a;
                }
                ajsq ajsq2;
                if ((ajsq2 = ((aiit)g2.instance).f) == null) {
                    ajsq2 = ajsq.a;
                }
                if (!((agzi)ajsq).equals(ajsq2)) {
                    final acjr acjr = (acjr)this.b.a();
                    final acjp a2 = acjq.a();
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
                    return acjr.d(a2.a());
                }
            }
        }
        return false;
    }
}
