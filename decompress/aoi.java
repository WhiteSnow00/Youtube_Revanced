import com.facebook.litho.ComponentHost;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoi implements AccessibilityManager$AccessibilityStateChangeListener
{
    final dg a;
    
    public aoi(final dg a, final byte[] array) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aoi && this.a.equals(((aoi)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final void onAccessibilityStateChanged(final boolean b) {
        final dg a = this.a;
        dsl.a();
        final dvx dvx = (dvx)((dvu)a).a.get();
        if (dvx == null) {
            return;
        }
        ((ComponentHost)dvx).j(b);
        dvx.n = true;
        ((ComponentHost)dvx).requestLayout();
    }
}
