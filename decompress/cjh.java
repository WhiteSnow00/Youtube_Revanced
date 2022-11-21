import android.view.View;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class cjh
{
    static final Property a;
    public static final ciz b;
    
    static {
        if (Build$VERSION.SDK_INT >= 29) {
            b = (ciz)new cjq();
        }
        else {
            b = (ciz)new cjp();
        }
        a = new cjf(Float.class);
        new cjg(Rect.class);
    }
    
    static float a(final View view) {
        return cjh.b.b(view);
    }
    
    static void b(final View view, final int n, final int n2, final int n3, final int n4) {
        cjh.b.c(view, n, n2, n3, n4);
    }
    
    static void c(final View view, final float n) {
        cjh.b.d(view, n);
    }
    
    static void d(final View view, final int n) {
        cjh.b.e(view, n);
    }
    
    static cjv e(final View view) {
        return new cjv(view);
    }
}
