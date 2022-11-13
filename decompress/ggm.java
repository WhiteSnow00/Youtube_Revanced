import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
import com.google.android.apps.youtube.app.common.ui.orientation.PlayerEnterExitFullscreenControllerImpl;
import com.google.android.apps.youtube.app.common.ui.navigation.PageMonitor;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBarConnectivityController;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneFragmentOrientationLocker;
import android.view.ContextThemeWrapper;
import com.google.android.apps.youtube.app.common.ui.systemui.PipWindowInsetsHelper;
import com.google.android.apps.youtube.app.common.ui.pip.observer.PipPlayerObserver;
import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.pip.PipObserver;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;
import com.google.android.apps.youtube.app.common.ui.orientation.OrientationInfoLoggingController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggm implements arls
{
    public static ggk b() {
        return new ggk();
    }
    
    public static gge c(final aeqe aeqe) {
        final gge t = ((ghd)((arlm)aeqe.a()).aR()).t();
        t.getClass();
        return t;
    }
    
    public static OrientationInfoLoggingController d(final asht asht, final tpz tpz, final atke atke) {
        return new OrientationInfoLoggingController(asht, tpz, atke);
    }
    
    public static ghk e(final Activity activity, final acql acql) {
        return new ghk(activity, acql);
    }
    
    public static gij f(final Context context, final atke atke, final Handler handler) {
        return new gij(context, atke, handler);
    }
    
    public static PipObserver g(final Activity activity, final atjz atjz) {
        return new PipObserver(activity, atjz);
    }
    
    public static PipPlayerObserver h(final Optional optional, final asht asht) {
        return new PipPlayerObserver(optional, asht);
    }
    
    public static PipWindowInsetsHelper i(final atke atke) {
        return new PipWindowInsetsHelper(atke);
    }
    
    public static Context j(final Activity activity, final vai vai) {
        int n;
        if (vai.aU() && vai.aV()) {
            n = 2132084270;
        }
        else {
            n = 2132084265;
        }
        return (Context)new ContextThemeWrapper((Context)activity, n);
    }
    
    public static PaneFragmentOrientationLocker k(final ghe ghe, final zfw zfw) {
        return new PaneFragmentOrientationLocker(ghe, zfw, null);
    }
    
    public static gif l(final Activity activity, final hzm hzm, final gil gil, final aaon aaon, final skc skc, final wyw wyw, final aaxx aaxx, final vai vai, final vaf vaf) {
        return new gif(activity, hzm, gil, aaon, skc, wyw, aaxx, vai, vaf, null, null);
    }
    
    public static SlimStatusBarConnectivityController m(final Context context, final tjm tjm, final skt skt, final fjv fjv, final abpq abpq, final gkc gkc, final zml zml, final zmf zmf, final abpu abpu, final tgd tgd, final riq riq) {
        return new SlimStatusBarConnectivityController(context, tjm, skt, fjv, abpq, gkc, zml, zmf, abpu, tgd, riq, null, null, null);
    }
    
    public static gkc n(final Context context, final skt skt, final wyv wyv, final gbc gbc) {
        return new gkc(context, skt, wyv, gbc, null, null, null);
    }
    
    public static PageMonitor o(final vai vai, final ghb ghb, final lag lag, final msr msr, final vyb vyb) {
        return new PageMonitor(vai, ghb, lag, msr, vyb, null, null);
    }
    
    public static ghm p(final lhm lhm, final msr msr, final lag lag) {
        return new ghm(lhm, msr, lag, null, null);
    }
    
    public static eg q(final msr msr, final vaf vaf, final Optional optional, final gin gin, final gin gin2, final abty abty, final abty abty2) {
        return new eg(msr, vaf, optional, gin, gin2, abty, abty2, (byte[])null, (byte[])null);
    }
    
    public static PlayerEnterExitFullscreenControllerImpl r(final Activity activity, final fxw fxw, final ghv ghv, final liq liq, final fjv fjv, final abty abty, final skt skt, final tpz tpz, final jki jki, final aun aun, final msr msr, final afvt afvt, final hox hox, final pja pja, final vai vai, final lhm lhm, final iuo iuo, final Optional optional, final acql acql) {
        return new PlayerEnterExitFullscreenControllerImpl(activity, fxw, ghv, liq, fjv, abty, skt, tpz, jki, aun, msr, afvt, hox, pja, vai, lhm, iuo, optional, acql, null, null, null, null);
    }
    
    public static ghv s(final Activity activity, final fxw fxw, final fjv fjv, final vaf vaf, final zfw zfw, final tpz tpz, final abty abty, final Handler handler, final wyw wyw, final ghs ghs, final jki jki, final acql acql, final vai vai, final lhm lhm, final msr msr) {
        return new ghv(activity, fxw, fjv, vaf, zfw, new ghu(new ghk(activity, acql), handler, vai), tpz, ghs, abty, wyw, jki, vai, lhm, msr, null, null, null, null);
    }
    
    public static DefaultPipController t(final bu bu, final hzm hzm, final atke atke, final atke atke2, final atke atke3, final atke atke4, final atke atke5, final atke atke6, final atke atke7, final atke atke8, final atke atke9, final arkg arkg, final arkg arkg2, final eg eg, final vaf vaf, final arwh arwh, final vai vai) {
        return new DefaultPipController(bu, hzm, atke, atke2, atke3, atke4, atke5, atke6, atke7, atke8, atke9, arkg, arkg2, eg, vaf, arwh, vai, null, null, null, null, null);
    }
    
    public static gim u(final msr msr, final bu bu, final hzm hzm, final arwh arwh, final atke atke, final eg eg) {
        return new gim(msr, bu, hzm, arwh, atke, eg, null, null, null, null, null);
    }
    
    public static pvh v(final ziy ziy) {
        ziy.getClass();
        return new pvh(ziy, (byte[])null, (byte[])null);
    }
    
    public final Object a() {
        throw null;
    }
}
