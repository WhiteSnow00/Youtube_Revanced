import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbo
{
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    @Deprecated
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final Object k;
    
    static {
        ayu.a("media3.datasource");
    }
    
    public bbo(final Uri uri) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }
    
    public bbo(final Uri a, final long b, final int c, final byte[] array, final Map map, final long g, long h, final String i, final int j, final Object k) {
        final long f = b + g;
        final boolean b2 = false;
        dk.f(f >= 0L);
        dk.f(g >= 0L);
        boolean b3 = false;
        Label_0093: {
            if (h <= 0L) {
                final long n = -1L;
                if (h != -1L) {
                    b3 = b2;
                    break Label_0093;
                }
                h = n;
            }
            b3 = true;
        }
        dk.f(b3);
        this.a = a;
        this.b = b;
        this.c = c;
        byte[] d = null;
        if (array != null) {
            d = d;
            if (array.length != 0) {
                d = array;
            }
        }
        this.d = d;
        this.e = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(map));
        this.g = g;
        this.f = f;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Deprecated
    public bbo(final Uri uri, final long n, final long n2, final long n3, final String s, final int n4) {
        this(uri, n - n2, 1, null, Collections.emptyMap(), n2, n3, s, n4, null);
    }
    
    @Deprecated
    public bbo(final Uri uri, final long n, final long n2, final String s) {
        this(uri, n, n, n2, s, 0);
    }
    
    @Deprecated
    public bbo(final Uri uri, final long n, final long n2, final String s, final byte[] array) {
        this(uri, n, n, n2, s, 4);
    }
    
    public static String f(final int n) {
        if (n == 1) {
            return "GET";
        }
        if (n == 2) {
            return "POST";
        }
        throw new IllegalStateException();
    }
    
    public final bbn a() {
        return new bbn(this);
    }
    
    public final bbo b(final long n) {
        final long h = this.h;
        long n2 = -1L;
        if (h != -1L) {
            n2 = h - n;
        }
        return this.c(n, n2);
    }
    
    public final bbo c(long n, final long n2) {
        final long n3 = 0L;
        if (n == 0L) {
            if (this.h == n2) {
                return this;
            }
            n = n3;
        }
        return new bbo(this.a, this.b, this.c, this.d, this.e, this.g + n, n2, this.i, this.j, this.k);
    }
    
    public final bbo d(final Uri uri) {
        return new bbo(uri, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k);
    }
    
    public final String e() {
        return f(this.c);
    }
    
    public final boolean g(final int n) {
        return (this.j & n) == n;
    }
    
    @Override
    public final String toString() {
        final String e = this.e();
        final String value = String.valueOf(this.a);
        final long g = this.g;
        final long h = this.h;
        final String i = this.i;
        final int j = this.j;
        final StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(e);
        sb.append(" ");
        sb.append(value);
        sb.append(", ");
        sb.append(g);
        sb.append(", ");
        sb.append(h);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        sb.append("]");
        return sb.toString();
    }
}
