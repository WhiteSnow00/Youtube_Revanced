import j$.util.Optional;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import android.app.Activity;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.ui.PlaylistEditToastController;
import android.content.Context;
import com.google.android.apps.youtube.app.ui.MultiPageMenuDialogFragmentController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jtv implements arjd
{
    public static MultiPageMenuDialogFragmentController b(final bu bu, final zjy zjy, final zki zki) {
        return new MultiPageMenuDialogFragmentController(bu, zjy, zki);
    }
    
    public static PlaylistEditToastController c(final Context context, final actx actx, final tdz tdz) {
        return new PlaylistEditToastController(context, actx, tdz);
    }
    
    public static juv d(final Context context, final acng acng, final tdz tdz, final uyi uyi) {
        return new juv(context, acng, tdz, uyi);
    }
    
    public static jxc e(final aeoe aeoe) {
        final jxc s = ((jwu)((arix)aeoe.a()).aR()).S();
        s.getClass();
        return s;
    }
    
    public static jsp f(final Executor executor, final Context context, final flg flg, final jvy jvy, final eg eg) {
        return new jsp(executor, context, flg, jvy, eg, null, null, null);
    }
    
    public static jwk g(final arud arud, final uyi uyi, final Activity activity, final vcf vcf, final vbq vbq, final zki zki, final hyj hyj, final tku tku, final gko gko, final gfc gfc, final aceo aceo, final mrm mrm) {
        return new jwk(arud, uyi, activity, vcf, vbq, zki, hyj, tku, gko, gfc, aceo, mrm, null, null, null, null);
    }
    
    public static YpcOffersListDialogFragmentController h(final bu bu, final aeby aeby, final zjy zjy, final zki zki) {
        return new YpcOffersListDialogFragmentController(bu, aeby, zjy, zki, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static tku i(final Context context, final atjj atjj, final aftr aftr, final String s, final auip auip, final Optional optional) {
        return jvo.b(context, atjj, aftr, s, auip, optional);
    }
}
