import java.util.function.Predicate;
import java.util.Iterator;
import j$.util.Optional;
import android.view.View$OnLayoutChangeListener;
import java.util.Set;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqj implements fob
{
    private final aatp A;
    private final ivb B;
    private final aatl C;
    private final irn D;
    private final MdxOverlaysPresenter E;
    private final SuggestedActionsMainController F;
    private final eun G;
    private final YouTubeControlsOverlay H;
    private final iye I;
    private final abad J;
    private final abad K;
    private final abns L;
    private final uyf M;
    private final avt N;
    private final eg O;
    private final YouTubePlayerOverlaysLayout a;
    private final aapf b;
    private final shw c;
    private final rvf d;
    private final irz e;
    private final foh f;
    private final asib g;
    private final aamx h;
    private final aatu i;
    private final aatv j;
    private final ktb k;
    private final tpw l;
    private final izk m;
    private final iwy n;
    private final abaa o;
    private final sgu p;
    private final shs q;
    private final shg r;
    private final sha s;
    private final CreatorEndscreenOverlayPresenter t;
    private final aatb u;
    private final abav v;
    private final aatk w;
    private final iro x;
    private final iss y;
    private final sky z;
    
    public iqj(final YouTubePlayerOverlaysLayout a, final aapf b, final shw c, final rvf d, final irz e, final qv qv, final foh f, final YouTubeControlsOverlay h, final iye i, final aatl c2, final aatp a2, final abad k, final abad j, final sky z, final irn d2, final aatu l, final aatv m, final ktb k2, final ivb b2, final sgu p47, final abaa o, final shs q, final shg r, final sha s, final izk m2, final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, final abav abav, final aatb u, final aatk w, final iro x, final iss y, final uyf m3, final abns l2, final aamx h2, final tpw l3, final MdxOverlaysPresenter e2, final SuggestedActionsMainController f2, final avt n, final eun g, final iwy n2, final eg o2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.H = h;
        this.I = i;
        this.C = c2;
        this.K = k;
        this.J = j;
        this.z = z;
        this.A = a2;
        this.D = d2;
        this.i = l;
        this.j = m;
        this.k = k2;
        this.B = b2;
        this.p = p47;
        this.o = o;
        this.q = q;
        this.r = r;
        this.s = s;
        this.m = m2;
        this.t = creatorEndscreenOverlayPresenter;
        this.v = abav;
        this.u = u;
        this.w = w;
        this.x = x;
        this.y = y;
        this.M = m3;
        this.L = l2;
        this.h = h2;
        this.l = l3;
        this.g = new asib();
        this.E = e2;
        this.F = f2;
        this.N = n;
        this.G = g;
        this.n = n2;
        this.O = o2;
        h.t = (aawm)creatorEndscreenOverlayPresenter;
        j.c = false;
        h.pj((aazw)j);
        k.c = false;
        c2.pj((aazw)k);
        final Set a3 = l.a;
        x.getClass();
        a3.add(x);
        l3.b((tpx)b2);
        u.a((aata)f);
        if (b2 != null) {
            final fof fof = f.a[1];
            fof.a.add((Object)b2);
            ((tpt)b2).f = fof.b;
            f.b();
        }
        b.c((aape)a2);
        b.c((aape)c2);
        b.c((aape)z);
        b.c((aape)l);
        b.c((aape)m);
        b.c((aape)k2);
        h.getClass();
        ((absd)a).l = (Runnable)new ihc(h, 6);
        e.b = (abaw)abav;
        d2.h((aami)x);
        d2.h((aami)h2);
        ((aams)x).x((aamq)h);
        ((aams)x).f.add(h);
        ((aams)x).x((aamq)f2);
        e2.d.f.add(h);
        e2.d.e.add(h);
        (n2.e = new FrameLayout(h.A().getContext())).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        n2.e.setVisibility(8);
        h.B((View)n2.e);
        qv.c((foa)this);
    }
    
    public final void a() {
        this.H.oE();
    }
    
    public final void b() {
        this.H.R();
    }
    
    public final void lV() {
        this.g.b();
        this.c.d();
        this.d.d((rna)this.q);
        this.d.d((rna)this.r);
        this.d.d((rna)this.s);
        this.d.d((rna)this.m);
        final shs q = this.q;
        if (q.e != null && q.h != null) {
            q.f();
        }
        final shg r = this.r;
        if (r.e != null && r.h != null) {
            r.f();
        }
        final sha s = this.s;
        if (s.e != null) {
            s.f();
        }
        final izk m = this.m;
        if (m.e) {
            m.b();
        }
        final iro x = this.x;
        if (((aams)x).g == 2) {
            ((aams)x).g = 3;
            ((aams)x).E();
        }
        final abaa o = this.o;
        o.c();
        o.S.a();
        final aatk w = this.w;
        ((aato)w.a).a = null;
        ((isl)w.b).b = null;
        ((aauw)w.c.a()).e = null;
        this.a.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this.y);
        this.N.p();
        final Object c = this.O.c;
        final Optional empty = Optional.empty();
        final adof adof = (adof)c;
        adof.c = empty;
        adof.b = afgq.a;
    }
    
    public final void oL(final fkk fkk, final fkk fkk2) {
        final iye i = this.I;
        while (true) {
            for (final jjg j : i.a) {
                if (((Predicate<fkk>)j.b).test(fkk2)) {
                    final jjg k = i.j;
                    boolean l = false;
                    if (k != j) {
                        for (final jjg jjg : i.a) {
                            if (jjg != j) {
                                ((fpg)jjg.a).setVisibility(8);
                            }
                        }
                        if ((i.j = j) != null) {
                            ((fpg)j.a).setVisibility(0);
                        }
                    }
                    this.J.c = this.H.ow(fkk2);
                    this.K.c = fkk2.h();
                    final CreatorEndscreenOverlayPresenter t = this.t;
                    final boolean b = fkk2.m() || fkk2.f();
                    final boolean o = fkk2.o();
                    final boolean m = fkk2.c() && !fkk2.f();
                    if (b || o) {
                        l = true;
                    }
                    if (t.i != l || t.k != m) {
                        t.k = m;
                        if (t.i = l) {
                            final aaxg l2 = t.l;
                            if (l2 != null) {
                                l2.a(true);
                            }
                        }
                        if (t.h) {
                            t.w();
                        }
                    }
                    return;
                }
            }
            jjg j = null;
            continue;
        }
    }
    
    public final void qB() {
        alvl alvl;
        if ((alvl = this.M.b().e) == null) {
            alvl = alvl.a;
        }
        if (alvl.Q) {
            this.g.f(this.j.lX(this.L));
        }
        this.g.f(((abnq)this.o.V).lX(this.L));
        this.g.f(this.v.s.lX(this.L));
        this.c.l(this.p);
        this.d.a((rna)this.q);
        this.d.a((rna)this.r);
        this.d.a((rna)this.s);
        this.d.a((rna)this.m);
        final sha s = this.s;
        if (s.e != null) {
            s.h(s.i);
        }
        final izk m = this.m;
        if (m.e) {
            m.d();
        }
        ((aams)this.x).E();
        final abaa o = this.o;
        o.b();
        o.S.b();
        final aatk w = this.w;
        ((aato)w.a).a = (aatm)w;
        ((isl)w.b).b = (aatm)w;
        ((aauw)w.c.a()).e = (aauu)w;
        this.a.addOnLayoutChangeListener((View$OnLayoutChangeListener)this.y);
        this.N.q((eue)this.G);
        final eg o2 = this.O;
        final Object c = o2.c;
        final Object d = o2.d;
        final Object b = o2.b;
        final Optional of = Optional.of(d);
        final adof adof = (adof)c;
        adof.c = of;
        adof.b = b;
    }
}
