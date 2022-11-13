import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxv
{
    public static void a(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static void b(final View view, final boolean b) {
        if (view != null) {
            if (b) {
                c(view);
                return;
            }
            d(view);
        }
    }
    
    public static void c(final View... array) {
        for (int i = 0; i < array.length; ++i) {
            final View view = array[i];
            if (view != null && (view.getVisibility() != 0 || view.getAlpha() != 1.0f)) {
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(1.0f).setDuration(100L).start();
            }
        }
    }
    
    public static void d(final View... array) {
        e(4, array);
    }
    
    public static void e(final int n, final View... array) {
        if (n != 4 && n != 8) {
            return;
        }
        for (final View view : array) {
            if (view != null && view.getVisibility() != n) {
                view.animate().cancel();
                view.animate().alpha(0.0f).setDuration(100L).withEndAction((Runnable)new ccm(view, n, 8)).start();
            }
        }
    }
    
    public static void f(final View view, final boolean b) {
        int i = 0;
        if (b) {
            for (int j = 0; j <= 0; ++j) {
                final View view2 = (new View[] { view })[j];
                if (view2 != null && (view2.getVisibility() != 0 || view2.getAlpha() != 1.0f || view2.getScaleX() != 1.0f || view2.getScaleY() != 1.0f)) {
                    view2.animate().cancel();
                    view2.setVisibility(0);
                    view2.setScaleX(0.9f);
                    view2.setScaleY(0.9f);
                    view2.animate().alpha(1.0f).setDuration(100L).start();
                    view2.animate().scaleX(1.0f).setDuration(200L).start();
                    view2.animate().scaleY(1.0f).setDuration(200L).start();
                }
            }
        }
        else {
            while (i <= 0) {
                final View view3 = (new View[] { view })[i];
                if (view3 != null && view3.getVisibility() == 0) {
                    view3.animate().cancel();
                    view3.animate().alpha(0.0f).setStartDelay(100L).setDuration(100L).withEndAction((Runnable)new gxo(view3, 4)).start();
                    view3.animate().scaleX(0.9f).setDuration(200L).start();
                    view3.animate().scaleY(0.9f).setDuration(200L).start();
                }
                ++i;
            }
        }
    }
}
