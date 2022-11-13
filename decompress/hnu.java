import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.View;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnu
{
    public static int[] a() {
        return new int[] { 1, 2 };
    }
    
    public static vcy b(final Map map, final vcy vcy, final wyv wyv, final LoggingUrlsPingController loggingUrlsPingController) {
        final vgy g = vct.g();
        g.h(map);
        g.j(vcy);
        return (vcy)new wyx((vcy)new hks(g.g(), loggingUrlsPingController, 0), wyv);
    }
    
    public static void c(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static void d(final View view) {
        e(view, null);
    }
    
    public static void e(final View view, final Runnable runnable) {
        if (view == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new hkp(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom(), runnable));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
            return;
        }
        view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new hkq());
    }
    
    public static void f(final View view, final boolean b) {
        if (view != null) {
            int visibility;
            if (!b) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            view.setVisibility(visibility);
        }
    }
    
    public static boolean g(final View view) {
        return view != null && view.getVisibility() == 0;
    }
    
    public static void h(final View view, final long startDelay) {
        tpe.v(view, true);
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(125L).setStartDelay(startDelay);
    }
    
    public static void i(final View view) {
        h(view, 0L);
    }
}
