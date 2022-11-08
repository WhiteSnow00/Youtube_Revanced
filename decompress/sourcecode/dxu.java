import java.util.ArrayList;
import java.util.List;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxu
{
    public static final dxv a;
    public static final dxv b;
    public static final dxv c;
    public static final dxv d;
    public static final dxv e;
    public static final dxv f;
    public static final dxv g;
    
    static {
        a = new dxt(5);
        b = new dxt(6);
        c = new dxt(4);
        d = new dxt(0);
        e = new dxt(1);
        f = new dxt(3);
        g = new dxt(2);
    }
    
    public static float a(View view, final boolean b) {
        float n = 0.0f;
        while (view != null && view.getParent() instanceof View) {
            if (view instanceof efw && view instanceof egg) {
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
    
    public static View b(final Object o, final dxv dxv) {
        if (o instanceof View) {
            return (View)o;
        }
        final String b = dxv.b();
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
    
    public static List d(final efw efw) {
        final int a = efw.a();
        List<Object> list = null;
        List<Object> list2;
        for (int i = 0; i < a; ++i, list = list2) {
            final efz b = efw.b(i);
            list2 = list;
            if (b.a instanceof Drawable) {
                list2 = list;
                if ((b.d.b.a.e & 0x4) != 0x0) {
                    if ((list2 = list) == null) {
                        list2 = new ArrayList<Object>();
                    }
                    list2.add(b.a);
                }
            }
        }
        return list;
    }
}
