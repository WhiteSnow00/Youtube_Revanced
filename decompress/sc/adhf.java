import android.net.NetworkInfo;
import android.net.NetworkInfo$State;
import android.content.Intent;
import java.util.HashMap;
import android.os.Build;
import android.os.Build$VERSION;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.os.SystemClock;
import j$.util.Optional;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhf
{
    public boolean a;
    public int b;
    public int c;
    private final Context d;
    private final int e;
    private final int f;
    private final int g;
    private final long h;
    private final int i;
    private final String j;
    private final String k;
    private final Optional l;
    private final Optional m;
    private final int n;
    private final int o;
    private final String p;
    private final int q;
    private int r;
    private int s;
    private int t;
    private final tjm u;
    private boolean v;
    private final Optional w;
    private String x;
    private String y;
    
    public adhf(final Context d, final tjm u, final Optional w) {
        this.a = true;
        this.r = 0;
        this.b = 1;
        this.c = 2;
        SystemClock.elapsedRealtime();
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager)d.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        SystemClock.elapsedRealtime();
        final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
        ((ActivityManager)d.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo);
        final long h = activityManager$MemoryInfo.totalMem / 1024L;
        SystemClock.elapsedRealtime();
        final int sdk_INT = Build$VERSION.SDK_INT;
        final String incremental = Build$VERSION.INCREMENTAL;
        final String fingerprint = Build.FINGERPRINT;
        SystemClock.elapsedRealtime();
        d.getClass();
        final HashMap a = ajt.a;
        int media_PERFORMANCE_CLASS;
        if (Build$VERSION.SDK_INT >= 31) {
            media_PERFORMANCE_CLASS = Build$VERSION.MEDIA_PERFORMANCE_CLASS;
        }
        else {
            media_PERFORMANCE_CLASS = 0;
        }
        int o;
        if ((o = aer.c(media_PERFORMANCE_CLASS)) <= 0) {
            final String brand = Build.BRAND;
            final String product = Build.PRODUCT;
            final String device = Build.DEVICE;
            final String release = Build$VERSION.RELEASE;
            final StringBuilder sb = new StringBuilder();
            sb.append(brand);
            sb.append('/');
            sb.append(product);
            sb.append('/');
            sb.append(device);
            sb.append(':');
            sb.append(release);
            Integer value;
            if ((value = ajt.a.get(sb.toString())) == null) {
                value = 0;
            }
            o = aer.c((int)value);
        }
        this.o = o;
        final String property = System.getProperty("os.arch");
        SystemClock.elapsedRealtime();
        this.q = tum.a(d);
        SystemClock.elapsedRealtime();
        this.d = d;
        this.e = displayMetrics.densityDpi;
        this.f = displayMetrics.heightPixels;
        this.g = displayMetrics.widthPixels;
        this.h = h;
        this.i = sdk_INT;
        this.j = incremental;
        this.k = fingerprint;
        this.p = property;
        this.u = u;
        this.n = dyr.a();
        if (Build$VERSION.SDK_INT >= 31) {
            this.l = Optional.of((Object)Build.SOC_MANUFACTURER);
            this.m = Optional.of((Object)Build.SOC_MODEL);
        }
        else {
            this.l = Optional.empty();
            this.m = Optional.empty();
        }
        this.w = w;
    }
    
    private final void f() {
        try {
            this.v = qca.c(this.d);
        }
        finally {}
    }
    
    public final void a(final Intent intent) {
        final int intExtra = intent.getIntExtra("status", -1);
        final int intExtra2 = intent.getIntExtra("plugged", -1);
        if (intExtra != 5 && intExtra != 2) {
            this.b = 2;
        }
        else if (intExtra2 == 1) {
            this.b = 4;
        }
        else if (intExtra2 == 2) {
            this.b = 3;
        }
        else if (intExtra2 == 4) {
            this.b = 5;
        }
        else {
            this.b = 1;
        }
        final int ao = aqsx.aO(intent.getIntExtra("health", 1));
        this.c = ao;
        if (ao == 0) {
            this.c = 2;
        }
    }
    
    public final boolean b() {
        this.f();
        return this.v;
    }
    
    public final void c(final ahaz ahaz) {
        final int e = this.e;
        ahaz.copyOnWrite();
        final aoqi aoqi = (aoqi)ahaz.instance;
        final aoqi a = aoqi.a;
        aoqi.b |= 0x1;
        aoqi.c = e;
        final int f = this.f;
        ahaz.copyOnWrite();
        final aoqi aoqi2 = (aoqi)ahaz.instance;
        aoqi2.b |= 0x2;
        aoqi2.d = f;
        final int g = this.g;
        ahaz.copyOnWrite();
        final aoqi aoqi3 = (aoqi)ahaz.instance;
        aoqi3.b |= 0x4;
        aoqi3.e = g;
        final long h = this.h;
        ahaz.copyOnWrite();
        final aoqi aoqi4 = (aoqi)ahaz.instance;
        aoqi4.b |= 0x8;
        aoqi4.f = h;
        final int i = this.i;
        ahaz.copyOnWrite();
        final aoqi aoqi5 = (aoqi)ahaz.instance;
        aoqi5.b |= 0x10;
        aoqi5.g = i;
        final String j = this.j;
        ahaz.copyOnWrite();
        final aoqi aoqi6 = (aoqi)ahaz.instance;
        j.getClass();
        aoqi6.b |= 0x20;
        aoqi6.h = j;
        final String k = this.k;
        ahaz.copyOnWrite();
        final aoqi aoqi7 = (aoqi)ahaz.instance;
        k.getClass();
        aoqi7.b |= 0x200;
        aoqi7.k = k;
        final String p = this.p;
        ahaz.copyOnWrite();
        final aoqi aoqi8 = (aoqi)ahaz.instance;
        p.getClass();
        aoqi8.b |= 0x40;
        aoqi8.i = p;
        final int q = this.q;
        ahaz.copyOnWrite();
        final aoqi aoqi9 = (aoqi)ahaz.instance;
        aoqi9.b |= 0x80;
        aoqi9.j = q;
        final int bt = tpe.bt();
        ahaz.copyOnWrite();
        final aoqi aoqi10 = (aoqi)ahaz.instance;
        aoqi10.b |= 0x1000;
        aoqi10.n = bt;
        final int n = this.n;
        ahaz.copyOnWrite();
        final aoqi aoqi11 = (aoqi)ahaz.instance;
        aoqi11.b |= 0x2000;
        aoqi11.o = n;
        final int o = this.o;
        ahaz.copyOnWrite();
        final aoqi aoqi12 = (aoqi)ahaz.instance;
        aoqi12.b |= 0x10000;
        aoqi12.p = o;
        if (this.l.isPresent()) {
            final String l = (String)this.l.get();
            ahaz.copyOnWrite();
            final aoqi aoqi13 = (aoqi)ahaz.instance;
            aoqi13.b |= 0x400;
            aoqi13.l = l;
        }
        if (this.m.isPresent()) {
            final String m = (String)this.m.get();
            ahaz.copyOnWrite();
            final aoqi aoqi14 = (aoqi)ahaz.instance;
            aoqi14.b |= 0x800;
            aoqi14.m = m;
        }
    }
    
    public final void d(final ahaz ahaz) {
        final NetworkInfo d = this.u.d();
        if (d == null) {
            this.s = 0;
            this.t = NetworkInfo$State.DISCONNECTED.ordinal();
        }
        else {
            this.s = d.getType();
            this.t = d.getState().ordinal();
        }
        this.r = ((WindowManager)this.d.getSystemService("window")).getDefaultDisplay().getRotation();
        this.f();
        if (this.w.isPresent()) {
            final ulq a = ((ulr)this.w.get()).a;
            if (a != null) {
                this.x = a.e;
                this.y = a.d;
            }
        }
        aoqh aoqh;
        if ((aoqh = ((aoqk)ahaz.instance).e) == null) {
            aoqh = aoqh.a;
        }
        final ahaz builder = ((ahbh)aoqh).toBuilder();
        final boolean a2 = this.a;
        builder.copyOnWrite();
        final aoqh aoqh2 = (aoqh)builder.instance;
        aoqh2.b |= 0x1;
        aoqh2.c = a2;
        final int r = this.r;
        builder.copyOnWrite();
        final aoqh aoqh3 = (aoqh)builder.instance;
        aoqh3.b |= 0x2;
        aoqh3.d = r;
        final int s = this.s;
        builder.copyOnWrite();
        final aoqh aoqh4 = (aoqh)builder.instance;
        aoqh4.b |= 0x4;
        aoqh4.e = s;
        final int t = this.t;
        builder.copyOnWrite();
        final aoqh aoqh5 = (aoqh)builder.instance;
        aoqh5.b |= 0x8;
        aoqh5.f = t;
        final int b = this.b;
        builder.copyOnWrite();
        final aoqh aoqh6 = (aoqh)builder.instance;
        if (b != 0) {
            aoqh6.g = b - 1;
            aoqh6.b |= 0x10;
            final boolean v = this.v;
            builder.copyOnWrite();
            final aoqh aoqh7 = (aoqh)builder.instance;
            aoqh7.b |= 0x20;
            aoqh7.h = v;
            final String x = this.x;
            if (x != null) {
                builder.copyOnWrite();
                final aoqh aoqh8 = (aoqh)builder.instance;
                aoqh8.b |= 0x10000;
                aoqh8.i = x;
            }
            final String y = this.y;
            if (y != null) {
                builder.copyOnWrite();
                final aoqh aoqh9 = (aoqh)builder.instance;
                aoqh9.b |= 0x20000;
                aoqh9.j = y;
            }
            ahaz.copyOnWrite();
            final aoqk aoqk = (aoqk)ahaz.instance;
            final aoqh e = (aoqh)builder.build();
            e.getClass();
            aoqk.e = e;
            aoqk.b |= 0x4;
            return;
        }
        throw null;
    }
    
    public final void e(final ahaz ahaz) {
        aoqi aoqi;
        if ((aoqi = ((aoqk)ahaz.instance).d) == null) {
            aoqi = aoqi.a;
        }
        final ahaz builder = ((ahbh)aoqi).toBuilder();
        this.c(builder);
        ahaz.copyOnWrite();
        final aoqk aoqk = (aoqk)ahaz.instance;
        final aoqi d = (aoqi)builder.build();
        d.getClass();
        aoqk.d = d;
        aoqk.b |= 0x2;
    }
}
