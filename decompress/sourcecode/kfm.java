import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

final class kfm extends View$AccessibilityDelegate
{
    final /* synthetic */ gcd a;
    
    public kfm(final gcd a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.isSelected());
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)ChipCloudView.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.a.isSelected());
    }
}
