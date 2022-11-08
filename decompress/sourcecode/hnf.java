import com.airbnb.lottie.LottieAnimationView;
import java.util.function.Consumer;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnf extends hng
{
    public final hlf t;
    public final hqk u;
    public hml v;
    public final uyi w;
    public final arud x;
    
    public hnf(final arud x, final hlf t, final uyi w, final hqj hqj, final ViewGroup viewGroup, final byte[] array, final byte[] array2) {
        super((View)viewGroup);
        this.x = x;
        this.t = t;
        this.w = w;
        final hql ai = ((hoa)hqj).ai;
        final Context context = (Context)ai.a.a();
        context.getClass();
        final aceo aceo = (aceo)ai.b.a();
        aceo.getClass();
        final abno abno = (abno)ai.c.a();
        abno.getClass();
        final wwu wwu = (wwu)ai.d.a();
        wwu.getClass();
        final hqq hqq = (hqq)ai.e.a();
        final hpg hpg = (hpg)ai.f.a();
        hpg.getClass();
        final hpp hpp = (hpp)ai.g.a();
        final hpt hpt = (hpt)ai.h.a();
        final hpn hpn = (hpn)ai.i.a();
        final arud arud = (arud)ai.j.a();
        arud.getClass();
        final fjz fjz = (fjz)ai.k.a();
        fjz.getClass();
        final hqk u = new hqk(context, aceo, abno, wwu, hqq, hpg, hpp, hpt, hpn, arud, fjz, (hqi)hqj, (byte[])null, (byte[])null);
        viewGroup.addView((View)(this.u = u), u.a());
    }
    
    @Override
    public final hml E() {
        return this.v;
    }
    
    @Override
    public final hqo F() {
        return (hqo)this.u;
    }
    
    @Override
    public final void G() {
        final hml v = this.v;
        if (v != null) {
            this.t.h(v.e);
            this.v.g = null;
            this.v = null;
        }
        final hqk u = this.u;
        if (u != null) {
            u.f().ifPresent((Consumer)gyc.h);
            this.u.f().ifPresent((Consumer)gyc.i);
            final hpm a = this.u.a;
            if (a != null) {
                a.j();
                final fve g = a.G;
                if (g != null) {
                    g.f();
                }
                final LottieAnimationView o = a.o;
                if (o != null) {
                    iba.e((View)o, false);
                    a.o = null;
                }
                final ViewGroup p = a.p;
                if (p != null) {
                    p.removeAllViews();
                    iba.e((View)a.p, false);
                    a.p = null;
                }
                a.L.cancel();
                a.M.c();
                if (a.O) {
                    a.j.c((acir)null);
                    a.t = null;
                }
            }
        }
    }
    
    @Override
    public final void H(final aamc aamc) {
        final hqk u = this.u;
        final int a = aamc.a();
        if (a == 2) {
            u.l = true;
            u.d.b();
            u.v.d();
            u.c.d(false);
            u.B();
            return;
        }
        if (a == 3) {
            u.c.d(true);
            u.B();
            return;
        }
        if (a != 5 && a != 6) {
            return;
        }
        u.v.h();
    }
    
    @Override
    public final boolean J() {
        return true;
    }
}
