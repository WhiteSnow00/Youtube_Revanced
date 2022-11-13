import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.widget.TextView;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iuz implements fpw, iuu
{
    public fpv a;
    public fpv b;
    public long c;
    public toz d;
    public toz e;
    public pvh f;
    private final Handler g;
    private final Runnable h;
    private boolean i;
    private boolean j;
    private boolean k;
    
    public iuz(final Handler g) {
        this.c = 500L;
        this.g = g;
        this.h = (Runnable)new inm(this, 9);
    }
    
    public static /* bridge */ void d(final iuz iuz) {
        iuz.g(null);
    }
    
    private final void f(final fpv b) {
        if (this.b == b) {
            return;
        }
        if ((this.b = b) != null) {
            final toz e = this.e;
            if (e != null) {
                ((TextView)e.a).setText(b.a);
            }
        }
    }
    
    private final void g(final fpv a) {
        if (this.a == a) {
            return;
        }
        this.a = a;
        this.g.removeCallbacks(this.h);
        if (a != null && a.b().h()) {
            this.g.postDelayed(this.h, (long)(int)a.b().c());
        }
        if (a != null) {
            final toz d = this.d;
            if (d != null) {
                ((TextView)d.a).setText(a.a);
            }
        }
        final pvh f = this.f;
        if (f != null) {
            f.t(this.a != null);
        }
    }
    
    public final void a(final fpv fpv) {
        if (fpv != null && (fpv == this.b || fpv == this.a)) {
            if (fpv == this.a) {
                this.g(null);
            }
            else {
                this.f(null);
            }
            this.c(true);
        }
    }
    
    public final void b(final fpv fpv) {
        if (fpv == null) {
            return;
        }
        if (fpv.b().h()) {
            this.g(fpv);
        }
        else {
            this.f(fpv);
        }
        this.c(true);
    }
    
    public final void c(final boolean b) {
        final toz d = this.d;
        final toz e = this.e;
        if (d != null) {
            if (e != null) {
                final boolean i = this.i;
                final boolean b2 = false;
                boolean b3 = false;
                boolean b4 = false;
                long c = 0L;
                Label_0123: {
                    if (i && !this.j && !this.k) {
                        final fpv a = this.a;
                        if (a != null || this.b != null) {
                            b4 = (a == null);
                            if (a != null) {
                                b3 = true;
                            }
                            c = 500L;
                            break Label_0123;
                        }
                    }
                    c = this.c;
                    this.g(null);
                    b4 = false;
                    b3 = b2;
                }
                d.c = c;
                d.l(b3, b);
                e.c = c;
                e.l(b4, b);
            }
        }
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
        if (!this.i) {
            return;
        }
        this.i = false;
        this.c(b);
    }
    
    public final void oZ(final ControlsState controlsState) {
    }
    
    public final void pa(final boolean j) {
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.c(false);
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
    
    public final void w(final boolean k) {
        if (this.k == k) {
            return;
        }
        this.k = k;
        this.c(false);
    }
    
    public final void x(final int n) {
    }
    
    public final void y(final boolean b) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.c(b);
    }
}
