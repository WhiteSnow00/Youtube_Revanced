// 
// Decompiled by Procyon v0.6.0
// 

public final class gqr extends nwp
{
    private final wwv a;
    
    public gqr(final wwv a) {
        this.a = a;
    }
    
    private final void b(final int n, final agza agza) {
        agza builder = agza;
        if (agza == null) {
            builder = ((agzi)aleq.a).createBuilder();
        }
        final agza builder2 = ((agzi)alff.a).createBuilder();
        builder2.copyOnWrite();
        final alff alff = (alff)builder2.instance;
        final aleq u = (aleq)builder.build();
        u.getClass();
        alff.u = u;
        alff.c |= 0x10;
        final alff alff2 = (alff)builder2.build();
        final wxz wxz = new wxz(this.a.a(), wya.c(n));
        this.a.l(wxz);
        this.a.J(3, wxz, alff2);
    }
    
    public final void a(final agza agza) {
        final agfp agfp = (agfp)agza.instance;
        if (agfp.c == 3 && ((agff)agfp.d).j()) {
            this.b(77701, null);
        }
        if (((agfp)agza.instance).c == 5) {
            final agza builder = ((agzi)aleq.a).createBuilder();
            final agfp agfp2 = (agfp)agza.instance;
            agfb c;
            if (agfp2.c == 5) {
                c = (agfb)agfp2.d;
            }
            else {
                c = agfb.c();
            }
            final String d = c.d();
            builder.copyOnWrite();
            final aleq aleq = (aleq)builder.instance;
            d.getClass();
            aleq.b |= 0x1;
            aleq.c = d;
            this.b(66792, builder);
        }
    }
}
