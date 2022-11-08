import java.util.Iterator;
import android.graphics.Bitmap;
import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgt implements dgo
{
    public static final Bitmap$Config[] a;
    public static final Bitmap$Config[] b;
    public static final Bitmap$Config[] c;
    public static final Bitmap$Config[] d;
    public static final Bitmap$Config[] e;
    public final dgs f;
    public final dgi g;
    private final Map h;
    
    static {
        final Bitmap$Config[] array = Arrays.copyOf(new Bitmap$Config[] { Bitmap$Config.ARGB_8888, null }, 3);
        array[array.length - 1] = Bitmap$Config.RGBA_F16;
        a = array;
        b = array;
        c = new Bitmap$Config[] { Bitmap$Config.RGB_565 };
        d = new Bitmap$Config[] { Bitmap$Config.ARGB_4444 };
        e = new Bitmap$Config[] { Bitmap$Config.ALPHA_8 };
    }
    
    public dgt() {
        this.f = new dgs();
        this.g = new dgi();
        this.h = new HashMap();
    }
    
    static String a(final int n, final Bitmap$Config bitmap$Config) {
        final String value = String.valueOf(bitmap$Config);
        final StringBuilder sb = new StringBuilder("[");
        sb.append(n);
        sb.append("](");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
    
    public final NavigableMap b(final Bitmap$Config bitmap$Config) {
        NavigableMap navigableMap;
        if ((navigableMap = this.h.get(bitmap$Config)) == null) {
            navigableMap = new TreeMap();
            this.h.put(bitmap$Config, navigableMap);
        }
        return navigableMap;
    }
    
    public final void c(final Integer n, final Bitmap bitmap) {
        final NavigableMap b = this.b(bitmap.getConfig());
        final Integer n2 = (Integer)b.get(n);
        if (n2 == null) {
            final String a = a(dpg.a(bitmap), bitmap.getConfig());
            final String string = this.toString();
            final StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
            sb.append(n);
            sb.append(", removed: ");
            sb.append(a);
            sb.append(", this: ");
            sb.append(string);
            throw new NullPointerException(sb.toString());
        }
        if (n2 == 1) {
            b.remove(n);
            return;
        }
        b.put(n, n2 - 1);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.g);
        sb.append(", sortedSizes=(");
        for (final Map.Entry<Object, V> entry : this.h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
