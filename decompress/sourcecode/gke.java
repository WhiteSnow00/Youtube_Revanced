import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

final class gke extends View$AccessibilityDelegate
{
    final /* synthetic */ gkh a;
    
    public gke(final gkh a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        aol.c(accessibilityNodeInfo).a.setTraversalBefore((View)this.a.a);
    }
}