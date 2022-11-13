import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gau extends View$AccessibilityDelegate
{
    public final BottomUiContainer a;
    
    public gau(final BottomUiContainer a) {
        this.a = a;
    }
    
    private final void a(final AccessibilityEvent accessibilityEvent) {
        synchronized (this.a.t) {
            if (accessibilityEvent.getEventType() == 32768) {
                this.a.s = 1;
            }
            else if (accessibilityEvent.getEventType() == 65536) {
                final BottomUiContainer a = this.a;
                if (a.s == 2) {
                    a.getHandler().postDelayed((Runnable)new eym(this, 18), gam.a);
                }
                this.a.s = 0;
            }
        }
    }
    
    public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a(accessibilityEvent);
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo$AccessibilityAction.ACTION_CLICK);
    }
    
    public final boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        this.a(accessibilityEvent);
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
