import android.view.View;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjz implements Runnable
{
    public final gkc a;
    public final ViewGroup b;
    public final SlimStatusBar c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    
    public gjz(final gkc a, final ViewGroup b, final SlimStatusBar c, final boolean d, final boolean e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void run() {
        final gkc a = this.a;
        final ViewGroup b = this.b;
        final SlimStatusBar c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        if (!gkc.t(b, c)) {
            if (c.getParent() != null) {
                b.endViewTransition((View)c);
            }
            a.r(b, c);
            b.addView((View)c);
            c.post((Runnable)new fsi(b, c, 7));
        }
        if (!d) {
            a.i = 2;
            c.announceForAccessibility((CharSequence)c.getContext().getString(2132018834));
            a.m(37929);
            return;
        }
        if (e) {
            a.i = 5;
            c.announceForAccessibility((CharSequence)c.getContext().getString(2132017563));
            return;
        }
        if (f) {
            a.i = 6;
            return;
        }
        a.i = 4;
        c.announceForAccessibility((CharSequence)c.getContext().getString(2132018835));
        a.m(37930);
    }
}
