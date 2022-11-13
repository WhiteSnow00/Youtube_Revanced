import android.view.animation.Interpolator;
import android.view.animation.AccelerateDecelerateInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public class dxg
{
    public static final dxd g;
    public static final dxe h;
    public static final dxd i;
    
    static {
        final dxd j = g = (dxd)new dxb(dzg.a);
        h = dxe.b;
        i = j;
        new AccelerateDecelerateInterpolator();
    }
    
    public static dxd c(final int n, final Interpolator interpolator) {
        return (dxd)new dxc(n, interpolator);
    }
    
    public static dxa d(final dxe dxe, final String s) {
        int n;
        if (dxe == dxe.a) {
            n = 4;
        }
        else {
            if (dxe != dxe.b) {
                throw new RuntimeException("Unhandled TransitionKeyType ".concat(String.valueOf(String.valueOf(dxe))));
            }
            n = 2;
        }
        return new dxa(n, (Object)s);
    }
    
    public static boolean e(final Object o) {
        return o == null;
    }
    
    public static float f(final dxf dxf, final ego ego) {
        final dxh o = ((dvf)ego).o;
        return dxf.c.a;
    }
}
