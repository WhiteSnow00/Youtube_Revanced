import android.view.WindowInsets;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amq
{
    static int a(final View view) {
        return view.getScrollIndicators();
    }
    
    public static aob b(final View view) {
        final WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        final aob o = aob.o(rootWindowInsets);
        o.s(o);
        o.q(view.getRootView());
        return o;
    }
    
    static void c(final View view, final int scrollIndicators) {
        view.setScrollIndicators(scrollIndicators);
    }
    
    static void d(final View view, final int n, final int n2) {
        view.setScrollIndicators(n, n2);
    }
}
