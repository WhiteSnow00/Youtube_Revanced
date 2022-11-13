import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.util.SparseArray;
import android.content.Context;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtm
{
    public static final Object a;
    public static final Map b;
    public static final WeakHashMap c;
    private static final WeakHashMap d;
    private static dtl e;
    
    static {
        a = new Object();
        b = new HashMap(4);
        c = new WeakHashMap();
        d = new WeakHashMap();
    }
    
    public static dvx a(final Context context, final dtd dtd) {
        synchronized (dtm.a) {
            final Map b = dtm.b;
            SparseArray sparseArray;
            if ((sparseArray = b.get(context)) == null) {
                if (dtm.c.containsKey(coz.b(context))) {
                    return null;
                }
                if (!dtm.d.containsKey(context)) {
                    if (dtm.e == null) {
                        dtm.e = new dtl();
                        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)dtm.e);
                    }
                }
                sparseArray = new SparseArray();
                b.put(context, sparseArray);
            }
            dvx n;
            if ((n = (dvx)sparseArray.get(dtd.w)) == null) {
                final boolean a = dyp.a;
                n = dtd.N();
                sparseArray.put(dtd.w, (Object)n);
            }
            return n;
        }
    }
}
