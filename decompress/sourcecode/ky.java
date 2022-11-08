import java.util.Locale;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public class ky
{
    static void a(final TextView textView, final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }
    
    static void b(final TextView textView, final Locale textLocale) {
        textView.setTextLocale(textLocale);
    }
    
    static Drawable[] c(final TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
    
    public void d() {
    }
    
    public void e(final CharSequence charSequence) {
    }
    
    public void f() {
    }
}
