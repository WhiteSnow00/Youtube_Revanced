import android.graphics.drawable.Drawable;
import android.graphics.Paint$FontMetricsInt;
import android.os.Build$VERSION;
import android.widget.TextView;
import android.view.ActionMode$Callback;
import android.widget.EdgeEffect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apj
{
    static void a(final EdgeEffect edgeEffect, final float n, final float n2) {
        edgeEffect.onPull(n, n2);
    }
    
    public static ActionMode$Callback b(final ActionMode$Callback actionMode$Callback) {
        ActionMode$Callback a = actionMode$Callback;
        if (actionMode$Callback instanceof apx) {
            a = ((apx)actionMode$Callback).a;
        }
        return a;
    }
    
    public static ActionMode$Callback c(final TextView textView, final ActionMode$Callback actionMode$Callback) {
        if (Build$VERSION.SDK_INT <= 27 && !(actionMode$Callback instanceof apx) && actionMode$Callback != null) {
            return (ActionMode$Callback)new apx(actionMode$Callback, textView);
        }
        return actionMode$Callback;
    }
    
    public static void d(final TextView textView, final int n) {
        afc.h(n);
        if (Build$VERSION.SDK_INT >= 28) {
            apw.b(textView, n);
            return;
        }
        final Paint$FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int n2;
        if (apt.c(textView)) {
            n2 = fontMetricsInt.top;
        }
        else {
            n2 = fontMetricsInt.ascent;
        }
        if (n > Math.abs(n2)) {
            textView.setPadding(textView.getPaddingLeft(), n + n2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }
    
    public static void e(final TextView textView, final int n) {
        afc.h(n);
        final Paint$FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int n2;
        if (apt.c(textView)) {
            n2 = fontMetricsInt.bottom;
        }
        else {
            n2 = fontMetricsInt.descent;
        }
        if (n > Math.abs(n2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), n - n2);
        }
    }
    
    public static void f(final TextView textView, final int n) {
        afc.h(n);
        final int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint$FontMetricsInt)null);
        if (n != fontMetricsInt) {
            textView.setLineSpacing((float)(n - fontMetricsInt), 1.0f);
        }
    }
    
    public static void g(final TextView textView, final int n, final int n2) {
        apu.e(textView, n, 0, n2, 0);
    }
    
    public static void h(final TextView textView, final Drawable drawable, final Drawable drawable2, final Drawable drawable3) {
        apu.f(textView, drawable, drawable2, drawable3, null);
    }
}
