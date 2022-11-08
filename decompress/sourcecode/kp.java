import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewTreeObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kp
{
    public static void a(final ViewTreeObserver viewTreeObserver, final ViewTreeObserver$OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener);
    }
    
    public static final void b(final View view, final ra ra) {
        view.getClass();
        view.setTag(2131432371, (Object)ra);
    }
}
