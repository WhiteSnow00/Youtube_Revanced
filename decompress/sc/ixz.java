import java.util.Set;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.apps.youtube.app.player.overlay.RepeatChapterPlaybackLoopController;
import android.os.Handler;
import j$.util.Optional;
import android.view.View;
import android.view.LayoutInflater;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import android.app.Activity;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixz implements arls
{
    public static iyn b(final Context context) {
        return new iyn(context);
    }
    
    public static jdg c(final Context context) {
        return new jdg(context);
    }
    
    public static atjz d() {
        return ((atjz)atjm.e()).bc();
    }
    
    public static snd e(final Context context, final wyw wyw, final sdh sdh) {
        return new snd(context.getResources(), wyw, sdh);
    }
    
    public static aavq f(final Context context, final acgs acgs, final ViewGroup viewGroup) {
        return new aavq(context, acgs, viewGroup);
    }
    
    public static aavh g(final Activity activity, final YouTubeControlsOverlay youTubeControlsOverlay, final atke atke, final itk itk) {
        final TouchImageView touchImageView = (TouchImageView)LayoutInflater.from((Context)activity).inflate(2131625760, (ViewGroup)null);
        youTubeControlsOverlay.B((View)touchImageView);
        return new aavh(atke, new aavl(touchImageView), (aavk)itk, (Context)activity);
    }
    
    public static aavi h(final Context context, final ViewGroup viewGroup) {
        return new aavi(viewGroup, context);
    }
    
    public static aavm i(final Context context, final ViewGroup viewGroup) {
        return new aavm(viewGroup, context);
    }
    
    public static aavr j(final wyw wyw, final Context context, final ViewGroup viewGroup, final acgs acgs, final vcy vcy) {
        return new aavr(wyw, context, viewGroup, acgs, vcy);
    }
    
    public static tsb k() {
        return new tsb();
    }
    
    public static ViewGroup l(final Context context) {
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(context).inflate(2131624587, (ViewGroup)null);
        viewGroup.getClass();
        return viewGroup;
    }
    
    public static View[] m(final Optional optional, final TouchImageView touchImageView) {
        return new View[] { (View)optional.get(), (View)touchImageView };
    }
    
    public static izv n(final atke atke, final atke atke2, final vai vai) {
        izv izv;
        if (vai.f(45356780L)) {
            izv = (izv)atke2.a();
        }
        else {
            izv = (izv)atke.a();
        }
        izv.getClass();
        return izv;
    }
    
    public static iyb o(final acbm acbm, final iyc iyc, final arkg arkg, final wyw wyw, final abpu abpu, final fjr fjr, final vai vai, final uwb uwb) {
        return new iyb(acbm, iyc, arkg, wyw, abpu, fjr, vai, uwb);
    }
    
    public static iyf p() {
        return new iyf();
    }
    
    public static iyh q(final Handler handler, final iuv iuv, final atjz atjz, final wyw wyw, final vai vai) {
        return new iyh(handler, iuv, atjz, wyw, vai);
    }
    
    public static RepeatChapterPlaybackLoopController r(final atke atke, final Context context, final uve uve, final jet jet, final ouf ouf, final aazo aazo, final jdn jdn, final jcf jcf, final abap abap, final wxx wxx) {
        return new RepeatChapterPlaybackLoopController(atke, context, uve, jet, ouf, aazo, jdn, jcf, abap, wxx, (byte[])null);
    }
    
    public static SubtitleButtonController s(final Context context, final abpu abpu, final itg itg, final ajb ajb, final vaf vaf, final iuv iuv, final wyw wyw) {
        final SubtitleButtonController subtitleButtonController = new SubtitleButtonController(context, abpu, itg, ajb, vaf, (wyv)new hyl(wyw, 3), (byte[])null, (byte[])null, (byte[])null);
        iuv.a((iuu)subtitleButtonController);
        return subtitleButtonController;
    }
    
    public static iyk t(final Context context, final acgs acgs, final auda auda, final arwh arwh, final vai vai, final vai vai2, final msr msr) {
        return new iyk(context, acgs, auda, arwh, vai, vai2, msr, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static eg u(final iyn iyn, final adqh adqh, final Set set) {
        return new eg(iyn, adqh, set, (byte[])null, (byte[])null);
    }
    
    public static abby v(final aujg aujg, final aavi aavi) {
        return aujg.Q((abbs)aavi, (abdi)new abdg());
    }
    
    public final Object a() {
        throw null;
    }
}
