import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

final class knh extends View$AccessibilityDelegate
{
    final /* synthetic */ knj a;
    
    public knh(final knj a) {
        this.a = a;
    }
    
    public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        this.a.a.performAccessibilityAction(64, (Bundle)null);
    }
}
