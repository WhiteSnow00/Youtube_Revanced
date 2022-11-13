import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbb
{
    final hay a;
    public boolean b;
    public final hao c;
    public uby d;
    final EffectsFeatureDescriptionView e;
    public final String f;
    public boolean g;
    public pvh h;
    public final aeea i;
    private float j;
    
    public hbb(final Context context, final hao c, final EffectsFeatureDescriptionView e, final aeea i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.j = -1.0f;
        this.a = new hay(context.getResources());
        this.c = c;
        this.e = e;
        this.f = context.getString(2132017590);
        this.i = i;
    }
    
    public final gxf a(final Context context, final CameraView cameraView, final CameraFocusOverlay cameraFocusOverlay, final gxd gxd) {
        final gxf gxf = new gxf(context, (gxd)new hba(this, cameraView, cameraFocusOverlay, gxd), (ukj)cameraView);
        gxf.c = new ujw(gxf.b, (ukv)new gxe(gxf, gxf.a));
        return gxf;
    }
    
    public final void b(int max, final int n) {
        final hay a = this.a;
        a.f = Math.max(1, max);
        max = Math.max(1, n);
        a.g = max;
        a.a = Math.min(1.0f, Math.max(a.h / a.f, a.i / max));
        this.c.g(this.a.c());
    }
    
    public final void c() {
        this.j = -1.0f;
    }
    
    public final void d(final uby d) {
        this.d = d;
        final hay a = this.a;
        final ahfp j = d.j;
        float c = 1.0f;
        if (j == null) {
            a.b = 1.0f;
            a.e = 0.0f;
            a.c = 0.0f;
            a.d = 0.0f;
            return;
        }
        if ((j.b & 0x2) != 0x0) {
            ahfq ahfq;
            if ((ahfq = j.d) == null) {
                ahfq = ahfq.a;
            }
            c = ahfq.c;
        }
        a.b = c;
        a.e = j.e;
        ahfq ahfq2;
        if ((ahfq2 = j.c) == null) {
            ahfq2 = ahfq.a;
        }
        a.c = ahfq2.c;
        ahfq ahfq3;
        if ((ahfq3 = j.c) == null) {
            ahfq3 = ahfq.a;
        }
        a.d = ahfq3.d;
    }
    
    public final void e(float j) {
        j = aeuz.j(j, 0.0f, 1.0f);
        final hay a = this.a;
        a.e((1.0f - j) * a.a + j * 4.0f);
        this.c.g(this.a.c());
        final pvh h = this.h;
        if (h != null) {
            h.L(this.a.a(), true);
        }
    }
    
    public final void f(final float n) {
        float j;
        if ((j = this.j) < 0.0f) {
            j = this.a.b;
            this.j = j;
        }
        float n2 = n;
        if (n < 0.0f) {
            n2 = n * 0.15f;
        }
        this.a.e(n2 * 4.0f + j);
        this.c.g(this.a.c());
        final pvh h = this.h;
        if (h != null) {
            h.L(this.a.a(), true);
        }
    }
}
