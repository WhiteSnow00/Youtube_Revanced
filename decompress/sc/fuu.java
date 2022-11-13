import j$.util.Optional;
import android.net.Uri;
import com.google.protobuf.MessageLite;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import java.util.Map;
import android.app.Activity;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.common.tvfilm.RentalActivationOverlay;
import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fuu implements arls
{
    public static SubscriptionNotificationOptionsDialogFragmentControllerImpl b(final bu bu, final zmf zmf, final zlv zlv) {
        return new SubscriptionNotificationOptionsDialogFragmentControllerImpl(bu, zmf, zlv);
    }
    
    public static fwz c(final oby oby, final fjv fjv, final abpu abpu, final fxw fxw) {
        return new fwz(oby, fjv, new Handler(), abpu, fxw);
    }
    
    public static fxs d(final tjb tjb, final atke atke) {
        return new fxs(tjb, atke);
    }
    
    public static RentalActivationOverlay e(final Context context, final fjv fjv) {
        return new RentalActivationOverlay(context, fjv);
    }
    
    public static fzb f(final fjv fjv, final vcy vcy, final Handler handler, final Executor executor, final oby oby, final fxw fxw, final vai vai, final atke atke) {
        return new fzb(fjv, vcy, handler, executor, oby, fxw, vai, atke);
    }
    
    public static fzg g(final fa fa) {
        return new fzg(fa);
    }
    
    public static gbc h(final Activity activity, final Map map, atke atke) {
        final atke atke2 = map.get(activity.getClass());
        if (atke2 != null) {
            atke = atke2;
        }
        final gbc gbc = (gbc)atke.a();
        gbc.getClass();
        return gbc;
    }
    
    public static gbp i(final gbc gbc, final Handler handler, final acgs acgs, final Context context, final vai vai) {
        return new gbp(gbc, handler, acgs, context, vai);
    }
    
    public static MealbarPromoController j(final aeqe aeqe) {
        final MealbarPromoController p = ((gbs)((arlm)aeqe.a()).aR()).p();
        p.getClass();
        return p;
    }
    
    public static fuw k(final Context context) {
        return new fuw(context, 1);
    }
    
    public static fzw l(final atke atke, final oby oby) {
        return new fzw(atke, oby);
    }
    
    public static tmx m(final Context context, final String c, final afvs afvs, final qcy qcy) {
        final String[] a = fvv.a;
        final qoa a2 = qob.a(context);
        a2.e("restorecontext");
        a2.f("restore_context.pb");
        final Uri a3 = a2.a();
        final qpz a4 = qqa.a();
        a4.e((MessageLite)fvy.a);
        a4.f(a3);
        final qqb d = qqd.d(context, (Executor)afvs);
        d.c = c;
        d.b();
        d.d(fvv.a);
        d.e((qqc)fnj.c);
        a4.b((qpw)d.a());
        return (tmx)new tmv(nns.o(qcy.C(a4.a())), (MessageLite)fvy.a);
    }
    
    public static fug n(final blu blu, final Context context, final vai vai) {
        return new fug(blu, context, vai, 3, null, null);
    }
    
    public static cya o(final qqr qqr) {
        return new cya(qqr);
    }
    
    public static cya p(final tmx tmx) {
        return new cya(tmx);
    }
    
    public static gbh q(final gbc gbc, final Handler handler, final atke atke, final wyv wyv, final aekp aekp) {
        return new gbh(gbc, handler, atke, wyv, aekp, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static hyx r(final vcy vcy, final wyv wyv, final actt actt, final oiu oiu) {
        return new hyx(vcy, wyv, actt, oiu);
    }
    
    public static hyx s(final adei adei, final zmf zmf, final vwa vwa, final cya cya) {
        return new hyx(adei, zmf, vwa, cya, null, null, null, null, null);
    }
    
    public static MealbarPromoController t(final Context context, final wyw wyw, final acvy acvy, final Object o, final hyx hyx, final tgd tgd, final abpu abpu, final ziy ziy, final fjv fjv, final actt actt, final heo heo, final hyx hyx2) {
        return new MealbarPromoController(context, wyw, acvy, (eg)o, hyx, tgd, abpu, ziy, fjv, actt, heo, hyx2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static gbu u(final Context context, final hzn hzn, final gbc gbc, final Handler handler, final ziy ziy, final vai vai) {
        return (gbu)new gbf(Optional.of((Object)context), Optional.of((Object)hzn), gbc, handler, ziy, vai, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static fzw v(final hzn hzn, final cyb cyb) {
        return new fzw(hzn, cyb, null, null, null, null, null);
    }
    
    public final Object a() {
        throw null;
    }
}
