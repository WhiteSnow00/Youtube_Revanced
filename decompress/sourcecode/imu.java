import java.util.concurrent.ScheduledExecutorService;
import android.app.Activity;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import android.os.Handler;
import com.google.android.apps.youtube.app.player.DefaultVideoStageMonitor;
import com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay;
import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imu implements arjd
{
    public static imy b(final aaam aaam, final zzu zzu, final aaha aaha, final tdz tdz) {
        return new imy(aaam, zzu, aaha, tdz);
    }
    
    public static imz c(final aaam aaam, final atjj atjj, final fml fml, final vcf vcf, final zki zki, final aaha aaha, final uyi uyi) {
        return new imz(aaam, atjj, fml, vcf, zki, aaha, uyi);
    }
    
    public static ioa d(final atjj atjj, final atjj atjj2) {
        return new ioa(atjj, atjj2);
    }
    
    public static iot e(final ipv ipv, final imj imj) {
        return new iot(ipv, imj, 0);
    }
    
    public static iqi f(final cl cl) {
        return new iqi(cl);
    }
    
    public static iqx g(final abno abno, final abhq abhq, final iqi iqi, final uyi uyi) {
        return new iqx(abno, abhq, iqi, uyi);
    }
    
    public static jrl h(final vax vax, final Context context) {
        return new jrl(vax, context, 1);
    }
    
    public static iot i(final Map map, final imj imj) {
        return new iot(map, imj, 1);
    }
    
    public static iqp j(final abno abno, final fjp fjp) {
        return new iqp(abno, fjp, 1);
    }
    
    public static iqq k(final aapf aapf, final atjj atjj, final tdz tdz, final isk isk, final qv qv, final sgv sgv, final abaa abaa, final aazo aazo, final abbo abbo, final abcn abcn, final abbb abbb, final abbf abbf, final iwu iwu, final shs shs, final shg shg, final LiveOverlayPresenter liveOverlayPresenter, final aaxm aaxm, final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, final SubtitlesOverlayPresenter subtitlesOverlayPresenter, final abav abav, final aatb aatb, final aatk aatk, final abay abay, final iro iro, final iss iss, final MdxOverlaysPresenter mdxOverlaysPresenter, final jcg jcg, final NoSoundMemoOverlay noSoundMemoOverlay, final ixz ixz, final iwr iwr, final abns abns, final vzj vzj, final fpl fpl, final irc irc, final jai jai, final atjj atjj2, final irm irm, final aayj aayj, final iwy iwy, final irc irc2, final irc irc3) {
        return new iqq(aapf, atjj, tdz, isk, qv, sgv, abaa, aazo, abbo, abcn, abbb, abbf, iwu, shs, shg, liveOverlayPresenter, aaxm, creatorEndscreenOverlayPresenter, subtitlesOverlayPresenter, abav, aatb, aatk, abay, iro, iss, mdxOverlaysPresenter, jcg, noSoundMemoOverlay, ixz, iwr, abns, vzj, fpl, irc, jai, atjj2, irm, aayj, iwy, irc2, irc3, null, null, null);
    }
    
    public static iqk l(final aucj aucj, final atjj atjj, final fjp fjp, final fjl fjl, final abns abns) {
        return new iqk(aucj, atjj, fjp, fjl, abns, (byte[])null, (byte[])null);
    }
    
    public static DefaultVideoStageMonitor m(final hyq hyq) {
        return new DefaultVideoStageMonitor(hyq, (byte[])null, (byte[])null);
    }
    
    public static ine n(final thh thh, final fmd fmd, final yzf yzf, final atjj atjj, final aaha aaha) {
        return new ine(thh, fmd, yzf, atjj, aaha, 0, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static AutonavToggleController o(final Context context, final wwv wwv, final acng acng, final vax vax, final abns abns, final irp irp, final uyi uyi, final Handler handler, final WillAutonavInformer willAutonavInformer, final mrm mrm) {
        return new AutonavToggleController(context, wwv, acng, vax, abns, irp, uyi, handler, willAutonavInformer, mrm, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static imv p(final fa fa, final zki zki, final zzu zzu, final aabt aabt, final zkw zkw, final tny tny, final thh thh, final imh imh, final aagu aagu, final aagn aagn, final toi toi, final qbo qbo, final qbo qbo2, final aagv aagv, final Integer n, final yzf yzf, final fml fml, final aaha aaha, final aaal aaal, final Executor executor, final uyi uyi, final Object o, final Object o2, final hyr hyr) {
        final feq feq = (feq)o;
        return new imv(fa, zki, zzu, aabt, zkw, tny, thh, imh, aagu, aagn, toi, qbo, qbo2, aagv, n, yzf, fml, aaha, aaal, executor, uyi, (blt)o2, hyr, null, null, null, null, null);
    }
    
    public static imt q(final Activity activity, final zki zki, final zzu zzu, final zkw zkw, final tny tny, final thh thh, final aacf aacf, final aagu aagu, final aagp aagp, final aagn aagn, final toi toi, final qbo qbo, final acga acga, final yzf yzf, final aaha aaha, final imh imh, final uyi uyi, final Object o, final imy imy) {
        final feq feq = (feq)o;
        return new imt(activity, zki, zzu, zkw, tny, thh, aacf, aagu, aagp, aagn, toi, qbo, acga, yzf, aaha, imh, uyi, imy, null, null, null, null, null);
    }
    
    public static qbo r(final bu bu, final actx actx, final vax vax, final blt blt, final wwu wwu) {
        return new qbo(bu, actx, vax, blt, wwu, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static fzo s(final fln fln, final thh thh) {
        return new fzo(fln, thh);
    }
    
    public static ims t(final Activity activity, final Context context, final vax vax, final aafo aafo, final Object o, final aeby aeby, final aeby aeby2) {
        return new ims(activity, context, vax, aafo, (hyr)o, aeby, aeby2, null, null, null, null);
    }
    
    public static qbo u(final Context context, final vax vax, final wwv wwv, final aagu aagu, final thh thh, final aeby aeby, final aeby aeby2) {
        return new qbo(context, vax, wwv, aagu, thh, aeby, aeby2, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static abli v(final Activity activity, final aeby aeby, final ScheduledExecutorService scheduledExecutorService, final zki zki, final lzi lzi) {
        return new abli(activity, (ablg)new ablf(activity, (Executor)scheduledExecutorService, zki, lzi, (byte[])null, (byte[])null, (byte[])null), aeby, (byte[])null, (byte[])null, (byte[])null);
    }
}
