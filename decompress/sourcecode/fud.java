import android.view.View$OnClickListener;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class fud
{
    private static final View$AccessibilityDelegate a;
    
    static {
        a = new fuc();
    }
    
    public static void a(final fub onClickListener, final View view, final Object tag) {
        view.getClass();
        tag.getClass();
        final int count = onClickListener.c.getCount();
        int visibility = 0;
        boolean focusable;
        if (count > 0) {
            view.setOnClickListener((View$OnClickListener)onClickListener);
            view.setTag(tag);
            focusable = true;
        }
        else {
            focusable = false;
        }
        view.setAccessibilityDelegate(fud.a);
        view.setClickable(focusable);
        view.setEnabled(focusable);
        view.setFocusable(focusable);
        if (!focusable) {
            visibility = 8;
        }
        view.setVisibility(visibility);
    }
}
