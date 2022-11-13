import android.view.accessibility.AccessibilityEvent;
import android.view.ViewParent;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amm
{
    static int a(final View view) {
        return view.getAccessibilityLiveRegion();
    }
    
    static void b(final ViewParent viewParent, final View view, final View view2, final int n) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, n);
    }
    
    static void c(final View view, final int accessibilityLiveRegion) {
        view.setAccessibilityLiveRegion(accessibilityLiveRegion);
    }
    
    static void d(final AccessibilityEvent accessibilityEvent, final int contentChangeTypes) {
        accessibilityEvent.setContentChangeTypes(contentChangeTypes);
    }
    
    static boolean e(final View view) {
        return view.isAttachedToWindow();
    }
    
    static boolean f(final View view) {
        return view.isLaidOut();
    }
    
    static boolean g(final View view) {
        return view.isLayoutDirectionResolved();
    }
}
