// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import androidx.window.layout.util.ActivityCompatHelperApi30;
import androidx.window.layout.util.DisplayCompatHelperApi28;
import androidx.window.layout.util.DisplayCompatHelperApi17;
import android.content.res.Configuration;
import androidx.window.layout.util.ActivityCompatHelperApi24;
import android.graphics.Point;
import androidx.window.core.Bounds;
import androidx.window.layout.util.ContextCompatHelperApi30;
import android.os.Build$VERSION;
import android.graphics.Rect;
import android.app.Activity;
import android.content.res.Resources;
import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.Display;
import java.util.Collection;
import java.util.ArrayList;

public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator
{
    public static final WindowMetricsCalculatorCompat INSTANCE;
    private static final String TAG;
    private static final ArrayList insetsTypeMasks;
    
    static {
        INSTANCE = new WindowMetricsCalculatorCompat();
        TAG = "WindowMetricsCalculatorCompat";
        insetsTypeMasks = new ArrayList((Collection<? extends E>)new atkf((Object[])new Integer[] { 1, 2, 4, 8, 16, 32, 64, 128 }, true));
    }
    
    private WindowMetricsCalculatorCompat() {
    }
    
    private final DisplayCutout getCutoutForDisplay(final Display display) {
        final DisplayCutout displayCutout = null;
        DisplayCutout displayCutout2;
        try {
            final Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor((Class<?>[])new Class[0]);
            constructor.setAccessible(true);
            final Object instance = constructor.newInstance(new Object[0]);
            final Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", instance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, instance);
            final Field declaredField = instance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            final Object value = declaredField.get(instance);
            displayCutout2 = displayCutout;
            if (value instanceof DisplayCutout) {
                displayCutout2 = (DisplayCutout)value;
            }
        }
        catch (final InstantiationException ex) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex);
            displayCutout2 = displayCutout;
        }
        catch (final InvocationTargetException ex2) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex2);
            displayCutout2 = displayCutout;
        }
        catch (final IllegalAccessException ex3) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex3);
            displayCutout2 = displayCutout;
        }
        catch (final NoSuchFieldException ex4) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex4);
            displayCutout2 = displayCutout;
        }
        catch (final NoSuchMethodException ex5) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex5);
            displayCutout2 = displayCutout;
        }
        catch (final ClassNotFoundException ex6) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex6);
            displayCutout2 = displayCutout;
        }
        return displayCutout2;
    }
    
    private final int getNavigationBarHeight(final Context context) {
        final Resources resources = context.getResources();
        final int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
    
    private final void getRectSizeFromDisplay(final Activity activity, final Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
    
    public WindowMetrics computeCurrentWindowMetrics(final Activity activity) {
        activity.getClass();
        Rect rect;
        if (Build$VERSION.SDK_INT >= 30) {
            rect = ContextCompatHelperApi30.INSTANCE.currentWindowBounds((Context)activity);
        }
        else if (Build$VERSION.SDK_INT >= 29) {
            rect = this.computeWindowBoundsQ$window_release(activity);
        }
        else if (Build$VERSION.SDK_INT >= 28) {
            rect = this.computeWindowBoundsP$window_release(activity);
        }
        else {
            rect = this.computeWindowBoundsN$window_release(activity);
        }
        aoa aoa;
        if (Build$VERSION.SDK_INT >= 30) {
            aoa = this.computeWindowInsetsCompat$window_release(activity);
        }
        else {
            Object o;
            if (Build$VERSION.SDK_INT >= 30) {
                o = new anr();
            }
            else if (Build$VERSION.SDK_INT >= 29) {
                o = new anq();
            }
            else {
                o = new anp();
            }
            aoa = ((ans)o).a();
            aoa.getClass();
        }
        return new WindowMetrics(new Bounds(rect), aoa);
    }
    
    public final WindowMetrics computeCurrentWindowMetrics(final Context context) {
        context.getClass();
        return new WindowMetrics(ContextCompatHelperApi30.INSTANCE.currentWindowBounds(context), (aoa)null, 2, (atnd)null);
    }
    
    public WindowMetrics computeMaximumWindowMetrics(final Activity activity) {
        activity.getClass();
        Rect maximumWindowBounds;
        if (Build$VERSION.SDK_INT >= 30) {
            maximumWindowBounds = ContextCompatHelperApi30.INSTANCE.maximumWindowBounds((Context)activity);
        }
        else {
            final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getClass();
            final Point realSizeForDisplay$window_release = this.getRealSizeForDisplay$window_release(defaultDisplay);
            maximumWindowBounds = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        aoa aoa;
        if (Build$VERSION.SDK_INT >= 30) {
            aoa = this.computeWindowInsetsCompat$window_release(activity);
        }
        else {
            Object o;
            if (Build$VERSION.SDK_INT >= 30) {
                o = new anr();
            }
            else if (Build$VERSION.SDK_INT >= 29) {
                o = new anq();
            }
            else {
                o = new anp();
            }
            aoa = ((ans)o).a();
            aoa.getClass();
        }
        return new WindowMetrics(new Bounds(maximumWindowBounds), aoa);
    }
    
    public final Rect computeWindowBoundsIceCreamSandwich$window_release(final Activity activity) {
        activity.getClass();
        final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getClass();
        final Point realSizeForDisplay$window_release = this.getRealSizeForDisplay$window_release(defaultDisplay);
        final Rect rect = new Rect();
        if (realSizeForDisplay$window_release.x != 0 && realSizeForDisplay$window_release.y != 0) {
            rect.right = realSizeForDisplay$window_release.x;
            rect.bottom = realSizeForDisplay$window_release.y;
        }
        else {
            defaultDisplay.getRectSize(rect);
        }
        return rect;
    }
    
    public final Rect computeWindowBoundsN$window_release(final Activity activity) {
        activity.getClass();
        final Rect rect = new Rect();
        final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            defaultDisplay.getClass();
            final Point realSizeForDisplay$window_release = this.getRealSizeForDisplay$window_release(defaultDisplay);
            final int navigationBarHeight = this.getNavigationBarHeight((Context)activity);
            if (rect.bottom + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom += navigationBarHeight;
            }
            else if (rect.right + navigationBarHeight == realSizeForDisplay$window_release.x) {
                rect.right += navigationBarHeight;
            }
        }
        return rect;
    }
    
    public final Rect computeWindowBoundsP$window_release(final Activity activity) {
        activity.getClass();
        final Rect rect = new Rect();
        final Configuration configuration = activity.getResources().getConfiguration();
        try {
            final Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            final Object value = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                final Object invoke = value.getClass().getDeclaredMethod("getBounds", (Class<?>[])new Class[0]).invoke(value, new Object[0]);
                invoke.getClass();
                rect.set((Rect)invoke);
            }
            else {
                final Object invoke2 = value.getClass().getDeclaredMethod("getAppBounds", (Class<?>[])new Class[0]).invoke(value, new Object[0]);
                invoke2.getClass();
                rect.set((Rect)invoke2);
            }
        }
        catch (final InvocationTargetException ex) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex);
            this.getRectSizeFromDisplay(activity, rect);
        }
        catch (final IllegalAccessException ex2) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex2);
            this.getRectSizeFromDisplay(activity, rect);
        }
        catch (final NoSuchMethodException ex3) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex3);
            this.getRectSizeFromDisplay(activity, rect);
        }
        catch (final NoSuchFieldException ex4) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex4);
            this.getRectSizeFromDisplay(activity, rect);
        }
        final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        final Point point = new Point();
        final DisplayCompatHelperApi17 instance = DisplayCompatHelperApi17.INSTANCE;
        defaultDisplay.getClass();
        instance.getRealSize(defaultDisplay, point);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            final int navigationBarHeight = this.getNavigationBarHeight((Context)activity);
            if (rect.bottom + navigationBarHeight == point.y) {
                rect.bottom += navigationBarHeight;
            }
            else if (rect.right + navigationBarHeight == point.x) {
                rect.right += navigationBarHeight;
            }
            else if (rect.left == navigationBarHeight) {
                rect.left = 0;
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            final DisplayCutout cutoutForDisplay = this.getCutoutForDisplay(defaultDisplay);
            if (cutoutForDisplay != null) {
                if (rect.left == DisplayCompatHelperApi28.INSTANCE.safeInsetLeft(cutoutForDisplay)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == DisplayCompatHelperApi28.INSTANCE.safeInsetRight(cutoutForDisplay)) {
                    rect.right += DisplayCompatHelperApi28.INSTANCE.safeInsetRight(cutoutForDisplay);
                }
                if (rect.top == DisplayCompatHelperApi28.INSTANCE.safeInsetTop(cutoutForDisplay)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == DisplayCompatHelperApi28.INSTANCE.safeInsetBottom(cutoutForDisplay)) {
                    rect.bottom += DisplayCompatHelperApi28.INSTANCE.safeInsetBottom(cutoutForDisplay);
                }
            }
        }
        return rect;
    }
    
    public final Rect computeWindowBoundsQ$window_release(Activity activity) {
        activity.getClass();
        final Configuration configuration = activity.getResources().getConfiguration();
        try {
            final Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            final Object value = declaredField.get(configuration);
            final Object invoke = value.getClass().getDeclaredMethod("getBounds", (Class<?>[])new Class[0]).invoke(value, new Object[0]);
            invoke.getClass();
            activity = (Activity)new Rect((Rect)invoke);
        }
        catch (final InvocationTargetException ex) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex);
            activity = (Activity)this.computeWindowBoundsP$window_release(activity);
        }
        catch (final IllegalAccessException ex2) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex2);
            activity = (Activity)this.computeWindowBoundsP$window_release(activity);
        }
        catch (final NoSuchMethodException ex3) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex3);
            activity = (Activity)this.computeWindowBoundsP$window_release(activity);
        }
        catch (final NoSuchFieldException ex4) {
            Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex4);
            activity = (Activity)this.computeWindowBoundsP$window_release(activity);
        }
        return (Rect)activity;
    }
    
    public final aoa computeWindowInsetsCompat$window_release(final Activity activity) {
        activity.getClass();
        if (Build$VERSION.SDK_INT >= 30) {
            return ActivityCompatHelperApi30.INSTANCE.currentWindowInsets(activity);
        }
        throw new Exception("Incompatible SDK version");
    }
    
    public final ArrayList getInsetsTypeMasks$window_release() {
        return WindowMetricsCalculatorCompat.insetsTypeMasks;
    }
    
    public final Point getRealSizeForDisplay$window_release(final Display display) {
        display.getClass();
        final Point point = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }
}
