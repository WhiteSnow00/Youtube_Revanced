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

public final class adfc
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
    private final thh u;
    private boolean v;
    private final Optional w;
    private String x;
    private String y;
    
    public adfc(final Context d, final thh u, final Optional w) {
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
        final HashMap a = ajs.a;
        int media_PERFORMANCE_CLASS;
        if (Build$VERSION.SDK_INT >= 31) {
            media_PERFORMANCE_CLASS = Build$VERSION.MEDIA_PERFORMANCE_CLASS;
        }
        else {
            media_PERFORMANCE_CLASS = 0;
        }
        int o;
        if ((o = aeq.c(media_PERFORMANCE_CLASS)) <= 0) {
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
            if ((value = ajs.a.get(sb.toString())) == null) {
                value = 0;
            }
            o = aeq.c((int)value);
        }
        this.o = o;
        final String property = System.getProperty("os.arch");
        SystemClock.elapsedRealtime();
        this.q = tsi.a(d);
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
        this.n = dyq.a();
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
            this.v = qaq.c(this.d);
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
        final int an = aqql.aN(intent.getIntExtra("health", 1));
        this.c = an;
        if (an == 0) {
            this.c = 2;
        }
    }
    
    public final boolean b() {
        this.f();
        return this.v;
    }
    
    public final void c(final agza agza) {
        final int e = this.e;
        agza.copyOnWrite();
        final aoof aoof = (aoof)agza.instance;
        final aoof a = aoof.a;
        aoof.b |= 0x1;
        aoof.c = e;
        final int f = this.f;
        agza.copyOnWrite();
        final aoof aoof2 = (aoof)agza.instance;
        aoof2.b |= 0x2;
        aoof2.d = f;
        final int g = this.g;
        agza.copyOnWrite();
        final aoof aoof3 = (aoof)agza.instance;
        aoof3.b |= 0x4;
        aoof3.e = g;
        final long h = this.h;
        agza.copyOnWrite();
        final aoof aoof4 = (aoof)agza.instance;
        aoof4.b |= 0x8;
        aoof4.f = h;
        final int i = this.i;
        agza.copyOnWrite();
        final aoof aoof5 = (aoof)agza.instance;
        aoof5.b |= 0x10;
        aoof5.g = i;
        final String j = this.j;
        agza.copyOnWrite();
        final aoof aoof6 = (aoof)agza.instance;
        j.getClass();
        aoof6.b |= 0x20;
        aoof6.h = j;
        final String k = this.k;
        agza.copyOnWrite();
        final aoof aoof7 = (aoof)agza.instance;
        k.getClass();
        aoof7.b |= 0x200;
        aoof7.k = k;
        final String p = this.p;
        agza.copyOnWrite();
        final aoof aoof8 = (aoof)agza.instance;
        p.getClass();
        aoof8.b |= 0x40;
        aoof8.i = p;
        final int q = this.q;
        agza.copyOnWrite();
        final aoof aoof9 = (aoof)agza.instance;
        aoof9.b |= 0x80;
        aoof9.j = q;
        final int bt = tmy.bt();
        agza.copyOnWrite();
        final aoof aoof10 = (aoof)agza.instance;
        aoof10.b |= 0x1000;
        aoof10.n = bt;
        final int n = this.n;
        agza.copyOnWrite();
        final aoof aoof11 = (aoof)agza.instance;
        aoof11.b |= 0x2000;
        aoof11.o = n;
        final int o = this.o;
        agza.copyOnWrite();
        final aoof aoof12 = (aoof)agza.instance;
        aoof12.b |= 0x10000;
        aoof12.p = o;
        if (this.l.isPresent()) {
            final String l = (String)this.l.get();
            agza.copyOnWrite();
            final aoof aoof13 = (aoof)agza.instance;
            aoof13.b |= 0x400;
            aoof13.l = l;
        }
        if (this.m.isPresent()) {
            final String m = (String)this.m.get();
            agza.copyOnWrite();
            final aoof aoof14 = (aoof)agza.instance;
            aoof14.b |= 0x800;
            aoof14.m = m;
        }
    }
    
    public final void d(final agza agza) {
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
            final ujw a = ((ujx)this.w.get()).a;
            if (a != null) {
                this.x = a.e;
                this.y = a.d;
            }
        }
        aooe aooe;
        if ((aooe = ((aooh)agza.instance).e) == null) {
            aooe = aooe.a;
        }
        final agza builder = aooe.toBuilder();
        final boolean a2 = this.a;
        builder.copyOnWrite();
        final aooe aooe2 = (aooe)builder.instance;
        aooe2.b |= 0x1;
        aooe2.c = a2;
        final int r = this.r;
        builder.copyOnWrite();
        final aooe aooe3 = (aooe)builder.instance;
        aooe3.b |= 0x2;
        aooe3.d = r;
        final int s = this.s;
        builder.copyOnWrite();
        final aooe aooe4 = (aooe)builder.instance;
        aooe4.b |= 0x4;
        aooe4.e = s;
        final int t = this.t;
        builder.copyOnWrite();
        final aooe aooe5 = (aooe)builder.instance;
        aooe5.b |= 0x8;
        aooe5.f = t;
        final int b = this.b;
        builder.copyOnWrite();
        final aooe aooe6 = (aooe)builder.instance;
        if (b != 0) {
            aooe6.g = b - 1;
            aooe6.b |= 0x10;
            final boolean v = this.v;
            builder.copyOnWrite();
            final aooe aooe7 = (aooe)builder.instance;
            aooe7.b |= 0x20;
            aooe7.h = v;
            final String x = this.x;
            if (x != null) {
                builder.copyOnWrite();
                final aooe aooe8 = (aooe)builder.instance;
                aooe8.b |= 0x10000;
                aooe8.i = x;
            }
            final String y = this.y;
            if (y != null) {
                builder.copyOnWrite();
                final aooe aooe9 = (aooe)builder.instance;
                aooe9.b |= 0x20000;
                aooe9.j = y;
            }
            agza.copyOnWrite();
            final aooh aooh = (aooh)agza.instance;
            final aooe e = (aooe)builder.build();
            e.getClass();
            aooh.e = e;
            aooh.b |= 0x4;
            return;
        }
        throw null;
    }
    
    public final void e(final agza agza) {
        aoof aoof;
        if ((aoof = ((aooh)agza.instance).d) == null) {
            aoof = aoof.a;
        }
        final agza builder = aoof.toBuilder();
        this.c(builder);
        agza.copyOnWrite();
        final aooh aooh = (aooh)agza.instance;
        final aoof d = (aoof)builder.build();
        d.getClass();
        aooh.d = d;
        aooh.b |= 0x2;
    }
}
