import android.graphics.RectF;
import android.view.ViewParent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxe
{
    private static final ThreadLocal a;
    private static final ThreadLocal b;
    
    static {
        a = new ThreadLocal();
        b = new ThreadLocal();
    }
    
    public static void a(final ViewGroup viewGroup, final View view, final Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        final ThreadLocal a = adxe.a;
        Matrix matrix = a.get();
        if (matrix == null) {
            matrix = new Matrix();
            a.set(matrix);
        }
        else {
            matrix.reset();
        }
        b((ViewParent)viewGroup, view, matrix);
        final ThreadLocal b = adxe.b;
        RectF rectF;
        if ((rectF = b.get()) == null) {
            rectF = new RectF();
            b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int)(rectF.left + 0.5f), (int)(rectF.top + 0.5f), (int)(rectF.right + 0.5f), (int)(rectF.bottom + 0.5f));
    }
    
    private static void b(final ViewParent viewParent, final View view, final Matrix matrix) {
        final ViewParent parent = view.getParent();
        if (parent instanceof View && parent != viewParent) {
            final View view2 = (View)parent;
            b(viewParent, view2, matrix);
            matrix.preTranslate((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
        }
        matrix.preTranslate((float)view.getLeft(), (float)view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
