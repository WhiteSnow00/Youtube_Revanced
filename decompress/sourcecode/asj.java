import android.graphics.Rect;
import android.view.View;
import android.text.method.TransformationMethod;

// 
// Decompiled by Procyon v0.6.0
// 

final class asj implements TransformationMethod
{
    private final TransformationMethod a;
    
    public asj(final TransformationMethod a) {
        this.a = a;
    }
    
    public final CharSequence getTransformation(CharSequence c, final View view) {
        if (view.isInEditMode()) {
            return c;
        }
        final CharSequence transformation = this.a.getTransformation(c, view);
        if ((c = transformation) != null) {
            if (ars.b().a() != 1) {
                c = transformation;
            }
            else {
                c = ars.b().c(transformation);
            }
        }
        return c;
    }
    
    public final void onFocusChanged(final View view, final CharSequence charSequence, final boolean b, final int n, final Rect rect) {
        this.a.onFocusChanged(view, charSequence, b, n, rect);
    }
}
