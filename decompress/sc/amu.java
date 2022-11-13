import android.view.View$OnUnhandledKeyEventListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amu
{
    static CharSequence a(final View view) {
        return view.getAccessibilityPaneTitle();
    }
    
    static Object b(final View view, final int n) {
        return view.requireViewById(n);
    }
    
    static void c(final View view, final amz amz) {
        abo abo;
        if ((abo = (abo)view.getTag(2131431941)) == null) {
            abo = new abo();
            view.setTag(2131431941, (Object)abo);
        }
        amz.getClass();
        final amt amt = new amt(amz);
        abo.put((Object)amz, (Object)amt);
        view.addOnUnhandledKeyEventListener((View$OnUnhandledKeyEventListener)amt);
    }
    
    static void d(final View view, final amz amz) {
        final abo abo = (abo)view.getTag(2131431941);
        if (abo == null) {
            return;
        }
        final View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener)abo.get((Object)amz);
        if (view$OnUnhandledKeyEventListener != null) {
            view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }
    }
    
    static void e(final View view, final boolean accessibilityHeading) {
        view.setAccessibilityHeading(accessibilityHeading);
    }
    
    static void f(final View view, final CharSequence accessibilityPaneTitle) {
        view.setAccessibilityPaneTitle(accessibilityPaneTitle);
    }
    
    static void g(final View view, final boolean screenReaderFocusable) {
        view.setScreenReaderFocusable(screenReaderFocusable);
    }
    
    static boolean h(final View view) {
        return view.isAccessibilityHeading();
    }
    
    static boolean i(final View view) {
        return view.isScreenReaderFocusable();
    }
}
