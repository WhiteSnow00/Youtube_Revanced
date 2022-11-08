import java.util.Set;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkz extends hng
{
    public final hoz t;
    public hml u;
    private final abno v;
    private final hyr w;
    
    public hkz(final abno v, final hyr w, final hoy hoy, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3) {
        super((View)viewGroup);
        this.v = v;
        this.w = w;
        final ljk cb = ((hoa)hoy).cb;
        final Object b = cb.b;
        final Object g = cb.g;
        final hoz t = new hoz((Context)b, (hox)hoy, (abno)cb.f, (eg)cb.c, (vyn)cb.i, (vxg)cb.k, (abhr)cb.j, cb.a, (acae)cb.h, (fyt)cb.e, (fzo)cb.l, (utk)cb.d, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        t.e = LayoutInflater.from(t.a).inflate(2131624547, (ViewGroup)t);
        t.l = (ViewGroup)t.e.findViewById(2131429345);
        final eg q = t.q;
        final Object d = q.d;
        final acae acae = (acae)((atjj)q.c).a();
        acae.getClass();
        final wwu wwu = (wwu)((atjj)q.b).a();
        wwu.getClass();
        t.d = new hqs((atjj)d, acae, wwu, (hqr)t);
        t.p.f((abry)t);
        t.m = (ViewGroup)t.findViewById(2131429342);
        t.n = (ViewGroup)t.m.findViewById(2131429344);
        t.m.findViewById(2131429343).setOnClickListener((View$OnClickListener)new hht(t, 14));
        t.f = (ViewGroup)t.findViewById(2131429350);
        final ViewGroup viewGroup2 = (ViewGroup)t.findViewById(2131429349);
        final fzo r = t.r;
        final Object b2 = r.b;
        final hqu g2 = new hqu((afts)r.a, viewGroup2, (hqt)t);
        final Context context = (Context)b2;
        g2.d = AnimationUtils.loadAnimation(context, 2130772052);
        g2.e = AnimationUtils.loadAnimation(context, 2130772053);
        g2.d.setDuration(400L);
        g2.e.setDuration(400L);
        g2.d.setAnimationListener((Animation$AnimationListener)g2);
        g2.e.setAnimationListener((Animation$AnimationListener)g2);
        g2.a.setVisibility(8);
        final TouchImageView touchImageView = (TouchImageView)g2.a.findViewById(2131429348);
        touchImageView.setOnClickListener((View$OnClickListener)new hqg(g2, 6));
        g2.c = new abag((ImageView)touchImageView, context, false, true);
        t.g = g2;
        t.f.setOnClickListener((View$OnClickListener)new hht(t, 15));
        viewGroup.addView((View)(this.t = t), t.a());
    }
    
    private final void K(final hml hml) {
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint b = hml.b();
        final String e = b.e;
        ((Set<String>)this.w.a).add(e);
        final hoz t = this.t;
        t.k = true;
        t.j(e, hml.f, hml.a, true, false, hml.c, b);
    }
    
    @Override
    public final hml E() {
        return this.u;
    }
    
    @Override
    public final hqo F() {
        return (hqo)this.t;
    }
    
    @Override
    public final void G() {
        final hml u = this.u;
        if (u != null) {
            u.g = null;
            this.u = null;
        }
        final hoz t = this.t;
        t.n();
        final hqs d = t.d;
        final ViewGroup d2 = d.d;
        if (d2 != null) {
            d2.removeAllViews();
        }
        d.a.c((acir)null);
        iba.e((View)d.c, false);
        t.g.g();
        t.n.removeAllViews();
        t.c.c((acir)null);
        t.m();
        t.e.setVisibility(0);
        t.o = null;
        t.k = false;
        t.h = Optional.empty();
        t.i = Optional.empty();
    }
    
    @Override
    public final void H(final aamc aamc) {
        final hml u = this.u;
        if (u != null) {
            if (!this.I(u)) {
                final int a = aamc.a();
                if (a != 2 && a != 5) {
                    if (a == 7) {
                        this.K(u);
                        return;
                    }
                }
                else {
                    final abtt q = this.v.q();
                    if (q != null) {
                        final PlayerResponseModel d = q.d();
                        if (d != null && !d.T() && !d.X()) {
                            this.K(u);
                            return;
                        }
                    }
                }
                final hoz t = this.t;
                final int a2 = aamc.a();
                if (a2 != 2) {
                    if (a2 == 3) {
                        t.g.d();
                        return;
                    }
                    if (a2 != 5 && a2 != 6) {
                        return;
                    }
                    t.p.h();
                }
                else {
                    t.j = true;
                    t.p.d();
                    t.g.e();
                }
            }
        }
    }
    
    public final boolean I(final hml hml) {
        return ((Set)this.w.a).contains(hml.b().e);
    }
    
    @Override
    public final boolean J() {
        return true;
    }
}
