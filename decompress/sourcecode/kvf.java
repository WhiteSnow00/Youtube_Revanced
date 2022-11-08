import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.watch.engagementpanel.WatchEngagementPanelViewContainerController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FoldableStatesMonitor;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryPreviousNextController;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.VideoStageMonitor;
import com.google.android.apps.youtube.app.watch.engagementpanel.ShowPlaylistEngagementPanelOnUiReadyHandler;
import com.google.android.apps.youtube.app.watch.engagementpanel.MainAppEngagementPanelDataProvider;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvf implements arjd
{
    public static MainAppEngagementPanelDataProvider b(final Context context, final osb osb, final utk utk) {
        return new MainAppEngagementPanelDataProvider(context, osb, utk);
    }
    
    public static utk c(final aeoe aeoe) {
        final utk aq = ((kvv)((arix)aeoe.a()).aR()).aq();
        aq.getClass();
        return aq;
    }
    
    public static kvw d(final abns abns) {
        return new kvw(abns);
    }
    
    public static ShowPlaylistEngagementPanelOnUiReadyHandler e(final aawb aawb, final vax vax, final arhr arhr) {
        return new ShowPlaylistEngagementPanelOnUiReadyHandler(aawb, vax, arhr);
    }
    
    public static kwx f(final fjp fjp, final wwv wwv) {
        return new kwx(fjp, wwv);
    }
    
    public static kxo g(final Context context, final uyf uyf, final uyi uyi) {
        return new kxo(context, uyf, uyi);
    }
    
    public static VideoStageMonitor h(final abns abns, final kxm kxm, final abcd abcd) {
        return new VideoStageMonitor(abns, kxm, abcd);
    }
    
    public static WatchHistoryPreviousNextController i(final qv qv, final vax vax, final kwy kwy, final abbf abbf, final PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, final absm absm, final abns abns, final atjj atjj, final asho asho, final elw elw) {
        return new WatchHistoryPreviousNextController(qv, vax, kwy, abbf, playbackLoopShuffleMonitor, absm, abns, atjj, asho, elw, (byte[])null, (byte[])null);
    }
    
    public static e j(final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4) {
        return new e(atjj, atjj2, atjj3, atjj4, (byte[])null);
    }
    
    public static kyp k() {
        return new kyp();
    }
    
    public static kwi l(final arhr arhr, final kwe kwe, final arud arud, final ashp ashp, final ashp ashp2, final kwj kwj) {
        return new kwi(arhr, kwe, arud, ashp, ashp2, kwj, null, null);
    }
    
    public static kct m(final tpo tpo, final asgt asgt) {
        return new kct(tpo, asgt);
    }
    
    public static FoldableStatesMonitor n(final Context context, final kct kct, final asgt asgt, final kxm kxm) {
        return new FoldableStatesMonitor(context, kct, asgt, kxm, (byte[])null, (byte[])null);
    }
    
    public static kct o(final utk utk) {
        return new kct(utk);
    }
    
    public static kwn p(final Context context, final atjj atjj, final ioe ioe, final bhu bhu, final osx osx) {
        return new kwn(context, atjj, ioe, bhu, osx, null, null);
    }
    
    public static kwe q(final Context context, final lbn lbn, final fjp fjp, final abrx abrx, final uyf uyf, final mrm mrm, final uyi uyi) {
        return new kwe(context, lbn, fjp, abrx, uyf, mrm, uyi, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static utk r(final kvc kvc, final avt avt) {
        final utk a = kvc.a();
        avt.z(a);
        return a;
    }
    
    public static bx s(final e e) {
        return new bx(e, (byte[])null, (byte[])null);
    }
    
    public static utk t(final cdn cdn, final avt avt) {
        cdn.B(true);
        final utk a = cdn.A().a();
        avt.z(a);
        return a;
    }
    
    public static WatchEngagementPanelViewContainerController u(final Context context, final arhr arhr, final uyf uyf, final arud arud, final kwi kwi, final fzo fzo, final abns abns, final kwe kwe, final ashp ashp, final ashp ashp2, final uyi uyi) {
        return new WatchEngagementPanelViewContainerController(context, arhr, uyf, arud, kwi, fzo, abns, kwe, ashp, ashp2, uyi, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static kvu v(final Context context, final tdz tdz, final vax vax, final vut vut, final tny tny, final c c, final hob hob, final acno acno, final aeby aeby, final abfa abfa, final abeg abeg, final uyi uyi, final actx actx, final bhu bhu, final aeby aeby2) {
        return new kvu(context, tdz, vax, vut, tny, c, hob, acno, aeby, abfa, abeg, uyi, actx, bhu, aeby2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
