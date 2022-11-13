import android.os.Build$VERSION;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

class cjm extends cjk
{
    private static boolean a = true;
    
    public cjm() {
    }
    
    public void f(final View view, final int n) {
        if (Build$VERSION.SDK_INT == 28) {
            super.f(view, n);
            return;
        }
        if (cjm.a) {
            try {
                cjl.a(view, n);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                cjm.a = false;
            }
        }
    }
}
