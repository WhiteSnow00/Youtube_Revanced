import com.google.android.apps.youtube.app.common.ui.orientation.PlayerEnterExitFullscreenControllerImpl;
import com.google.android.apps.youtube.app.common.ui.navigation.PageMonitor;
import com.google.android.apps.youtube.app.common.ui.navigation.HomePageMonitor;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneFragmentOrientationLocker;
import com.google.android.apps.youtube.app.common.ui.pip.PipObserver;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;
import com.google.android.apps.youtube.app.common.ui.orientation.OrientationInfoLoggingController;
import java.util.function.Function;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfr implements arjd
{
    public static gfs b(final uyf uyf) {
        return new gfs(uyf);
    }
    
    public static Optional c(Optional map) {
        map = map.map((Function)gfu.m);
        map.getClass();
        return map;
    }
    
    public static ggd d() {
        return new ggd();
    }
    
    public static gfx e(final aeoe aeoe) {
        final gfx t = ((ggu)((arix)aeoe.a()).aR()).t();
        t.getClass();
        return t;
    }
    
    public static OrientationInfoLoggingController f(final ashe ashe, final tnu tnu, final atjj atjj) {
        return new OrientationInfoLoggingController(ashe, tnu, atjj);
    }
    
    public static ghb g(final Activity activity, final acoh acoh) {
        return new ghb(activity, acoh);
    }
    
    public static gia h(final Context context, final atjj atjj, final Handler handler) {
        return new gia(context, atjj, handler);
    }
    
    public static PipObserver i(final Activity activity, final atje atje) {
        return new PipObserver(activity, atje);
    }
    
    public static PaneFragmentOrientationLocker j(final ggv ggv, final zed zed) {
        return new PaneFragmentOrientationLocker(ggv, zed, (byte[])null);
    }
    
    public static ghw k(final Activity activity, final hyq hyq, final gic gic, final aams aams, final shw shw, final wwv wwv, final aawb aawb, final uyi uyi, final uyf uyf) {
        return new ghw(activity, hyq, gic, aams, shw, wwv, aawb, uyi, uyf, (byte[])null, (byte[])null);
    }
    
    public static hnc l(final Activity activity, final zki zki, final zkw zkw, final vup vup, final tny tny, final tdz tdz, final thh thh, final toi toi, final vax vax, final Executor executor) {
        return new hnc(activity, zki, zkw, vup, tny, tdz, thh, toi, vax, executor, null, null);
    }
    
    public static DefaultPipController m(final bu bu, final hyq hyq, final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4, final atjj atjj5, final atjj atjj6, final atjj atjj7, final atjj atjj8, final atjj atjj9, final arhr arhr, final arhr arhr2, final hdv hdv, final uyf uyf, final arud arud, final uyi uyi) {
        return new DefaultPipController(bu, hyq, atjj, atjj2, atjj3, atjj4, atjj5, atjj6, atjj7, atjj8, atjj9, arhr, arhr2, hdv, uyf, arud, uyi, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static cxz n() {
        return gej.n();
    }
    
    public static HomePageMonitor o(final uyi uyi, final ggs ggs, final kzd kzd, final mrm mrm, final vwa vwa) {
        return new HomePageMonitor(uyi, ggs, kzd, mrm, vwa, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static PageMonitor p(final uyi uyi, final ggs ggs, final kzd kzd, final mrm mrm, final vwa vwa) {
        return new PageMonitor(uyi, ggs, kzd, mrm, vwa, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static ghd q(final lgl lgl, final mrm mrm, final kzd kzd) {
        return new ghd(lgl, mrm, kzd, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static ghm r(final Activity activity, final fxo fxo, final fjp fjp, final uyf uyf, final zed zed, final tnu tnu, final abrx abrx, final Handler handler, final wwv wwv, final ghk ghk, final kct kct, final acoh acoh, final uyi uyi, final lgl lgl, final mrm mrm) {
        return new ghm(activity, fxo, fjp, uyf, zed, new ghl(new ghb(activity, acoh), handler, uyi), tnu, ghk, abrx, wwv, kct, uyi, lgl, mrm, null, null, null, null);
    }
    
    public static PlayerEnterExitFullscreenControllerImpl s(final Activity activity, final fxo fxo, final ghm ghm, final lho lho, final fjp fjp, final abrx abrx, final sin sin, final tnu tnu, final kct kct, final aum aum, final mrm mrm, final afts afts, final hob hob, final phq phq, final uyi uyi, final lgl lgl, final itq itq, final Optional optional, final acoh acoh) {
        return new PlayerEnterExitFullscreenControllerImpl(activity, fxo, ghm, lho, fjp, abrx, sin, tnu, kct, aum, mrm, afts, hob, phq, uyi, lgl, itq, optional, acoh, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static gid t(final mrm mrm, final bu bu, final hyq hyq, final arud arud, final atjj atjj, final hdv hdv) {
        return new gid(mrm, bu, hyq, arud, atjj, hdv, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static gfx u(final fa fa, final avt avt, final arhr arhr, final fzo fzo, final uyi uyi, final uyi uyi2, final Optional optional, final atjj atjj, final fap fap) {
        return new gfx(fa, avt, arhr, fzo, uyi, uyi2, optional, atjj, fap, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static qpt v(final auip auip) {
        auip.getClass();
        return new qpt(auip, (byte[])null, (byte[])null, (byte[])null);
    }
}
