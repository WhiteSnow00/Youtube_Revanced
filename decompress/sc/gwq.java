import android.view.WindowManager$LayoutParams;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.util.DisplayMetrics;

// 
// Decompiled by Procyon v0.6.0
// 

final class gwq implements ukh
{
    final gww a;
    
    public gwq(final gww a) {
        this.a = a;
    }
    
    public final void a() {
    }
    
    public final void b() {
        final CameraView l = this.a.L;
        l.getClass();
        final uki g = l.g();
        if (g != null) {
            final gww a = this.a;
            final hau bu = a.bu;
            if (bu != null) {
                final int a2 = g.a;
                bu.o = g.b;
                bu.p = a2;
            }
            final float n = (float)g.b;
            final float n2 = (float)g.a;
            final DisplayMetrics displayMetrics = new DisplayMetrics();
            a.h.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int widthPixels = displayMetrics.widthPixels;
            int max = Math.max(1, displayMetrics.heightPixels);
            final float n3 = (float)widthPixels;
            final float n4 = (float)max;
            final float n5 = n / n2;
            if (n5 >= n3 / n4) {
                widthPixels = (int)(n4 * n5);
            }
            else {
                max = (int)(n3 / n5);
            }
            final CameraView i = a.L;
            i.getClass();
            i.v(widthPixels, max);
            final CameraFocusOverlay aj = a.aJ;
            if (aj != null) {
                tpe.aF((View)aj, tpe.aE(widthPixels, max), (Class)ViewGroup$LayoutParams.class);
            }
            final ImageView al = a.aL;
            if (al != null) {
                tpe.aF((View)al, tpe.aE(widthPixels, max), (Class)ViewGroup$LayoutParams.class);
            }
        }
        final gww a3 = this.a;
        if (a3.bq != null) {
            a3.v();
            return;
        }
        a3.br = (Runnable)new gsb(a3, 15);
    }
    
    public final void d() {
        this.a.n();
        final gvw ae = this.a.ae;
        if (ae != null) {
            ae.f = true;
            ae.d();
        }
        final gww a = this.a;
        final int au = a.aU;
        if (au != -1) {
            final CameraView l = a.L;
            l.getClass();
            l.F(au);
            this.a.aU = -1;
        }
    }
    
    public final void g() {
        final WindowManager$LayoutParams attributes = this.a.h.getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        this.a.h.getWindow().setAttributes(attributes);
    }
    
    public final void nG() {
    }
    
    public final void nH() {
    }
    
    public final void nL() {
        final WindowManager$LayoutParams attributes = this.a.h.getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        this.a.h.getWindow().setAttributes(attributes);
    }
}
