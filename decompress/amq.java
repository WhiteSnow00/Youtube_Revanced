import android.view.View$OnApplyWindowInsetsListener;
import android.util.Log;
import android.os.Build$VERSION;
import android.view.WindowInsets;
import android.graphics.Rect;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amq
{
    static float a(final View view) {
        return view.getElevation();
    }
    
    static float b(final View view) {
        return view.getTranslationZ();
    }
    
    static float c(final View view) {
        return view.getZ();
    }
    
    static ColorStateList d(final View view) {
        return view.getBackgroundTintList();
    }
    
    static PorterDuff$Mode e(final View view) {
        return view.getBackgroundTintMode();
    }
    
    static aoc f(final View view, final aoc aoc, final Rect rect) {
        final WindowInsets e = aoc.e();
        if (e != null) {
            return aoc.p(view.computeSystemWindowInsets(e, rect), view);
        }
        rect.setEmpty();
        return aoc;
    }
    
    public static aoc g(final View view) {
        final boolean d = anq.d;
        aoc a;
        final aoc aoc = a = null;
        if (d) {
            if (!view.isAttachedToWindow()) {
                a = aoc;
            }
            else {
                final View rootView = view.getRootView();
                try {
                    final Object value = anq.a.get(rootView);
                    a = aoc;
                    if (value != null) {
                        final Rect rect = (Rect)anq.b.get(value);
                        final Rect rect2 = (Rect)anq.c.get(value);
                        a = aoc;
                        if (rect != null) {
                            a = aoc;
                            if (rect2 != null) {
                                Object o;
                                if (Build$VERSION.SDK_INT >= 30) {
                                    o = new ant();
                                }
                                else if (Build$VERSION.SDK_INT >= 29) {
                                    o = new ans();
                                }
                                else {
                                    o = new anr();
                                }
                                ((anu)o).b(aic.c(rect));
                                ((anu)o).c(aic.c(rect2));
                                a = ((anu)o).a();
                                a.s(a);
                                a.q(view.getRootView());
                            }
                        }
                    }
                }
                catch (final IllegalAccessException ex) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. ".concat(String.valueOf(ex.getMessage())), (Throwable)ex);
                    a = aoc;
                }
            }
        }
        return a;
    }
    
    static String h(final View view) {
        return view.getTransitionName();
    }
    
    static void i(final WindowInsets windowInsets, final View view) {
        final View$OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener = (View$OnApplyWindowInsetsListener)view.getTag(2131431943);
        if (view$OnApplyWindowInsetsListener != null) {
            view$OnApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
    
    static void j(final View view, final ColorStateList backgroundTintList) {
        view.setBackgroundTintList(backgroundTintList);
    }
    
    static void k(final View view, final PorterDuff$Mode backgroundTintMode) {
        view.setBackgroundTintMode(backgroundTintMode);
    }
    
    static void l(final View view, final float elevation) {
        view.setElevation(elevation);
    }
    
    static void m(final View view, final boolean nestedScrollingEnabled) {
        view.setNestedScrollingEnabled(nestedScrollingEnabled);
    }
    
    static void n(final View view, final alx alx) {
        if (Build$VERSION.SDK_INT < 30) {
            view.setTag(2131431935, (Object)alx);
        }
        if (alx == null) {
            view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)view.getTag(2131431943));
            return;
        }
        view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new amp(view, alx));
    }
    
    static void o(final View view, final String transitionName) {
        view.setTransitionName(transitionName);
    }
    
    static void p(final View view, final float translationZ) {
        view.setTranslationZ(translationZ);
    }
    
    static void q(final View view, final float z) {
        view.setZ(z);
    }
    
    static void r(final View view) {
        view.stopNestedScroll();
    }
    
    static boolean s(final View view, final float n, final float n2, final boolean b) {
        return view.dispatchNestedFling(n, n2, b);
    }
    
    static boolean t(final View view, final float n, final float n2) {
        return view.dispatchNestedPreFling(n, n2);
    }
    
    static boolean u(final View view, final int n, final int n2, final int[] array, final int[] array2) {
        return view.dispatchNestedPreScroll(n, n2, array, array2);
    }
    
    static boolean v(final View view, final int n, final int n2, final int n3, final int n4, final int[] array) {
        return view.dispatchNestedScroll(n, n2, n3, n4, array);
    }
    
    static boolean w(final View view) {
        return view.hasNestedScrollingParent();
    }
    
    static boolean x(final View view) {
        return view.isImportantForAccessibility();
    }
    
    static boolean y(final View view) {
        return view.isNestedScrollingEnabled();
    }
    
    static boolean z(final View view, final int n) {
        return view.startNestedScroll(n);
    }
}
