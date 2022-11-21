import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

final class aduy implements Runnable
{
    final SwipeDismissBehavior a;
    private final View b;
    private final boolean c;
    
    public aduy(final SwipeDismissBehavior a, final View b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final aqj e = this.a.e;
        if (e != null && e.n()) {
            anc.I(this.b, this);
            return;
        }
        if (this.c) {
            final xsj j = this.a.j;
            if (j != null) {
                j.G(this.b);
            }
        }
    }
}
