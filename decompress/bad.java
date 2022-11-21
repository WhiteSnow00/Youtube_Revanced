import android.os.Bundle;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bad
{
    public static afgh a(final axy axy, final List list) {
        final afgc d = afgh.d();
        for (int i = 0; i < list.size(); ++i) {
            final Bundle bundle = list.get(i);
            b(bundle);
            d.h(axy.a(bundle));
        }
        return d.g();
    }
    
    public static Object b(final Object o) {
        o.getClass();
        return o;
    }
    
    public static Object c(final Object o) {
        if (o != null) {
            return o;
        }
        throw new IllegalStateException();
    }
    
    public static void d(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void e(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException((String)o);
    }
    
    public static void f(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void g(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException((String)o);
    }
    
    public static void h(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }
    
    public static void i(final Object o, final Object o2) {
        if (o != null) {
            return;
        }
        throw new IllegalStateException((String)o2);
    }
}
