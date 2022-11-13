import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apu
{
    static int a(final TextView textView) {
        return textView.getBreakStrategy();
    }
    
    static int b(final TextView textView) {
        return textView.getHyphenationFrequency();
    }
    
    static ColorStateList c(final TextView textView) {
        return textView.getCompoundDrawableTintList();
    }
    
    static PorterDuff$Mode d(final TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }
    
    static void e(final TextView textView, final int breakStrategy) {
        textView.setBreakStrategy(breakStrategy);
    }
    
    public static void f(final TextView textView, final ColorStateList compoundDrawableTintList) {
        textView.setCompoundDrawableTintList(compoundDrawableTintList);
    }
    
    public static void g(final TextView textView, final PorterDuff$Mode compoundDrawableTintMode) {
        textView.setCompoundDrawableTintMode(compoundDrawableTintMode);
    }
    
    static void h(final TextView textView, final int hyphenationFrequency) {
        textView.setHyphenationFrequency(hyphenationFrequency);
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
