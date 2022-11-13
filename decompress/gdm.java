import android.support.v7.widget.RecyclerView;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class gdm extends iw
{
    final AccessibilityManager a;
    final vcy b;
    final aiqj c;
    final gdh d;
    final gdn e;
    
    public gdm(final gdn e, final AccessibilityManager a, final vcy b, final aiqj c, final gdh d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void py(final RecyclerView recyclerView, final int n, final int n2) {
        final AccessibilityManager a = this.a;
        if (a != null && a.isEnabled()) {
            return;
        }
        final double n3 = recyclerView.computeVerticalScrollOffset();
        final gdn e = this.e;
        if (!e.a) {
            if (n2 >= 0 && n3 >= e.b) {
                this.b.a(this.c);
            }
        }
        else if (n3 < e.b) {
            this.d.b();
        }
    }
}
