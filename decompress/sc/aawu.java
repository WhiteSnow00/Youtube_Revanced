import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.google.vr.ndk.base.DaydreamApi;
import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import android.content.ComponentName;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawu
{
    private static final ComponentName a;
    private static final ComponentName b;
    
    static {
        a = new ComponentName("com.google.android.apps.youtube.vr", "com.google.android.apps.youtube.vr.activities.YouTubeVrActivity");
        b = new ComponentName("com.google.android.apps.youtube.vr.oculus", "com.google.android.apps.youtube.vr.activities.YouTubeVrActivity");
    }
    
    public static Intent a(final Context context) {
        return new Intent().setClassName(context, "com.google.android.libraries.youtube.player.features.gl.vr.VrWelcomeActivity");
    }
    
    static boolean b(final Context context) {
        return context != null && g(context, "com.oculus.horizon") != null;
    }
    
    static Intent c(final Context context, int n) {
        if (--n == 1) {
            return new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=com.google.android.apps.youtube.vr")).putExtra("overlay", true).putExtra("callerId", context.getPackageName());
        }
        if (n != 2) {
            return null;
        }
        return new Intent("android.intent.action.VIEW").setData(Uri.parse("https://www.oculus.com/experiences/gear-vr/1458129140982015/"));
    }
    
    public static void d(final Context context, int n, final DaydreamApi daydreamApi, final abpq abpq) {
        if (--n != 1) {
            if (n == 2) {
                if (context != null) {
                    final Intent addFlags = new Intent().setComponent(aawu.b).addFlags(335609856);
                    h(abpq, addFlags);
                    context.startActivity(addFlags);
                }
            }
        }
        else if (daydreamApi != null) {
            final Intent setAction = DaydreamApi.createVrIntent(aawu.a).setAction("android.intent.action.VIEW");
            h(abpq, setAction);
            daydreamApi.launchInVr(setAction);
        }
        if (abpq != null) {
            abpq.a();
        }
    }
    
    public static boolean e(final Context context, int n) {
        String s;
        if (--n != 1) {
            if (n != 2) {
                s = null;
            }
            else {
                s = "com.google.android.apps.youtube.vr.oculus";
            }
        }
        else {
            s = "com.google.android.apps.youtube.vr";
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        final PackageInfo g = g(context, s);
        return g != null && g.versionCode > 10199000L;
    }
    
    static boolean f(final Context context, int n) {
        if (context == null) {
            return false;
        }
        if (--n != 1) {
            return n == 2 && b(context);
        }
        return DaydreamApi.isDaydreamReadyPlatform(context);
    }
    
    private static PackageInfo g(final Context context, final String s) {
        final PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getPackageInfo(s, 0);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    private static void h(final abpq abpq, final Intent intent) {
        if (abpq != null && intent != null && !TextUtils.isEmpty((CharSequence)abpq.s())) {
            final ahaz builder = ((ahbh)lrf.a).createBuilder();
            final int i = abpq.i();
            builder.copyOnWrite();
            final lrf lrf = (lrf)builder.instance;
            lrf.b |= 0x4;
            lrf.g = i;
            final boolean f = abpq.f();
            builder.copyOnWrite();
            final lrf lrf2 = (lrf)builder.instance;
            lrf2.b |= 0x800;
            lrf2.p = (f ^ true);
            final long k = abpq.k();
            builder.copyOnWrite();
            final lrf lrf3 = (lrf)builder.instance;
            lrf3.b |= 0x200;
            lrf3.n = k;
            if (!TextUtils.isEmpty((CharSequence)abpq.s())) {
                final String s = abpq.s();
                builder.copyOnWrite();
                final lrf lrf4 = (lrf)builder.instance;
                s.getClass();
                lrf4.b |= 0x1;
                lrf4.d = s;
            }
            if (!TextUtils.isEmpty((CharSequence)abpq.r())) {
                final String r = abpq.r();
                builder.copyOnWrite();
                final lrf lrf5 = (lrf)builder.instance;
                r.getClass();
                lrf5.b |= 0x2;
                lrf5.f = r;
            }
            intent.putExtra("playback_start_descriptor_proto", ((agzk)builder.build()).toByteArray());
            Uri cq;
            if (TextUtils.isEmpty((CharSequence)abpq.s())) {
                cq = null;
            }
            else {
                cq = tpe.cQ(abpq.s(), abpq.r(), abpq.i(), abpq.k() / 1000L);
            }
            intent.setData(cq);
        }
    }
}
