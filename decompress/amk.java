import android.graphics.Paint;
import android.view.Display;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amk
{
    static int a() {
        return View.generateViewId();
    }
    
    static int b(final View view) {
        return view.getLabelFor();
    }
    
    static int c(final View view) {
        return view.getLayoutDirection();
    }
    
    static int d(final View view) {
        return view.getPaddingEnd();
    }
    
    static int e(final View view) {
        return view.getPaddingStart();
    }
    
    static Display f(final View view) {
        return view.getDisplay();
    }
    
    static void g(final View view, final int labelFor) {
        view.setLabelFor(labelFor);
    }
    
    static void h(final View view, final Paint layerPaint) {
        view.setLayerPaint(layerPaint);
    }
    
    static void i(final View view, final int layoutDirection) {
        view.setLayoutDirection(layoutDirection);
    }
    
    static void j(final View view, final int n, final int n2, final int n3, final int n4) {
        view.setPaddingRelative(n, n2, n3, n4);
    }
    
    static boolean k(final View view) {
        return view.isPaddingRelative();
    }
}
