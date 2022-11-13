import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbu implements abps, tgg
{
    public final abbv a;
    
    public abbu(final abbv a) {
        this.a = a;
    }
    
    public final void a(final abzl abzl, final abkh abkh) {
        Label_0192: {
            if (abzl != null && abzl.c() != null) {
                final akwz y = abzl.c().y();
                alun alun = null;
                if (y != null) {
                    akwt akwt;
                    if ((akwt = y.o) == null) {
                        akwt = akwt.a;
                    }
                    aluq aluq;
                    if ((aluq = akwt.c) == null) {
                        aluq = aluq.a;
                    }
                    alup alup;
                    if ((alup = aluq.g) == null) {
                        alup = alup.a;
                    }
                    alun = alun;
                    if ((alup.b & 0x1) != 0x0) {
                        akwt akwt2;
                        if ((akwt2 = y.o) == null) {
                            akwt2 = akwt.a;
                        }
                        aluq aluq2;
                        if ((aluq2 = akwt2.c) == null) {
                            aluq2 = aluq.a;
                        }
                        alup alup2;
                        if ((alup2 = aluq2.g) == null) {
                            alup2 = alup.a;
                        }
                        if ((alun = alup2.c) == null) {
                            alun = alun.a;
                        }
                    }
                }
                if (alun != null) {
                    break Label_0192;
                }
            }
            final int i = abkh.i;
            if (i != 15) {
                if (aakv.b(i)) {
                    final anew e = abkh.e;
                    if (e == null) {
                        this.a.w.oG(abkh.d, abkh.a);
                        return;
                    }
                    this.a.w.y(e, abkh.a);
                }
                return;
            }
        }
        this.a.w.f(ControlsState.a());
    }
    
    public final void b(ypj q) {
        final abbv a = this.a;
        a.O = 0L;
        a.P = 0L;
        final FormatStreamModel e = q.e();
        final FormatStreamModel f = q.f();
        q = (ypj)this.a.Q;
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
                        break Label_0110;
                        Label_0091: {
                            iftrue(Label_0110:)(f == null);
                        }
                        continue;
                    }
                    monitorexit(q);
                    this.a.S.b();
                }
            }
        }
    }
    
    public final void c(final aamh aamh) {
        final abjv c = aamh.c();
        final abjv c2 = abjv.c;
        final abbv a = this.a;
        final boolean b = a.B;
        final boolean b2 = true;
        int b3;
        if (c == c2) {
            b3 = 1;
        }
        else {
            b3 = 0;
        }
        if ((b ? 1 : 0) != b3) {
            a.B = (b3 != 0);
            a.w.oH((boolean)(b3 != 0));
        }
        this.a.A = (aamh.d() == abjv.h && b2);
    }
    
    public final void d(final aani aani) {
        if (aani.c() == abkb.e) {
            if (aani.a() != null) {
                final angl i = aani.a().i;
                if (i != null && (i.b & 0x80000) != 0x0) {
                    final abbs w = this.a.w;
                    ajut ajut;
                    if ((ajut = i.n) == null) {
                        ajut = ajut.a;
                    }
                    w.s((CharSequence)acak.b(ajut));
                }
            }
        }
    }
    
    public final void f(final aans h) {
        final boolean l = h.l();
        final boolean b = true;
        final boolean b2 = l && h.b() != null && h.b().U();
        final abke c = h.c();
        abke i;
        if (h.b() != null && h.b().m().S()) {
            i = c;
            if (h.a() != null) {
                i = c;
                if (h.a().Q()) {
                    i = c;
                    if (c.a(new abke[] { abke.e, abke.f, abke.d })) {
                        i = abke.i;
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
                    if (c.a(new abke[] { abke.e, abke.f, abke.d })) {
                        i = abke.i;
                    }
                }
            }
        }
        this.a.C = i.c(abke.c);
        final abbv a = this.a;
        a.E = (i == abke.j);
        Label_0560: {
            if (i == abke.a) {
                a.G = false;
                a.F = false;
                a.H = null;
                a.I = abke.a;
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
                    break Label_0560;
                }
            }
            if (a.C && !i.b()) {
                if (i == abke.d) {
                    this.a.w.f(new ControlsState(abbx.c, false));
                }
                else if (i.a(new abke[] { abke.e, abke.g })) {
                    this.a.w.f(ControlsState.d());
                }
                else if (i == abke.j) {
                    this.a.w.f(ControlsState.a());
                }
            }
            else {
                final abbv a2 = this.a;
                final abbs w = a2.w;
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
        final abbv a3 = this.a;
        a3.I = i;
        a3.H = h;
        a3.e();
        boolean b3 = false;
        Label_0657: {
            if (i.c(abke.g)) {
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
        this.a.w.pm(b3);
        this.a.d();
    }
    
    public final void g(final aant aant) {
        this.a.K = aant.e();
        this.a.L = aant.b();
        this.a.M = aant.h();
        this.a.N = aant.f();
        this.a.O = aant.a();
        this.a.f();
    }
    
    public final void h(final aanw aanw) {
        final abbv a = this.a;
        if (a.C) {
            if (!a.E) {
                final int a2 = aanw.a();
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
                    final abbs w = this.a.w;
                    ControlsState controlsState;
                    if (aanw.c()) {
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
    
    public final asir[] lX(final abpu abpu) {
        final asir an = ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 8192L)).j(aale.q(1)).an(new abav(this, 11), abba.f);
        final asir an2 = ((ashi)abpu.p().d).j(aale.s(abpu.bM(), 8192L)).j(aale.q(1)).an(new abav(this, 17), abba.f);
        final asir an3 = ((ashi)abpu.p().e).j(aale.s(abpu.bM(), 8192L)).j(aale.q(1)).an(new abav(this, 18), abba.f);
        final asir an4 = ((ashi)abpu.p().m).j(aale.s(abpu.bM(), 8192L)).j(aale.q(1)).an(new abav(this, 19), abba.f);
        final asir an5 = ((ashi)abpu.p().k).j(aale.s(abpu.bM(), 8192L)).j(aale.q(1)).an(new abav(this, 12), abba.f);
        asir asir;
        if (((vai)abpu.ci().g).bw()) {
            asir = ((ashi)abpu.cc().a).an(new abav(this, 13), abba.f);
        }
        else {
            asir = abpu.cc().c().j(aale.s(abpu.bM(), 8192L)).j(aale.q(0)).an(new abav(this, 13), abba.f);
        }
        final asir an6 = abpu.R().j(aale.s(abpu.bM(), 8192L)).j(aale.q(1)).an(new abav(this, 14), abba.f);
        asir asir2;
        if (((vai)abpu.ci().g).bx()) {
            asir2 = abpu.Q().an(new abav(this, 15), abba.f);
        }
        else {
            asir2 = abpu.P().j(aale.s(abpu.bM(), 8192L)).j(aale.q(1)).an(new abav(this, 15), abba.f);
        }
        return new asir[] { an, an2, an3, an4, an5, asir, an6, asir2, aale.p((ashi)abpu.p().i, (aezf)aalg.q).j(aale.q(1)).an(new abav(this, 16), abba.f) };
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
                this.a(null, (abkh)o);
                break;
            }
            case 6: {
                this.h((aanw)o);
                break;
            }
            case 5: {
                this.g((aant)o);
                break;
            }
            case 4: {
                this.f((aans)o);
                break;
            }
            case 3: {
                final aano aano = (aano)o;
                this.i();
                break;
            }
            case 2: {
                this.d((aani)o);
                break;
            }
            case 1: {
                this.c((aamh)o);
                break;
            }
            case 0: {
                this.b((ypj)o);
                break;
            }
            case -1: {
                array = new Class[] { ypj.class, aamh.class, aani.class, aano.class, aans.class, aant.class, aanw.class, abkh.class };
                break;
            }
        }
        return array;
    }
}
