import android.widget.EditText;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyn extends View$AccessibilityDelegate
{
    final /* synthetic */ adyo a;
    
    public adyn(final adyo a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        final EditText c = this.a.b.c;
        if (c != null) {
            accessibilityNodeInfo.setLabeledBy((View)c);
        }
    }
}
