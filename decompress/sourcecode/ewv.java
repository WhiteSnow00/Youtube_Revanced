import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewv extends ews
{
    private final atjj b;
    private final arhr c;
    private final asho d;
    
    public ewv(final Activity activity, final uyf uyf, final wwu wwu, final arhr arhr, final atjj b, final arhr arhr2, final arhr c, final arhr arhr3, final arhr arhr4, final abns abns, final arhr arhr5, final arhr arhr6, final arhr arhr7, final asho asho, final asho d, final Executor executor, final arhr arhr8, final arhr arhr9, final uyi uyi, final arhr arhr10) {
        super(activity, wwu, arhr, arhr2, c, arhr3, abns, arhr5, arhr6, arhr7, asho, executor, arhr8, arhr9, uyi.bO(), arhr10);
        this.b = b;
        this.c = c;
        this.d = d;
        if (gkt.v(uyf)) {
            executor.execute((Runnable)new axa(this, arhr2, arhr4, asho, uyf, 3));
            return;
        }
        arhr.a();
        b.a();
        c.a();
        arhr3.a();
        arhr4.a();
        arhr5.a();
        arhr6.a();
        arhr7.a();
        this.a(arhr2, arhr4, asho, uyf);
    }
    
    public final void a(final arhr arhr, final arhr arhr2, final asho asho, final uyf uyf) {
        final mrm mrm = (mrm)arhr.a();
        final ashe o = ashe.o((ashh)mrm.w().y(2L, TimeUnit.SECONDS), (ashh)((ewu)this.b.a()).b(), (ashh)ews.j((fjp)this.c.a()).ai(), (asiy)exg.b);
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        ashe aa = o;
        if (alvl.aY) {
            aa = o.aa(this.d);
        }
        aa.as((ashh)((hyj)arhr2.a()).a(), (asit)exh.b).p(tmy.ch(mrm.u())).aa(asho).aB((asix)new erw(this, 5));
    }
    
    @Override
    public final void k(final aaly aaly) {
        final ewu ewu = (ewu)this.b.a();
        if (!((fjp)this.c.a()).j().e() && aaly.c().a(new abim[] { abim.i, abim.j }) && (ewu.a().equals(ewt.c) || ewu.a().equals(ewt.h))) {
            ewu.f();
        }
    }
    
    @Override
    public final void m() {
        ((ewu)this.b.a()).c(ahzm.c);
    }
    
    @Override
    public final void n() {
        ((ewu)this.b.a()).e(ahzm.c);
    }
    
    @Override
    public final void o(final boolean b) {
        ((ewu)this.b.a()).c(ahzm.c);
    }
    
    @Override
    public final void p() {
        super.p();
        ((ewu)this.b.a()).c(ahzm.b);
    }
    
    @Override
    public final void q(final aiva aiva) {
        super.q(aiva);
        ((ewu)this.b.a()).d(ahzm.c);
    }
}
