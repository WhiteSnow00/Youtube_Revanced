import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

final class fuc extends View$AccessibilityDelegate
{
    public fuc() {
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCanOpenPopup(true);
    }
}
