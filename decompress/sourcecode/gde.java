import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gde
{
    public boolean a;
    public double b;
    public RecyclerView c;
    public iw d;
    
    public final void a(final aioe aioe, final acor acor, final vax vax, final gcy gcy, final Context context, final int n) {
        if (acor != null) {
            if (context != null) {
                if ((this.c = acor.N) == null) {
                    return;
                }
                this.b = n * 5;
                final AccessibilityManager a = tqt.a(context);
                final gdd d = new gdd(this, a, vax, aioe, gcy);
                this.d = d;
                this.c.aE(d);
                if (a != null) {
                    a.addAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)new gdc(this, gcy));
                }
            }
        }
    }
}
