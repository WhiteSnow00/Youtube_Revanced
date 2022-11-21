import java.util.concurrent.atomic.AtomicReference;
import android.view.View;
import android.os.Bundle;
import android.content.res.Configuration;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Map;
import java.util.List;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class acpf extends acql implements View$OnClickListener, acrq, acss
{
    private final aclm M;
    private final asln N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private acbk T;
    private acbk U;
    private final List a;
    private final Map b;
    private final acrf c;
    private final acsu d;
    private final acsi e;
    public final aclr f;
    public final acmd g;
    public final List h;
    public final thg i;
    public final acpd j;
    public final Object k;
    public final List l;
    public acla m;
    public acla n;
    public boolean o;
    public String p;
    public acbk q;
    public Runnable r;
    public boolean s;
    public acsm t;
    public acpc u;
    public final arzb v;
    
    public acpf(final acsx acsx, final acmd g, final acrr acrr, final acrr acrr2, final vnq vnq, final thg i, final acrf c, final tre tre, final xab xab, final acsu d, final acsi e, final arzb v, final aske aske, final Queue queue, final byte[] array, final byte[] array2) {
        super(acsx.a(acsx), vnq, i, thg.c(), tre, xab, queue);
        this.k = new Object();
        this.p = "";
        this.S = false;
        this.g = g;
        i.getClass();
        this.i = i;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.v = v;
        final aclr f = new aclr();
        this.f = f;
        this.h = new ArrayList();
        this.a = new ArrayList();
        this.l = new ArrayList();
        this.b = new HashMap();
        final acpd j = new acpd(this, acrr, acrr2);
        this.j = j;
        this.R = true;
        this.s = true;
        this.u = null;
        if (acsx instanceof acpe) {
            final acpe acpe = (acpe)acsx;
            this.p(acpe.a, acpe.b);
            this.S = acpe.e;
            j.d(acpe.c);
            this.U = acpe.d;
            this.S();
        }
        this.N = aske.B((asmo)new uti(this, 10)).am((asmi)new acbf(this, 4));
        g.h((acla)f);
        g.f((acma)(this.M = new aclm(xab)));
        g.f((acma)new aclm(xab));
        g.f((acma)new kgp((acss)this, 8));
        g.tg(j);
        j.g(super.I, null);
    }
    
    private final void aq() {
        final Iterator iterator = this.h.iterator();
        while (iterator.hasNext()) {
            ((acre)iterator.next()).sa();
        }
    }
    
    private final void ar(final vic vic) {
        boolean s = false;
        if (vic != null) {
            s = s;
            if (vic.a.t) {
                s = true;
            }
        }
        this.S = s;
        this.S();
    }
    
    private final void o(final Object o, final acsx acsx) {
        final acre a = this.c.a(o, acsx, (acss)this);
        if (a != null) {
            this.h.add(a);
            this.a.add(o);
            this.f.n(this.q(), a.a());
            String lf;
            if (a instanceof acqu) {
                lf = ((acqu)a).lF();
            }
            else {
                lf = null;
            }
            if (!TextUtils.isEmpty((CharSequence)lf)) {
                this.b.put(lf, a);
            }
            if (a instanceof acqh) {
                final acqh acqh = (acqh)a;
                if (this.an(acqh)) {
                    this.L(acqh);
                }
            }
        }
    }
    
    private final void p(final List list, final List list2) {
        if (!this.o) {
            final acla m = this.m;
            if (m != null && this.f.i(m) == -1) {
                this.f.o(this.m);
            }
        }
        final Iterator iterator = list.iterator();
        Iterator iterator2;
        if (list2 != null) {
            iterator2 = list2.iterator();
        }
        else {
            iterator2 = null;
        }
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            acsx acsx;
            if (iterator2 != null && iterator2.hasNext()) {
                acsx = (acsx)iterator2.next();
            }
            else {
                acsx = null;
            }
            this.o(next, acsx);
        }
        this.j.a(null);
        final acla n = this.n;
        if (n != null && this.f.i(n) == -1) {
            this.f.m(this.n);
        }
        this.o = true;
    }
    
    public final void A(final afbk afbk) {
        this.g.h((acla)new aclh((acla)this.f, afbk));
    }
    
    public final void B() {
        this.D(true);
    }
    
    public final void D(final boolean b) {
        int n = 0;
        int n2 = 0;
        this.S = false;
        this.o = false;
        if (b) {
            if (this.m != null) {
                n2 = 1;
            }
            n = n2;
            if (this.Q) {
                n = n2 + 1;
            }
        }
        final aclr f = this.f;
        if (n > 0) {
            int i = f.h() - 1;
            tcl.l();
            if (!f.a.isEmpty()) {
                if (n <= i && i < f.a.size()) {
                    final int g = f.a.get(i).g();
                    final int b2 = f.a.get(n).b;
                    while (i >= n) {
                        f.p(i);
                        --i;
                    }
                    f.s();
                    final int n3 = g - b2;
                    if (n3 > 0) {
                        f.y(b2, n3);
                    }
                }
            }
        }
        else {
            f.t();
        }
        this.r = null;
        final acla n4 = this.n;
        if (n4 != null) {
            this.f.m(n4);
        }
        this.aq();
        this.h.clear();
        this.a.clear();
        this.b.clear();
        this.p = "";
        this.L(null);
        this.rW();
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            ((acsr)iterator.next()).b();
        }
    }
    
    protected final void E() {
        final acbk x = this.X(acbj.b);
        if (this.T != x) {
            this.lL(acbj.b);
            this.T = x;
        }
    }
    
    public final void F() {
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            ((acsr)iterator.next()).e();
        }
    }
    
    public void G(final Configuration configuration) {
        throw null;
    }
    
    protected final void H(final vic vic, final acbk acbk) {
        super.my(vic, acbk);
        if (vic == null) {
            return;
        }
        if (acbk.a() == acbj.d) {
            this.P(vic);
            return;
        }
        this.y(vic);
    }
    
    protected abstract void I(final Bundle p0);
    
    public final void J() {
        this.g.h((acla)this.f);
    }
    
    public final void K() {
        final acrp b = this.j.b;
        if (b != null && b.a instanceof acqd) {
            final acrq d = b.d;
            if (d != null) {
                d.oK();
            }
        }
    }
    
    protected final void L(acqh acqh) {
        final boolean ap = acql.ap(acqh);
        acqh acqh2;
        if (ap) {
            acqh2 = super.L;
        }
        else {
            acqh2 = super.K;
        }
        final Object o = null;
        if (acqh2 != null) {
            acqh2.G = null;
        }
        if (ap) {
            super.L = acqh;
        }
        else {
            super.K = acqh;
        }
        if (acqh != null) {
            acqh.G = super.J;
        }
        Object z = o;
        if (acqh != null) {
            z = acqh.Z();
        }
        this.j.g(super.I, z);
        acqh = super.L;
        if (acqh != null && acql.ao(acqh)) {
            acqh = super.L;
        }
        else {
            acqh = super.K;
        }
        if (acqh instanceof acqk && acqh.al(acbj.b)) {
            ((acqk)acqh).N(false);
        }
    }
    
    public final void M(final acla m) {
        final acla i = this.m;
        if (i == m) {
            return;
        }
        if (i != null) {
            this.f.q(i);
        }
        this.m = m;
        if (m != null && this.o) {
            this.f.o(m);
        }
    }
    
    public final void N(final vic vic) {
        this.O(vic, null, null);
    }
    
    public final void O(final vic vic, final xbn xbn, final Bundle bundle) {
        this.T(vic, xbn, bundle);
        this.d();
        this.ar(vic);
    }
    
    public final void P(final vic vic) {
        this.W(vic, null);
    }
    
    public final void Q(final boolean r) {
        this.R = r;
        this.S();
    }
    
    public final void R() {
        this.j.b();
    }
    
    final void S() {
        if (this.pR()) {
            this.e.sc(1);
            return;
        }
        this.e.sc(3);
    }
    
    public final boolean T(final vic vic, final xbn b, final Bundle bundle) {
        this.M.b = b;
        final boolean o = this.o;
        if (o) {
            this.g.h((acla)acle.a);
        }
        this.i();
        this.y(vic);
        if (o) {
            this.g.h((acla)this.f);
        }
        Bundle bundle2 = bundle;
        if (vic != null) {
            final aobc a = vic.a;
            bundle2 = bundle;
            if ((a.c & 0x80000) != 0x0) {
                bundle2 = bundle;
                if (a.s > 0) {
                    if ((bundle2 = bundle) == null) {
                        bundle2 = new Bundle();
                    }
                    bundle2.putInt("scroll_position", vic.a.s);
                }
            }
        }
        this.I(bundle2);
        return o;
    }
    
    protected final acpc U() {
        synchronized (this.k) {
            return this.u;
        }
    }
    
    public final void V(final vic vic) {
        this.O(vic, null, null);
    }
    
    public void W(final vic vic, final Bundle bundle) {
        throw null;
    }
    
    public void d() {
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            ((acsr)iterator.next()).a();
        }
        final boolean o = this.O;
        if (o && !this.P) {
            return;
        }
        this.O = true;
        if (o ^ true) {
            this.j();
        }
        if (this.h.isEmpty() && this.al(acbj.d)) {
            this.lL(acbj.d);
            this.P = false;
        }
        if (this.P) {
            this.oj();
            this.P = false;
        }
    }
    
    protected void h(final aobc aobc) {
    }
    
    public void i() {
        throw null;
    }
    
    protected abstract void j();
    
    protected boolean k(final acqe acqe) {
        amls amls;
        if ((amls = this.v.f().f) == null) {
            amls = amls.a;
        }
        return !amls.f || !acqe.c() || acqe.d();
    }
    
    protected abstract void l(final int p0, final int p1);
    
    protected final /* bridge */ Object lE(final anxa anxa) {
        if (anxa != null && ((ahcu)anxa).ry((ahci)aobc.b)) {
            return new vic((aobc)((ahcu)anxa).rx((ahci)aobc.b));
        }
        return null;
    }
    
    public final void lH(final anwr anwr, final aisc aisc) {
        this.i();
        this.j.a(aamp.x(anwr));
        this.ad(aamp.x(anwr), aisc);
    }
    
    protected final void lJ(final dbm dbm, final acbk u) {
        super.lJ(dbm, u);
        this.U = u;
    }
    
    protected final boolean lO() {
        synchronized (this.k) {
            return this.s;
        }
    }
    
    public void m() {
        this.P = true;
    }
    
    public final void mA(final String s) {
        ((acsm)this).oL(s, 0, null);
    }
    
    public final void mz(final anwr anwr, final tui tui, final acqm acqm, final aisc aisc) {
        this.i();
        this.j.a(aamp.x(anwr));
        this.ae(tui, acqm, aamp.x(anwr), aisc);
    }
    
    public final void oK() {
        final acbk u = this.U;
        if (u != null) {
            this.mB(u);
            this.U = null;
        }
    }
    
    public final boolean oL(final String s, final int n, final Runnable r) {
        final acre u = this.u(s);
        if (u == null || u.a() == null || u.a().isEmpty()) {
            final acsm t = this.t;
            return t != null && t.oL(s, n, r);
        }
        final int j = this.f.j(u.a());
        if (j >= 0) {
            this.r = r;
            this.l(j, n);
            return true;
        }
        return false;
    }
    
    public void oj() {
        if (this.al(acbj.d)) {
            this.ah();
            return;
        }
        if (this.d.pR()) {
            this.d.oj();
            return;
        }
        this.e.sc(1);
    }
    
    public final void onClick(final View view) {
        this.lL(acbj.b);
    }
    
    public final boolean pR() {
        return !this.S && ((this.R && this.al(acbj.d)) || this.d.pR());
    }
    
    public final int q() {
        final int i = this.f.i(this.j.a);
        if (i != -1) {
            return i;
        }
        return this.f.i(this.n);
    }
    
    public acsx qz() {
        final ArrayList list = new ArrayList(this.h.size());
        final Iterator iterator = this.h.iterator();
        while (iterator.hasNext()) {
            list.add(((acre)iterator.next()).qz());
        }
        final acsx qz = super.qz();
        final List a = this.a;
        final acrp b = this.j.b;
        acqf a2;
        if (b != null) {
            a2 = b.a;
        }
        else {
            a2 = null;
        }
        return new acpe(qz, a, list, a2, this.U, this.S);
    }
    
    public Bundle r() {
        throw null;
    }
    
    public final void rW() {
        super.rW();
        this.T = null;
        this.q = null;
        final acpd j = this.j;
        final acrp b = j.b;
        if (b != null) {
            j.d(b.a);
        }
        final acrp d = j.d;
        if (d != null) {
            j.f(d.a);
        }
        final acrr a = j.a;
        if (a != null) {
            a.clear();
        }
        j.b = null;
        final acrr c = j.c;
        if (c != null) {
            c.clear();
        }
        j.d = null;
    }
    
    public abstract View s();
    
    public void sa() {
        super.sa();
        this.r = null;
        this.aq();
        this.j.h();
        atkw.f((AtomicReference)this.N);
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            ((acsr)iterator.next()).d();
        }
    }
    
    public final acla t() {
        return (acla)this.f;
    }
    
    public final acre u(final String s) {
        return this.b.get(s);
    }
    
    protected final void v(final Object o) {
        this.Q = true;
        this.x(o);
    }
    
    public final void w(final acma acma) {
        this.g.f(acma);
    }
    
    public final void x(final Object o) {
        this.o(o, null);
    }
    
    public final void y(final vic vic) {
        if (vic == null) {
            return;
        }
        final boolean b = this.o ^ true;
        if (vic.b == null) {
            vic.b = (afgh)((asla)askp.U((Iterable)vic.a.e).Z((asmn)vmk.b).q((askt)twy.a).aO((asmn)twx.c)).ac();
        }
        super.lM(vic.b);
        this.S();
        if (b) {
            this.Q = false;
            this.h(vic.a);
            this.ar(vic);
        }
        this.p(vic.a(), null);
        final Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            ((acsr)iterator.next()).c(vic, b);
        }
        this.p = vic.a.m;
    }
    
    public final void z(final acsr acsr) {
        this.l.add(acsr);
    }
}
