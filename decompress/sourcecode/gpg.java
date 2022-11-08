import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;
import com.google.android.apps.youtube.app.extensions.accountlinking.AccountLinkingController;
import java.util.Set;
import android.content.Context;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import java.util.Map;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpg implements arjd
{
    public static gpj b(final Activity activity, final tdz tdz, final atjj atjj, final Map map, final Map map2, final Map map3, final LoggingUrlsPingController loggingUrlsPingController) {
        return new gpj(activity, tdz, atjj, map, map2, map3, loggingUrlsPingController);
    }
    
    public static gpl c(final Context context, final Set set) {
        return new gpl(context, set);
    }
    
    public static gpr d(final bu bu, final abno abno) {
        return new gpr(bu, abno, 0);
    }
    
    public static AccountLinkingController e(final vbq vbq, final jdt jdt) {
        return new AccountLinkingController(vbq, jdt);
    }
    
    public static gpx f(final bu bu, final vxi vxi, final Object o, final rgh rgh, final vcf vcf, final vbq vbq, final PlayBilling playBilling, final adfy adfy, final asho asho, final vax vax, final arhr arhr) {
        return new gpx(bu, vxi, (cya)o, rgh, vcf, vbq, playBilling, adfy, asho, vax, arhr, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static gql g(final bu bu, final PlayBilling playBilling, final vxi vxi, final vax vax, final vbq vbq, final rgh rgh, final Object o, final adfy adfy, final asho asho, final Executor executor) {
        return new gql(bu, playBilling, vxi, vax, vbq, rgh, (cya)o, adfy, asho, executor, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static gnk h(final wwu wwu) {
        return new gnk(wwu, 17);
    }
    
    public static gnk i(final tdz tdz) {
        return new gnk(tdz, 18, null);
    }
    
    public static eyv j(final bu bu, final gqb gqb, final vax vax) {
        return new eyv(bu, gqb, vax, 18);
    }
    
    public static gnk k(final wvu wvu) {
        return new gnk(wvu, 20);
    }
    
    public static gpo l(final Activity activity, final vax vax, final Executor executor, final atjj atjj, final atjj atjj2, final hyq hyq, final uyf uyf) {
        return new gpo(activity, vax, executor, atjj, atjj2, hyq, uyf, (byte[])null, (byte[])null);
    }
    
    public static gpf m(final vax vax, final wwu wwu, final vwb vwb) {
        return new gpf(vax, wwu, vwb, null, null);
    }
    
    public static gpn n(final bu bu, final vax vax, final ktg ktg, final ktf ktf, final wwu wwu, final abno abno, final elw elw, final ggi ggi) {
        return new gpn(bu, vax, ktg, ktf, wwu, abno, elw, ggi, (byte[])null, (byte[])null);
    }
    
    public static gqb o(final zki zki, final lzi lzi, final Executor executor) {
        return new gqb(zki, lzi, executor, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static fch p(final bu bu, final nod nod, final lzi lzi, final zki zki, final vax vax) {
        return new fch(bu, nod, lzi, zki, vax, 6, null, null, null);
    }
    
    public static fch q(final Activity activity, final gqn gqn, final lzi lzi, final zki zki, final vax vax) {
        return new fch(activity, gqn, lzi, zki, vax, 7, null, null, null);
    }
    
    public static cya r(final acko acko) {
        return new cya(acko, null);
    }
    
    public static gpe s(final Context context, final vax vax, final vwb vwb, final hyc hyc, final wwu wwu, final fax fax, final arud arud) {
        return new gpe(context, vax, vwb, hyc, wwu, fax, arud, null, null, null, null, null, null);
    }
    
    public static gpy t(final Context context, final aceo aceo, final vax vax, final wwv wwv, final acng acng, final aeby aeby, final aeby aeby2) {
        return new gpy(context, aceo, vax, wwv, acng, aeby, aeby2, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static gqc u(final Context context, final aceo aceo, final vax vax, final wwv wwv, final acng acng, final aeby aeby, final aeby aeby2) {
        return new gqc(context, aceo, vax, wwv, acng, aeby, aeby2, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static gps v(final Activity activity, final AccountLinkingController accountLinkingController, final acng acng, final mrm mrm, final wwv wwv, final ftc ftc, final aeby aeby) {
        return new gps(activity, accountLinkingController, acng, mrm, wwv, ftc, aeby, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
