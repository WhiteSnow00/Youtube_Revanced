import android.os.Bundle;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.ViewParent;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amj
{
    static int a(final View view) {
        return view.getImportantForAccessibility();
    }
    
    static int b(final View view) {
        return view.getMinimumHeight();
    }
    
    static int c(final View view) {
        return view.getMinimumWidth();
    }
    
    static int d(final View view) {
        return view.getWindowSystemUiVisibility();
    }
    
    static ViewParent e(final View view) {
        return view.getParentForAccessibility();
    }
    
    static AccessibilityNodeProvider f(final View view) {
        return view.getAccessibilityNodeProvider();
    }
    
    static void g(final View view) {
        view.postInvalidateOnAnimation();
    }
    
    static void h(final View view, final int n, final int n2, final int n3, final int n4) {
        view.postInvalidateOnAnimation(n, n2, n3, n4);
    }
    
    static void i(final View view, final Runnable runnable) {
        view.postOnAnimation(runnable);
    }
    
    static void j(final View view, final Runnable runnable, final long n) {
        view.postOnAnimationDelayed(runnable, n);
    }
    
    static void k(final ViewTreeObserver viewTreeObserver, final ViewTreeObserver$OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener);
    }
    
    static void l(final View view) {
        view.requestFitSystemWindows();
    }
    
    static void m(final View view, final Drawable background) {
        view.setBackground(background);
    }
    
    static void n(final View view, final boolean hasTransientState) {
        view.setHasTransientState(hasTransientState);
    }
    
    static void o(final View view, final int importantForAccessibility) {
        view.setImportantForAccessibility(importantForAccessibility);
    }
    
    static boolean p(final View view) {
        return view.getFitsSystemWindows();
    }
    
    static boolean q(final View view) {
        return view.hasOverlappingRendering();
    }
    
    static boolean r(final View view) {
        return view.hasTransientState();
    }
    
    static boolean s(final View view, final int n, final Bundle bundle) {
        return view.performAccessibilityAction(n, bundle);
    }
}
