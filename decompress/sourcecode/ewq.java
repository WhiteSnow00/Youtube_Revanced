import java.io.File;
import android.os.Handler;
import com.google.android.apps.youtube.app.bedtime.YoutubeTimeReminderController;
import com.google.android.apps.youtube.app.wellness.youtubetime.YoutubeTimeTimerController;
import com.google.android.apps.youtube.app.bedtime.DataReminderController;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewq implements arjd
{
    public static adea b(final vjl vjl, final adcg adcg) {
        return ewo.y(vjl, adcg);
    }
    
    public static acws c(final atjj atjj, final atjj atjj2, final atjj atjj3, final oas oas, final uyi uyi) {
        return ewo.G(atjj, atjj2, atjj3, oas, uyi);
    }
    
    public static void d() {
        final int a = ewo.a;
    }
    
    public static Intent e(final Context context) {
        final Intent c = ewo.c(context);
        c.getClass();
        return c;
    }
    
    public static PendingIntent f(final Context context, final Intent intent) {
        return ewo.b(context, intent);
    }
    
    public static void g() {
        final int a = ewo.a;
    }
    
    public static zhs h(final Context context, final uyf uyf) {
        Object o;
        if (sqi.b(uyf)) {
            o = new acdx(context);
        }
        else {
            o = new acdw(context);
        }
        return (zhs)o;
    }
    
    public static ewv i(final Activity activity, final uyf uyf, final wwu wwu, final arhr arhr, final atjj atjj, final arhr arhr2, final arhr arhr3, final arhr arhr4, final arhr arhr5, final abns abns, final arhr arhr6, final arhr arhr7, final arhr arhr8, final asho asho, final asho asho2, final Executor executor, final arhr arhr9, final arhr arhr10, final uyi uyi, final arhr arhr11) {
        return new ewv(activity, uyf, wwu, arhr, atjj, arhr2, arhr3, arhr4, arhr5, abns, arhr6, arhr7, arhr8, asho, asho2, executor, arhr9, arhr10, uyi, arhr11);
    }
    
    public static tku j(final Context context, final atjj atjj) {
        return tdb.p(context, "commonui", "bedtime_proto.pb", (qbo)atjj.a(), (MessageLite)ewx.a);
    }
    
    public static tku k(final Context context, final atjj atjj) {
        return tdb.p(context, "commonui", "bedtime_setting_proto.pb", (qbo)atjj.a(), (MessageLite)ewz.a);
    }
    
    public static exe l(final arhr arhr, final arhr arhr2, final arhr arhr3, final uyf uyf, final zki zki, final Executor executor, final asho asho, final tdz tdz, final uyi uyi, final rkw rkw) {
        return new exe(arhr, arhr2, arhr3, uyf, zki, executor, asho, tdz, uyi, rkw);
    }
    
    public static DataReminderController m(final Activity activity, final wwu wwu, final arhr arhr, final arhr arhr2, final arhr arhr3, final arhr arhr4, final arhr arhr5, final abns abns, final arhr arhr6, final arhr arhr7, final arhr arhr8, final asho asho, final asho asho2, final Executor executor, final gmq gmq, final uyi uyi, final arhr arhr9, final tku tku, final arhr arhr10, final arhr arhr11) {
        return new DataReminderController(activity, wwu, arhr, arhr2, arhr3, arhr4, arhr5, abns, arhr6, arhr7, arhr8, asho, asho2, executor, gmq, uyi, arhr9, tku, arhr10, arhr11);
    }
    
    public static YoutubeTimeReminderController n(final Activity activity, final wwu wwu, final arhr arhr, final arhr arhr2, final arhr arhr3, final arhr arhr4, final arhr arhr5, final abns abns, final arhr arhr6, final arhr arhr7, final arhr arhr8, final asho asho, final asho asho2, final Executor executor, final YoutubeTimeTimerController youtubeTimeTimerController, final uyi uyi, final arhr arhr9, final arhr arhr10, final arhr arhr11) {
        return new YoutubeTimeReminderController(activity, wwu, arhr, arhr2, arhr3, arhr4, arhr5, abns, arhr6, arhr7, arhr8, asho, asho2, executor, youtubeTimeTimerController, uyi, arhr9, arhr10, arhr11);
    }
    
    public static gkt o() {
        return ewo.L();
    }
    
    public static exj p(final atjj atjj, final arud arud, final uyf uyf, final arhr arhr, final arhr arhr2, final Handler handler, final asho asho, final Executor executor, final oas oas) {
        return new exj(atjj, arud, uyf, arhr, arhr2, handler, asho, executor, oas, null, null);
    }
    
    public static blt q(final Context context, final atjj atjj, final uyf uyf, final ewl ewl, final Executor executor, final asho asho) {
        return new blt(context, atjj, uyf, ewl, executor, asho);
    }
    
    public static acwz r(final File file, final adbp adbp) {
        return ewo.J(file);
    }
    
    public static lzi s(final Context context) {
        return new lzi(context, (char[])null);
    }
    
    public static avt t(final atjj atjj, final uyf uyf) {
        return new avt(atjj, uyf);
    }
    
    public static hyc u(final Context context, final ttg ttg, final avt avt, final uyf uyf) {
        return new hyc(context, ttg, avt, uyf, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static eye v(final bu bu, final tny tny, final vmh vmh, final Executor executor, final aeby aeby, final uyi uyi) {
        return new eye(bu, tny, vmh, executor, aeby, uyi, null, null, null);
    }
}
