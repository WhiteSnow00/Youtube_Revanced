import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyb implements iuu, fjq, iya
{
    public final acbm a;
    public final fjr b;
    public final iyc c;
    public final boolean d;
    public final asiq e;
    public final abpu f;
    public final uwb g;
    public long h;
    public final ativ i;
    public final ativ j;
    public boolean k;
    public boolean l;
    public boolean m;
    public toz n;
    private final ackm o;
    private final arkg p;
    private boolean q;
    private boolean r;
    
    public iyb(final acbm a, final iyc c, final arkg p8, final wyw wyw, final abpu f, final fjr b, final vai vai, final uwb g) {
        this.a = a;
        ((wyy)(this.o = new ackm())).a(wyw);
        this.p = p8;
        this.c = c;
        this.e = new asiq();
        this.f = f;
        this.b = b;
        this.d = vai.f(45358110L);
        this.i = ativ.aE();
        this.j = ativ.aE();
        this.g = g;
    }
    
    public final ashi a() {
        return ashi.K((Object)0).l((auke)ashi.e((auke)this.i, (auke)this.j, (asji)ivm.f)).p().V();
    }
    
    public final void b(final boolean b) {
        if (this.d) {
            final toz n = this.n;
            if (n != null) {
                if (this.l && this.r && !this.k && !this.m) {
                    if (this.q) {
                        n.b(b);
                        return;
                    }
                    n.j(4);
                    n.a(b);
                }
                else {
                    n.j(8);
                    n.a(false);
                    this.i.tu((Object)false);
                }
            }
        }
    }
    
    final void c(final ajmo ajmo) {
        this.r = false;
        if (ajmo != null) {
            this.r = true;
            this.a.b(this.o, ((accf)this.p.a()).d(ajmo));
        }
        this.b(false);
    }
    
    @Override
    public final void i(final boolean b) {
    }
    
    @Override
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
    }
    
    @Override
    public final void l(final boolean b) {
    }
    
    @Override
    public final void m(final boolean b) {
    }
    
    @Override
    public final void n(final trs trs) {
    }
    
    @Override
    public final void oY(final boolean b) {
        this.q = false;
        this.b(b);
    }
    
    @Override
    public final void oZ(final ControlsState controlsState) {
    }
    
    @Override
    public final void pa(final boolean b) {
    }
    
    @Override
    public final void pb(final boolean b) {
    }
    
    @Override
    public final void pc(final boolean b) {
    }
    
    @Override
    public final void pd(final elx elx) {
        this.c(null);
    }
    
    @Override
    public final void r(final fkr fkr) {
    }
    
    @Override
    public final void s(final boolean b) {
    }
    
    @Override
    public final void t(final boolean b) {
    }
    
    @Override
    public final void u(final boolean b) {
    }
    
    @Override
    public final void v(final boolean b) {
    }
    
    @Override
    public final void w(final boolean b) {
    }
    
    @Override
    public final void x(final int n) {
    }
    
    @Override
    public final void y(final boolean b) {
        this.q = true;
        this.b(b);
    }
}
