import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivi
{
    public gle a;
    public String b;
    public ControlsOverlayStyle c;
    private int d;
    private ControlsState e;
    private fkk f;
    private ivk g;
    private boolean h;
    private byte i;
    
    public final ivj a() {
        if (this.i == 3) {
            final ControlsState e = this.e;
            if (e != null) {
                final fkk f = this.f;
                if (f != null) {
                    final ivk g = this.g;
                    if (g != null) {
                        return new ivj(this.d, e, this.a, f, this.b, g, this.h, this.c);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.i & 0x1) == 0x0) {
            sb.append(" inlinePlaybackState");
        }
        if (this.e == null) {
            sb.append(" controlsState");
        }
        if (this.f == null) {
            sb.append(" playerViewMode");
        }
        if (this.g == null) {
            sb.append(" videoTimes");
        }
        if ((this.i & 0x2) == 0x0) {
            sb.append(" isVideoAdPlaying");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final ControlsState e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null controlsState");
    }
    
    public final void c(final int d) {
        this.d = d;
        this.i |= 0x1;
    }
    
    public final void d(final boolean h) {
        this.h = h;
        this.i |= 0x2;
    }
    
    public final void e(final fkk f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null playerViewMode");
    }
    
    public final void f(final ivk g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null videoTimes");
    }
}
