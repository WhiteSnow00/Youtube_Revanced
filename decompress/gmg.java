import android.net.Uri;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Bitmap;
import java.io.IOException;
import android.provider.MediaStore$Images$Media;
import android.os.Build$VERSION;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmg implements atke
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public gmg(final gmi a, final aani b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gmg(final gmi a, final PlaybackStartDescriptor b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gmg(final hjb a, final ReelItemEditModel b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gmg(final Class b, final View a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final Object a() {
        final int c = this.c;
        if (c == 0) {
            return gmi.k(((gmi)this.a).e(((PlaybackStartDescriptor)this.b).b));
        }
        if (c == 1) {
            return gmi.k(((gmi)this.a).e(((aani)this.b).d()));
        }
        if (c != 2) {
            final Object b = this.b;
            final View view = (View)this.a;
            final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
            view.getContext();
            return tpe.aJ((Class)b, layoutParams);
        }
        final Object a = this.a;
        final ReelItemEditModel reelItemEditModel = (ReelItemEditModel)this.b;
        Object o;
        if (reelItemEditModel.d().f) {
            final hkl e = ((hjb)a).e;
            final Uri a2 = reelItemEditModel.c().a;
            a2.getClass();
            if (Build$VERSION.SDK_INT >= 29) {
                o = e.a(a2);
            }
            else {
                try {
                    o = aezp.j((Object)MediaStore$Images$Media.getBitmap(e.a.getContentResolver(), a2));
                }
                catch (final IOException ex) {
                    zlm.c(zll.a, zlk.x, "Failed loading thumbnail", (Throwable)ex);
                    o = aeyo.a;
                }
            }
        }
        else {
            final hkl e2 = ((hjb)a).e;
            final Uri a3 = reelItemEditModel.c().a;
            final long n = reelItemEditModel.h().n();
            final boolean e3 = reelItemEditModel.d().e;
            a3.getClass();
            if (Build$VERSION.SDK_INT >= 29 && n <= 0L && (true ^ e3)) {
                o = e2.a(a3);
            }
            else {
                e2.b.setDataSource(e2.a, a3);
                try {
                    o = aezp.j((Object)e2.b.getFrameAtTime(n, 0));
                }
                catch (final SecurityException ex2) {
                    zlm.c(zll.a, zlk.x, "Failed loading thumbnail", (Throwable)ex2);
                    o = aeyo.a;
                }
            }
        }
        if (!((aezp)o).h()) {
            return o;
        }
        final txs a4 = txt.a();
        a4.a = (Bitmap)((aezp)o).c();
        final hhi hhi = (hhi)a;
        a4.b(hhi.d);
        a4.d(hhi.c);
        a4.c(0);
        a4.h(hhi.a);
        a4.g(hhi.b);
        return tpe.ck(a4.a());
    }
}
