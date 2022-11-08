import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.edit.camera.CameraView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvz implements gwo
{
    public final /* synthetic */ gwg a;
    
    public gvz(final gwg a) {
        this.a = a;
    }
    
    public final void a(final float n) {
    }
    
    public final void d() {
    }
    
    public final void g(final float n, final float n2) {
    }
    
    public final void h(final float n, final float n2) {
        final CameraView l = this.a.L;
        l.getClass();
        l.j(n, n2, (uij)new hhb(this, 1));
    }
    
    public final void nC() {
        final FrameLayout bc = this.a.bC;
        if (bc != null && bc.getVisibility() == 0) {
            return;
        }
        final CameraView l = this.a.L;
        l.getClass();
        if (!l.M()) {
            return;
        }
        this.a.bT.S(wya.c(96641)).l(257);
        final gww ay = this.a.ay;
        if (ay != null) {
            ((uiw)ay).e();
        }
    }
    
    public final void nI(final float n) {
        final CameraView l = this.a.L;
        l.getClass();
        l.i(n);
    }
    
    public final void rZ(final int n) {
        final gwg a = this.a;
        if (!a.ba) {
            return;
        }
        final CameraView l = a.L;
        l.getClass();
        if (!l.L()) {
            final hav u = this.a.u;
            if (n == 3) {
                final String a2 = u.a(3);
                if (u.f != null) {
                    if (!a2.isEmpty()) {
                        final float n2 = (float)(-u.f.getWidth());
                        final EffectsFeatureDescriptionView g = u.g;
                        if (g != null) {
                            g.e(a2, n2);
                        }
                    }
                }
            }
            else if (n == 1) {
                final String a3 = u.a(1);
                final View f = u.f;
                if (f != null) {
                    final float n3 = (float)f.getWidth();
                    final EffectsFeatureDescriptionView g2 = u.g;
                    if (g2 != null) {
                        g2.e(a3, n3);
                    }
                }
            }
        }
    }
    
    public final void sa() {
    }
}
