import java.util.concurrent.Callable;
import android.os.Looper;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kad extends gec
{
    public volatile int d;
    private final Handler e;
    private final InlinePlaybackLifecycleController f;
    private final uyf g;
    private final uyi h;
    private final uyi i;
    private final arud j;
    
    public kad(final arud j, final uyf g, final atjj atjj, final InlinePlaybackLifecycleController f, final asho asho, final uyi h, final uyi i, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.j = j;
        this.g = g;
        f.getClass();
        this.f = f;
        this.d = gkt.ag(j);
        this.h = h;
        this.i = i;
        this.e = new kac(this, Looper.getMainLooper());
        alvs alvs;
        if ((alvs = j.f().e) == null) {
            alvs = alvs.a;
        }
        if (feq.h(alvs)) {
            this.d = feq.g(alvs).c;
            mrm.A((Callable)new fol(this, atjj, asho, j, 8, null, null));
        }
    }
    
    private final void b() {
        this.e.removeMessages(23998);
    }
    
    @Override
    public final void j(final ged ged) {
        this.b();
    }
    
    @Override
    protected final boolean l(final ged ged, final int n) {
        if (gkt.x(this.g) && ged.b.b().d == akeb.b) {
            return true;
        }
        final int n2 = (int)this.i.h(45365518L);
        alvs alvs;
        if ((alvs = this.j.f().e) == null) {
            alvs = alvs.a;
        }
        int n3;
        if (feq.h(alvs) && this.d > 0) {
            n3 = this.d;
        }
        else {
            n3 = gkt.ag(this.j);
        }
        if (n2 != 1500) {
            n3 = n2;
        }
        int n4 = n3;
        if (this.f.j(ged.b) == 2) {
            n4 = n3;
            if (this.h.bi()) {
                n4 = 0;
            }
        }
        if (n == 2 && n4 > 0 && ged.b.q()) {
            this.b();
            this.e.sendEmptyMessageDelayed(23998, (long)n4);
            return false;
        }
        this.b();
        return true;
    }
}
