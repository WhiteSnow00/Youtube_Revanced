import android.graphics.Rect;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amm
{
    static Rect a(final View view) {
        return view.getClipBounds();
    }
    
    static void b(final View view, final Rect clipBounds) {
        view.setClipBounds(clipBounds);
    }
    
    static boolean c(final View view) {
        return view.isInLayout();
    }
}
