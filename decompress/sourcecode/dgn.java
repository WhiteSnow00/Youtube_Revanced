import java.util.NavigableMap;
import android.util.Log;
import android.graphics.Bitmap;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgn implements dgf
{
    private static final Bitmap$Config a;
    private final dgo b;
    private final Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;
    
    static {
        a = Bitmap$Config.ARGB_8888;
    }
    
    public dgn(final long d) {
        final dgt b = new dgt();
        final HashSet set = new HashSet((Collection<? extends E>)Arrays.asList(Bitmap$Config.values()));
        set.add(null);
        set.remove(Bitmap$Config.HARDWARE);
        final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)set);
        this.d = d;
        this.b = (dgo)b;
        this.c = unmodifiableSet;
    }
    
    private static Bitmap f(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        Bitmap$Config a = bitmap$Config;
        if (bitmap$Config == null) {
            a = dgn.a;
        }
        return Bitmap.createBitmap(n, n2, a);
    }
    
    private final Bitmap g(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        monitorenter(this);
        try {
            if (bitmap$Config != Bitmap$Config.HARDWARE) {
                final dgo b = this.b;
                Bitmap$Config a;
                if ((a = bitmap$Config) == null) {
                    a = dgn.a;
                }
                final int b2 = dpg.b(n, n2, a);
                final dgr d = ((dgt)b).f.d(b2, a);
                final boolean equals = Bitmap$Config.RGBA_F16.equals((Object)a);
                int n3 = 0;
                Bitmap$Config[] array;
                if (equals) {
                    array = dgt.b;
                }
                else {
                    final int n4 = dgq.a[a.ordinal()];
                    if (n4 != 1) {
                        if (n4 != 2) {
                            if (n4 != 3) {
                                if (n4 != 4) {
                                    array = new Bitmap$Config[] { a };
                                }
                                else {
                                    array = dgt.e;
                                }
                            }
                            else {
                                array = dgt.d;
                            }
                        }
                        else {
                            array = dgt.c;
                        }
                    }
                    else {
                        array = dgt.a;
                    }
                }
                final int length = array.length;
                dgr d2;
                while (true) {
                    d2 = d;
                    if (n3 >= length) {
                        break;
                    }
                    final Bitmap$Config bitmap$Config2 = array[n3];
                    final Integer n5 = ((dgt)b).b(bitmap$Config2).ceilingKey(b2);
                    if (n5 != null && n5 <= b2 * 8) {
                        if (n5 == b2) {
                            if (bitmap$Config2 == null) {
                                d2 = d;
                                if (a == null) {
                                    break;
                                }
                            }
                            else if (bitmap$Config2.equals((Object)a)) {
                                d2 = d;
                                break;
                            }
                        }
                        ((dgt)b).f.c((dgp)d);
                        d2 = ((dgt)b).f.d(n5, bitmap$Config2);
                        break;
                    }
                    ++n3;
                }
                final Bitmap bitmap = (Bitmap)((dgt)b).g.a((dgp)d2);
                if (bitmap != null) {
                    ((dgt)b).c(d2.a, bitmap);
                    bitmap.reconfigure(n, n2, a);
                }
                if (bitmap == null) {
                    ++this.g;
                }
                else {
                    ++this.f;
                    this.e -= dpg.a(bitmap);
                    bitmap.setHasAlpha(true);
                    bitmap.setPremultiplied(true);
                }
                monitorexit(this);
                return bitmap;
            }
            final String value = String.valueOf(bitmap$Config);
            final StringBuilder sb = new StringBuilder("Cannot create a mutable Bitmap with config: ");
            sb.append(value);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void h(final long n) {
        monitorenter(this);
        try {
            while (this.e > n) {
                final dgo b = this.b;
                final Bitmap bitmap = (Bitmap)((dgt)b).g.b();
                if (bitmap != null) {
                    ((dgt)b).c(dpg.a(bitmap), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        this.b.toString();
                    }
                    this.e = 0L;
                    monitorexit(this);
                    return;
                }
                this.e -= dpg.a(bitmap);
                ++this.i;
                bitmap.recycle();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final Bitmap a(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        final Bitmap g = this.g(n, n2, bitmap$Config);
        Bitmap f;
        if (g != null) {
            g.eraseColor(0);
            f = g;
        }
        else {
            f = f(n, n2, bitmap$Config);
        }
        return f;
    }
    
    public final Bitmap b(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        final Bitmap g = this.g(n, n2, bitmap$Config);
        if (g == null) {
            return f(n, n2, bitmap$Config);
        }
        return g;
    }
    
    public final void c() {
        this.h(0L);
    }
    
    public final void d(final Bitmap bitmap) {
        monitorenter(this);
        if (bitmap != null) {
            Label_0242: {
                try {
                    if (bitmap.isRecycled()) {
                        throw new IllegalStateException("Cannot pool recycled bitmap");
                    }
                    if (bitmap.isMutable() && dpg.a(bitmap) <= this.d && this.c.contains(bitmap.getConfig())) {
                        final int a = dpg.a(bitmap);
                        final dgo b = this.b;
                        final dgr d = ((dgt)b).f.d(dpg.a(bitmap), bitmap.getConfig());
                        ((dgt)b).g.c((dgp)d, (Object)bitmap);
                        final NavigableMap b2 = ((dgt)b).b(bitmap.getConfig());
                        final Integer n = (Integer)b2.get(d.a);
                        final int a2 = d.a;
                        int n2;
                        if (n == null) {
                            n2 = 1;
                        }
                        else {
                            n2 = n + 1;
                        }
                        b2.put(a2, n2);
                        ++this.h;
                        this.e += a;
                        this.h(this.d);
                        monitorexit(this);
                        return;
                    }
                    bitmap.recycle();
                    monitorexit(this);
                    return;
                }
                finally {
                    break Label_0242;
                }
                throw new NullPointerException("Bitmap must not be null");
            }
            monitorexit(this);
        }
        throw new NullPointerException("Bitmap must not be null");
    }
    
    public final void e(final int n) {
        if (n < 40 && n < 20) {
            if (n == 15) {
                this.h(this.d >> 1);
            }
            return;
        }
        this.c();
    }
}
