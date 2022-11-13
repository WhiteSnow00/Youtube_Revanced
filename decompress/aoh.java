import com.facebook.litho.ComponentHost;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoh implements AccessibilityManager$AccessibilityStateChangeListener
{
    final dg a;
    
    public aoh(final dg a, final byte[] array) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aoh && this.a.equals(((aoh)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final void onAccessibilityStateChanged(final boolean b) {
        final dg a = this.a;
        dsi.a();
        final dvu dvu = (dvu)((dvr)a).a.get();
        if (dvu == null) {
            return;
        }
        ((ComponentHost)dvu).j(b);
        dvu.n = true;
        ((ComponentHost)dvu).requestLayout();
    }
}
