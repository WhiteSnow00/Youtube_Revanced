import com.google.android.apps.youtube.app.common.ui.pip.observer.PipPlayerObserver;
import j$.util.Optional;
import android.os.Handler;
import java.util.concurrent.Executor;
import android.content.Context;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import android.app.Activity;
import java.util.Map;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelObscuredPlaybackSuspender;

// 
// Decompiled by Procyon v0.6.0
// 

public final class how implements arjd
{
    public static hqv b(final wym wym) {
        return new hqv(wym);
    }
    
    public static ReelObscuredPlaybackSuspender c(final fjp fjp, final hqa hqa) {
        return new ReelObscuredPlaybackSuspender(fjp, hqa);
    }
    
    public static ViewGroup d(final View view) {
        final ViewGroup viewGroup = (ViewGroup)view.findViewById(2131429712);
        viewGroup.getClass();
        return viewGroup;
    }
    
    public static vax e(final Map map, final vax vax) {
        final vwb g = vas.g();
        g.h(map);
        g.j(vax);
        return (vax)g.g();
    }
    
    public static adcs f(final Activity activity) {
        final hti aa = ((hth)activity).aa;
        aa.getClass();
        return (adcs)aa;
    }
    
    public static View g(final EditVideoActivity editVideoActivity) {
        final View inflate = LayoutInflater.from((Context)editVideoActivity).inflate(2131624377, (ViewGroup)null);
        inflate.getClass();
        return inflate;
    }
    
    public static zfj h() {
        return (zfj)hsy.a;
    }
    
    public static aexq i(final EditVideoActivity editVideoActivity) {
        return aexq.j(editVideoActivity.getSupportActionBar());
    }
    
    public static gur j(final hss hss) {
        return new gur(hss, 15);
    }
    
    public static hry k(final Activity activity, final Executor executor, final zki zki, final adjk adjk, final adno adno, final vax vax, final aceo aceo, final acng acng, final wwu wwu) {
        return new hry(activity, executor, zki, adjk, adno, vax, aceo, acng, wwu, (byte[])null);
    }
    
    public static hvr l() {
        return new hvr();
    }
    
    public static hqe m(final aagm aagm, final aum aum, final Executor executor, final oas oas) {
        return new hqe(aagm, aum, executor, oas, null);
    }
    
    public static hpp n(final Context context, final Handler handler, final hqa hqa, final hpd hpd, final arud arud) {
        return new hpp(context, handler, hqa, hpd, arud, null, null);
    }
    
    public static hsr o(final zhb zhb, final uyi uyi) {
        return new hsr(zhb, uyi, (byte[])null);
    }
    
    public static hyr p() {
        return new hyr((char[])null);
    }
    
    public static hov q(final mrm mrm, final Optional optional, final PipPlayerObserver pipPlayerObserver) {
        return new hov(mrm, optional, pipPlayerObserver, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static hou r(final ggs ggs, final uyf uyf, final mrm mrm) {
        return new hou(ggs, uyf, mrm, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static hpd s(final Context context, final wwu wwu, final uyi uyi, final mrm mrm) {
        return new hpd(context, wwu, uyi, mrm, null, null, null);
    }
    
    public static hpt t(final aceo aceo, final aeyr aeyr, final mrm mrm, final uyi uyi, final arud arud) {
        return new hpt(aceo, aeyr, mrm, uyi, arud, null, null, null, null);
    }
    
    public static hsn u(final zhb zhb, final asho asho, final mrm mrm) {
        return new hsn(zhb, asho, mrm, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static hsv v(final sin sin, final asho asho, final zfs zfs, final yzf yzf, final zhb zhb, final hst hst, final Executor executor, final fam fam, final fyy fyy, final cl cl, final aeby aeby) {
        return new hsv(sin, asho, zfs, yzf, zhb, hst, executor, fam, fyy, cl, aeby, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
