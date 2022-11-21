import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class arfr implements View$OnClickListener
{
    final arft a;
    private final int b;
    
    public arfr(final arft a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        if (this.b != 0) {
            final Runnable k = this.a.k;
            if (k != null) {
                k.run();
            }
            return;
        }
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
}
