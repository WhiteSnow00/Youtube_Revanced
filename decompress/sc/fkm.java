import android.view.View;
import java.lang.ref.WeakReference;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkm
{
    public aotp a;
    public Bitmap b;
    private WatchDescriptor c;
    private WeakReference d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private byte i;
    
    public final fkn a() {
        if (this.i == 15) {
            final WatchDescriptor c = this.c;
            if (c != null) {
                final WeakReference d = this.d;
                if (d != null) {
                    final fkn fkn = new fkn(c, d, this.a, this.b, this.e, this.f, this.g, this.h);
                    fkn.a.getClass();
                    return fkn;
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" watchDescriptor");
        }
        if (this.d == null) {
            sb.append(" sourceViewWeakReference");
        }
        if ((this.i & 0x1) == 0x0) {
            sb.append(" playbackStartFlag");
        }
        if ((this.i & 0x2) == 0x0) {
            sb.append(" shouldStartWatchShuffled");
        }
        if ((this.i & 0x4) == 0x0) {
            sb.append(" overrideExitFullscreenToMaximized");
        }
        if ((this.i & 0x8) == 0x0) {
            sb.append(" persistCurrentPlayerViewMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final boolean g) {
        this.g = g;
        this.i |= 0x4;
    }
    
    public final void c(final boolean h) {
        this.h = h;
        this.i |= 0x8;
    }
    
    public final void d(final int e) {
        this.e = e;
        this.i |= 0x1;
    }
    
    public final void e(final boolean f) {
        this.f = f;
        this.i |= 0x2;
    }
    
    public final void f(final WatchDescriptor c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null watchDescriptor");
    }
    
    public final void g(final View view) {
        this.d = new WeakReference((T)view);
    }
}
