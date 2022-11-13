import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import java.util.concurrent.TimeUnit;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.os.Looper;
import android.os.Handler;
import android.animation.Animator;
import java.util.Set;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

public class aaon implements aaoc, aaoq, aaoo, abps, acaw, tgg
{
    private static final aaoj a;
    private static final Property k;
    private final fzw A;
    public final aaod b;
    public final vcy c;
    public final wyw d;
    public final tgd e;
    public final Set f;
    public int g;
    public angg h;
    public Animator i;
    public final skt j;
    private final aaor l;
    private final abpl m;
    private final trc n;
    private final tjm o;
    private final Handler p;
    private final Runnable q;
    private final Set r;
    private final atke s;
    private String t;
    private String u;
    private boolean v;
    private int w;
    private boolean x;
    private final aaoi y;
    private abjv z;
    
    static {
        a = new aaoj(0);
        k = new aaoh(Long.class);
    }
    
    public aaon(final aaod b, final aaor l, final fzw a, final vcy c, final wyw d, final abpl m, final trc n, final tjm o, final tgd e, final atke s, final byte[] array, final byte[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        l.getClass();
        this.l = l;
        a.getClass();
        this.A = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        m.getClass();
        this.m = m;
        n.getClass();
        this.n = n;
        o.getClass();
        this.o = o;
        e.getClass();
        this.e = e;
        this.j = new skt((byte[])null);
        l.e(this);
        ((Set<aaon>)a.b).add(this);
        this.y = new aaoi(this);
        this.p = new Handler(Looper.getMainLooper());
        this.g = 0;
        this.w = 0;
        this.q = new aaog(this, 0);
        this.f = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.r = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        s.getClass();
        this.s = s;
    }
    
    private final void a() {
        this.b.mk();
        this.j.c(false);
    }
    
    private final void f() {
        this.p.removeCallbacks(this.q);
    }
    
    private final void g(final boolean v) {
        this.v = v;
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            ((aaok)iterator.next()).H(this.v);
        }
    }
    
    private final void h(final boolean b) {
        this.b.n(this.h, b);
        this.d.t((wzz)new wyt(this.h.s.I()), (alhi)null);
        this.j.c(true);
    }
    
    public final void A(final aani aani) {
        if (aani.a() == null) {
            return;
        }
        this.j(aani.a());
        final alem a = aani.a().a;
        aldx aldx;
        if ((aldx = a.g) == null) {
            aldx = aldx.a;
        }
        final int b = aldx.b;
        angg angg = null;
        angl a2;
        if (b == 78882851) {
            aldx aldx2;
            if ((aldx2 = a.g) == null) {
                aldx2 = aldx.a;
            }
            if (aldx2.b == 78882851) {
                a2 = (angl)aldx2.c;
            }
            else {
                a2 = angl.a;
            }
        }
        else {
            a2 = null;
        }
        if (a2 == null) {
            return;
        }
        angh angh;
        if ((angh = a2.i) == null) {
            angh = angh.a;
        }
        if ((angh.b & 0x1) != 0x0) {
            angh angh2;
            if ((angh2 = a2.i) == null) {
                angh2 = angh.a;
            }
            if ((angg = angh2.c) == null) {
                angg = angg.a;
            }
        }
        this.C(angg);
    }
    
    protected final void B(aiqj f) {
        f = this.d.f(f);
        this.c.a(f);
    }
    
    protected final void C(final angg h) {
        if (h != null && aakt.b(h) != null && aakt.a(h) != null) {
            this.h = h;
            this.D();
        }
    }
    
    public final void D() {
        int w = 0;
        Label_0321: {
            if (!TextUtils.isEmpty((CharSequence)this.u) && this.h != null) {
                final int g = this.g;
                final int n = 2;
                if ((g == 2 || g == 3) && (this.l.i() || this.h.n) && !this.m.l(abop.c) && this.m.l(abop.d) && this.z != abjv.h && !this.v && this.q() && !this.x) {
                    w = n;
                    if (this.g == 3) {
                        break Label_0321;
                    }
                    final angg h = this.h;
                    angf angf = null;
                    Label_0217: {
                        if (h != null) {
                            ange ange;
                            if ((ange = h.h) == null) {
                                ange = ange.a;
                            }
                            if ((ange.b & 0x1) != 0x0) {
                                ange ange2;
                                if ((ange2 = h.h) == null) {
                                    ange2 = ange.a;
                                }
                                if ((angf = ange2.c) == null) {
                                    angf = angf.a;
                                }
                                break Label_0217;
                            }
                        }
                        angf = null;
                    }
                    if (angf != null) {
                        int n2;
                        if (this.o.m()) {
                            n2 = angf.c;
                        }
                        else {
                            n2 = angf.b;
                        }
                        if (n2 != 0 && n2 != -1 && this.n.a() >= TimeUnit.MINUTES.toMillis(n2)) {
                            w = n;
                            break Label_0321;
                        }
                    }
                    w = n;
                    if (this.A.k()) {
                        break Label_0321;
                    }
                    if (!this.l.i()) {
                        w = n;
                        break Label_0321;
                    }
                    w = 1;
                    break Label_0321;
                }
            }
            w = 0;
        }
        if (this.w != w) {
            if (this.i != null) {
                this.f();
                this.i.cancel();
                this.i = null;
            }
            final aaoi y = this.y;
            if (y != null) {
                y.b = 0L;
                ((aaon)y.c).b.o(0L, y.a);
            }
            if ((this.w = w) != 0) {
                if (w != 1) {
                    this.h(true);
                    return;
                }
                final long millis = TimeUnit.SECONDS.toMillis(this.b());
                if (millis > 0L) {
                    final aaoi y2 = this.y;
                    y2.a = millis;
                    (this.i = (Animator)ObjectAnimator.ofObject((Object)y2, aaon.k, (TypeEvaluator)aaon.a, (Object[])new Long[] { millis })).setDuration(millis);
                    this.i.setInterpolator((TimeInterpolator)new LinearInterpolator());
                    this.f();
                    this.p.post(this.q);
                    this.h(false);
                    return;
                }
                this.a();
                this.u(true);
            }
            else {
                this.a();
            }
        }
    }
    
