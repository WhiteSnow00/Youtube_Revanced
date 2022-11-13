import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewz extends eww
{
    private final atke b;
    private final arkg c;
    private final asid d;
    
    public ewz(final Activity activity, final vaf vaf, final wyv wyv, final arkg arkg, final atke b, final arkg arkg2, final arkg c, final arkg arkg3, final arkg arkg4, final abpu abpu, final arkg arkg5, final arkg arkg6, final arkg arkg7, final asid asid, final asid d, final Executor executor, final arkg arkg8, final arkg arkg9, final vai vai, final arkg arkg10) {
        super(activity, wyv, arkg, arkg2, c, arkg3, abpu, arkg5, arkg6, arkg7, asid, executor, arkg8, arkg9, vai.bN(), arkg10);
        this.b = b;
        this.c = c;
        this.d = d;
        if (fbu.X(vaf)) {
            executor.execute((Runnable)new axb(this, arkg2, arkg4, asid, vaf, 3));
            return;
        }
        arkg.a();
        b.a();
        c.a();
        arkg3.a();
        arkg4.a();
        arkg5.a();
        arkg6.a();
        arkg7.a();
        this.a(arkg2, arkg4, asid, vaf);
    }
    
    public final void a(final arkg arkg, final arkg arkg2, final asid asid, final vaf vaf) {
        final msr msr = (msr)arkg.a();
        final asht p4 = asht.p(msr.M().z(2L, TimeUnit.SECONDS), ((ewy)this.b.a()).b(), j((fjv)this.c.a()).ai(), (asjn)exk.b);
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        asht af = p4;
        if (alxp.aY) {
            af = p4.af(this.d);
        }
        af.ay(((hze)arkg2.a()).a(), (asji)exl.b).q(tpe.cl(msr.K())).af(asid).aH(new erz(this, 5));
    }
    
    public final void k(final aans aans) {
        final ewy ewy = (ewy)this.b.a();
        if (!((fjv)this.c.a()).j().e() && aans.c().a(new abke[] { abke.i, abke.j }) && (ewy.a().equals((Object)ewx.c) || ewy.a().equals((Object)ewx.h))) {
            ewy.f();
        }
    }
    
    public final void m() {
        ((ewy)this.b.a()).c(aibk.c);
    }
    
    public final void o(final boolean b) {
        ((ewy)this.b.a()).c(aibk.c);
    }
    
    public final void oN() {
        ((ewy)this.b.a()).e(aibk.c);
    }
    
    public final void p() {
        super.p();
        ((ewy)this.b.a()).c(aibk.b);
    }
    
    public final void q(final aixf aixf) {
        super.q(aixf);
        ((ewy)this.b.a()).d(aibk.c);
    }
}
