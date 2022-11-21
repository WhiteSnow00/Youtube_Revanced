import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adux implements apc
{
    final SwipeDismissBehavior a;
    
    public adux(final SwipeDismissBehavior a) {
        this.a = a;
    }
    
    public final boolean a(final View view) {
        final boolean x = this.a.x(view);
        final int n = 0;
        if (x) {
            int n2;
            if (anc.f(view) == 1) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            final int g = this.a.g;
            int width = 0;
            Label_0079: {
                Label_0065: {
                    if (g == 0) {
                        if (n2 != 0) {
                            break Label_0065;
                        }
                        n2 = n;
                    }
                    if (g != 1 || n2 != 0) {
                        width = view.getWidth();
                        break Label_0079;
                    }
                }
                width = -view.getWidth();
            }
            anc.E(view, width);
            view.setAlpha(0.0f);
            final xsj j = this.a.j;
            if (j != null) {
                j.G(view);
            }
            return true;
        }
        return false;
    }
}
