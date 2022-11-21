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

public final class adiu
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
    private final tkq u;
    private boolean v;
    private final Optional w;
    private String x;
    private String y;
    
    public adiu(final Context d, final tkq u, final Optional w) {
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
        final HashMap a = aju.a;
        int media_PERFORMANCE_CLASS;
        if (Build$VERSION.SDK_INT >= 31) {
            media_PERFORMANCE_CLASS = Build$VERSION.MEDIA_PERFORMANCE_CLASS;
        }
        else {
            media_PERFORMANCE_CLASS = 0;
        }
        int o;
        if ((o = aer.d(media_PERFORMANCE_CLASS)) <= 0) {
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
            if ((value = aju.a.get(sb.toString())) == null) {
                value = 0;
            }
            o = aer.d(value);
        }
        this.o = o;
        final String property = System.getProperty("os.arch");
        SystemClock.elapsedRealtime();
        this.q = tvo.a(d);
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
        this.n = dyu.a();
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
            this.v = qct.c(this.d);
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
        final int ag = aqvq.aG(intent.getIntExtra("health", 1));
        this.c = ag;
        if (ag == 0) {
            this.c = 2;
        }
    }
    
    public final boolean b() {
        this.f();
        return this.v;
    }
    
    public final void c(final ahcr ahcr) {
        final int e = this.e;
        ahcr.copyOnWrite();
        final aost aost = (aost)ahcr.instance;
        final aost a = aost.a;
        aost.b |= 0x1;
        aost.c = e;
        final int f = this.f;
        ahcr.copyOnWrite();
        final aost aost2 = (aost)ahcr.instance;
        aost2.b |= 0x2;
        aost2.d = f;
        final int g = this.g;
        ahcr.copyOnWrite();
        final aost aost3 = (aost)ahcr.instance;
        aost3.b |= 0x4;
        aost3.e = g;
        final long h = this.h;
        ahcr.copyOnWrite();
        final aost aost4 = (aost)ahcr.instance;
        aost4.b |= 0x8;
        aost4.f = h;
        final int i = this.i;
        ahcr.copyOnWrite();
        final aost aost5 = (aost)ahcr.instance;
        aost5.b |= 0x10;
        aost5.g = i;
        final String j = this.j;
        ahcr.copyOnWrite();
        final aost aost6 = (aost)ahcr.instance;
        j.getClass();
        aost6.b |= 0x20;
        aost6.h = j;
        final String k = this.k;
        ahcr.copyOnWrite();
        final aost aost7 = (aost)ahcr.instance;
        k.getClass();
        aost7.b |= 0x200;
        aost7.k = k;
        final String p = this.p;
        ahcr.copyOnWrite();
        final aost aost8 = (aost)ahcr.instance;
        p.getClass();
        aost8.b |= 0x40;
        aost8.i = p;
        final int q = this.q;
        ahcr.copyOnWrite();
        final aost aost9 = (aost)ahcr.instance;
        aost9.b |= 0x80;
        aost9.j = q;
        final int bt = tqf.bt();
        ahcr.copyOnWrite();
        final aost aost10 = (aost)ahcr.instance;
        aost10.b |= 0x1000;
        aost10.n = bt;
        final int n = this.n;
        ahcr.copyOnWrite();
        final aost aost11 = (aost)ahcr.instance;
        aost11.b |= 0x2000;
        aost11.o = n;
        final int o = this.o;
        ahcr.copyOnWrite();
        final aost aost12 = (aost)ahcr.instance;
        aost12.b |= 0x10000;
        aost12.p = o;
        if (this.l.isPresent()) {
            final String l = (String)this.l.get();
            ahcr.copyOnWrite();
            final aost aost13 = (aost)ahcr.instance;
            aost13.b |= 0x400;
            aost13.l = l;
        }
        if (this.m.isPresent()) {
            final String m = (String)this.m.get();
            ahcr.copyOnWrite();
            final aost aost14 = (aost)ahcr.instance;
            aost14.b |= 0x800;
            aost14.m = m;
        }
    }
    
    public final void d(final ahcr ahcr) {
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
            final umu a = ((umv)this.w.get()).a;
            if (a != null) {
                this.x = a.e;
                this.y = a.d;
            }
        }
        aosr aosr;
        if ((aosr = ((aosv)ahcr.instance).e) == null) {
            aosr = aosr.a;
        }
        final ahcr builder = ((ahcz)aosr).toBuilder();
        final boolean a2 = this.a;
        builder.copyOnWrite();
        final aosr aosr2 = (aosr)builder.instance;
        aosr2.b |= 0x1;
        aosr2.c = a2;
        final int r = this.r;
        builder.copyOnWrite();
        final aosr aosr3 = (aosr)builder.instance;
        aosr3.b |= 0x2;
        aosr3.d = r;
        final int s = this.s;
        builder.copyOnWrite();
        final aosr aosr4 = (aosr)builder.instance;
        aosr4.b |= 0x4;
        aosr4.e = s;
        final int t = this.t;
        builder.copyOnWrite();
        final aosr aosr5 = (aosr)builder.instance;
        aosr5.b |= 0x8;
        aosr5.f = t;
        final int b = this.b;
        builder.copyOnWrite();
        final aosr aosr6 = (aosr)builder.instance;
        if (b != 0) {
            aosr6.g = b - 1;
            aosr6.b |= 0x10;
            final boolean v = this.v;
            builder.copyOnWrite();
            final aosr aosr7 = (aosr)builder.instance;
            aosr7.b |= 0x20;
            aosr7.h = v;
            final String x = this.x;
            if (x != null) {
                builder.copyOnWrite();
                final aosr aosr8 = (aosr)builder.instance;
                aosr8.b |= 0x10000;
                aosr8.i = x;
            }
            final String y = this.y;
            if (y != null) {
                builder.copyOnWrite();
                final aosr aosr9 = (aosr)builder.instance;
                aosr9.b |= 0x20000;
                aosr9.j = y;
            }
            ahcr.copyOnWrite();
            final aosv aosv = (aosv)ahcr.instance;
            final aosr e = (aosr)builder.build();
            e.getClass();
            aosv.e = e;
            aosv.b |= 0x4;
            return;
        }
        throw null;
    }
    
    public final void e(final ahcr ahcr) {
        aost aost;
        if ((aost = ((aosv)ahcr.instance).d) == null) {
            aost = aost.a;
        }
        final ahcr builder = ((ahcz)aost).toBuilder();
        this.c(builder);
        ahcr.copyOnWrite();
        final aosv aosv = (aosv)ahcr.instance;
        final aost d = (aost)builder.build();
        d.getClass();
        aosv.d = d;
        aosv.b |= 0x2;
    }
}
