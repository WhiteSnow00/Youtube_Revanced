import com.google.android.apps.youtube.app.common.ui.pip.observer.PipPlayerObserver;
import android.os.Handler;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelObscuredPlaybackSuspender;
import j$.util.Optional;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hoy implements arls
{
    public static SubtitlesOverlayPresenter b(final abdb abdb, final abse abse, final abtw abtw, final absb absb, final Executor executor, final Executor executor2, final vaf vaf) {
        return new SubtitlesOverlayPresenter(abdb, abse, abtw, absb, executor, executor2, vaf);
    }
    
    public static Optional c(final how how) {
        return Optional.ofNullable((Object)how.be);
    }
    
    public static how d(final br br) {
        final how how = (how)br;
        how.getClass();
        return how;
    }
    
    public static acwt e(final atke atke) {
        final acwt acwt = (acwt)atke.a();
        acwt.getClass();
        return acwt;
    }
    
    public static hpa f(final acpk acpk, final vcy vcy, final wyv wyv) {
        return new hpa(acpk, vcy, wyv);
    }
    
    public static hpi g(final arkg arkg, final wyv wyv) {
        return new hpi(arkg, wyv);
    }
    
    public static hpp h(final atke atke, final vaf vaf) {
        return new hpp(atke, vaf);
    }
    
    public static Optional i(final atke atke, final hpq hpq) {
        ansd ansd;
        if ((ansd = ((vaf)atke.a()).b().A) == null) {
            ansd = ansd.a;
        }
        Optional optional;
        if (ansd.d) {
            optional = Optional.of((Object)hpq);
        }
        else {
            optional = Optional.empty();
        }
        return optional;
    }
    
    public static hqz j(final qqr qqr, final aun aun, final Executor executor, final oby oby) {
        return new hqz(qqr, aun, executor, oby);
    }
    
    public static hrp k(final xam xam) {
        return new hrp(xam);
    }
    
    public static ReelObscuredPlaybackSuspender l(final fjv fjv, final hqv hqv) {
        return new ReelObscuredPlaybackSuspender(fjv, hqv);
    }
    
    public static lib m(final atke atke, final atke atke2) {
        return new lib(atke, atke2, 1, (byte[])null);
    }
    
    public static hwo n() {
        return new hwo();
    }
    
    public static hqk o(final Context context, final Handler handler, final hqv hqv, final hpy hpy, final arwh arwh) {
        return new hqk(context, handler, hqv, hpy, arwh, null, null);
    }
    
    public static hzn p() {
        return new hzn((char[])null);
    }
    
    public static hzn q(final ghb ghb) {
        return new hzn(ghb);
    }
    
    public static hzn r() {
        return new hzn((short[])null);
    }
    
    public static hpq s(final ghb ghb, final vaf vaf, final msr msr) {
        return new hpq(ghb, vaf, msr, (byte[])null, (byte[])null);
    }
    
    public static hpr t(final msr msr, final Optional optional, final PipPlayerObserver pipPlayerObserver) {
        return new hpr(msr, optional, pipPlayerObserver, (byte[])null, (byte[])null);
    }
    
    public static hpy u(final Context context, final wyv wyv, final vai vai, final msr msr) {
        return new hpy(context, wyv, vai, msr, null, null);
    }
    
    public static hqo v(final acgs acgs, final afaq afaq, final msr msr, final vai vai, final arwh arwh) {
        return new hqo(acgs, afaq, msr, vai, arwh, null, null, null, null);
    }
    
    public final Object a() {
        throw null;
    }
}
