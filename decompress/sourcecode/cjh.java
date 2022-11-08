import android.graphics.Matrix;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

class cjh extends cjf
{
    private static boolean a = true;
    private static boolean b = true;
    
    public cjh() {
    }
    
    public void g(final View view, final Matrix matrix) {
        if (cjh.a) {
            try {
                cjg.b(view, matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                cjh.a = false;
            }
        }
    }
    
    public void h(final View view, final Matrix matrix) {
        if (cjh.b) {
            try {
                cjg.c(view, matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                cjh.b = false;
            }
        }
    }
}
