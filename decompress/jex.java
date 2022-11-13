import java.util.concurrent.Executor;
import android.net.Uri;
import com.google.protobuf.MessageLite;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.app.Activity;
import android.graphics.Typeface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jex implements arls
{
    public static jew b(final bu bu, final zmf zmf, final zmt zmt, final tqd tqd) {
        return new jew(bu, zmf, zmt, tqd);
    }
    
    public static jgm c(final iiu iiu) {
        return new jgm(iiu);
    }
    
    public static jjg d(final Context context, final Object o, final Object o2, final Object o3) {
        return new jjg(context, (lkx)o, (lkx)o2, (lkx)o3, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static jjw e(final Context context, final acpk acpk, final Typeface typeface) {
        return new jjw(context, acpk, typeface);
    }
    
    public static jke f(final Context context, final acpk acpk, final Typeface typeface) {
        return new jke(context, acpk, typeface);
    }
    
    public static vcy g(final jnl jnl, final wyv wyv) {
        return (vcy)new wyx((vcy)jnl, wyv);
    }
    
    public static vcy h(final jnl jnl, final wyv wyv) {
        return (vcy)new wyx((vcy)jnl, wyv);
    }
    
    public static ViewGroup i(final Activity activity) {
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)activity).inflate(2131624909, (ViewGroup)null);
        viewGroup.getClass();
        return viewGroup;
    }
    
    public static hln j(final bu bu, final zmf zmf, final zlv zlv) {
        return new hln(bu, zmf, zlv, 4);
    }
    
    public static gpx k(final wxx wxx, final wyv wyv) {
        return new gpx(wxx, wyv, 13);
    }
    
    public static abkx l(final hyx hyx) {
        return (abkx)new jev(hyx, 0, null);
    }
    
    public static tmx m(final Context context, final qcy qcy) {
        final qoa a = qob.a(context);
        a.e("voiceconsentsnackbarimpressions");
        a.f("voice_consent_snackbar_impressions.pb");
        final Uri a2 = a.a();
        final qpz a3 = qqa.a();
        a3.e((MessageLite)jmw.a);
        a3.g(false);
        a3.f(a2);
        return (tmx)new tmv(nns.o(qcy.C(a3.a())), (MessageLite)jmw.a);
    }
    
    public static tmx n(final Context context, final qcy qcy) {
        final qoa a = qob.a(context);
        a.e("voicefeaturesettings");
        a.f("voice_feature_settings.pb");
        final Uri a2 = a.a();
        final qpz a3 = qqa.a();
        a3.e((MessageLite)jmx.a);
        a3.g(false);
        a3.f(a2);
        return (tmx)new tmv(nns.o(qcy.C(a3.a())), (MessageLite)jmx.a);
    }
    
    public static lmo o(final Activity activity, final zmf zmf, final zmt zmt, final vwa vwa, final tqd tqd, final tgd tgd, final vcy vcy, final Executor executor) {
        return new lmo(activity, zmf, zmt, vwa, tqd, tgd, vcy, executor, (byte[])null, (byte[])null);
    }
    
    public static vad p(final atke atke, final acya acya) {
        return new vad(atke, acya);
    }
    
    public static pvh q(final bu bu) {
        return new pvh(bu);
    }
    
    public static bx r(final aeqe aeqe) {
        final bx ae = ((jlp)((arlm)aeqe.a()).aR()).Ae();
        ae.getClass();
        return ae;
    }
    
    public static bx s() {
        return new bx((Class)jim.class);
    }
    
    public static ghf t(final fa fa, final msr msr, final ViewGroup viewGroup, final fzw fzw) {
        return (ghf)new hyk(fa, msr, (ViewGroup)viewGroup.findViewById(2131431398), fzw, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static jjo u(final Context context, final acpk acpk, final acgs acgs, final Typeface typeface, final aeea aeea) {
        return new jjo(context, acpk, acgs, typeface, aeea, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static jlr v(final arwh arwh, final Context context, final atke atke, final aeea aeea, final vai vai) {
        return new jlr(arwh, context, atke, aeea, vai, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Object a() {
        throw null;
    }
}
