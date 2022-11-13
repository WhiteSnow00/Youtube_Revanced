import java.util.List;
import android.os.Vibrator;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aayn extends abvy
{
    public final CreatorEndscreenOverlayPresenter a;
    
    public aayn(final CreatorEndscreenOverlayPresenter a, final long n) {
        this.a = a;
        super(n, Long.MAX_VALUE, 1, 1, (String)null);
    }
    
    public final void a() {
        this.a.r.j(false);
        final CreatorEndscreenOverlayPresenter a = this.a;
        a.p(a.h = false);
        this.a.w();
    }
    
    public final void b(final boolean b, final boolean b2, final boolean b3) {
        final CreatorEndscreenOverlayPresenter a = this.a;
        if (a.p.e && !b2 && !b3) {
            a.e.post((Runnable)new aavc(this, 10));
            return;
        }
        if (!a.c.f() && !b2) {
            return;
        }
        this.a.r.j(true);
        final CreatorEndscreenOverlayPresenter a2 = this.a;
        a2.p(a2.h = true);
        this.a.w();
        final CreatorEndscreenOverlayPresenter a3 = this.a;
        a3.v.C((alwh[])((List)a3.p.d).toArray(new alwh[0]));
        if (!b2 && !b3 && tsy.e(this.a.a)) {
            final CreatorEndscreenOverlayPresenter a4 = this.a;
            if (a4.q == null) {
                a4.q = (Vibrator)a4.a.getSystemService("vibrator");
            }
            if (this.a.q.hasVibrator()) {
                final CreatorEndscreenOverlayPresenter a5 = this.a;
                a5.q.vibrate((long)a5.a.getResources().getInteger(2131492961));
            }
        }
    }
}
