import android.graphics.Matrix;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

class cji extends cjg
{
    private static boolean a = true;
    private static boolean b = true;
    
    public cji() {
    }
    
    public void g(final View view, final Matrix matrix) {
        if (cji.a) {
            try {
                cjh.b(view, matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                cji.a = false;
            }
        }
    }
    
    public void h(final View view, final Matrix matrix) {
        if (cji.b) {
            try {
                cjh.c(view, matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                cji.b = false;
            }
        }
    }
}
