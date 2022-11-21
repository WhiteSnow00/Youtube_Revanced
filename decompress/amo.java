import android.view.WindowInsets;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amo
{
    static WindowInsets a(final View view, final WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }
    
    static WindowInsets b(final View view, final WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }
    
    static void c(final View view) {
        view.requestApplyInsets();
    }
}
