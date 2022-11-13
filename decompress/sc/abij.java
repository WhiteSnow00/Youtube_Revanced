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

public final class abij implements abps
{
    private adet A;
    public final Executor a;
    public final Executor b;
    public final Set c;
    public final LruCache d;
    public final ativ e;
    public long f;
    public Bitmap g;
    public long h;
    public Bitmap i;
    public boolean j;
    public boolean k;
    public final Object l;
    public boolean m;
    public boolean n;
    public xan o;
    public final asiq p;
    private final acgs q;
    private final tcc r;
    private final abjj s;
    private final abpu t;
    private boolean u;
    private final xao v;
    private boolean w;
    private int x;
    private final vai y;
    private final arwh z;
    
    public abij(final acgs q, final Executor a, final ScheduledExecutorService b, final abjj s, final abpu t, final arwh z, final xao v, final vai y, final byte[] array, final byte[] array2) {
        this.j = false;
        this.k = false;
        this.n = false;
        this.p = new asiq();
        q.getClass();
        this.q = q;
        this.a = a;
        this.b = b;
        this.l = new Object();
        this.c = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.s = s;
        this.t = t;
        this.z = z;
        this.x = 0;
        this.v = v;
        this.y = y;
        this.d = new LruCache(3);
        this.e = ativ.aF((Object)Optional.empty());
        this.f = -1L;
        this.h = -1L;
        this.r = (tcc)new hxl(this, 13);
        this.g();
    }
    
    public static long b(final abil abil, final long n) {
        return n << 32 | (long)abil.e;
    }
    
    public static final Uri j(final abil abil, int b) {
        b = abil.b(b);
        if (b < abil.d()) {
            return Uri.parse(abil.g(b));
        }
        return null;
    }
    
    public static final boolean k(final aant aant) {
        return aant.a() - aant.e() > 5000L;
    }
    
    public final int a(final abil abil, final int n) {
        if ((this.j && !this.k) || this.s.k) {
            final Uri j = j(abil, n);
            if (j != null) {
                final anfc ag = abrj.ag(this.z);
                if (ag != null && ag.E && !this.w) {
                    this.w = true;
                    (this.o = this.v.c(almx.N)).e();
                }
                final xan o = this.o;
                if (o != null) {
                    o.c("thsb0_ns");
                }
                this.q.l(j, this.r);
            }
            return 4;
        }
        return 8;
    }
    
    public final Bitmap c(final abil abil, int x, final Bitmap inBitmap) {
        final BitmapRegionDecoder bitmapRegionDecoder = (BitmapRegionDecoder)this.d.get((Object)j(abil, x));
        final Bitmap bitmap = null;
        if (bitmapRegionDecoder == null) {
            this.a(abil, x);
            return null;
        }
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inBitmap = inBitmap;
        bitmapFactory$Options.inMutable = true;
        Bitmap decodeRegion;
        try {
            final Rect f = abil.f(x);
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
            zlm.b(zll.b, zlk.j, "Storyboard regionDecoder.decodeRegion exception - ".concat(String.valueOf(ex.getClass().getName())));
            this.m = true;
            decodeRegion = bitmap;
        }
        return decodeRegion;
    }
    
    public final void d(final abii abii) {
        synchronized (this) {
            this.c.add(abii);
        }
    }
    
    public final void f(final PlayerResponseModel playerResponseModel) {
        String i;
        final String s = i = playerResponseModel.I();
        boolean b = false;
        Label_0075: {
            if (s == null) {
                final anfc ag = abrj.ag(this.z);
                i = s;
                if (ag != null) {
                    i = s;
                    if (ag.x) {
                        final String h = playerResponseModel.H();
                        if ((i = h) != null) {
                            b = true;
                            i = h;
                            break Label_0075;
                        }
                    }
                }
            }
            b = false;
        }
        this.h();
        final int h2 = playerResponseModel.h();
        final Object o = null;
        adet aw;
        if (b) {
            final afhd co = this.t.co();
            if (i == null) {
                aw = null;
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
                aw = new adet(Arrays.asList(new abim(sb.toString(), co, null, null, null)));
            }
        }
        else {
            aw = adet.aw(i, h2 * 1000L, this.y);
        }
        this.A = aw;
        this.x = playerResponseModel.j();
        this.u = true;
        final ativ e = this.e;
        final adet a = this.A;
        final int j = playerResponseModel.i();
        Object u;
        if (a == null) {
            u = o;
        }
        else {
            u = a.U(j);
        }
        e.tu((Object)Optional.ofNullable(u));
    }
    
    public final void g() {
        this.p.f(this.lX(this.t));
    }
    
    public final void h() {
        if (this.f == -1L && this.h == -1L) {
            return;
        }
        synchronized (this.l) {
            this.A = null;
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
            this.e.tu((Object)Optional.empty());
            this.l(this.i);
        }
    }
    
    public final boolean i() {
        final adet a = this.A;
        if (a != null && this.u) {
            final abil u = a.U(0);
            if (!(u instanceof abim) || u.c() > 0) {
                return true;
            }
        }
        return false;
    }
    
    public final void l(final Bitmap bitmap) {
        monitorenter(this);
        final abik abik;
        Label_0020: {
            Label_0018: {
                if (bitmap != null) {
                    Label_0047: {
                        try {
                            abik.a(bitmap);
                            break Label_0020;
                        }
                        finally {
                            break Label_0047;
                        }
                        break Label_0018;
                    }
                    monitorexit(this);
                }
            }
            abik = null;
        }
        this.a.execute(new aaxb(this, abik, 6));
        monitorexit(this);
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().e).j(aale.s(abpu.bM(), 268435456L)).j(aale.q(1)).an((asjm)new abhx(this, 5), (asjm)abfd.f), ((ashi)abpu.p().k).j(aale.s(abpu.bM(), 268435456L)).j(aale.q(1)).an((asjm)new abhx(this, 7), (asjm)abfd.f), abpu.D().an((asjm)new abhx(this, 8), (asjm)abfd.f), abpu.H((aezf)abdc.o, (aezf)abdc.n).R().j(aale.q(1)).an((asjm)new abhx(this, 4), (asjm)abfd.f), abpu.v().an((asjm)new abhx(this, 6), (asjm)abfd.f) };
    }
    
    public final void m() {
        synchronized (this) {
            this.a.execute((Runnable)new abei(this, 7));
        }
    }
}
