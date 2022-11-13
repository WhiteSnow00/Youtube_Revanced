import java.util.concurrent.Executor;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import android.app.Activity;
import java.util.Map;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htj implements arls
{
    public static ViewGroup b(final View view) {
        final ViewGroup viewGroup = (ViewGroup)view.findViewById(2131429712);
        viewGroup.getClass();
        return viewGroup;
    }
    
    public static vcy c(final Map map, final vcy vcy) {
        final vgy g = vct.g();
        g.h(map);
        g.j(vcy);
        return (vcy)g.g();
    }
    
    public static adeu d(final Activity activity) {
        final hud aa = ((huc)activity).aa;
        aa.getClass();
        return (adeu)aa;
    }
    
    public static View e(final EditVideoActivity editVideoActivity) {
        final View inflate = LayoutInflater.from((Context)editVideoActivity).inflate(2131624376, (ViewGroup)null);
        inflate.getClass();
        return inflate;
    }
    
    public static zhc f() {
        return (zhc)htv.a;
    }
    
    public static EditVideoActivity g(final Activity activity) {
        final EditVideoActivity editVideoActivity = (EditVideoActivity)activity;
        editVideoActivity.getClass();
        return editVideoActivity;
    }
    
    public static cl h(final EditVideoActivity editVideoActivity) {
        final cl supportFragmentManager = editVideoActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        return supportFragmentManager;
    }
    
    public static Drawable i(final EditVideoActivity editVideoActivity) {
        final Drawable cu = tpe.cu((Context)editVideoActivity, 2130970659);
        cu.getClass();
        return cu;
    }
    
    public static hue j(final Intent intent, final ucs ucs) {
        return new hue(intent, ucs);
    }
    
    public static faq k(final Activity activity, final Map map) {
        final atke atke = map.get(activity.getClass());
        activity.getClass().getName();
        atke.getClass();
        final faq faq = (faq)atke.a();
        faq.getClass();
        return faq;
    }
    
    public static cl l(final Activity activity, final Map map) {
        final atke atke = map.get(activity.getClass());
        activity.getClass().getName();
        atke.getClass();
        final cl cl = (cl)atke.a();
        cl.getClass();
        return cl;
    }
    
    public static gvh m(final htp htp) {
        return new gvh(htp, 15);
    }
    
    public static gvh n(final uwx uwx) {
        return new gvh(uwx, 16);
    }
    
    public static gvh o(final Object o) {
        return new gvh((huc)o, 17);
    }
    
    public static fec p() {
        return new fec(6);
    }
    
    public static hsu q(final Activity activity, final Executor executor, final zmf zmf, final adll adll, final adpp adpp, final vcy vcy, final acgs acgs, final acpk acpk, final wyv wyv) {
        return new hsu(activity, executor, zmf, adll, adpp, vcy, acgs, acpk, wyv, null);
    }
    
    public static hwo r() {
        return new hwo();
    }
    
    public static gvh s(final abrj abrj) {
        return new gvh(abrj, 18, null, null, null);
    }
    
    public static hto t(final ziy ziy, final vai vai) {
        return new hto(ziy, vai, null, null, null, null);
    }
    
    public static htk u(final ziy ziy, final asid asid, final msr msr) {
        return new htk(ziy, asid, msr, null, null, null);
    }
    
    public static hts v(final skt skt, final asid asid, final zhk zhk, final zaz zaz, final ziy ziy, final htq htq, final Executor executor, final faq faq, final fzg fzg, final cl cl, final aeea aeea) {
        return new hts(skt, asid, zhk, zaz, ziy, htq, executor, faq, fzg, cl, aeea, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Object a() {
        throw null;
    }
}
