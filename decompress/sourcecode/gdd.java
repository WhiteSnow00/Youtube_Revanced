import android.support.v7.widget.RecyclerView;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class gdd extends iw
{
    final /* synthetic */ AccessibilityManager a;
    final /* synthetic */ vax b;
    final /* synthetic */ aioe c;
    final /* synthetic */ gcy d;
    final /* synthetic */ gde e;
    
    public gdd(final gde e, final AccessibilityManager a, final vax b, final aioe c, final gcy d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        final AccessibilityManager a = this.a;
        if (a != null && a.isEnabled()) {
            return;
        }
        final double n3 = recyclerView.computeVerticalScrollOffset();
        final gde e = this.e;
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
