import android.widget.OverScroller;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

// 
// Decompiled by Procyon v0.6.0
// 

final class adun implements Runnable
{
    final aduo a;
    private final CoordinatorLayout b;
    private final View c;
    
    public adun(final aduo a, final CoordinatorLayout b, final View c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        if (this.c != null) {
            final OverScroller d = this.a.d;
            if (d != null) {
                if (d.computeScrollOffset()) {
                    final aduo a = this.a;
                    a.I(this.b, this.c, a.d.getCurrY());
                    anc.I(this.c, this);
                    return;
                }
                this.a.C(this.b, this.c);
            }
        }
    }
}
