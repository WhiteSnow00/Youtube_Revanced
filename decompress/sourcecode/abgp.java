import java.util.List;
import java.util.Arrays;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.graphics.Rect;
import android.graphics.BitmapFactory$Options;
import android.graphics.BitmapRegionDecoder;
import android.net.Uri;
import j$.util.Optional;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import android.graphics.Bitmap;
import android.util.LruCache;
import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abgp implements abnq
{
    public final Executor a;
    public final Executor b;
    public final Set c;
    public final LruCache d;
    public final atid e;
    public long f;
    public Bitmap g;
    public long h;
    public Bitmap i;
    public boolean j;
    public boolean k;
    public final Object l;
    public boolean m;
    public boolean n;
    public wyn o;
    public final asib p;
    private final aceo q;
    private final szx r;
    private final abhq s;
    private final abns t;
    private boolean u;
    private final wyo v;
    private boolean w;
    private int x;
    private final arud y;
    private aeby z;
    
    public abgp(final aceo q, final Executor a, final ScheduledExecutorService b, final abhq s, final abns t, final arud y, final wyo v, final byte[] array, final byte[] array2) {
        this.j = false;
        this.k = false;
        this.n = false;
        this.p = new asib();
        q.getClass();
        this.q = q;
        this.a = a;
        this.b = b;
        this.l = new Object();
        this.c = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.s = s;
        this.t = t;
        this.y = y;
        this.x = 0;
        this.v = v;
        this.d = new LruCache(3);
        this.e = atid.aE((Object)Optional.empty());
        this.f = -1L;
        this.h = -1L;
        this.r = (szx)new hwo(this, 13);
        this.g();
    }
    
    public static long b(final abgr abgr, final long n) {
        return n << 32 | (long)abgr.e;
    }
    
    public static final Uri j(final abgr abgr, int b) {
        b = abgr.b(b);
        if (b < abgr.d()) {
            return Uri.parse(abgr.g(b));
        }
        return null;
    }
    
    public static final boolean k(final aalz aalz) {
        return aalz.a() - aalz.e() > 5000L;
    }
    
    public final int a(final abgr abgr, final int n) {
        if ((this.j && !this.k) || this.s.l) {
            final Uri j = j(abgr, n);
            if (j != null) {
                final ancy z = abpj.Z(this.y);
                if (z != null && z.E && !this.w) {
                    this.w = true;
                    (this.o = this.v.c(alku.N)).e();
                }
                final wyn o = this.o;
                if (o != null) {
                    o.c("thsb0_ns");
                }
                this.q.l(j, this.r);
            }
            return 4;
        }
        return 8;
    }
    
    public final Bitmap c(final abgr abgr, int x, final Bitmap inBitmap) {
        final BitmapRegionDecoder bitmapRegionDecoder = (BitmapRegionDecoder)this.d.get((Object)j(abgr, x));
        final Bitmap bitmap = null;
        if (bitmapRegionDecoder == null) {
            this.a(abgr, x);
            return null;
        }
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inBitmap = inBitmap;
        bitmapFactory$Options.inMutable = true;
        Bitmap decodeRegion;
        try {
            final Rect f = abgr.f(x);
            x = this.x;
            if (x == 1) {
                f.set(f.left, f.top, f.centerX(), f.bottom);
            }
            else if (x == 3) {
                f.set(f.left, f.top, f.right, f.centerY());
            }
            decodeRegion = bitmap;
            if (bitmapRegionDecoder.getWidth() >= f.right) {
                decodeRegion = bitmap;
                if (bitmapRegionDecoder.getHeight() >= f.bottom) {
                    decodeRegion = bitmap;
                    if (f.width() > 0) {
                        decodeRegion = bitmap;
                        if (f.height() > 0) {
                            decodeRegion = bitmapRegionDecoder.decodeRegion(f, bitmapFactory$Options);
                        }
                    }
                }
            }
        }
        catch (final Exception ex) {
            zjp.b(zjo.b, zjn.j, "Storyboard regionDecoder.decodeRegion exception - ".concat(String.valueOf(ex.getClass().getName())));
            this.m = true;
            decodeRegion = bitmap;
        }
        return decodeRegion;
    }
    
    public final void d(final abgo abgo) {
        synchronized (this) {
            this.c.add(abgo);
        }
    }
    
    public final void f(final PlayerResponseModel playerResponseModel) {
        String i;
        final String s = i = playerResponseModel.I();
        boolean b = false;
        Label_0063: {
            if (s == null) {
                final ancy z = abpj.Z(this.y);
                i = s;
                if (z != null) {
                    i = s;
                    if (z.x) {
                        final String h = playerResponseModel.H();
                        if ((i = h) != null) {
                            b = true;
                            i = h;
                            break Label_0063;
                        }
                    }
                }
            }
            b = false;
        }
        this.h();
        final int h2 = playerResponseModel.h();
        final Object o = null;
        aeby bj;
        if (b) {
            final aepj ck = this.t.ck();
            if (i == null) {
                bj = null;
            }
            else {
                final String[] split = i.split("#", -1);
                final String s2 = split[1];
                final String s3 = split[2];
                final String s4 = split[3];
                final String s5 = split[4];
                final String s6 = split[0];
                final StringBuilder sb = new StringBuilder();
                sb.append(s2);
                sb.append("#");
                sb.append(s3);
                sb.append("#0#");
                sb.append(s4);
                sb.append("#");
                sb.append(s5);
                sb.append("#-1#");
                sb.append(s6);
                sb.append("#");
                bj = new aeby(Arrays.asList(new abgs(sb.toString(), ck, null, null)));
            }
        }
        else {
            bj = aeby.bj(i, h2 * 1000L);
        }
        this.z = bj;
        this.x = playerResponseModel.j();
        this.u = true;
        final atid e = this.e;
        final aeby z2 = this.z;
        final int j = playerResponseModel.i();
        Object ab;
        if (z2 == null) {
            ab = o;
        }
        else {
            ab = z2.aB(j);
        }
        e.tr((Object)Optional.ofNullable(ab));
    }
    
    public final void g() {
        this.p.f(this.lX(this.t));
    }
    
    public final void h() {
        if (this.f == -1L && this.h == -1L) {
            return;
        }
        synchronized (this.l) {
            this.z = null;
            this.j = false;
            this.k = false;
            this.d.evictAll();
            this.g = null;
            this.i = null;
            this.f = -1L;
            this.h = -1L;
            this.m = false;
            this.n = false;
            this.u = false;
            this.o = null;
            this.w = false;
            this.e.tr((Object)Optional.empty());
            this.l(this.i);
        }
    }
    
    public final boolean i() {
        final aeby z = this.z;
        if (z != null && this.u) {
            final abgr ab = z.aB(0);
            if (!(ab instanceof abgs) || ab.c() > 0) {
                return true;
            }
        }
        return false;
    }
    
    public final void l(final Bitmap bitmap) {
        monitorenter(this);
        final abgq abgq;
        Label_0020: {
            Label_0018: {
                if (bitmap != null) {
                    Label_0046: {
                        try {
                            abgq.a(bitmap);
                            break Label_0020;
                        }
                        finally {
                            break Label_0046;
                        }
                        break Label_0018;
                    }
                    monitorexit(this);
                }
            }
            abgq = null;
        }
        this.a.execute((Runnable)new aban(this, abgq, 4));
        monitorexit(this);
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().e).j(aajj.t(abns.bN(), 268435456L)).j(aajj.r(1)).am((asix)new abgn(this, 1), (asix)abdi.f), ((asgt)abns.q().k).j(aajj.t(abns.bN(), 268435456L)).j(aajj.r(1)).am((asix)new abgn(this, 2), (asix)abdi.f), abns.E().am((asix)new abgn(this, 3), (asix)abdi.f), abns.I((aexg)abbn.k, (aexg)abbn.j).R().j(aajj.r(1)).am((asix)new abfy(this, 20), (asix)abdi.f), abns.w().am((asix)new abgn(this, 0), (asix)abdi.f) };
    }
    
    public final void m() {
        synchronized (this) {
            this.a.execute((Runnable)new abdq(this, 5));
        }
    }
}
