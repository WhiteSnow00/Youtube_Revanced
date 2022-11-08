import android.hardware.Camera$Parameters;
import android.hardware.Camera;
import com.google.android.libraries.youtube.edit.camera.CameraView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvv implements gwe
{
    final /* synthetic */ gwg a;
    private final /* synthetic */ int b;
    
    public gvv(final gwg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final float n) {
        if (this.b != 0) {
            final CameraView l = this.a.L;
            l.getClass();
            final Camera a = l.A.a();
            if (a != null) {
                final Camera$Parameters h = l.A.h(a);
                if (h != null && h.isZoomSupported()) {
                    if (l.m < 0) {
                        l.m = h.getZoom();
                    }
                    final int maxZoom = h.getMaxZoom();
                    int max;
                    if (n >= 0.0f) {
                        max = maxZoom;
                    }
                    else {
                        max = Math.max(Math.round(maxZoom * 0.15f), l.m);
                    }
                    l.y(a, h, CameraView.d(n, max, l.m), maxZoom, false);
                }
            }
            return;
        }
        final gzy bp = this.a.bp;
        if (bp != null) {
            bp.k(n);
        }
    }
    
    public final void b(final float n) {
        if (this.b != 0) {
            final CameraView l = this.a.L;
            l.getClass();
            l.q(n);
            return;
        }
        final gzy bp = this.a.bp;
        if (bp != null) {
            bp.j(n);
        }
    }
}
