import android.graphics.Bitmap;
import android.net.Uri;
import android.graphics.BitmapRegionDecoder;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abih implements afty
{
    public final abij a;
    public final abil b;
    public final int c;
    
    public abih(final abij a, final abil b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final ListenableFuture a() {
        final abij a = this.a;
        final abil b = this.b;
        final int c = this.c;
        final long n = c;
        final long b2 = abij.b(b, n);
        synchronized (a.l) {
            ListenableFuture listenableFuture;
            if (b2 != a.h && b2 != a.f) {
                final Uri j = abij.j(b, c);
                final Object o = null;
                BitmapRegionDecoder bitmapRegionDecoder;
                if (j != null) {
                    bitmapRegionDecoder = (BitmapRegionDecoder)a.d.get((Object)j);
                }
                else {
                    bitmapRegionDecoder = null;
                }
                if (bitmapRegionDecoder == null) {
                    listenableFuture = afwm.l((Throwable)new Exception(String.valueOf(a.a(b, c))));
                }
                else {
                    final long b3 = abij.b(b, n);
                    final Bitmap g = a.g;
                    if (g != null) {
                        adkp.H(g != a.i);
                    }
                    final Bitmap c2 = a.c(b, c, a.g);
                    if (c2 != null) {
                        a.g = a.i;
                        a.f = a.h;
                        a.i = c2;
                        a.h = b3;
                        a.a.execute((Runnable)new abei(a, 8));
                        final Bitmap i = a.i;
                        Object a2 = o;
                        if (i != null) {
                            a2 = abik.a(i);
                        }
                        listenableFuture = afwm.m(a2);
                    }
                    else {
                        listenableFuture = afwm.l((Throwable)new Exception("6"));
                    }
                }
            }
            else {
                listenableFuture = afwm.l((Throwable)new Exception("5"));
            }
            a.n = false;
            return listenableFuture;
        }
    }
}
