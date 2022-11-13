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

public final class dgo implements dgg
{
    private static final Bitmap$Config a;
    private final dgp b;
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
    
    public dgo(final long d) {
        final dgu b = new dgu();
        final HashSet set = new HashSet((Collection<? extends E>)Arrays.asList(Bitmap$Config.values()));
        set.add(null);
        set.remove(Bitmap$Config.HARDWARE);
        final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)set);
        this.d = d;
        this.b = (dgp)b;
        this.c = unmodifiableSet;
    }
    
    private static Bitmap f(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        Bitmap$Config a = bitmap$Config;
        if (bitmap$Config == null) {
            a = dgo.a;
        }
        return Bitmap.createBitmap(n, n2, a);
    }
    
    private final Bitmap g(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        monitorenter(this);
        try {
            if (bitmap$Config != Bitmap$Config.HARDWARE) {
                final dgp b = this.b;
                Bitmap$Config a;
                if ((a = bitmap$Config) == null) {
                    a = dgo.a;
                }
                final int n3 = n * n2 * dph.b(a);
                final dgs d = ((dgu)b).f.d(n3, a);
                final boolean equals = Bitmap$Config.RGBA_F16.equals((Object)a);
                int n4 = 0;
                Bitmap$Config[] array;
                if (equals) {
                    array = dgu.b;
                }
                else {
                    final int n5 = dgr.a[a.ordinal()];
                    if (n5 != 1) {
                        if (n5 != 2) {
                            if (n5 != 3) {
                                if (n5 != 4) {
                                    array = new Bitmap$Config[] { a };
                                }
                                else {
                                    array = dgu.e;
                                }
                            }
                            else {
                                array = dgu.d;
                            }
                        }
                        else {
                            array = dgu.c;
                        }
                    }
                    else {
                        array = dgu.a;
                    }
                }
                final int length = array.length;
                dgs d2;
                while (true) {
                    d2 = d;
                    if (n4 >= length) {
                        break;
                    }
                    final Bitmap$Config bitmap$Config2 = array[n4];
                    final Integer n6 = ((dgu)b).b(bitmap$Config2).ceilingKey(n3);
                    if (n6 != null && n6 <= n3 * 8) {
                        if (n6 == n3) {
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
                        ((dgu)b).f.c((dgq)d);
                        d2 = ((dgu)b).f.d(n6, bitmap$Config2);
                        break;
                    }
                    ++n4;
                }
                final Bitmap bitmap = (Bitmap)((dgu)b).g.a((dgq)d2);
                if (bitmap != null) {
                    ((dgu)b).c(d2.a, bitmap);
                    bitmap.reconfigure(n, n2, a);
                }
                if (bitmap == null) {
                    ++this.g;
                }
                else {
                    ++this.f;
                    this.e -= dph.a(bitmap);
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
                final dgp b = this.b;
                final Bitmap bitmap = (Bitmap)((dgu)b).g.b();
                if (bitmap != null) {
                    ((dgu)b).c(dph.a(bitmap), bitmap);
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
                this.e -= dph.a(bitmap);
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
            Label_0244: {
                try {
                    if (bitmap.isRecycled()) {
                        throw new IllegalStateException("Cannot pool recycled bitmap");
                    }
                    if (bitmap.isMutable() && dph.a(bitmap) <= this.d && this.c.contains(bitmap.getConfig())) {
                        final int a = dph.a(bitmap);
                        final dgp b = this.b;
                        final dgs d = ((dgu)b).f.d(dph.a(bitmap), bitmap.getConfig());
                        ((dgu)b).g.c((dgq)d, (Object)bitmap);
                        final NavigableMap b2 = ((dgu)b).b(bitmap.getConfig());
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
                    break Label_0244;
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
