// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings.datasaving;

import java.util.concurrent.Executor;

public class DataSavingEntityController implements tfg
{
    static final String a;
    public final thh b;
    public final aanf c;
    public final uyi d;
    public final uyi e;
    private final vbq g;
    private final zki h;
    private final tku i;
    private final tku j;
    private final asgt k;
    private final asho l;
    private final Executor m;
    private final asib n;
    
    static {
        a = vek.h(apvw.b.a(), "app_settings_entity_identifier");
    }
    
    public DataSavingEntityController(final vbq g, final zki h, final tku i, final tku j, final thh b, final asgt k, final uyi d, final uyi e, final asho l, final Executor m, final aanf c) {
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.b = b;
        this.k = k;
        this.d = d;
        this.e = e;
        this.l = l;
        this.m = m;
        this.c = c;
        this.n = new asib();
    }
    
    public final void k() {
        tcp.k(this.j.a(), this.m, (tcn)jbz.i, (tco)new jor(this, 3));
    }
    
    public final void l(final aply aply) {
        final vbp a = this.g.a(this.h.c());
        final String a2 = DataSavingEntityController.a;
        final apvv apvv = (apvv)((vdo)a).f(a2).af();
        apvv apvv2;
        if (apvv != null) {
            final apvt c = apvv.c();
            c.b(aply);
            apvv2 = c.c();
        }
        else {
            a2.getClass();
            agot.E(a2.isEmpty() ^ true, (Object)"key cannot be empty");
            final agza builder = ((agzi)apvw.a).createBuilder();
            builder.copyOnWrite();
            final apvw apvw = (apvw)builder.instance;
            apvw.c |= 0x1;
            apvw.d = a2;
            final apvt apvt = new apvt(builder);
            apvt.b(aply);
            apvv2 = apvt.c();
        }
        final vdv c2 = ((vdo)a).c();
        c2.d((vdm)apvv2);
        c2.c().U();
    }
    
    public final void lW(final aum aum) {
        if (this.e.bG()) {
            tcp.i(this.i.b((aexg)ixn.m), tcp.b);
            return;
        }
        if (!kgk.A(this.d, this.e)) {
            final vdv c = ((vdo)this.g.a(this.h.c())).c();
            c.g(DataSavingEntityController.a);
            c.b().U();
            return;
        }
        this.k();
        this.n.f(new asic[] { this.j.d().L((asjc)new jax(this, 10)).p().P(this.l).al((asix)new jmj(this, 12)), this.i.d().L((asjc)new jax(this, 11)).p().P(this.l).al((asix)new jou(this, 0)), this.k.p().P(this.l).al((asix)new jou(this, 1)) });
    }
    
    public final void my(final aum aum) {
        this.n.b();
    }
}
