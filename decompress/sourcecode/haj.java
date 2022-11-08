import android.graphics.Matrix;
import android.view.animation.Animation;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import com.google.android.libraries.youtube.edit.camera.CameraView;

// 
// Decompiled by Procyon v0.6.0
// 

final class haj implements gwo
{
    final /* synthetic */ CameraView a;
    final /* synthetic */ CameraFocusOverlay b;
    final /* synthetic */ gwo c;
    final /* synthetic */ hak d;
    
    public haj(final hak d, final CameraView a, final CameraFocusOverlay b, final gwo c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final void i() {
        final EffectsFeatureDescriptionView e = this.d.e;
        if (e != null) {
            final Animation d = e.d;
            if (d != null && e.e) {
                d.cancel();
                e.setAlpha(1.0f);
                e.setVisibility(0);
            }
        }
    }
    
    public final void a(float e) {
        final hak d = this.d;
        d.b = true;
        final hah a = d.a;
        e += a.e;
        a.e = e;
        if (e < 0.0f) {
            a.e = e + 6.2831855f;
        }
        else if (e > 6.2831855f) {
            a.e = e - 6.2831855f;
        }
        d.c.f(a.c());
        this.i();
    }
    
    public final void d() {
        final hak d = this.d;
        final tzw d2 = d.d;
        if (d2 != null) {
            d2.C(d.a.b());
        }
        final hak d3 = this.d;
        if (d3.b) {
            d3.b = false;
            d3.h.S(wya.c(132383)).d();
        }
        final EffectsFeatureDescriptionView e = this.d.e;
        if (e != null && e.getVisibility() == 0) {
            e.startAnimation((Animation)e.a(false));
        }
    }
    
    public final void g(final float n, final float n2) {
        final hak d = this.d;
        d.b = true;
        final hah a = d.a;
        a.c += n;
        a.d += n2;
        a.d();
        d.c.f(d.a.c());
        this.i();
    }
    
    public final void h(final float n, final float n2) {
        final float[] array = { n, n2 };
        final hah a = this.d.a;
        final Matrix matrix = new Matrix();
        final float b = a.b;
        matrix.postScale(b, -b);
        matrix.postRotate((float)Math.toDegrees(-a.e));
        matrix.postTranslate(a.f / 2 - a.c, a.g / 2 - a.d);
        matrix.invert(matrix);
        matrix.postScale(1.0f, -1.0f);
        matrix.postTranslate((float)(a.f / 2), (float)(a.g / 2));
        matrix.mapPoints(array);
        this.a.k(array[0], array[1], (int)n, (int)n2, (uij)new hai(this, this.b));
    }
    
    public final void nC() {
        this.c.nC();
    }
    
    public final void nI(final float n) {
        final hak d = this.d;
        d.b = true;
        final hah a = d.a;
        a.e(a.b * n);
        d.c.f(d.a.c());
        final qpt i = d.i;
        if (i != null) {
            i.L(d.a.a(), false);
        }
        this.i();
    }
    
    public final void rZ(final int n) {
    }
    
    public final void sa() {
    }
}
