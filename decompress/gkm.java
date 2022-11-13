import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

final class gkm extends View$AccessibilityDelegate
{
    final gkp a;
    
    public gkm(final gkp a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        aom.c(accessibilityNodeInfo).a.setTraversalBefore((View)this.a.a);
    }
}
