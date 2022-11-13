import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import android.view.View$OnLayoutChangeListener;
import com.google.android.libraries.youtube.player.ui.PlayerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcz implements jda, iuu
{
    public final fjv a;
    public final abty b;
    public final PlayerView c;
    public final ghk d;
    public final fno e;
    public final abtx f;
    public final View$OnLayoutChangeListener g;
    public final fju h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ashi l;
    public ashj m;
    private final aonv n;
    private final aons o;
    private final iuv p;
    private boolean q;
    private boolean r;
    
    public jcz(final fjv a, final abty b, final iri iri, final ghk d, final fno e, final iuv p7, final aonv n) {
        this.n = n;
        aonx aonx;
        if ((aonx = n.g) == null) {
            aonx = aonx.a;
        }
        this.o = (aons)((ahbc)aonx).rx((ahaq)aons.b);
        this.a = a;
        this.b = b;
        final YouTubePlayerViewNotForReflection r = ((iru)iri.b()).R;
        r.getClass();
        this.c = (PlayerView)r;
        this.d = d;
        this.e = e;
        this.p = p7;
        this.f = (abtx)new ivq(this, 3);
        this.g = (View$OnLayoutChangeListener)new jcy(this, 0);
        this.h = (fju)new jcx(this);
    }
    
    public final ashi a() {
        if (this.l == null) {
            this.l = ashi.m(new ixl(this, 4), ashb.c);
        }
        return this.l;
    }
    
    public final void b() {
        this.p.a((iuu)this);
    }
    
    public final void c() {
        final ashj m = this.m;
        if (m == null) {
            return;
        }
        final boolean o = glb.o(0.0f, this.e.a());
        final boolean b = false;
        boolean b2 = false;
        Label_0101: {
            if (!o) {
                b2 = b;
            }
            else {
                final boolean b3 = !this.k && (this.j ^ this.i);
                final boolean c = this.o.c;
                b2 = b;
                if (this.r) {
                    b2 = b;
                    if (b3) {
                        if (!this.q) {
                            b2 = b;
                            if (!c) {
                                break Label_0101;
                            }
                        }
                        b2 = true;
                    }
                }
            }
        }
        m.c(jcq.b(b2, this.n));
    }
    
    public final void d(final fkr fkr) {
        this.r = fkr.c();
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
    }
    
    public final void l(final boolean b) {
    }
    
    public final void m(final boolean b) {
    }
    
    public final void n(final trs trs) {
    }
    
    public final void oY(final boolean b) {
        if (this.q) {
            this.q = false;
            this.c();
        }
    }
    
    public final void oZ(final ControlsState controlsState) {
    }
    
    public final void pa(final boolean b) {
    }
    
    public final void pb(final boolean b) {
    }
    
    public final void pc(final boolean b) {
    }
    
    public final void r(final fkr fkr) {
    }
    
    public final void s(final boolean b) {
    }
    
    public final void t(final boolean b) {
    }
    
    public final void u(final boolean b) {
    }
    
    public final void v(final boolean b) {
    }
    
    public final void w(final boolean b) {
    }
    
    public final void x(final int n) {
    }
    
    public final void y(final boolean b) {
        if (!this.q) {
            this.q = true;
            this.c();
        }
    }
}
