import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import android.os.Looper;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpg
{
    public static final char[] a;
    public static final char[] b;
    private static volatile Handler c;
    
    static {
        a = "0123456789abcdef".toCharArray();
        b = new char[64];
    }
    
    private dpg() {
    }
    
    public static int a(final Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            }
            catch (final NullPointerException ex) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        final String value = String.valueOf(bitmap);
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final String value2 = String.valueOf(bitmap.getConfig());
        final StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(value);
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(value2);
        throw new IllegalStateException(sb.toString());
    }
    
    public static int b(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return n * n2 * c(bitmap$Config);
    }
    
    public static int c(final Bitmap$Config bitmap$Config) {
        Bitmap$Config argb_8888 = bitmap$Config;
        if (bitmap$Config == null) {
            argb_8888 = Bitmap$Config.ARGB_8888;
        }
        final int n = dpf.a[argb_8888.ordinal()];
        int n2 = 1;
        if (n != 1) {
            n2 = 2;
            if (n != 2) {
                n2 = n2;
                if (n != 3) {
                    if (n != 4) {
                        return 4;
                    }
                    return 8;
                }
            }
        }
        return n2;
    }
    
    public static int d(final float n) {
        return f(Float.floatToIntBits(n), 17);
    }
    
    public static int e(final int n) {
        return f(n, 17);
    }
    
    public static int f(final int n, final int n2) {
        return n2 * 31 + n;
    }
    
    public static int g(final Object o, final int n) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        return f(hashCode, n);
    }
    
    public static Handler h() {
        if (dpg.c == null) {
            synchronized (dpg.class) {
                if (dpg.c == null) {
                    dpg.c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return dpg.c;
    }
    
    public static List i(final Collection collection) {
        final ArrayList list = new ArrayList(collection.size());
        for (final Object next : collection) {
            if (next != null) {
                list.add(next);
            }
        }
        return list;
    }
    
    public static Queue j(final int n) {
        return new ArrayDeque(n);
    }
    
    public static void k() {
        if (p()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }
    
    public static void l(final Runnable runnable) {
        h().post(runnable);
    }
    
    public static boolean m(final Object o, final Object o2) {
        if (o == null) {
            return o2 == null;
        }
        if (o instanceof dif) {
            return ((dif)o).a();
        }
        return o.equals(o2);
    }
    
    public static boolean n(final Object o, final Object o2) {
        boolean equals;
        if (o == null) {
            if (o2 == null) {
                return true;
            }
            equals = false;
        }
        else {
            equals = o.equals(o2);
        }
        return equals;
    }
    
    public static boolean o() {
        return !p();
    }
    
    public static boolean p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
    
    public static boolean q(final int n) {
        return n > 0 || n == Integer.MIN_VALUE;
    }
    
    public static boolean r(final int n, final int n2) {
        return q(n) && q(n2);
    }
}
