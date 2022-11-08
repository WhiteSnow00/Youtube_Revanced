import com.google.android.libraries.youtube.edit.camera.ProgressBarData;
import android.view.View;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hor
{
    public static int[] a() {
        return new int[] { 1, 2 };
    }
    
    public static vax b(final Map map, final vax vax, final wwu wwu, final LoggingUrlsPingController loggingUrlsPingController) {
        final vwb g = vas.g();
        g.h(map);
        g.j(vax);
        return (vax)new www((vax)new hjx(g.g(), loggingUrlsPingController, 0), wwu);
    }
    
    public static boolean c(final View view) {
        return view != null && view.getVisibility() == 0;
    }
    
    public static uir d() {
        final uir e = ProgressBarData.e();
        e.c(2131102063);
        e.b(2131493099);
        e.e(2131102062);
        return e;
    }
    
    public static uir e(final aqyx aqyx) {
        final uir e = ProgressBarData.e();
        final aqyx a = aqyx.a;
        final int ordinal = aqyx.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                e.c(2131102067);
                e.e(2131102066);
                return e;
            }
            if (ordinal != 3 && ordinal != 4) {
                return e;
            }
        }
        e.c(2131102065);
        e.e(2131102069);
        return e;
    }
    
    public static void g(final View view, final boolean b) {
        if (view != null) {
            if (b) {
                h(view);
                return;
            }
            i(view);
        }
    }
    
    public static void h(final View... array) {
        for (final View view : array) {
            if (view != null && (view.getVisibility() != 0 || view.getAlpha() != 1.0f)) {
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(1.0f).setDuration(100L).start();
            }
        }
    }
    
    public static void i(final View... array) {
        j(4, array);
    }
    
    public static void j(final int n, final View... array) {
        if (n != 4 && n != 8) {
            return;
        }
        for (final View view : array) {
            if (view != null && view.getVisibility() != n) {
                view.animate().cancel();
                view.animate().alpha(0.0f).setDuration(100L).withEndAction((Runnable)new ccl(view, n, 8)).start();
            }
        }
    }
    
    public static void k(final View view, final boolean b) {
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
                    view3.animate().alpha(0.0f).setStartDelay(100L).setDuration(100L).withEndAction((Runnable)new gwx(view3, 5)).start();
                    view3.animate().scaleX(0.9f).setDuration(200L).start();
                    view3.animate().scaleY(0.9f).setDuration(200L).start();
                }
                ++i;
            }
        }
    }
}
