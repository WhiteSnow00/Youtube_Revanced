import j$.util.Optional;
import java.util.Map;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyRendererOuterClass;
import java.util.Collection;
import android.animation.ObjectAnimator;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import java.util.function.Consumer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmv extends nq
{
    public final List a;
    public hnf e;
    public final hne f;
    public final boolean g;
    public final boolean h;
    public boolean i;
    private final hre j;
    private final hpt k;
    private final hrd l;
    private final boolean m;
    private boolean n;
    private final vai o;
    private final heo p;
    private final heo q;
    private final arwh r;
    private final hyx s;
    private final fzw t;
    
    public hmv(final hyx s, final heo q, final heo p17, final fzw t, final arwh r, final vai o, final hre j, final hpt k, final hne f, final hrd l, final boolean n, final boolean m, final boolean h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = new ArrayList();
        this.e = null;
        this.s = s;
        this.q = q;
        this.p = p17;
        this.t = t;
        this.r = r;
        this.o = o;
        this.j = j;
        this.k = k;
        this.f = f;
        this.l = l;
        this.g = n;
        this.m = m;
        this.h = h;
        this.i = n;
        this.n = n;
        this.s(true);
    }
    
    private final int O() {
        if (this.m) {
            return 1;
        }
        return 0;
    }
    
    private static boolean P(final hnf hnf, final aiqj aiqj) {
        if (hnf == null) {
            return false;
        }
        if (!hnf.b) {
            if (((ahbc)hnf.e).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) && ((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)hnf.e).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                return reelWatchEndpointOuterClass$ReelWatchEndpoint.e.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint2.e) && reelWatchEndpointOuterClass$ReelWatchEndpoint.f.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint2.f);
            }
            if (((ahbc)hnf.e).ry((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint) && ((ahbc)aiqj).ry((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
                return ((ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((ahbc)hnf.e).rx((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)).equals((Object)((ahbc)aiqj).rx((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint));
            }
        }
        return false;
    }
    
    public final int A(final int n) {
        return n + this.O();
    }
    
    public final int B() {
        if (this.o.cm() > 0L) {
            return (int)this.o.cm();
        }
        return 40;
    }
    
    public final int C(final long n) {
        final List a = this.a;
        monitorenter(a);
        int i = 0;
        try {
            while (i < this.a.size()) {
                if (((hnf)this.a.get(i)).a == n) {
                    final int a2 = this.A(i);
                    monitorexit(a);
                    return a2;
                }
                ++i;
            }
            monitorexit(a);
            return -1;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final int D() {
        if (this.m && this.g) {
            return 0;
        }
        return -1;
    }
    
    public final long E(final int n) {
        final hnf h = this.H(n);
        if (h == null) {
            return Long.MIN_VALUE;
        }
        return h.a;
    }
    
    public final hnf F(final aiqj aiqj, int n) {
        final List a = this.a;
        monitorenter(a);
        try {
            final int size = this.a.size();
            int b = this.b(n);
            n = size - 1;
            if (b >= 0 && b < size) {
                final hnf hnf = this.a.get(b);
                if (P(hnf, aiqj)) {
                    monitorexit(a);
                    return hnf;
                }
                n = b - 1;
                ++b;
            }
            else {
                b = size;
            }
            while (n >= 0 || b < size) {
                int n2;
                if ((n2 = b) < size) {
                    final hnf hnf2 = this.a.get(b);
                    if (P(hnf2, aiqj)) {
                        monitorexit(a);
                        return hnf2;
                    }
                    n2 = b + 1;
                }
                b = n2;
                if (n >= 0) {
                    final hnf hnf3 = this.a.get(n);
                    if (P(hnf3, aiqj)) {
                        monitorexit(a);
                        return hnf3;
                    }
                    --n;
                    b = n2;
                }
            }
            monitorexit(a);
            return null;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final hnf G(final long n) {
        return this.H(this.C(n));
    }
    
    public final hnf H(int b) {
        synchronized (this.a) {
            b = this.b(b);
            hnf hnf = null;
            if (b >= 0) {
                hnf = hnf;
                if (b < this.a.size()) {
                    hnf = this.a.get(b);
                }
            }
            return hnf;
        }
    }
    
    public final aiqj I(final long n) {
        final hnf g = this.G(n + 1L);
        if (g != null) {
            return g.e;
        }
        return null;
    }
    
    public final aiqj J(final long n) {
        final hnf g = this.G(n - 1L);
        if (g != null) {
            return g.e;
        }
        return null;
    }
    
    public final void K(final ttg ttg) {
        final List a = this.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ttg.a((Object)iterator.next());
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void L(final boolean n) {
        if (this.g && this.n != n) {
            this.n = n;
            synchronized (this.a) {
                final int n2 = this.O() + this.a.size();
                monitorexit(this.a);
                if (n) {
                    this.j(n2);
                    return;
                }
                this.o(n2);
            }
        }
    }
    
    public final boolean M() {
        ajrk ajrk;
        if ((ajrk = this.r.f().A) == null) {
            ajrk = ajrk.a;
        }
        final ahaz builder = ((ahbh)ajrl.a).createBuilder();
        builder.copyOnWrite();
        ajrl.a((ajrl)builder.instance);
        final ajrl ajrl = (ajrl)builder.build();
        final ahcr b = ajrk.b;
        final Long value = 45366411L;
        ajrl ajrl2 = ajrl;
        if (((Map)b).containsKey(value)) {
            ajrl2 = (ajrl)((Map)b).get(value);
        }
        if (ajrl2.b != 1 || !(boolean)ajrl2.c) {
            ajrk ajrk2;
            if ((ajrk2 = this.r.f().A) == null) {
                ajrk2 = ajrk.a;
            }
            final ahaz builder2 = ((ahbh)ajrl.a).createBuilder();
            builder2.copyOnWrite();
            ajrl.a((ajrl)builder2.instance);
            final ajrl ajrl3 = (ajrl)builder2.build();
            final ahcr b2 = ajrk2.b;
            final Long value2 = 45383267L;
            ajrl ajrl4 = ajrl3;
            if (((Map)b2).containsKey(value2)) {
                ajrl4 = (ajrl)((Map)b2).get(value2);
            }
            if (ajrl4.b != 1 || !(boolean)ajrl4.c) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean N() {
        ajrk ajrk;
        if ((ajrk = this.r.f().A) == null) {
            ajrk = ajrk.a;
        }
        final ahaz builder = ((ahbh)ajrl.a).createBuilder();
        builder.copyOnWrite();
        ajrl.a((ajrl)builder.instance);
        final ajrl ajrl = (ajrl)builder.build();
        final ahcr b = ajrk.b;
        final Long value = 45383268L;
        ajrl ajrl2 = ajrl;
        if (((Map)b).containsKey(value)) {
            ajrl2 = (ajrl)((Map)b).get(value);
        }
        return ajrl2.b == 1 && (boolean)ajrl2.c;
    }
    
    public final int a() {
        synchronized (this.a) {
            final int size = this.a.size();
            final int o = this.O();
            final int n = this.n ? 1 : 0;
            monitorexit(this.a);
            return size + o + n;
        }
    }
    
    public final int b(final int n) {
        return n - this.O();
    }
    
    public final int d(final int n) {
        if (this.b(n) < 0) {
            return 0;
        }
        final hnf h = this.H(n);
        if (h == null) {
            return 1;
        }
        if (h.b) {
            return 4;
        }
        if (hko.p(h.b())) {
            return 5;
        }
        if (h.e()) {
            return 6;
        }
        if (h.d()) {
            return 7;
        }
        if (hko.x(h.e)) {
            return 3;
        }
        return 2;
    }
    
    public final /* bridge */ on g(final ViewGroup viewGroup, final int n) {
        Object o;
        if (n == 4) {
            final hyx s = this.s;
            final boolean h = this.h;
            final acbm acbm = (acbm)((atke)s.a).a();
            acbm.getClass();
            final accf accf = (accf)((atke)s.c).a();
            accf.getClass();
            final wyv wyv = (wyv)((atke)s.b).a();
            wyv.getClass();
            final hph hph = (hph)((atke)s.d).a();
            hph.getClass();
            viewGroup.getClass();
            o = new hnz(acbm, accf, wyv, hph, viewGroup, h);
        }
        else if (n == 6) {
            final heo p2 = this.p;
            final hrd l = this.l;
            final boolean h2 = this.h;
            final hmb hmb = (hmb)((atke)p2.b).a();
            hmb.getClass();
            final hqb hqb = (hqb)((atke)p2.a).a();
            hqb.getClass();
            final hml hml = (hml)((atke)p2.c).a();
            hml.getClass();
            viewGroup.getClass();
            o = new hmu(hmb, hqb, hml, l, viewGroup, h2);
        }
        else {
            boolean b = false;
            if (n == 7) {
                final ViewGroup viewGroup2 = (ViewGroup)LayoutInflater.from(viewGroup.getContext()).inflate(2131625251, viewGroup, false);
                final fzw t = this.t;
                final hpt k = this.k;
                final abpq abpq = (abpq)((atke)t.a).a();
                abpq.getClass();
                final hzn hzn = (hzn)((atke)t.b).a();
                hzn.getClass();
                viewGroup2.getClass();
                o = new hlv(abpq, hzn, k, viewGroup2, (byte[])null, (byte[])null, (byte[])null);
            }
            else if (n != 0 && n != 1) {
                final ViewGroup viewGroup3 = (ViewGroup)LayoutInflater.from(viewGroup.getContext()).inflate(2131625251, viewGroup, false);
                final heo q = this.q;
                final hre j = this.j;
                final arwh arwh = (arwh)((atke)q.b).a();
                arwh.getClass();
                final hmb hmb2 = (hmb)((atke)q.c).a();
                hmb2.getClass();
                final vai vai = (vai)((atke)q.a).a();
                vai.getClass();
                viewGroup3.getClass();
                o = new hob(arwh, hmb2, vai, j, viewGroup3, (byte[])null, (byte[])null);
            }
            else {
                final boolean u = this.f.u;
                if (0x1 == (n ^ 0x1)) {
                    b = true;
                }
                o = new hmm(viewGroup, u, b);
            }
        }
        return (on)o;
    }
    
    public final long mR(final int n) {
        if (this.b(n) < 0) {
            return Long.MIN_VALUE;
        }
        final hnf h = this.H(n);
        if (h != null) {
            return h.a;
        }
        return Long.MAX_VALUE;
    }
    
    public final void q(final on on, final int n) {
        final hoc hoc = (hoc)on;
        final hnf h = this.H(n);
        final boolean b = hoc instanceof hob;
        final int n2 = 4;
        final boolean b2 = false;
        Label_1681: {
            if (b && h != null) {
                final hob g = (hob)hoc;
                if (g.v != h) {
                    g.v = h;
                    h.g = (hoc)g;
                    final ReelWatchEndpointOuterClass$ReelWatchEndpoint b3 = h.b();
                    if ((b3.b & 0x80) != 0x0) {
                        g.u.f().ifPresent((Consumer)new hoa(b3, 0));
                    }
                    else {
                        g.u.f().ifPresent((Consumer)gyr.h);
                    }
                    g.t.f(h.e, g.u.c());
                    final hrf u = g.u;
                    if (!hko.y(b3)) {
                        hko.p(b3);
                    }
                    u.t = h.c;
                    final String e = b3.e;
                    final akqn f = h.f;
                    boolean p2 = hko.p(b3);
                    if (f == null) {
                        if (p2) {
                            p2 = true;
                        }
                        else {
                            if ((b3.b & 0x200) != 0x0) {
                                final ante k = hko.k(b3);
                                Label_0961: {
                                    boolean b4;
                                    if (g.w.f(45383519L)) {
                                        final ante i = hko.k(b3);
                                        b4 = (i == null || ((i.c & 0x200) == 0x0 && (i.b & 0x8) == 0x0));
                                    }
                                    else {
                                        final int cb = aqsx.cb(b3.d);
                                        if (cb == 0 || cb != 3) {
                                            break Label_0961;
                                        }
                                        ansk ansk;
                                        if ((ansk = g.x.f().u) == null) {
                                            ansk = ansk.a;
                                        }
                                        if (hko.v(hko.k(b3))) {
                                            b4 = ansk.g;
                                        }
                                        else {
                                            b4 = ansk.f;
                                        }
                                    }
                                    if (b4) {
                                        final hrf u2 = g.u;
                                        hnu.f(u2.i, h.c);
                                        final hqh a = u2.a;
                                        if ((a.H = k) == null) {
                                            break Label_1681;
                                        }
                                        a.J.clear();
                                        a.K.clear();
                                        final int r = hqh.r(k);
                                        if (hko.E(r)) {
                                            a.g();
                                        }
                                        else {
                                            a.n = LayoutInflater.from(a.e.getContext()).inflate(2131625233, a.e, false);
                                            a.e.addView(a.n);
                                        }
                                        a.q = a.n.findViewById(2131430821);
                                        a.o = (LottieAnimationView)a.n.findViewById(2131430952);
                                        final LottieAnimationView o = a.o;
                                        if (o != null) {
                                            o.g(2131951688);
                                            a.o.setPadding(a.n.getResources().getDimensionPixelSize(2131169156), 0, 0, a.n.getResources().getDimensionPixelSize(2131169155));
                                        }
                                        a.p = (ViewGroup)a.n.findViewById(2131430861);
                                        if (a.e.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                                            a.o.setScaleX(-1.0f);
                                        }
                                        hnu.f((View)a.e, true);
                                        hnu.f(a.q, false);
                                        a.J.add(ObjectAnimator.ofFloat((Object)a.o, View.ALPHA, new float[] { 0.0f, 1.0f }));
                                        a.J.add(ObjectAnimator.ofFloat((Object)a.p, View.ALPHA, new float[] { 0.0f, 1.0f }));
                                        a.K.add(ObjectAnimator.ofFloat((Object)a.o, View.ALPHA, new float[] { 1.0f, 0.0f }));
                                        a.K.add(ObjectAnimator.ofFloat((Object)a.p, View.ALPHA, new float[] { 1.0f, 0.0f }));
                                        if (a.H != null) {
                                            if (a.p != null) {
                                                final boolean e2 = hko.E(r);
                                                int n4;
                                                for (int j = 0; j < 5; j = n4 + 1) {
                                                    int n3;
                                                    int n5;
                                                    if (e2) {
                                                        if (j == 4) {
                                                            n3 = 2131625263;
                                                            n4 = 4;
                                                            n5 = 2131232141;
                                                        }
                                                        else {
                                                            n5 = 2131232142;
                                                            n4 = j;
                                                            n3 = 2131625262;
                                                        }
                                                    }
                                                    else {
                                                        n5 = 2131232140;
                                                        final int n6 = 2131625234;
                                                        n4 = j;
                                                        n3 = n6;
                                                    }
                                                    final View q = hqh.q(a.p, r, n3, n5);
                                                    if (!e2) {
                                                        q.setPaddingRelative(q.getPaddingStart(), 0, q.getPaddingEnd(), q.getPaddingBottom());
                                                    }
                                                }
                                            }
                                        }
                                        if (a.o != null) {
                                            a.L.setDuration(100L);
                                            a.L.playTogether((Collection)a.J);
                                            a.L.start();
                                            a.o.m(0.0f);
                                            a.o.e();
                                            hnu.f((View)a.o, true);
                                            hnu.f((View)a.p, true);
                                        }
                                        break Label_1681;
                                    }
                                }
                                g.u.z(e, k, h.a, false, false, false, h.c, b3);
                            }
                            break Label_1681;
                        }
                    }
                    g.u.k(e, f, h.a, p2, h.c, b3);
                }
            }
            else if (hoc instanceof hmu && h != null) {
                final hmu g2 = (hmu)hoc;
                g2.G();
                g2.A = h;
                h.g = (hoc)g2;
                g2.u.f(h.e, g2.t);
                tpe.v((View)g2.w, g2.z);
                final long a2 = h.a;
                final View x = g2.x;
                int visibility;
                if (!g2.v.bz(a2)) {
                    visibility = 4;
                }
                else {
                    visibility = 0;
                }
                x.setVisibility(visibility);
                final View y = g2.y;
                int visibility2;
                if (!g2.v.by(a2)) {
                    visibility2 = n2;
                }
                else {
                    visibility2 = 0;
                }
                y.setVisibility(visibility2);
                final Optional l = g2.K();
                if (l.isPresent()) {
                    ansp ansp;
                    if ((ansp = ((ansq)l.get()).d) == null) {
                        ansp = ansp.a;
                    }
                    if (!((ahbc)ansp).ry((ahaq)ansn.b)) {
                        final ackm ackm = new ackm();
                        g2.t.addView(((eup)g2.B).a());
                        g2.I().ifPresent((Consumer)new fvi(g2, ackm, 15));
                    }
                }
            }
            else if (hoc instanceof hlv && h != null) {
                final hlv g3 = (hlv)hoc;
                if (g3.u != h) {
                    g3.u = h;
                    h.g = (hoc)g3;
                    g3.t.l = g3.I(h);
                    final ReelWatchEndpointOuterClass$ReelWatchEndpoint b5 = h.b();
                    g3.t.k(b5.e, h.f, h.a, false, h.c, b5);
                }
            }
            else if (hoc instanceof hnz && h != null) {
                final hnz g4 = (hnz)hoc;
                anuv anuv;
                if ((anuv = h.b().q) == null) {
                    anuv = anuv.a;
                }
                final antu antu = (antu)((ahbc)anuv).rx((ahaq)ReelWatchSurveyRendererOuterClass.reelWatchSurveyRenderer);
                antu.getClass();
                final String y2 = g4.y;
                if (y2 == null || !y2.equals(antu.d)) {
                    g4.G();
                    g4.z = h;
                    h.g = (hoc)g4;
                    g4.y = antu.d;
                    anuv anuv2;
                    if ((anuv2 = antu.c) == null) {
                        anuv2 = anuv.a;
                    }
                    final ajmo ajmo = (ajmo)((ahbc)anuv2).rx((ahaq)ElementRendererOuterClass.elementRenderer);
                    ajmo.getClass();
                    final HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", g4.w);
                    final acbj d = g4.x.d(ajmo);
                    final ackm ackm2 = new ackm();
                    ackm2.g((Map)hashMap);
                    final wyw pf = g4.v.pF();
                    pf.getClass();
                    ((wyy)ackm2).a(pf);
                    g4.u.b(ackm2, d);
                    g4.t.addView(g4.u.a());
                }
            }
            else if (hoc instanceof hmm) {
                final hmm hmm = (hmm)hoc;
                boolean g5;
                if (hmm.u) {
                    g5 = b2;
                    if (this.g) {
                        g5 = b2;
                        if (this.i) {
                            g5 = true;
                        }
                    }
                }
                else {
                    g5 = this.g;
                }
                hnu.f(hmm.t, g5);
                hnu.f((View)hmm.v, g5 ^ true);
            }
        }
        final hne f2 = this.f;
        f2.j.execute((Runnable)new ccm(f2, n, 10));
    }
    
    public final void r(final on on) {
        ((hoc)on).G();
    }
    
    public final int x() {
        synchronized (this.a) {
            final boolean n = this.n;
            int n2 = -1;
            if (n) {
                n2 = n2;
                if (this.g) {
                    n2 = this.a.size() + this.O();
                }
            }
            return n2;
        }
    }
    
    public final int y() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return -1;
            }
            return (this.D() != -1) ? 1 : 0;
        }
    }
    
    public final int z() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return -1;
            }
            return this.A(this.a.size() - 1);
        }
    }
}
