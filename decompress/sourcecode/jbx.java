import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import android.view.View$OnLayoutChangeListener;
import com.google.android.libraries.youtube.player.ui.PlayerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbx implements jby, itw
{
    public final fjp a;
    public final abrx b;
    public final PlayerView c;
    public final ghb d;
    public final fnj e;
    public final abrw f;
    public final View$OnLayoutChangeListener g;
    public final fjo h;
    public boolean i;
    public boolean j;
    public boolean k;
    public asgt l;
    public asgu m;
    private final aols n;
    private final aolp o;
    private final itx p;
    private boolean q;
    private boolean r;
    
    public jbx(final fjp a, final abrx b, final iqi iqi, final ghb d, final fnj e, final itx p7, final aols n) {
        this.n = n;
        aolu aolu;
        if ((aolu = n.g) == null) {
            aolu = aolu.a;
        }
        this.o = (aolp)((agzd)aolu).rr((agyr)aolp.b);
        this.a = a;
        this.b = b;
        final YouTubePlayerViewNotForReflection r = ((iqw)iqi.b()).R;
        r.getClass();
        this.c = (PlayerView)r;
        this.d = d;
        this.e = e;
        this.p = p7;
        this.f = (abrw)new iur(this, 3);
        this.g = (View$OnLayoutChangeListener)new jbw(this, 0);
        this.h = new jbv(this);
    }
    
    public final asgt a() {
        if (this.l == null) {
            this.l = asgt.m((asgv)new iwo(this, 4), asgm.c);
        }
        return this.l;
    }
    
    public final void b() {
        this.p.a(this);
    }
    
    public final void c() {
        final asgu m = this.m;
        if (m == null) {
            return;
        }
        final boolean c = gkt.c(0.0f, this.e.a());
        final boolean b = false;
        boolean b2 = false;
        Label_0102: {
            if (!c) {
                b2 = b;
            }
            else {
                final boolean b3 = !this.k && (this.j ^ this.i);
                final boolean c2 = this.o.c;
                b2 = b;
                if (this.r) {
                    b2 = b;
                    if (b3) {
                        if (!this.q) {
                            b2 = b;
                            if (!c2) {
                                break Label_0102;
                            }
                        }
                        b2 = true;
                    }
                }
            }
        }
        m.c((Object)jbr.b(b2, this.n));
    }
    
    public final void d(final fkk fkk) {
        this.r = fkk.c();
    }
    
    public final void oX(final boolean b) {
        if (this.q) {
            this.q = false;
            this.c();
        }
    }
    
    public final void y(final boolean b) {
        if (!this.q) {
            this.q = true;
            this.c();
        }
    }
}
