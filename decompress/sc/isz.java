import android.os.Handler;
import com.google.android.apps.youtube.app.player.overlay.DefaultInlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.ChapterSeekOverlayController;
import java.util.Set;
import com.google.android.apps.youtube.app.player.infocards.YouTubeInfoCardOverlayPresenter;
import com.google.android.apps.youtube.app.player.controls.SingleLoopMenuItemControllerImpl;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import android.content.Context;
import com.google.android.apps.youtube.app.player.controls.PreviousPaddleMenuItemController;
import com.google.android.apps.youtube.app.player.controls.NextPaddleMenuItemControllerImpl;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isz implements arls
{
    public static NextPaddleMenuItemControllerImpl b(final Activity activity, final abpu abpu, final ftk ftk, final abbf abbf, final vcy vcy, final acpk acpk, final asid asid, final wyw wyw) {
        return new NextPaddleMenuItemControllerImpl(activity, abpu, ftk, abbf, vcy, acpk, asid, wyw);
    }
    
    public static isx c(final bu bu, final tmx tmx, final xnt xnt, final ftk ftk) {
        return new isx(bu, tmx, xnt, ftk);
    }
    
    public static PreviousPaddleMenuItemController d(final ftk ftk, final abbf abbf) {
        return new PreviousPaddleMenuItemController(ftk, abbf);
    }
    
    public static SingleLoopMenuItemControllerImpl e(final Context context, final PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, final abpu abpu, final wyw wyw, final ftk ftk) {
        return new SingleLoopMenuItemControllerImpl(context, playbackLoopShuffleMonitor, abpu, wyw, ftk);
    }
    
    public static itn f(final vwt vwt, final tgd tgd, final tqd tqd, final wyw wyw) {
        return new itn(vwt, tgd, tqd, wyw);
    }
    
    public static YouTubeInfoCardOverlayPresenter g(final Context context, final uyu uyu, final tqf tqf, final uyy uyy, final uyx uyx, final skc skc, final aazi aazi, final tgd tgd) {
        return new YouTubeInfoCardOverlayPresenter(context, uyu, tqf, uyy, uyx, skc, aazi, tgd);
    }
    
    public static iub h(final xao xao, final afss afss) {
        return new iub(xao, afss);
    }
    
    public static iuh i(final Context context, final wxx wxx, final tjm tjm, final abjj abjj, final fbo fbo, final abpu abpu, final vai vai, final Set set) {
        return new iuh(context, wxx, tjm, abjj, fbo, abpu, vai, set);
    }
    
    public static ChapterSeekOverlayController j(final abap abap, final abpu abpu, final abgw abgw, final vaf vaf) {
        return new ChapterSeekOverlayController(abap, abpu, abgw, vaf);
    }
    
    public static iuv k() {
        return new iuv();
    }
    
    public static DefaultInlineMutedControlsOverlay l(final Context context, final abdr abdr, final atke atke) {
        return new DefaultInlineMutedControlsOverlay(context, abdr, atke);
    }
    
    public static iuz m(final Handler handler) {
        return new iuz(handler);
    }
    
    public static its n(final Activity activity, final wyw wyw, final hwn hwn) {
        return new its(activity, wyw, hwn, null);
    }
    
    public static itt o(final Context context, final jej jej, final abhq abhq, final jki jki) {
        return new itt(context, jej, abhq, jki, null, null, null, null);
    }
    
    public static itu p(final Context context, final Handler handler, final acgs acgs, final atke atke, final atke atke2, final msr msr, final jbi jbi) {
        return new itu(context, handler, acgs, atke, atke2, msr, jbi, null, null);
    }
    
    public static ity q(final Context context, final itw itw, final acgs acgs, final vcy vcy, final tqf tqf, final aahc aahc, final zpk zpk, final wyw wyw, final aazj aazj, final uwb uwb, final abcd abcd, final aaon aaon, final msr msr) {
        return new ity(context, itw, acgs, vcy, tqf, aahc, zpk, wyw, aazj, uwb, abcd, aaon, msr, null, null, null);
    }
    
    public static itr r(final acql acql, final arwh arwh, final vai vai, final itq itq, final abhm abhm, final uwb uwb, final msr msr) {
        return new itr(acql, arwh, vai, itq, abhm, uwb, msr, null, null, null, null);
    }
    
    public static abhm s(final Context context, final aeea aeea, final fuf fuf, final fuf fuf2, final fuf fuf3, final accf accf, final omw omw, final acdp acdp, final vai vai, final oug oug, final atke atke, final wyw wyw, final abhq abhq, final itn itn, final tgd tgd, final acqg acqg) {
        return new abhm(context, aeea, fuf, fuf2, fuf3, accf, omw, acdp, vai, oug, atke, wyw, abhq, itn, tgd, acqg, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static itb t(final Activity activity, final vcy vcy, final aeea aeea, final atke atke) {
        return new itb(activity, vcy, aeea, atke, null, null, null);
    }
    
    public static itd u(final bu bu, final itc itc, final aeea aeea, final ftk ftk) {
        return new itd(bu, itc, aeea, ftk, null, null, null);
    }
    
    public static ajb v(final bu bu, final acwb acwb, final aeea aeea) {
        return new ajb(bu, acwb, aeea, (byte[])null, (byte[])null);
    }
    
    public final Object a() {
        throw null;
    }
}
