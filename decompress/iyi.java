import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.function.Consumer;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyi implements iuu
{
    public Optional a;
    private final iyd b;
    private boolean c;
    private boolean d;
    
    public iyi(final iyd b) {
        this.b = b;
        this.a = Optional.empty();
    }
    
    private final void b(final boolean b) {
        boolean b2 = false;
        this.d = false;
        Label_0088: {
            if (b) {
                final iyd b3 = this.b;
                if (!b3.a) {
                    final int b4 = b3.b;
                    Label_0049: {
                        if (b4 != 0) {
                            if (b3.d >= b4) {
                                break Label_0049;
                            }
                        }
                        else {
                            final int c = b3.c;
                            if (c == 0) {
                                break Label_0088;
                            }
                            if (b3.d % c != 0) {
                                break Label_0049;
                            }
                        }
                        b2 = true;
                    }
                    b3.a();
                    if (b2) {
                        break Label_0088;
                    }
                }
                return;
            }
        }
        this.a.ifPresent((Consumer)new iyg(b, 2));
    }
    
    final void a(final boolean b) {
        if (b && this.c) {
            this.d = true;
            return;
        }
        this.b(b);
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
    public final void u(final boolean c) {
        if (c == this.c) {
            return;
        }
        this.c = c;
        if (this.d && !c) {
            this.b(true);
        }
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
    }
}