    public final void E() {
        this.x = true;
    }
    
    @Override
    public final void F() {
        this.D();
    }
    
    protected int b() {
        final angg h = this.h;
        if (h != null) {
            return h.l;
        }
        return 0;
    }
    
    protected void c() {
        this.g = 2;
    }
    
    public void d(final aans aans) {
        String k;
        if (aans.b() != null) {
            k = aans.b().K();
        }
        else {
            k = null;
        }
        if (!TextUtils.equals((CharSequence)k, (CharSequence)this.u)) {
            this.u = null;
            this.h = null;
            this.g = 0;
            this.D();
            this.u = k;
            this.g(false);
        }
        final abke c = aans.c();
        if (c == abke.j) {
            this.p();
        }
        final int g = this.g;
        if (g != 0 && c == abke.j) {
            if (g == 1) {
                if (this.s()) {
                    this.l();
                }
                else {
                    this.g = 2;
                }
            }
        }
        else {
            this.g = (c.a(new abke[] { abke.g, abke.c, abke.i, abke.d, abke.f }) ? 1 : 0);
            this.g(false);
        }
        this.D();
    }
    
    @Override
    public final void i(final boolean b) {
        this.D();
    }
    
    protected void j(final WatchNextResponseModel watchNextResponseModel) {
    }
    
    protected void k() {
    }
    
    protected void l() {
    }
    
    @Override
    public asir[] lX(final abpu abpu) {
        final asir an = ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 2L)).j(aale.q(1)).an((asjm)new aaoe(this, 0), (asjm)aaof.a);
        asir asir;
        if (((vai)abpu.ci().g).bx()) {
            asir = abpu.Q().an((asjm)new aaoe(this, 5), (asjm)aaof.a);
        }
        else {
            asir = abpu.P().j(aale.s(abpu.bM(), 2L)).j(aale.q(1)).an((asjm)new aaoe(this, 5), (asjm)aaof.a);
        }
        asir asir2;
        if (((vai)abpu.ci().g).bw()) {
            asir2 = ((ashi)abpu.cc().a).an((asjm)new aaoe(this, 6), (asjm)aaof.a);
        }
        else {
            asir2 = abpu.cc().c().j(aale.s(abpu.bM(), 2L)).j(aale.q(0)).an((asjm)new aaoe(this, 6), (asjm)aaof.a);
        }
        return new asir[] { an, asir, asir2, abpu.D().j(aale.s(abpu.bM(), 2L)).j(aale.q(1)).an((asjm)new aaoe(this, 2), (asjm)aaof.a), abpu.v().j(aale.s(abpu.bM(), 2L)).j(aale.q(1)).an((asjm)new aaoe(this, 3), (asjm)aaof.a), abpu.R().j(aale.s(abpu.bM(), 2L)).j(aale.q(1)).an((asjm)new aaoe(this, 4), (asjm)aaof.a) };
    }
    
    public final void m() {
    }
    
    public Class[] ms(final Class clazz, final Object o, final int n) {
        return aakv.a(this, o, n);
    }
    
    public final void o(final boolean b) {
    }
    
    public final void oN() {
        this.c();
    }
    
    protected void p() {
    }
    
    protected boolean q() {
        return true;
    }
    
    protected boolean r() {
        return true;
    }
    
    protected boolean s() {
        return false;
    }
    
    @Override
    public final void t() {
        final aicz a = aakt.a(this.h);
        if (a != null) {
            this.d.J(3, (wzz)new wyt(a.w), (alhi)null);
        }
        this.g(true);
        this.D();
    }
    
    @Override
    public final void u(final boolean b) {
        if (b) {
            if (this.r()) {
                final Iterator iterator = this.r.iterator();
                while (iterator.hasNext()) {
                    ((aaom)iterator.next()).a();
                }
                this.k();
                final xan g = (xan)this.s.a();
                final aboo d = aboo.d;
                final abjs a = abjt.a();
                a.g = g;
                this.m.a(new abop(d, null, a.a()));
            }
        }
        else {
            final aicz b2 = aakt.b(this.h);
            if (b2 != null) {
                this.d.J(3, (wzz)new wyt(b2.w), (alhi)null);
                aiqj aiqj;
                if ((aiqj = b2.o) == null) {
                    aiqj = aiqj.a;
                }
                this.B(aiqj);
            }
        }
    }
    
    protected final int v() {
        final angg h = this.h;
        if (h != null) {
            return h.m;
        }
        return -1;
    }
    
    public final void w(final aaol aaol) {
        ((Set<aaol>)this.j.b).add(aaol);
    }
    
    public final void x(final aany aany) {
        this.x |= (aany.a().a() == 3);
    }
    
    public final void y(final aamh aamh) {
        this.z = aamh.d();
        this.D();
    }
    
    public final void z(final aany aany) {
        final PlaybackStartDescriptor a = aany.a().o().a;
        String k;
        if (a != null) {
            k = a.k();
        }
        else {
            k = null;
        }
        if (!TextUtils.equals((CharSequence)this.t, (CharSequence)k)) {
            this.t = k;
            this.x = false;
        }
    }
}
