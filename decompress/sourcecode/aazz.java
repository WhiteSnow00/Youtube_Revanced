import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aazz implements abnq, tec
{
    public final /* synthetic */ abaa a;
    
    public aazz(final abaa a) {
        this.a = a;
    }
    
    public final void a(final abxj abxj, final abip abip) {
        Label_0190: {
            if (abxj != null && abxj.c() != null) {
                final akuv y = abxj.c().y();
                alsk alsk = null;
                if (y != null) {
                    akup akup;
                    if ((akup = y.o) == null) {
                        akup = akup.a;
                    }
                    alsn alsn;
                    if ((alsn = akup.c) == null) {
                        alsn = alsn.a;
                    }
                    alsm alsm;
                    if ((alsm = alsn.g) == null) {
                        alsm = alsm.a;
                    }
                    alsk = alsk;
                    if ((alsm.b & 0x1) != 0x0) {
                        akup akup2;
                        if ((akup2 = y.o) == null) {
                            akup2 = akup.a;
                        }
                        alsn alsn2;
                        if ((alsn2 = akup2.c) == null) {
                            alsn2 = alsn.a;
                        }
                        alsm alsm2;
                        if ((alsm2 = alsn2.g) == null) {
                            alsm2 = alsm.a;
                        }
                        if ((alsk = alsm2.c) == null) {
                            alsk = alsk.a;
                        }
                    }
                }
                if (alsk != null) {
                    break Label_0190;
                }
            }
            final int i = abip.i;
            if (i != 15) {
                if (aaja.b(i)) {
                    final ancs e = abip.e;
                    if (e == null) {
                        this.a.w.oG(abip.d, abip.a);
                        return;
                    }
                    this.a.w.y(e, abip.a);
                }
                return;
            }
        }
        this.a.w.f(ControlsState.a());
    }
    
    public final void b(ynk q) {
        final abaa a = this.a;
        a.O = 0L;
        a.P = 0L;
        final FormatStreamModel e = q.e();
        final FormatStreamModel f = q.f();
        q = (ynk)this.a.Q;
        monitorenter(q);
        Label_0065: {
            if (e == null || f == null) {
                break Label_0065;
            }
            Label_0110: {
                try {
                    this.a.R = new FormatStreamModel[] { e, f };
                    break Label_0110;
                    iftrue(Label_0091:)(e == null);
                    this.a.R = new FormatStreamModel[] { e };
                    break Label_0110;
                }
                finally {
                    monitorexit(q);
                    while (true) {
                        this.a.R = new FormatStreamModel[] { f };
                        monitorexit(q);
                        this.a.S.b();
                        return;
                        Label_0091: {
                            iftrue(Label_0110:)(f == null);
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public final void c(final aakn aakn) {
        final abid c = aakn.c();
        final abid c2 = abid.c;
        final boolean b = true;
        final boolean b2 = c == c2;
        final abaa a = this.a;
        if (a.B != b2) {
            a.B = b2;
            a.w.oH(b2);
        }
        this.a.A = (aakn.d() == abid.h && b);
    }
    
    public final void d(final aalo aalo) {
        if (aalo.c() == abij.e) {
            if (aalo.a() != null) {
                final aneh i = aalo.a().i;
                if (i != null && (i.b & 0x80000) != 0x0) {
                    final aazx w = this.a.w;
                    ajsq ajsq;
                    if ((ajsq = i.n) == null) {
                        ajsq = ajsq.a;
                    }
                    w.s((CharSequence)abyh.b(ajsq));
                }
            }
        }
    }
    
    public final void f(final aaly h) {
        final boolean l = h.l();
        final boolean b = true;
        final boolean b2 = l && h.b() != null && h.b().U();
        final abim c = h.c();
        abim i;
        if (h.b() != null && h.b().m().S()) {
            i = c;
            if (h.a() != null) {
                i = c;
                if (h.a().Q()) {
                    i = c;
                    if (c.a(new abim[] { abim.e, abim.f, abim.d })) {
                        i = abim.i;
                    }
                }
            }
        }
        else {
            i = c;
            if (h.b() != null) {
                i = c;
                if (h.b().m().ak()) {
                    i = c;
                    if (c.a(new abim[] { abim.e, abim.f, abim.d })) {
                        i = abim.i;
                    }
                }
            }
        }
        this.a.C = i.c(abim.c);
        final abaa a = this.a;
        a.E = (i == abim.j);
        Label_0561: {
            if (i == abim.a) {
                a.G = false;
                a.F = false;
                a.H = null;
                a.I = abim.a;
                a.C = false;
                a.D = false;
                a.E = false;
                a.K = 0L;
                a.L = 0L;
                a.M = 0L;
                a.N = 0L;
                a.O = 0L;
                a.P = 0L;
                a.w.oF();
                a.w.f(ControlsState.b());
                a.S.a();
                synchronized (a.Q) {
                    a.R = null;
                    break Label_0561;
                }
            }
            if (a.C && !i.b()) {
                if (i == abim.d) {
                    this.a.w.f(new ControlsState(abac.c, false));
                }
                else if (i.a(new abim[] { abim.e, abim.g })) {
                    this.a.w.f(ControlsState.d());
                }
                else if (i == abim.j) {
                    this.a.w.f(ControlsState.a());
                }
            }
            else {
                final abaa a2 = this.a;
                final aazx w = a2.w;
                ControlsState controlsState;
                if (a2.v.f()) {
                    controlsState = ControlsState.e();
                }
                else {
                    controlsState = ControlsState.c();
                }
                w.f(controlsState);
            }
        }
        if (i.d()) {
            this.a.w.f(ControlsState.f());
            this.a.S.b();
        }
        final abaa a3 = this.a;
        a3.I = i;
        a3.H = h;
        a3.e();
        boolean b3 = false;
        Label_0657: {
            if (i.c(abim.g)) {
                b3 = b;
                if (!h.l()) {
                    break Label_0657;
                }
                if (h.l() && b2) {
                    b3 = b;
                    break Label_0657;
                }
            }
            b3 = false;
        }
        this.a.w.pk(b3);
        this.a.d();
    }
    
    public final void g(final aalz aalz) {
        this.a.K = aalz.e();
        this.a.L = aalz.b();
        this.a.M = aalz.h();
        this.a.N = aalz.f();
        this.a.O = aalz.a();
        this.a.f();
    }
    
    public final void h(final aamc aamc) {
        final abaa a = this.a;
        if (a.C) {
            if (!a.E) {
                final int a2 = aamc.a();
                if (a2 != 2) {
                    if (a2 != 3 && a2 != 4) {
                        if (a2 == 5) {
                            this.a.w.f(ControlsState.e());
                            return;
                        }
                        if (a2 != 6) {
                            return;
                        }
                    }
                    final aazx w = this.a.w;
                    ControlsState controlsState;
                    if (aamc.c()) {
                        controlsState = ControlsState.c();
                    }
                    else {
                        controlsState = ControlsState.d();
                    }
                    w.f(controlsState);
                    return;
                }
                this.a.w.f(ControlsState.f());
            }
        }
    }
    
    public final void i() {
        this.a.D = true;
    }
    
    public final asic[] lX(final abns abns) {
        final asic am = ((asgt)abns.q().a).j(aajj.t(abns.bN(), 8192L)).j(aajj.r(1)).am((asix)new aazd(this, 6), (asix)aaze.f);
        final asic am2 = ((asgt)abns.q().d).j(aajj.t(abns.bN(), 8192L)).j(aajj.r(1)).am((asix)new aazd(this, 12), (asix)aaze.f);
        final asic am3 = ((asgt)abns.q().e).j(aajj.t(abns.bN(), 8192L)).j(aajj.r(1)).am((asix)new aazd(this, 13), (asix)aaze.f);
        final asic am4 = ((asgt)abns.q().m).j(aajj.t(abns.bN(), 8192L)).j(aajj.r(1)).am((asix)new aazd(this, 14), (asix)aaze.f);
        final asic am5 = ((asgt)abns.q().k).j(aajj.t(abns.bN(), 8192L)).j(aajj.r(1)).am((asix)new aazd(this, 7), (asix)aaze.f);
        asic asic;
        if (((uyi)abns.cd().h).bw()) {
            asic = ((asgt)abns.f().f).am((asix)new aazd(this, 8), (asix)aaze.f);
        }
        else {
            asic = abns.f().b().j(aajj.t(abns.bN(), 8192L)).j(aajj.r(0)).am((asix)new aazd(this, 8), (asix)aaze.f);
        }
        final asic am6 = abns.S().j(aajj.t(abns.bN(), 8192L)).j(aajj.r(1)).am((asix)new aazd(this, 9), (asix)aaze.f);
        asic asic2;
        if (((uyi)abns.cd().h).bx()) {
            asic2 = abns.R().am((asix)new aazd(this, 10), (asix)aaze.f);
        }
        else {
            asic2 = abns.Q().j(aajj.t(abns.bN(), 8192L)).j(aajj.r(1)).am((asix)new aazd(this, 10), (asix)aaze.f);
        }
        return new asic[] { am, am2, am3, am4, am5, asic, am6, asic2, aajj.q((asgt)abns.q().i, (aexg)aajm.m).j(aajj.r(1)).am((asix)new aazd(this, 11), (asix)aaze.f) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            case 7: {
                this.a(null, (abip)o);
                break;
            }
            case 6: {
                this.h((aamc)o);
                break;
            }
            case 5: {
                this.g((aalz)o);
                break;
            }
            case 4: {
                this.f((aaly)o);
                break;
            }
            case 3: {
                final aalu aalu = (aalu)o;
                this.i();
                break;
            }
            case 2: {
                this.d((aalo)o);
                break;
            }
            case 1: {
                this.c((aakn)o);
                break;
            }
            case 0: {
                this.b((ynk)o);
                break;
            }
            case -1: {
                array = new Class[] { ynk.class, aakn.class, aalo.class, aalu.class, aaly.class, aalz.class, aamc.class, abip.class };
                break;
            }
        }
        return array;
    }
}
