import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.function.Consumer;
import j$.util.Optional;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyh implements iuu, lhu
{
    public final Handler a;
    public final iuv b;
    public final Runnable c;
    public final wyw d;
    public final boolean e;
    public final trk f;
    public Optional g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    private final atjz m;
    private xah n;
    
    public iyh(final Handler a, final iuv b, final atjz m, final wyw d, final vai vai) {
        this.a = a;
        this.b = b;
        this.m = m;
        this.d = d;
        this.e = vai.f(45369032L);
        this.f = (trk)new ivs(b, 3);
        this.g = Optional.empty();
        this.c = (Runnable)new inm(this, 16);
    }
    
    public final void a() {
        this.b(false);
        this.a.removeCallbacks(this.c);
    }
    
    public final void b(final boolean j) {
        if (this.g.isPresent()) {
            if (this.j != j) {
                this.j = j;
                ((toz)this.g.get()).l(j, true);
                if (j && !this.k) {
                    this.m.tu((Object)iuw.a());
                }
                Optional optional;
                if (this.e) {
                    optional = Optional.ofNullable((Object)this.n);
                }
                else {
                    optional = Optional.of((Object)this.d);
                }
                optional.ifPresent((Consumer)new iyg(j, 0));
            }
        }
    }
    
    public final void c(final xah n) {
        this.n = n;
    }
    
    public final void d() {
    }
    
    @Override
    public final void i(final boolean b) {
    }
    
    @Override
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
        final boolean a = ControlsOverlayStyle.a(controlsOverlayStyle);
        boolean h;
        final boolean b = h = true;
        if (!a) {
            h = (ControlsOverlayStyle.c(controlsOverlayStyle) && b);
        }
        this.h = h;
        if (h) {
            this.a();
        }
    }
    
    @Override
    public final void l(final boolean b) {
        if (b) {
            this.a();
        }
    }
    
    @Override
    public final void m(final boolean b) {
    }
    
    @Override
    public final void n(final trs trs) {
    }
    
    @Override
    public final void oY(final boolean b) {
        this.k = false;
        this.a();
    }
    
    @Override
    public final void oZ(final ControlsState controlsState) {
    }
    
    @Override
    public final void pa(final boolean i) {
        this.i = i;
    }
    
    @Override
    public final void pb(final boolean b) {
    }
    
    @Override
    public final void pc(final boolean b) {
    }
    
    @Override
    public final void r(final fkr fkr) {
        this.l = fkr.c();
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
        if (!b) {
            return;
        }
        this.a();
    }
    
    @Override
    public final void x(final int n) {
    }
    
    @Override
    public final void y(final boolean b) {
        this.k = true;
    }
}
