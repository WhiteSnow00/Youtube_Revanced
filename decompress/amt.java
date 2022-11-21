import java.util.Collection;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amt
{
    static int a(final View view) {
        return view.getImportantForAutofill();
    }
    
    static int b(final View view) {
        return view.getNextClusterForwardId();
    }
    
    static View c(final View view, final View view2, final int n) {
        return view.keyboardNavigationClusterSearch(view2, n);
    }
    
    static void d(final View view, final Collection collection, final int n) {
        view.addKeyboardNavigationClusters(collection, n);
    }
    
    static void e(final View view, final String... autofillHints) {
        view.setAutofillHints(autofillHints);
    }
    
    static void f(final View view, final boolean focusedByDefault) {
        view.setFocusedByDefault(focusedByDefault);
    }
    
    static void g(final View view, final int importantForAutofill) {
        view.setImportantForAutofill(importantForAutofill);
    }
    
    static void h(final View view, final boolean keyboardNavigationCluster) {
        view.setKeyboardNavigationCluster(keyboardNavigationCluster);
    }
    
    static void i(final View view, final int nextClusterForwardId) {
        view.setNextClusterForwardId(nextClusterForwardId);
    }
    
    static void j(final View view, final CharSequence tooltipText) {
        view.setTooltipText(tooltipText);
    }
    
    static boolean k(final View view) {
        return view.hasExplicitFocusable();
    }
    
    static boolean l(final View view) {
        return view.isFocusedByDefault();
    }
    
    static boolean m(final View view) {
        return view.isImportantForAutofill();
    }
    
    static boolean n(final View view) {
        return view.isKeyboardNavigationCluster();
    }
    
    static boolean o(final View view) {
        return view.restoreDefaultFocus();
    }
}
