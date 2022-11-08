import android.net.Uri;
import com.google.protobuf.MessageLite;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingEntityController;
import java.util.concurrent.Executor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.app.Activity;
import android.graphics.Typeface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jko implements arjd
{
    public static jjc b(final Context context, final acng acng, final Typeface typeface) {
        return new jjc(context, acng, typeface);
    }
    
    public static vax c(final jmi jmi, final wwu wwu) {
        return (vax)new www((vax)jmi, wwu);
    }
    
    public static vax d(final jmi jmi, final wwu wwu) {
        return (vax)new www((vax)jmi, wwu);
    }
    
    public static ViewGroup e(final Activity activity) {
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)activity).inflate(2131624908, (ViewGroup)null);
        viewGroup.getClass();
        return viewGroup;
    }
    
    public static vax f(final jop jop, final wwu wwu) {
        return (vax)new www((vax)jop, wwu);
    }
    
    public static DataSavingEntityController g(final vbq vbq, final zki zki, final tku tku, final tku tku2, final thh thh, final asgt asgt, final uyi uyi, final uyi uyi2, final asho asho, final Executor executor, final aanf aanf) {
        return new DataSavingEntityController(vbq, zki, tku, tku2, thh, asgt, uyi, uyi2, asho, executor, aanf);
    }
    
    public static jpa h(final fa fa, final uyf uyf, final tku tku, final tku tku2, final tku tku3, final SharedPreferences sharedPreferences, final gbn gbn, final asho asho, final zjy zjy, final zki zki) {
        return new jpa(fa, uyf, tku, tku2, tku3, sharedPreferences, gbn, asho, zjy, zki);
    }
    
    public static tku i(final Context context, final atjj atjj) {
        return tdb.p(context, "datasavingsetting", "data_saving_setting_schema.pb", (qbo)atjj.a(), (MessageLite)jpc.a);
    }
    
    public static jpe j(final uyi uyi, final uyi uyi2, final gbn gbn, final vax vax, final abns abns, final tku tku, final tku tku2, final thh thh) {
        return new jpe(uyi, uyi2, gbn, vax, abns, tku, tku2, thh);
    }
    
    public static jri k(final vmt vmt, final vax vax, final Executor executor, final Context context, final uyf uyf, final tny tny, final adfy adfy, final oas oas) {
        return new jri(vmt, vax, executor, context, uyf, tny, adfy, oas);
    }
    
    public static jld l() {
        return new jld(1);
    }
    
    public static jph m(final wvu wvu, final arud arud, final uyf uyf, final atjj atjj, final atjj atjj2, final atjj atjj3, final zki zki, final Executor executor, final Executor executor2, final tdz tdz, final uyi uyi, final uyi uyi2) {
        return new jph(wvu, arud, uyf, atjj, atjj2, atjj3, zki, atio.b(executor), executor2, tdz, uyi, uyi2, (byte[])null, (byte[])null);
    }
    
    public static tku n(final Context context, final qbo qbo) {
        final qmr a = qms.a(context);
        a.e("voiceconsentsnackbarimpressions");
        a.f("voice_consent_snackbar_impressions.pb");
        final Uri a2 = a.a();
        final qoq a3 = qor.a();
        a3.e((MessageLite)jlu.a);
        a3.g(false);
        a3.f(a2);
        return (tku)new tks(qan.h(qbo.D(a3.a())), (MessageLite)jlu.a);
    }
    
    public static tku o(final Context context, final qbo qbo) {
        final qmr a = qms.a(context);
        a.e("voicefeaturesettings");
        a.f("voice_feature_settings.pb");
        final Uri a2 = a.a();
        final qoq a3 = qor.a();
        a3.e((MessageLite)jlv.a);
        a3.g(false);
        a3.f(a2);
        return (tku)new tks(qan.h(qbo.D(a3.a())), (MessageLite)jlv.a);
    }
    
    public static kgk p() {
        return new kgk();
    }
    
    public static jrf q(final fzo fzo, final vax vax) {
        return new jrf(fzo, vax, null, null, null);
    }
    
    public static kgk r(final mrm mrm, final Context context, final alm alm, final zki zki, final gbn gbn, final asho asho, final uyi uyi) {
        return new kgk(mrm, context, alm, zki, gbn, asho, uyi, null, null, null, null);
    }
    
    public static uye s(final atjj atjj, final acvy acvy) {
        return new uye(atjj, acvy);
    }
    
    public static bx t(final aeoe aeoe) {
        final bx ab = ((jkn)((arix)aeoe.a()).aR()).Ab();
        ab.getClass();
        return ab;
    }
    
    public static ggw u(final fa fa, final mrm mrm, final ViewGroup viewGroup, final fzo fzo) {
        return (ggw)new hxo(fa, mrm, (ViewGroup)viewGroup.findViewById(2131431395), fzo, null, null, null, null, null);
    }
    
    public static jkq v(final arud arud, final Context context, final atjj atjj, final adcr adcr, final uyi uyi) {
        return new jkq(arud, context, atjj, adcr, uyi, null, null, null, null, null, null);
    }
}
