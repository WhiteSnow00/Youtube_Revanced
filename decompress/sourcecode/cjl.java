import android.os.Build$VERSION;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

class cjl extends cjj
{
    private static boolean a = true;
    
    public cjl() {
    }
    
    public void f(final View view, final int n) {
        if (Build$VERSION.SDK_INT == 28) {
            super.f(view, n);
            return;
        }
        if (cjl.a) {
            try {
                cjk.a(view, n);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                cjl.a = false;
            }
        }
    }
}
