import android.content.SharedPreferences;
import java.util.Set;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBarConnectivityController;
import com.google.android.apps.youtube.app.datasaving.DefaultNetworkDataUsageMonitor;
import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerViewModeMonitor;
import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerResponseMonitor;
import android.view.ContextThemeWrapper;
import android.content.Context;
import android.app.Activity;
import com.google.android.apps.youtube.app.common.ui.systemui.PipWindowInsetsHelper;
import com.google.android.apps.youtube.app.common.ui.pip.observer.PipPlayerObserver;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gij implements arjd
{
    public static PipPlayerObserver b(final Optional optional, final ashe ashe) {
        return new PipPlayerObserver(optional, ashe);
    }
    
    public static PipWindowInsetsHelper c(final atjj atjj) {
        return new PipWindowInsetsHelper(atjj);
    }
    
    public static Context d(final Activity activity, final uyi uyi) {
        int n;
        if (uyi.aT() && uyi.aU()) {
            n = 2132084270;
        }
        else {
            n = 2132084265;
        }
        return (Context)new ContextThemeWrapper((Context)activity, n);
    }
    
    public static Context e(final Activity activity, final gko gko, final uyi uyi) {
        return fah.o(activity, gko, uyi);
    }
    
    public static gkl f(final osb osb) {
        return (gkl)new gkk(osb);
    }
    
    public static TooltipPlayerResponseMonitor g(final acuj acuj, final abns abns) {
        return new TooltipPlayerResponseMonitor(acuj, abns);
    }
    
    public static TooltipPlayerViewModeMonitor h(final acup acup, final fjp fjp) {
        return new TooltipPlayerViewModeMonitor(acup, fjp);
    }
    
    public static gky i(final sxe sxe, final ohr ohr, final arhr arhr, final wwv wwv, final acup acup, final gem gem) {
        return new gky(sxe, ohr, arhr, wwv, acup, gem);
    }
    
    public static glu j(final Context context, final uyf uyf) {
        return new glu(context, uyf);
    }
    
    public static DefaultNetworkDataUsageMonitor k(final Context context, final tku tku, final uyi uyi, final aeke aeke) {
        return new DefaultNetworkDataUsageMonitor(context, tku, uyi, aeke);
    }
    
    public static SlimStatusBarConnectivityController l(final Context context, final thh thh, final sin sin, final fjp fjp, final abno abno, final gju gju, final zko zko, final zki zki, final abns abns, final tdz tdz, final rgm rgm) {
        return new SlimStatusBarConnectivityController(context, thh, sin, fjp, abno, gju, zko, zki, abns, tdz, rgm, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static gju m(final Context context, final sin sin, final wwu wwu, final gau gau) {
        return new gju(context, sin, wwu, gau, null, null, null);
    }
    
    public static cxz n() {
        return new cxz((int[])null);
    }
    
    public static gmb o(final tus tus, final abns abns, final fai fai, final fjp fjp, final Executor executor, final asho asho, final vjl vjl, final qv qv, final mrm mrm, final uyi uyi) {
        return new gmb(tus, abns, fai, fjp, executor, asho, vjl, qv, mrm, uyi, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static hdv p(final mrm mrm, final uyf uyf, final Optional optional, final gie gie, final gie gie2, final abrx abrx, final abrx abrx2) {
        return new hdv(mrm, uyf, optional, gie, gie2, abrx, abrx2, null, null, null);
    }
    
    public static hob q(final Activity activity, final ashe ashe, final mrm mrm, final kct kct) {
        return new hob(activity, ashe, mrm, kct, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static fzo r(final vax vax, final Set set) {
        return new fzo(vax, set);
    }
    
    public static fzo s(final SharedPreferences sharedPreferences, final oas oas) {
        return new fzo(sharedPreferences, oas);
    }
    
    public static gmu t(final bu bu, final vup vup, final thh thh, final sin sin, final Executor executor, final bx bx, final zjy zjy, final wwu wwu, final zki zki, final uyi uyi) {
        return new gmu(bu, vup, thh, sin, executor, bx, zjy, wwu, zki, uyi, null, null, null, null, null, null);
    }
    
    public static gmd u(final Context context, final acng acng, final aeby aeby, final ackz ackz, final aeby aeby2, final fjp fjp) {
        return new gmd(context, acng, aeby, ackz, aeby2, fjp, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static gms v(final bu bu, final zki zki, final zkw zkw, final tny tny, final fzo fzo, final bx bx) {
        return new gms(bu, zki, zkw, tny, fzo, bx, null, null, null, null, null, null);
    }
}
