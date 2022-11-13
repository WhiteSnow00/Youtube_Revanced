import android.content.SharedPreferences;
import java.util.Set;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.android.apps.youtube.app.common.csi.WatchUiActionLatencyLogger;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.datasaving.DefaultNetworkDataUsageMonitor;
import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerViewModeMonitor;
import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerResponseMonitor;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gku implements arls
{
    public static gkt b(final otk otk) {
        return new gks(otk);
    }
    
    public static Context c(final Activity activity, final gkx gkx, final vai vai) {
        return fal.m(activity, gkx, vai);
    }
    
    public static TooltipPlayerResponseMonitor d(final acwn acwn, final abpu abpu) {
        return new TooltipPlayerResponseMonitor(acwn, abpu);
    }
    
    public static TooltipPlayerViewModeMonitor e(final acwt acwt, final fjv fjv) {
        return new TooltipPlayerViewModeMonitor(acwt, fjv);
    }
    
    public static glg f(final szk szk, final oiy oiy, final arkg arkg, final wyw wyw, final acwt acwt, final geu geu) {
        return new glg(szk, oiy, arkg, wyw, acwt, geu);
    }
    
    public static gmc g(final Context context, final vaf vaf) {
        return new gmc(context, vaf);
    }
    
    public static DefaultNetworkDataUsageMonitor h(final Context context, final tmx tmx, final vai vai, final aemf aemf) {
        return new DefaultNetworkDataUsageMonitor(context, tmx, vai, aemf);
    }
    
    public static gnr i(final Context context, final vwa vwa, final vcy vcy, final Executor executor, final acgs acgs, final wyv wyv, final zmf zmf, final tag tag) {
        return new gnr(context, vwa, vcy, executor, acgs, wyv, zmf, tag, 0, null, null);
    }
    
    public static cya j() {
        return new cya((int[])null);
    }
    
    public static gnc k(final Activity activity, final tgd tgd, final fan fan, final c c, final fgt fgt, final WatchUiActionLatencyLogger watchUiActionLatencyLogger, final arwh arwh, final tnu tnu, final agnt agnt) {
        return new gnc(activity, tgd, fan, c, fgt, watchUiActionLatencyLogger, arwh, tnu, agnt, null, null, null, null);
    }
    
    public static gmi l(final twt twt, final abpu abpu, final fam fam, final fjv fjv, final Executor executor, final asid asid, final vlq vlq, final qv qv, final msr msr, final vai vai) {
        return new gmi(twt, abpu, fam, fjv, executor, asid, vlq, qv, msr, vai, null, null, null, null);
    }
    
    public static hox m(final Activity activity, final asht asht, final msr msr, final jki jki) {
        return new hox(activity, asht, msr, jki, null, null, null);
    }
    
    public static qcy n(final bu bu, final vnu vnu, final wyv wyv, final tqd tqd, final vcy vcy, final sxr sxr, final Executor executor) {
        return new qcy(bu, vnu, wyv, tqd, vcy, sxr, executor);
    }
    
    public static gnp o(final Object o, final Executor executor, final Executor executor2, final fln fln, final e e, final heo heo) {
        return new gnp((gnc)o, executor, executor2, fln, e, heo, null, null, null, null, null);
    }
    
    public static gnq p(final bx bx) {
        return new gnq(bx, 0, null, null, null);
    }
    
    public static gnq q(final bx bx) {
        return new gnq(bx, 1, null, null, null);
    }
    
    public static fzw r(final vcy vcy, final Set set) {
        return new fzw(vcy, set);
    }
    
    public static fzw s(final SharedPreferences sharedPreferences, final oby oby) {
        return new fzw(sharedPreferences, oby);
    }
    
    public static gnb t(final bu bu, final vwa vwa, final tjm tjm, final skt skt, final Executor executor, final bx bx, final zlv zlv, final wyv wyv, final zmf zmf, final vai vai) {
        return new gnb(bu, vwa, tjm, skt, executor, bx, zlv, wyv, zmf, vai, null, null, null, null, null, null);
    }
    
    public static gmz u(final bu bu, final zmf zmf, final zmt zmt, final tqd tqd, final fzw fzw, final bx bx) {
        return new gmz(bu, zmf, zmt, tqd, fzw, bx, null, null, null, null);
    }
    
    public static gmk v(final Context context, final acpk acpk, final aeea aeea, final acnc acnc, final aeea aeea2, final fjv fjv) {
        return new gmk(context, acpk, aeea, acnc, aeea2, fjv, null, null, null, null);
    }
    
    public final Object a() {
        throw null;
    }
}
