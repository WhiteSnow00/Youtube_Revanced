import com.google.android.apps.youtube.app.extensions.datapush.production.YoutubeContainerRegistrar;
import com.google.android.apps.youtube.app.extensions.arcamera.faceviewer.FaceViewerPresenter;
import android.net.Uri;
import com.google.protobuf.MessageLite;
import java.util.concurrent.ScheduledExecutorService;
import java.security.SecureRandom;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.graphics.Paint;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqm implements arjd
{
    public static PlayBilling b(final bu bu, final arhr arhr, final Executor executor, final Executor executor2) {
        return new PlayBilling(bu, arhr, executor, executor2);
    }
    
    public static gtf c(final Context context, final atjj atjj) {
        final gtf gtf = new gtf(context);
        final gkm a = ((gko)atjj.a()).a();
        final gkm b = gkm.b;
        if (gtf.a == null) {
            gtf.a = new Paint();
        }
        gtf.a.setColor(tmy.cn(context, 2130970922));
        if (a == b) {
            gtf.a.setColor(gtf.getResources().getColor(2131102354));
        }
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        gtf.b = tmy.aZ(displayMetrics, 1);
        gtf.c = tmy.aZ(displayMetrics, 12);
        gtf.d = tmy.aZ(displayMetrics, 20);
        gtf.e = tmy.aZ(displayMetrics, 32);
        return gtf;
    }
    
    public static gtk d(final Context context, final gte gte, final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new gtk(context, gte, atjj, atjj2, atjj3);
    }
    
    public static atie e() {
        return (atie)atid.aD();
    }
    
    public static gtb f(final Context context, final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4, final Executor executor, final Handler handler) {
        return new gtb(context, atjj, atjj2, atjj3, atjj4, executor, handler);
    }
    
    public static gte g(final abgp abgp, final atjj atjj, final Executor executor, final asho asho) {
        return new gte(abgp, atjj, executor, asho);
    }
    
    public static gto h(final Context context, final SharedPreferences sharedPreferences, final oas oas) {
        return new gto(context, sharedPreferences, oas);
    }
    
    public static gpr i(final vax vax, final grv grv) {
        return new gpr(vax, grv, 3);
    }
    
    public static gqn j(final SecureRandom secureRandom, final aagm aagm) {
        return new gqn(secureRandom, aagm, null);
    }
    
    public static hdv k(final Context context, final zjy zjy, final zki zki) {
        return new hdv(context, zjy, zki);
    }
    
    public static abgp l(final aceo aceo, final Executor executor, final ScheduledExecutorService scheduledExecutorService, final abhq abhq, final abns abns, final arud arud, final wyo wyo) {
        return new abgp(aceo, executor, scheduledExecutorService, abhq, abns, arud, wyo, (byte[])null, (byte[])null);
    }
    
    public static aagm m(final Context context, final qbo qbo) {
        final qmr a = qms.a(context);
        a.e("uri_flow_module");
        a.f("uri_flow.pb");
        final Uri a2 = a.a();
        final qoq a3 = qor.a();
        a3.f(a2);
        a3.e((MessageLite)ahdn.a);
        return qbo.D(a3.a());
    }
    
    public static ozg n() {
        return new ozg((byte[])null, null);
    }
    
    public static gpr o(final ozg ozg, final vax vax) {
        return new gpr(ozg, vax, 2, null, null, null);
    }
    
    public static cya p() {
        return new cya((byte[])null, (char[])null);
    }
    
    public static cya q(final uyi uyi) {
        return new cya(uyi);
    }
    
    public static grj r(grj grj, final grj grj2, final cya cya) {
        if (cya.r()) {
            grj = grj2;
        }
        grj.getClass();
        return grj;
    }
    
    public static FaceViewerPresenter s(final Context context, final ScheduledExecutorService scheduledExecutorService, final utk utk, final gko gko, final cya cya) {
        return new FaceViewerPresenter(context, utk, gko, cya, new hez(context, scheduledExecutorService), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static maw t(final zki zki, final cya cya) {
        return new maw(zki, cya, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static grn u(final maw maw, final wyo wyo, final Executor executor, final SecureRandom secureRandom, final atjj atjj, final cya cya, final oas oas) {
        return new grn(maw, wyo, executor, secureRandom, atjj, cya, oas, null, null, null, null, null);
    }
    
    public static YoutubeContainerRegistrar v(final lzi lzi, final mrm mrm, final mck mck, final mck mck2, final mck mck3, final mrm mrm2, final adcr adcr, final aeby aeby, final adcr adcr2, final avt avt) {
        return new YoutubeContainerRegistrar(lzi, mrm, mck, mck2, mck3, mrm2, adcr, aeby, adcr2, avt, null, null, null, null, null, null, null);
    }
}
