import android.content.res.Resources;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.FullscreenEngagementViewPresenter;
import com.google.android.apps.youtube.app.player.overlay.accessibility.TimebarAccessibilityController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izs implements asjm
{
    public final Object a;
    private final int b;
    
    public izs(final arfk a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public izs(final TimebarAccessibilityController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izs(final FullscreenEngagementViewPresenter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izs(final izr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izs(final izv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izs(final izw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izs(final jac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izs(final jba a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izs(final jbb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izs(final jbd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izs(final jbh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public izs(final jby a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        int n = 3;
        final ajvv ajvv = null;
        boolean f = true;
        final boolean b2 = true;
        final boolean b3 = true;
        final int n2 = 0;
        switch (b) {
            default: {
                ((jby)this.a).e = (boolean)o;
                return;
            }
            case 19: {
                ((jby)this.a).d = (int)o;
                return;
            }
            case 18: {
                final Object a = this.a;
                final aani aani = (aani)o;
                if (aani.a() != null) {
                    final WatchNextResponseModel a2 = aani.a();
                    if (a2 != null) {
                        final alem a3 = a2.a;
                        aldx aldx;
                        if ((aldx = a3.g) == null) {
                            aldx = aldx.a;
                        }
                        angl a4;
                        if (aldx.b == 78882851) {
                            a4 = (angl)aldx.c;
                        }
                        else {
                            a4 = angl.a;
                        }
                        anuv anuv;
                        if ((anuv = a4.l) == null) {
                            anuv = anuv.a;
                        }
                        ajvv ajvv2;
                        if (!anuv.ry((ahaq)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementOverlayRenderer)) {
                            ajvv2 = ajvv;
                        }
                        else {
                            aldx aldx2;
                            if ((aldx2 = a3.g) == null) {
                                aldx2 = aldx.a;
                            }
                            angl a5;
                            if (aldx2.b == 78882851) {
                                a5 = (angl)aldx2.c;
                            }
                            else {
                                a5 = angl.a;
                            }
                            anuv anuv2;
                            if ((anuv2 = a5.l) == null) {
                                anuv2 = anuv.a;
                            }
                            ajvv2 = (ajvv)anuv2.rx((ahaq)FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementOverlayRenderer);
                        }
                        ((FullscreenEngagementViewPresenter)a).k(ajvv2, true);
                    }
                }
                return;
            }
            case 17: {
                final Object a6 = this.a;
                final aani aani2 = (aani)o;
                final jbh jbh = (jbh)a6;
                if (jbh.f && aani2.c().a(new abkb[] { abkb.d })) {
                    jbh.g(false, true);
                    final jba jba = (jba)jbh.b.a();
                    final PlayerResponseModel b4 = aani2.b();
                    boolean g = false;
                    Label_0625: {
                        if (b4 != null) {
                            final jay d = jba.d;
                            final int size = d.e.size();
                            d.e.clear();
                            if (size > 0) {
                                d.n(0, size);
                            }
                            d.n = false;
                            d.j = null;
                            d.k = 0;
                            final String i = b4.I();
                            if (i != null) {
                                final adet aw = adet.aw(i, b4.h() * 1000L, d.o);
                                if (aw != null) {
                                    d.j = aw.U(b4.i());
                                    d.k = b4.j();
                                    if (d.j != null) {
                                        g = b3;
                                        if (!d.a.h()) {
                                            d.x();
                                            g = b3;
                                        }
                                        break Label_0625;
                                    }
                                }
                            }
                        }
                        g = false;
                    }
                    jbh.g = g;
                }
                return;
            }
            case 16: {
                final Object a7 = this.a;
                final aanf aanf = (aanf)o;
                final arfk arfk = (arfk)a7;
                if (((jbh)arfk.c).j()) {
                    final abka b5 = aanf.b();
                    if (b5 == abka.f || b5 == abka.c) {
                        ((jbh)arfk.c).g(false, false);
                    }
                }
                return;
            }
            case 15: {
                final Object a8 = this.a;
                final jbg jbg = (jbg)o;
                final jbg a9 = jbg.a;
                final int ordinal = jbg.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 3) {
                        final arfk arfk2 = (arfk)a8;
                        ((abpq)arfk2.b).a();
                        final abvx q = ((abpq)arfk2.b).q();
                        if (q == null) {
                            arfk2.a = -1L;
                            return;
                        }
                        arfk2.a = q.c();
                        if (!((jbh)arfk2.c).h()) {
                            ((jbh)arfk2.c).f(arfk2.a);
                        }
                    }
                    return;
                }
                ((arfk)a8).a = -1L;
                return;
            }
            case 14: {
                final Object a10 = this.a;
                final fkr fkr = (fkr)o;
                final arfk arfk3 = (arfk)a10;
                if (((jbh)arfk3.c).j()) {
                    final abvx q2 = ((abpq)arfk3.b).q();
                    if (q2 != null) {
                        ((jbh)arfk3.c).f(q2.c());
                    }
                }
                return;
            }
            case 13: {
                final Object a11 = this.a;
                final jbg jbg2 = (jbg)o;
                final boolean k = jbh.k(jbg2);
                if (k) {
                    final jbd jbd = (jbd)a11;
                    if (jbd.m == null) {
                        jbd.b();
                    }
                }
                if (k) {
                    final jbd jbd2 = (jbd)a11;
                    if (jbd2.e.h()) {
                        final jba g2 = jbd2.g;
                        final jay d2 = g2.d;
                        if (!d2.n) {
                            d2.x();
                            g2.d.y(g2.c.n(abea.f));
                        }
                        final arfk t = jbd2.t;
                        final abvx q3 = ((abpq)t.b).q();
                        if (q3 != null) {
                            ((jbh)t.c).f(q3.c());
                        }
                    }
                }
                if (k) {
                    final jbd jbd3 = (jbd)a11;
                    final View m = jbd3.m;
                    if (m != null && m.getVisibility() != 0) {
                        tpe.v(jbd3.m, true);
                        jbd3.j.l((wzz)jbd.a);
                        jbd3.j.m((wzz)jbd.b, (wzz)jbd.a);
                        jbd3.j.m((wzz)jbd.d, (wzz)jbd.a);
                        jbd3.j.m((wzz)jbd.c, (wzz)jbd.a);
                    }
                }
                else {
                    final jbd jbd4 = (jbd)a11;
                    final View j = jbd4.m;
                    if (j != null && j.getVisibility() != 8) {
                        tpe.v(jbd4.m, false);
                        jbd4.j.o((wzz)jbd.b, (alhi)null);
                        jbd4.j.o((wzz)jbd.d, (alhi)null);
                        jbd4.j.o((wzz)jbd.c, (alhi)null);
                        jbd4.j.o((wzz)jbd.a, (alhi)null);
                    }
                }
                final jbd jbd5 = (jbd)a11;
                final View n3 = jbd5.n;
                if (n3 != null) {
                    n3.requestLayout();
                    if (k) {
                        jbd5.f.t(jbd5.n);
                        jbd5.f.x(true, false);
                    }
                }
                final wyw l = jbd5.j;
                final wyt a12 = jbd.a;
                final ahaz builder = ((ahbh)alhi.a).createBuilder();
                final ahaz builder2 = ((ahbh)alhe.a).createBuilder();
                final jbg a13 = jbg.a;
                final int ordinal2 = jbg2.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    n = 5;
                                    if (ordinal2 != 5) {
                                        n = 1;
                                    }
                                }
                                else {
                                    n = 7;
                                }
                            }
                            else {
                                n = 4;
                            }
                        }
                        else {
                            n = 6;
                        }
                    }
                }
                else {
                    n = 2;
                }
                builder2.copyOnWrite();
                final alhe alhe = (alhe)builder2.instance;
                alhe.c = n - 1;
                alhe.b |= 0x1;
                final alhe p = (alhe)builder2.build();
                builder.copyOnWrite();
                final alhi alhi = (alhi)builder.instance;
                p.getClass();
                alhi.P = p;
                alhi.d |= 0x10;
                l.w((wzz)a12, (alhi)builder.build());
                return;
            }
            case 12: {
                final Object a14 = this.a;
                final int intValue = (int)o;
                final jbd jbd6 = (jbd)a14;
                final View n4 = jbd6.n;
                if (n4 != null) {
                    tpe.aF(n4, tpe.an(new tut[] { tpe.ax(intValue), tpe.aw(intValue) }), (Class)ViewGroup$MarginLayoutParams.class);
                }
                final RecyclerView o2 = jbd6.o;
                if (o2 != null) {
                    tpe.aF((View)o2, tpe.an(new tut[] { tpe.ax(intValue), tpe.aw(intValue) }), (Class)ViewGroup$MarginLayoutParams.class);
                }
                return;
            }
            case 11: {
                final Object a15 = this.a;
                final Float n5 = (Float)o;
                final View m2 = ((jbd)a15).m;
                if (m2 != null) {
                    m2.setAlpha((float)n5);
                }
                return;
            }
            case 10: {
                final Object a16 = this.a;
                final String a17 = jbd.a((long)o);
                final jbd jbd7 = (jbd)a16;
                final TextView p2 = jbd7.p;
                if (p2 != null && !TextUtils.equals(p2.getText(), (CharSequence)a17)) {
                    jbd7.p.setText((CharSequence)a17);
                    final Resources resources = jbd7.p.getResources();
                    jbd7.p.setContentDescription((CharSequence)resources.getString(2132017423, new Object[] { tpe.ad(resources, (CharSequence)a17) }));
                }
                jbd7.f.p(true, true);
                return;
            }
            case 9: {
                final Object a18 = this.a;
                final float floatValue = (float)o;
                final View n6 = ((jbd)a18).n;
                if (n6 != null) {
                    tpe.aF(n6, tpe.aq((int)floatValue), (Class)ViewGroup$MarginLayoutParams.class);
                }
                return;
            }
            case 8: {
                final Object a19 = this.a;
                final jbg jbg3 = (jbg)o;
                ((jbb)a19).a(false);
                return;
            }
            case 7: {
                final Object a20 = this.a;
                final long longValue = (long)o;
                final jba jba2 = (jba)a20;
                if (jba2.e != null && jba2.b.mb()) {
                    jba2.e.an();
                }
                final RecyclerView e = jba2.e;
                if (e != null && jba2.f != null && e.F == 0) {
                    final jay d3 = jba2.d;
                    int n7 = n2;
                    jax jax;
                    if (d3.e.isEmpty()) {
                        jax = jax.a(0, 0);
                    }
                    else {
                        while (n7 < d3.e.size() - 1 && longValue > ((jav)d3.e.get(n7)).b) {
                            ++n7;
                        }
                        final jav jav = d3.e.get(n7);
                        final long b6 = jav.b;
                        final long a21 = jav.a;
                        double n9;
                        final double n8 = n9 = 0.0;
                        if (b6 > a21) {
                            final double n10 = (double)(longValue - a21);
                            final double n11 = (double)(b6 - a21);
                            Double.isNaN(n10);
                            Double.isNaN(n11);
                            n9 = n10 / n11;
                            if (n9 < 0.0) {
                                n9 = n8;
                            }
                            else if (n9 > 1.0) {
                                n9 = 1.0;
                            }
                        }
                        int n12;
                        if (jav.e == 2) {
                            n12 = d3.i;
                        }
                        else {
                            n12 = d3.h;
                        }
                        final double n13 = n12;
                        Double.isNaN(n13);
                        jax = jax.a(n7, (int)(n9 * n13));
                    }
                    jba2.f.ab(jax.a, -jax.b);
                }
                return;
            }
            case 6: {
                final Object a22 = this.a;
                final abbc abbc = (abbc)o;
                final TimebarAccessibilityController timebarAccessibilityController = (TimebarAccessibilityController)a22;
                final boolean a23 = timebarAccessibilityController.a;
                final boolean a24 = abbc.a;
                if (a23 != a24) {
                    timebarAccessibilityController.a = a24;
                    timebarAccessibilityController.z();
                }
                return;
            }
            case 5: {
                final Object a25 = this.a;
                if (((aans)o).c().d()) {
                    final jac jac = (jac)a25;
                    if (jac.k.X()) {
                        teu.n((aun)jac.b, ((qqr)((atke)jac.l.a).a()).a(), (ttg)ify.f, (ttg)new hui(jac, 17));
                    }
                }
                return;
            }
            case 4: {
                final Object a26 = this.a;
                final aamh aamh = (aamh)o;
                final izw izw = (izw)a26;
                final boolean f2 = izw.f;
                if (aamh.d() != abjv.h) {
                    f = false;
                }
                izw.f = f;
                if (f == f2) {
                    return;
                }
                izw.h();
                return;
            }
            case 3: {
                final Object a27 = this.a;
                final aanq aanq = (aanq)o;
                final izw izw2 = (izw)a27;
                final boolean g3 = izw2.g;
                boolean g4 = b2;
                if (aanq.a() != abkd.b) {
                    if (aanq.b()) {
                        g4 = b2;
                    }
                    else {
                        g4 = false;
                    }
                }
                if (g3 != (izw2.g = g4)) {
                    izw2.h();
                }
                return;
            }
            case 2: {
                ((izw)this.a).e = (boolean)o;
                return;
            }
            case 1: {
                final Object a28 = this.a;
                final gsf gsf = (gsf)o;
                final ivf l2 = ((izr)a28).l;
                if (l2 != null) {
                    final boolean a29 = gsf.a;
                    l2.k = a29;
                    l2.q.l(a29, false);
                }
                return;
            }
            case 0: {
                ((izv)this.a).b = (boolean)o;
            }
        }
    }
}
