import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class arcv implements View$OnClickListener
{
    final arcx a;
    private final int b;
    
    public arcv(final arcx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        final int b = this.b;
        if (b == 0) {
            final Runnable k = this.a.k;
            if (k != null) {
                k.run();
            }
            return;
        }
        if (b != 1) {
            final Runnable l = this.a.l;
            final Runnable i = this.a.k;
            if (i != null) {
                i.run();
                return;
            }
            if (l != null) {
                l.run();
            }
        }
        else {
            final Runnable m = this.a.m;
            final Runnable j = this.a.k;
            if (j != null) {
                j.run();
                return;
            }
            if (m != null) {
                m.run();
            }
        }
    }
}
