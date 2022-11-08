import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmh extends View$AccessibilityDelegate
{
    final /* synthetic */ CastSeekBar a;
    
    public mmh(final CastSeekBar a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)SeekBar.class.getName());
        accessibilityEvent.setItemCount(this.a.a.b);
        this.a.a();
        accessibilityEvent.setCurrentItemIndex(0);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }
    
    public final boolean performAccessibilityAction(final View view, int b, final Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (!super.performAccessibilityAction(view, b, bundle)) {
            if (b == 4096 || b == 8192) {
                final CastSeekBar a = this.a;
                b = a.a.b;
                a.a();
                final boolean f = a.a.f;
            }
            return false;
        }
        return true;
    }
}
