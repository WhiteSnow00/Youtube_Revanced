import com.google.android.libraries.youtube.notification.push.optoutdialog.NotificationOptOutDialogActivity;
import com.google.android.libraries.youtube.notification.NotificationInteractionBroadcastReceiver;
import java.util.concurrent.Future;
import android.provider.SearchRecentSuggestions;
import android.graphics.Typeface;
import android.content.pm.PackageManager;
import android.content.ClipData;
import android.app.PendingIntent;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.io.File;
import java.util.Set;
import java.util.Locale;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.content.SharedPreferences;
import android.hardware.Camera$CameraInfo;
import android.hardware.Camera;
import com.google.firebase.analytics.FirebaseAnalytics;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewo
{
    static {
        TimeUnit.MINUTES.toSeconds(90L);
    }
    
    public static FirebaseAnalytics A(final Context context) {
        return FirebaseAnalytics.getInstance(context);
    }
    
    public static akix B() {
        try {
            final int numberOfCameras = Camera.getNumberOfCameras();
            int i = 0;
            int n = 0;
            boolean b = false;
            while (i < numberOfCameras) {
                final Camera$CameraInfo camera$CameraInfo = new Camera$CameraInfo();
                Camera.getCameraInfo(i, camera$CameraInfo);
                int n2;
                if (camera$CameraInfo.facing == 0) {
                    n2 = 1;
                }
                else {
                    n2 = n;
                    if (camera$CameraInfo.facing == 1) {
                        b = true;
                        n2 = n;
                    }
                }
                ++i;
                n = n2;
            }
            if (n != 0) {
                akix akix;
                if (b) {
                    akix = akix.e;
                }
                else {
                    akix = akix.c;
                }
                return akix;
            }
            akix akix2;
            if (b) {
                akix2 = akix.d;
            }
            else {
                akix2 = akix.b;
            }
            return akix2;
        }
        catch (final Exception ex) {
            trn.d("Can't get camera type", (Throwable)ex);
            return akix.a;
        }
    }
    
    public static String C(final Context context, final SharedPreferences sharedPreferences, final String s) {
        final Set c = uyp.c;
        String s3;
        final String s2 = s3 = sharedPreferences.getString("country", "");
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            s3 = tsx.m(s2);
            if (c.contains(s3)) {
                return s3;
            }
        }
        final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        if (telephonyManager != null) {
            final String s4 = s3 = telephonyManager.getSimCountryIso();
            if (!TextUtils.isEmpty((CharSequence)s4)) {
                s3 = tsx.m(s4);
                if (c.contains(s3)) {
                    return s3;
                }
            }
        }
        if (TextUtils.isEmpty((CharSequence)s3) && !TextUtils.isEmpty((CharSequence)s)) {
            final String m = tsx.m(s);
            if (c.contains(m)) {
                return m;
            }
        }
        final String i = tsx.m(Locale.getDefault().getCountry());
        if (c.contains(i)) {
            return i;
        }
        return null;
    }
    
    public static uxh D(final hxs hxs, final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        int n;
        if ((n = alvl.bG) == 0) {
            n = vwh.p();
        }
        return vem.k(vwh.p(), n, akiz.t, (viy)hxs, true);
    }
    
    public static Set E(final uyf uyf, final ahqj ahqj, final atjj atjj, final atjj atjj2, final tcq tcq) {
        aook aook;
        if ((aook = uyf.b().s) == null) {
            aook = aook.a;
        }
        if (aook.q == 0L) {
            return (Set)afgq.a;
        }
        if (!ahqj.j) {
            return (Set)afgq.a;
        }
        return (Set)afdu.s((Object)new via((uyq)atjj2.a(), (atjj)new esb(atjj, 6), tcq, 3));
    }
    
    static acws F(final atjj atjj, final atjj atjj2, final atjj atjj3, final oas oas, final uyi uyi) {
        tgw tgw;
        if (uyi.cu()) {
            tgw = (tgw)atjj2.a();
        }
        else {
            tgw = (tgw)atjj.a();
        }
        return new acws(tgw, (acwz)atjj3.a(), oas);
    }
    
    static acws G(final atjj atjj, final atjj atjj2, final atjj atjj3, final oas oas, final uyi uyi) {
        tgw tgw;
        if (uyi.cu()) {
            tgw = (tgw)atjj2.a();
        }
        else {
            tgw = (tgw)atjj.a();
        }
        return new acws(tgw, (acwz)atjj3.a(), oas);
    }
    
    static tul H(final atjj atjj, final uyi uyi) {
        if (uyi.cA()) {
            return (tul)atjj.a();
        }
        return (tul)new tuo();
    }
    
    static acwz I(final File file) {
        return new acwz(file, "shortszeroprefix.cache");
    }
    
    static acwz J(final File file) {
        return new acwz(file, "zeroprefixparsed.cache");
    }
    
    public static atvw K(final Context context, final ahqj ahqj) {
        return new atvw(context, ahqj);
    }
    
    static gkt L() {
        return new gkt();
    }
    
    public static abyo M(final Context context, final uyf uyf, final arud arud, final abyn abyn, final Executor executor) {
        return (abyo)new abys(uyf.b(), arud, context, abyn, executor, (byte[])null, (byte[])null);
    }
    
    static acvy N(final Context context, final uyf uyf, final arud arud, final SharedPreferences sharedPreferences) {
        return (acvy)new jks(context, sharedPreferences, uyf, arud, null, null);
    }
    
    public static Set O(final arud arud, final uyi uyi, final jgh jgh, final hxv hxv, final gex gex, final skh skh) {
        final HashSet set = new HashSet();
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        if (alvs.M) {
            set.add(jgh);
        }
        alvs alvs2;
        if ((alvs2 = arud.f().e) == null) {
            alvs2 = alvs.a;
        }
        if (alvs2.ax) {
            set.add(hxv);
        }
        set.add(skh);
        if (uyi.l(45354177L).aw((Object)false).ab()) {
            set.add(gex);
        }
        return set;
    }
    
    public static jkx P(final Executor executor, final acvy acvy, final agkw agkw, final jkp jkp) {
        return new jkx(executor, acvy, agkw, jkp, null, null, null);
    }
    
    public static adbp Q(final atjj atjj) {
        return (adbp)atjj.a();
    }
    
    static abfa R(final uyf uyf, final aaca aaca) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        if (alvl.D) {
            return (abfa)new aber(aaca, null, null, null);
        }
        return (abfa)new abez(aaca, null, null, null);
    }
    
    public static aeim S(final Context context, final uyf uyf, final aeim aeim, final adcr adcr, final wyo wyo) {
        final aeim aeim2 = new aeim((short[])null);
        aeim2.g((adli)new adlc(context, aeim, adcr, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        aeim2.g((adli)new adlc(context, aeim, adcr, 0, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        aeim2.g((adli)new urp(context, uyf, aeim, adcr, wyo, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
        aeim2.g((adli)new adlp());
        return aeim2;
    }
    
    public static jla T(final aeim aeim, final zki zki) {
        return new jla(aeim, zki, null, null, null);
    }
    
    public static e U(final jkw jkw, final aded aded, final Executor executor, final Executor executor2) {
        return new e((adee)jkw, (adee)aded, executor, executor2);
    }
    
    public static aded V(final auip auip, final adea adea, final jkr jkr, final jld jld) {
        final aded z = auip.z((List)afcr.r((Object)adea));
        z.f = "CAE%3D";
        final HashSet d = new HashSet();
        d.add(jkr);
        d.add(jld);
        z.d = d;
        return z;
    }
    
    public static aded W(final auip auip, final adea adea, final jld jld, final jld jld2) {
        final aded z = auip.z((List)afcr.r((Object)adea));
        z.f = "CAE%3D";
        final HashSet d = new HashSet();
        d.add(jld);
        d.add(jld2);
        z.d = d;
        return z;
    }
    
    static auip X() {
        return new auip((byte[])null, (byte[])null);
    }
    
    static zhb Y(final atjj atjj) {
        return (zhb)atjj.a();
    }
    
    public static bx Z(final arud arud) {
        return new bx(arud, null, null);
    }
    
    public static long a(final tlq tlq) {
        return tlq.e(tlq.ak);
    }
    
    static acww aa(final arud arud, final SharedPreferences sharedPreferences, final acws acws, final Context context, final zki zki, final rfv rfv, final ScheduledExecutorService scheduledExecutorService, final oas oas, final jkp jkp, final acwg acwg, final acwj acwj, final aeim aeim, final acwu acwu, final auip auip, final jkq jkq, final adbp adbp, final uyi uyi) {
        final jkt jkt = new jkt(sharedPreferences, context, arud, uyi, null, null);
        jkt.d = "youtube-android-pb";
        jkt.f = true;
        jkt.g = false;
        jkt.e = false;
        jkt.j = gkt.aG(arud);
        return new acww(jkt, acws, context, zki, rfv, scheduledExecutorService, oas, jkp, acwg, acwj, aeim, acwu, auip, jkq, adbp, null, null, null, null, null, null);
    }
    
    static acww ab(final arud arud, final SharedPreferences sharedPreferences, final acws acws, final Context context, final zki zki, final rfv rfv, final ScheduledExecutorService scheduledExecutorService, final oas oas, final jkp jkp, final acwg acwg, final acwj acwj, final acwu acwu, final auip auip, final jkq jkq, final adbp adbp, final uyi uyi) {
        final jkt jkt = new jkt(sharedPreferences, context, arud, uyi, null, null);
        jkt.d = "youtube-android-pb";
        jkt.f = false;
        jkt.g = true;
        jkt.e = true;
        jkt.j = gkt.aG(arud);
        return new acww(jkt, acws, context, zki, rfv, scheduledExecutorService, oas, jkp, acwg, acwj, null, acwu, auip, jkq, adbp, null, null, null, null, null, null);
    }
    
    static acww ac(final arud arud, final SharedPreferences sharedPreferences, final acws acws, final Context context, final zki zki, final rfv rfv, final ScheduledExecutorService scheduledExecutorService, final oas oas, final jkp jkp, final acwg acwg, final acwj acwj, final acwe acwe, final auip auip, final jkq jkq, final adbp adbp, final uyi uyi) {
        final jkt jkt = new jkt(sharedPreferences, context, arud, uyi, null, null);
        jkt.d = "youtube-android-pb-shorts";
        jkt.f = false;
        jkt.g = true;
        jkt.e = true;
        jkt.j = gkt.aG(arud);
        return new acww(jkt, acws, context, zki, rfv, scheduledExecutorService, oas, jkp, acwg, acwj, null, acwe, auip, jkq, adbp, null, null, null, null, null, null);
    }
    
    static vou ad(final vjh vjh, final adcr adcr, final zki zki, final tgw tgw) {
        return new vou(vjh, adcr, zki, tgw, via.a, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    static PendingIntent b(final Context context, final Intent intent) {
        final ClipData a = qjs.a;
        final PendingIntent b = qjs.b(context, intent, 201326592);
        b.getClass();
        return b;
    }
    
    static Intent c(final Context context) {
        return fvu.h(context);
    }
    
    public static PackageManager d(final Context context) {
        return context.getPackageManager();
    }
    
    public static Typeface e() {
        return Typeface.create("sans-serif-medium", 0);
    }
    
    public static SearchRecentSuggestions f(final Context context) {
        return new SearchRecentSuggestions(context, "com.google.android.youtube.SuggestionProvider", 1);
    }
    
    static fvp g(final tlq tlq, final atjj atjj) {
        if (tlq.m(tlq.n)) {
            return (fvp)new fvm(atjj);
        }
        return (fvp)new fvo();
    }
    
    public static jkw h(final ScheduledExecutorService scheduledExecutorService, final aded aded, final jkx jkx, final jkz jkz, final jla jla, final acvy acvy, final zki zki) {
        return new jkw(scheduledExecutorService, (adee)aded, (adee)jkx, (adee)jkz, (adee)jla, zki, acvy);
    }
    
    public static jkz i(final acwj acwj) {
        return new jkz(acwj);
    }
    
    public static tre j(final Context context) {
        final wer a = tre.a();
        final wer a2 = tre.a();
        a2.b = new csh(context, 6);
        a2.d(a);
        return a2.c();
    }
    
    public static via k(final atjj atjj, final tcq tcq) {
        return new via((uyq)new uyr(1), (atjj)new esb(atjj, 7), tcq, 3);
    }
    
    static xqk l(final atjj atjj) {
        return (xqk)atjj.a();
    }
    
    public static zhb m(final vvt vvt) {
        final uyl uyl = (uyl)tcp.g((Future)vvt.c(), 1L, TimeUnit.SECONDS, (Object)uyl.a());
        final aavx aavx = new aavx((byte[])null);
        zgp e;
        if (uyl != uyl.d && uyl != uyl.h) {
            e = fea.a;
        }
        else {
            e = fea.b;
        }
        aavx.e = e;
        aavx.b = zgu.a;
        return aavx.e();
    }
    
    static zjw n(final tal tal) {
        return new zjw(tal, "offline_library_browse_fetch");
    }
    
    static zjw o(final tal tal) {
        return new zjw(tal, "offline_settings_fetch");
    }
    
    static zog p(final Context context) {
        final zof zof = new zof();
        zof.c(0);
        zof.b(0);
        zof.a(0);
        zof.a = new Intent(context, (Class)NotificationInteractionBroadcastReceiver.class);
        zof.b = fvu.h(context);
        zof.c = new Intent(context, (Class)NotificationOptOutDialogActivity.class).addFlags(411041792);
        zof.c(2131233028);
        zof.b(2131820552);
        zof.a(2132017506);
        zof.g = "414843287017";
        if (zof.h != 7) {
            final StringBuilder sb = new StringBuilder();
            if ((zof.h & 0x1) == 0x0) {
                sb.append(" smallIcon");
            }
            if ((zof.h & 0x2) == 0x0) {
                sb.append(" largeIcon");
            }
            if ((zof.h & 0x4) == 0x0) {
                sb.append(" appLabel");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zog(zof.a, zof.b, zof.c, zof.d, zof.e, zof.f, zof.g);
    }
    
    static zqm q(final zqk zqk, final zoj zoj) {
        final zpm zpm = (zpm)((atjj)zqk.a).a();
        zpm.getClass();
        final addp addp = (addp)((atjj)zqk.b).a();
        addp.getClass();
        final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)((atjj)zqk.c).a();
        scheduledExecutorService.getClass();
        final vup vup = (vup)((atjj)zqk.d).a();
        vup.getClass();
        zoj.getClass();
        final Context context = (Context)((atjj)zqk.e).a();
        context.getClass();
        final arud arud = (arud)((atjj)zqk.f).a();
        arud.getClass();
        final oas oas = (oas)((atjj)zqk.g).a();
        oas.getClass();
        final thh thh = (thh)((atjj)zqk.h).a();
        thh.getClass();
        final aaal aaal = (aaal)((atjj)zqk.i).a();
        aaal.getClass();
        return (zqm)new zqj(zpm, addp, scheduledExecutorService, vup, zoj, context, arud, oas, thh, aaal, (atjj)zqk.j, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static ztf r() {
        final acvq acvq = new acvq();
        acvq.c |= 0x1;
        acvq.e(false);
        acvq.d(false);
        acvq.c |= 0x8;
        acvq.e(true);
        acvq.d(true);
        if (acvq.c != 15) {
            final StringBuilder sb = new StringBuilder();
            if ((0x1 & acvq.c) == 0x0) {
                sb.append(" channelAutoOfflineEnabled");
            }
            if ((acvq.c & 0x2) == 0x0) {
                sb.append(" videoListAutoOfflineEnabled");
            }
            if ((acvq.c & 0x4) == 0x0) {
                sb.append(" offlineCandidatesEnabled");
            }
            if ((acvq.c & 0x8) == 0x0) {
                sb.append(" offlineSubscriptionsSyncEnabled");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new ztf(acvq.a, acvq.b);
    }
    
    static ztj s() {
        final zti zti = new zti();
        zti.a(false);
        final short f = zti.f;
        zti.b = 1;
        zti.c = 35;
        zti.d = 2000L;
        zti.f = (short)(f | 0x1E);
        zti.e = aadj.d;
        zti.f |= 0x1E0;
        zti.a(true);
        if (zti.f != 511) {
            final StringBuilder sb = new StringBuilder();
            if ((0x1 & zti.f) == 0x0) {
                sb.append(" enablePlaylistAutoSync");
            }
            if ((zti.f & 0x2) == 0x0) {
                sb.append(" enableYouTubeBundles");
            }
            if ((zti.f & 0x4) == 0x0) {
                sb.append(" transferRetryStrategy");
            }
            if ((zti.f & 0x8) == 0x0) {
                sb.append(" transferMaxRetries");
            }
            if ((zti.f & 0x10) == 0x0) {
                sb.append(" transferBaseRetryMilliSecs");
            }
            if ((zti.f & 0x20) == 0x0) {
                sb.append(" transferMaxRetryMilliSecs");
            }
            if ((zti.f & 0x40) == 0x0) {
                sb.append(" disableOfflineWhenDatabaseOpenException");
            }
            if ((zti.f & 0x80) == 0x0) {
                sb.append(" databaseOpenRetries");
            }
            if ((zti.f & 0x100) == 0x0) {
                sb.append(" enableFallbackToAudioOnlyDownload");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new ztj(zti.a, zti.b, zti.c, zti.d, zti.e);
    }
    
    static aajh t() {
        final aajg a = aajh.a();
        a.c(true);
        return a.a();
    }
    
    public static acwe u(final acws acws, final tlq tlq) {
        return new acwe(acws, tlq);
    }
    
    public static acwe v(final acws acws, final tlq tlq) {
        return new acwe(acws, tlq);
    }
    
    public static acwn w(final oas oas) {
        return new acwn(oas);
    }
    
    public static acwu x(final atjj atjj) {
        return (acwu)atjj.a();
    }
    
    static adea y(final vjl vjl, final adcg adcg) {
        return new adea(vjl, adcg);
    }
    
    public static afcw z() {
        return wvh.a;
    }
}
