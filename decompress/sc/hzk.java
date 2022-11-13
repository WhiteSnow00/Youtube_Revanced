import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.content.res.Resources;
import android.net.Uri;
import com.google.protobuf.MessageLite;
import com.google.android.apps.youtube.app.mdx.tvsignin.MdxTvFoundForSignInListener;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.mdx.tvsignin.MdxAssistedTvSignInDialogFragmentController;
import android.content.SharedPreferences;
import android.content.Context;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import android.app.Activity;
import com.google.android.apps.youtube.app.innertube.guide.impl.GuideControllerImpl$WatchWhileLifecycleObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzk implements arls
{
    public static GuideControllerImpl$WatchWhileLifecycleObserver b() {
        return new GuideControllerImpl$WatchWhileLifecycleObserver();
    }
    
    public static hzx c(final otk otk) {
        return new hzx(otk);
    }
    
    public static iah d(final atke atke, final atke atke2, final atke atke3) {
        return new iah(atke, atke2, atke3);
    }
    
    public static iao e() {
        return new iao();
    }
    
    public static WatchOnTvMenuItem f(final Activity activity, final gkx gkx, final xbt xbt, final vai vai) {
        return new WatchOnTvMenuItem(activity, gkx, xbt, vai);
    }
    
    public static iaz g(final xnt xnt, final abkz abkz, final tqd tqd, final Context context, final abnl abnl, final kui kui, final lag lag, final vaf vaf) {
        return new iaz(xnt, abkz, tqd, context, abnl, kui, lag, vaf);
    }
    
    public static iba h(final xnt xnt, final abkz abkz, final tqd tqd, final Context context, final abnl abnl) {
        return new iba(xnt, abkz, tqd, context, abnl);
    }
    
    public static ibl i() {
        return new ibl();
    }
    
    public static MdxAssistedTvSignInDialogFragmentController j(final bu bu, final xri xri, final xrd xrd, final SharedPreferences sharedPreferences, final xbv xbv, final oby oby, final arkg arkg, final arkg arkg2) {
        return new MdxAssistedTvSignInDialogFragmentController(bu, xri, xrd, sharedPreferences, xbv, oby, arkg, arkg2);
    }
    
    public static MdxTvFoundForSignInListener k(final arkg arkg, final arkg arkg2, final arkg arkg3, final arkg arkg4, final arkg arkg5, final arkg arkg6, final arkg arkg7, final atke atke, final arkg arkg8, final Executor executor, final xbt xbt, final xfl xfl, final arkg arkg9, final arkg arkg10, final arkg arkg11) {
        return new MdxTvFoundForSignInListener(arkg, arkg2, arkg3, arkg4, arkg5, arkg6, arkg7, atke, arkg8, executor, xbt, xfl, arkg9, arkg10, arkg11);
    }
    
    public static gpx l(final Context context, final xnt xnt) {
        return new gpx(context, xnt, 11);
    }
    
    public static qqr m(final Context context, final qcy qcy) {
        final qoa a = qob.a(context);
        a.e("main_app_mdx");
        a.f("main_app_mdx_tvsignin.pb");
        final Uri a2 = a.a();
        final qpz a3 = qqa.a();
        a3.f(a2);
        a3.e((MessageLite)aqac.a);
        return qcy.C(a3.a());
    }
    
    public static hzj n(final vqx vqx, final tgd tgd, final asid asid, final fet fet, final Resources resources, final zmf zmf, final eg eg, final vaf vaf, final mdp mdp, final atke atke, final Object o, final ewp ewp, final Executor executor) {
        return new hzj(vqx, tgd, asid, fet, resources, zmf, eg, vaf, mdp, atke, (GuideControllerImpl$WatchWhileLifecycleObserver)o, ewp, executor, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static hzw o(final Activity activity, final vwa vwa, final e e, final Executor executor, final zmf zmf) {
        return new hzw(activity, vwa, e, executor, zmf, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static hzn p() {
        return new hzn((int[])null);
    }
    
    public static e q(final elx elx, final wyw wyw, final vcy vcy, final tag tag) {
        return new e(elx, wyw, vcy, tag, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static hzd r(final vaf vaf, final arkg arkg, final aeea aeea) {
        return new hzd(vaf, arkg, aeea, null, null, null, null, null);
    }
    
    public static iab s(final Context context, final atke atke, final acps acps, final atke atke2, final aeea aeea, final vzf vzf, final wfi wfi, final abrj abrj, final xib xib, final ashy ashy, final omw omw, final acdp acdp, final vai vai, final oug oug, final atke atke3) {
        return new iab(context, atke, acps, atke2, aeea, vzf, wfi, abrj, xib, ashy, omw, acdp, vai, oug, atke3, null, null, null, null, null, null);
    }
    
    public static ibj t(final gbp gbp, final Context context, final xhy xhy, final xhv xhv, final wyv wyv, final aeea aeea, final liq liq, final xnt xnt, final xfl xfl, final xnj xnj, final abpu abpu, final vcy vcy, final ggr ggr) {
        return new ibj(gbp, context, xhy, xhv, wyv, aeea, liq, xnt, xfl, xnj, abpu, vcy, ggr, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static iae u(final asid asid, final qv qv, final iab iab, final wbj wbj, final vcy vcy, final aeea aeea, final tgd tgd, final asht asht, final abpu abpu, final wyw wyw, final xib xib) {
        return new iae(asid, qv, iab, wbj, vcy, aeea, tgd, asht, abpu, wyw, xib, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static iav v(final xbv xbv, final arwh arwh, final msr msr, final asid asid, final aeea aeea, final Context context, final xbt xbt) {
        return new iav(xbv, arwh, msr, asid, aeea, context, xbt, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Object a() {
        throw null;
    }
}
