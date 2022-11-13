import android.graphics.Matrix;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class cjn extends cjm
{
    public cjn() {
    }
    
    public final float c(final View view) {
        return view.getTransitionAlpha();
    }
    
    public final void d(final View view, final int n, final int n2, final int n3, final int n4) {
        view.setLeftTopRightBottom(n, n2, n3, n4);
    }
    
    public final void e(final View view, final float transitionAlpha) {
        view.setTransitionAlpha(transitionAlpha);
    }
    
    @Override
    public final void f(final View view, final int transitionVisibility) {
        view.setTransitionVisibility(transitionVisibility);
    }
    
    public final void g(final View view, final Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
    
    public final void h(final View view, final Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
