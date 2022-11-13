import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaos implements aaoc, abps
{
    public final atke a;
    public final abpu b;
    public abjv c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    private final aaor h;
    private final trc i;
    private final tjm j;
    
    public aaos(final atke a, final abpu b, final aaor h, final trc i, final tjm j) {
        this.d = false;
        this.a = a;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        j.getClass();
        this.j = j;
        this.b = b;
    }
    
    public final boolean a() {
        if (this.d && this.c == abjv.d && ((abpl)this.a.a()).l(abop.d) && this.h.i() && !this.g) {
            int n;
            if (this.j.m()) {
                n = this.f;
            }
            else {
                n = this.e;
            }
            if (n != 0) {
                if (n != -1) {
                    if (this.i.a() >= TimeUnit.MINUTES.toMillis(n)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public final asir[] lX(final abpu abpu) {
        final asir an = ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 4L)).j(aale.q(1)).an((asjm)new aaoe(this, 7), (asjm)aaof.c);
        asir asir;
        if (((vai)abpu.ci().g).bw()) {
            asir = ((ashi)abpu.cc().a).an((asjm)new aaoe(this, 8), (asjm)aaof.c);
        }
        else {
            asir = abpu.cc().c().j(aale.s(abpu.bM(), 4L)).j(aale.q(0)).an((asjm)new aaoe(this, 8), (asjm)aaof.c);
        }
        asir asir2;
        if (((vai)abpu.ci().g).bx()) {
            asir2 = abpu.Q().an((asjm)new aaoe(this, 9), (asjm)aaof.c);
        }
        else {
            asir2 = abpu.P().j(aale.s(abpu.bM(), 4L)).j(aale.q(1)).an((asjm)new aaoe(this, 9), (asjm)aaof.c);
        }
        return new asir[] { an, asir, asir2 };
    }
    
    public final void t() {
        this.g = true;
    }
    
    public final void u(final boolean b) {
    }
}
