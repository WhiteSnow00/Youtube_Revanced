import j$.util.Optional;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.common.player.PlaybackLifecycleMonitor;
import com.google.android.apps.youtube.app.common.player.MultiplePlayerWorkaroundController;
import android.app.Activity;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fng implements arjd
{
    public static tku b(final Context context, final atjj atjj) {
        return fnf.a(context, atjj);
    }
    
    public static fno c(final arhr arhr, final atjj atjj, final atjj atjj2, final arhr arhr2, final arhr arhr3, final uyf uyf) {
        return new fno(arhr, atjj, atjj2, arhr2, arhr3, uyf);
    }
    
    public static fnq d(final Activity activity, final fno fno, final fke fke) {
        return new fnq(activity, fno, fke);
    }
    
    public static MultiplePlayerWorkaroundController e(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new MultiplePlayerWorkaroundController(atjj, atjj2, atjj3);
    }
    
    public static PlaybackLifecycleMonitor f(final abno abno, final abns abns) {
        return new PlaybackLifecycleMonitor(abno, abns);
    }
    
    public static fpc g(final aays aays) {
        return new fpc(aays);
    }
    
    public static fno h(final abns abns) {
        final fno fno = (fno)abns.m();
        fno.getClass();
        return fno;
    }
    
    public static abll i(final abns abns) {
        final abll k = abns.k();
        k.getClass();
        return k;
    }
    
    public static abni j(final abns abns) {
        final abni n = abns.n();
        n.getClass();
        return n;
    }
    
    public static aaxs k(final jdt jdt) {
        final aaxs c = jdt.c();
        c.getClass();
        return c;
    }
    
    public static abno l(final abns abns) {
        final abno o = abns.o();
        o.getClass();
        return o;
    }
    
    public static absi m(final abns abns) {
        final absi t = abns.t();
        t.getClass();
        return t;
    }
    
    public static jdt n(final abns abns) {
        final jdt jdt = (jdt)abns;
        jdt.getClass();
        return jdt;
    }
    
    public static SubtitlesOverlayPresenter o(final abbh abbh, final abqd abqd, final abrv abrv, final abqa abqa, final Executor executor, final Executor executor2, final uyf uyf) {
        return new SubtitlesOverlayPresenter(abbh, abqd, abrv, abqa, executor, executor2, uyf);
    }
    
    public static tks p(final Context context, final aftr aftr, final String s, final qbo qbo, final atjj atjj, final uyf uyf) {
        return fnf.g(context, aftr, s, qbo, atjj, uyf);
    }
    
    public static fzo q() {
        return new fzo((byte[])null);
    }
    
    public static bhu r(final toa toa, final hob hob, final kzd kzd) {
        return new bhu(toa, hob, kzd, null);
    }
    
    public static bhu s() {
        return new bhu((short[])null);
    }
    
    public static hyq t(final mrm mrm, final arhr arhr, final arhr arhr2, final Optional optional) {
        return new hyq(mrm, arhr, arhr2, optional, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static fpn u(final bhu bhu, final Context context, final hyc hyc) {
        return new fpn(bhu, context, hyc, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static gmy v(final Context context, final abno abno, final ira ira, final wwu wwu, final ish ish, final aeby aeby) {
        return new gmy(context, abno, ira, wwu, ish, aeby, (byte[])null, (byte[])null, (byte[])null);
    }
}
