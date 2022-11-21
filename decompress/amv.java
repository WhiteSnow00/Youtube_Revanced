import android.view.View$OnUnhandledKeyEventListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amv
{
    static CharSequence a(final View view) {
        return view.getAccessibilityPaneTitle();
    }
    
    static Object b(final View view, final int n) {
        return view.requireViewById(n);
    }
    
    static void c(final View view, final ana ana) {
        abp abp;
        if ((abp = (abp)view.getTag(2131431942)) == null) {
            abp = new abp();
            view.setTag(2131431942, (Object)abp);
        }
        ana.getClass();
        final amu amu = new amu(ana);
        abp.put((Object)ana, (Object)amu);
        view.addOnUnhandledKeyEventListener((View$OnUnhandledKeyEventListener)amu);
    }
    
    static void d(final View view, final ana ana) {
        final abp abp = (abp)view.getTag(2131431942);
        if (abp == null) {
            return;
        }
        final View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener)abp.get((Object)ana);
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
