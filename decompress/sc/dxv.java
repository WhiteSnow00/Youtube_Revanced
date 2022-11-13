import java.util.ArrayList;
import java.util.List;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxv
{
    public static final dxw a;
    public static final dxw b;
    public static final dxw c;
    public static final dxw d;
    public static final dxw e;
    public static final dxw f;
    public static final dxw g;
    
    static {
        a = (dxw)new dxu(5);
        b = (dxw)new dxu(6);
        c = (dxw)new dxu(4);
        d = (dxw)new dxu(0);
        e = (dxw)new dxu(1);
        f = (dxw)new dxu(3);
        g = (dxw)new dxu(2);
    }
    
    public static float a(View view, final boolean b) {
        float n = 0.0f;
        while (view != null && view.getParent() instanceof View) {
            if (view instanceof efx && view instanceof egh) {
                return n;
            }
            float n2;
            if (b) {
                n2 = view.getX();
            }
            else {
                n2 = view.getY();
            }
            n += n2;
            view = (View)view.getParent();
        }
        return n;
    }
    
    public static View b(final Object o, final dxw dxw) {
        if (o instanceof View) {
            return (View)o;
        }
        final String b = dxw.b();
        final String value = String.valueOf(o);
        final StringBuilder sb = new StringBuilder("Animating '");
        sb.append(b);
        sb.append("' is only supported on Views (got ");
        sb.append(value);
        sb.append(")");
        throw new RuntimeException(sb.toString());
    }
    
    public static View c(Drawable drawable) {
        Drawable$Callback callback;
        while (true) {
            callback = drawable.getCallback();
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = (Drawable)callback;
        }
        if (callback instanceof View) {
            return (View)callback;
        }
        return null;
    }
    
    public static List d(final efx efx) {
        final int a = efx.a();
        int i = 0;
        List<Object> list = null;
        while (i < a) {
            final ega b = efx.b(i);
            List<Object> list2 = list;
            if (b.a instanceof Drawable) {
                list2 = list;
                if ((b.d.b.a.e & 0x4) != 0x0) {
                    if ((list2 = list) == null) {
                        list2 = new ArrayList<Object>();
                    }
                    list2.add(b.a);
                }
            }
            ++i;
            list = list2;
        }
        return list;
    }
}
