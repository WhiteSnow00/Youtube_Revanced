import com.google.android.libraries.lens.sdk.intent.LensImage;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.google.android.apps.youtube.app.extensions.lens.OpenLensForFrameController;
import android.view.PixelCopy$OnPixelCopyFinishedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gua implements PixelCopy$OnPixelCopyFinishedListener
{
    public final OpenLensForFrameController a;
    public final HandlerThread b;
    public final Bitmap c;
    
    public gua(final OpenLensForFrameController a, final HandlerThread b, final Bitmap c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onPixelCopyFinished(final int n) {
        final OpenLensForFrameController a = this.a;
        final HandlerThread b = this.b;
        final Bitmap c = this.c;
        b.quitSafely();
        if (n != 0) {
            final alnn a2 = alno.a();
            final alnp f = alnp.f;
            ((ahaz)a2).copyOnWrite();
            alno.c((alno)a2.instance, f);
            ((ahaz)a2).copyOnWrite();
            alno.d((alno)a2.instance, n);
            a.h((alno)((ahaz)a2).build());
            return;
        }
        final Bitmap copy = c.copy(c.getConfig(), false);
        c.recycle();
        if (copy == null) {
            ttr.m("OpenLensForFrameCtrl", "Failed to convert Bitmap");
            a.i(alnp.h);
            return;
        }
        a.e = aezp.k((Object)new LensImage(copy));
        a.c.execute((Runnable)new fsi(a, copy, 17));
        a.j((LensImage)a.e.c());
    }
}
