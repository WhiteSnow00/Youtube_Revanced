import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyf implements iuu
{
    public boolean a;
    public long b;
    public long c;
    public long d;
    public long e;
    public toz f;
    private boolean g;
    private boolean h;
    private boolean i;
    
    public final void a(final long c) {
        final toz f = this.f;
        if (f == null) {
            return;
        }
        f.c = c;
    }
    
    public final void b(final long d) {
        final toz f = this.f;
        if (f == null) {
            return;
        }
        f.d = d;
    }
    
    public final void c(final boolean b) {
        final toz f = this.f;
        if (f == null) {
            return;
        }
        if (!this.g && !this.a && !this.h && !this.i) {
            f.a(b);
            return;
        }
        f.b(b);
    }
    
    @Override
    public final void i(final boolean b) {
    }
    
    @Override
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
    }
    
    @Override
    public final void l(final boolean i) {
        this.i = i;
        this.b(this.d);
        this.a(this.b);
        this.c(true);
    }
    
    @Override
    public final void m(final boolean h) {
        this.h = h;
        this.b(this.d);
        this.a(this.b);
        this.c(true);
    }
    
    @Override
    public final void n(final trs trs) {
    }
    
    @Override
    public final void oY(final boolean b) {
        this.g = false;
        this.a(this.b);
        this.c(b);
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
        this.g = true;
        this.b(this.d);
        this.c(b);
    }
}
