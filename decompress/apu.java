import android.graphics.drawable.Drawable;
import java.util.Locale;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apu
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
    
    public static float i(final float[] array, final float n) {
        if (n >= 1.0f) {
            return 1.0f;
        }
        if (n <= 0.0f) {
            return 0.0f;
        }
        final int min = Math.min((int)(200.0f * n), 199);
        final float n2 = (float)min;
        final float n3 = array[min];
        return n3 + (n - n2 * 0.005f) / 0.005f * (array[min + 1] - n3);
    }
}
