import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

final class inu extends View$AccessibilityDelegate
{
    public inu() {
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setEnabled(false);
    }
}
