import android.graphics.drawable.Drawable;
import java.util.Locale;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apt
{
    static int a(final View view) {
        return view.getLayoutDirection();
    }
    
    static int b(final View view) {
        return view.getTextDirection();
    }
    
    static Locale c(final TextView textView) {
        return textView.getTextLocale();
    }
    
    public static void d(final TextView textView, final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }
    
    static void e(final TextView textView, final int n, final int n2, final int n3, final int n4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(n, n2, n3, n4);
    }
    
    static void f(final TextView textView, final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }
    
    static void g(final View view, final int textDirection) {
        view.setTextDirection(textDirection);
    }
    
    public static Drawable[] h(final TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
    
    public static boolean i(final byte[] array, final byte[] array2) {
        if (array2 == null) {
            return false;
        }
        if (array.length >= array2.length) {
            for (int i = 0; i < array2.length; ++i) {
                if (array[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static long[] j(final Object o) {
        if (o instanceof int[]) {
            final int[] array = (int[])o;
            final long[] array2 = new long[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        if (o instanceof long[]) {
            return (long[])o;
        }
        return null;
    }
}
