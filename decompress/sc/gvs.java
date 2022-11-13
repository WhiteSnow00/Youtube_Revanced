import android.view.ContextThemeWrapper;
import java.util.Map;
import java.util.function.Supplier;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvs implements arls
{
    public static ViewGroup b(final ShortsCreationActivity shortsCreationActivity) {
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from((Context)shortsCreationActivity).inflate(2131625394, (ViewGroup)null).findViewById(2131427411);
        viewGroup.getClass();
        return viewGroup;
    }
    
    public static acof c() {
        return new acof((Supplier)fdi.h);
    }
    
    public static hcb d(final ShortsCreationActivity shortsCreationActivity) {
        return (hcb)shortsCreationActivity.d();
    }
    
    public static vcy e(final Map map, final vcy vcy) {
        final vgy g = vct.g();
        g.h(map);
        g.j(vcy);
        return (vcy)g.g();
    }
    
    public static cl f(final ShortsCreationActivity shortsCreationActivity) {
        return shortsCreationActivity.getSupportFragmentManager();
    }
    
    public static gwf g(final uve uve) {
        return new gwf(uve);
    }
    
    public static gxp h(final xao xao, final tjm tjm) {
        return new gxp(xao, tjm);
    }
    
    public static tye i(final tyf tyf, final ubu ubu, final ubg ubg) {
        return tyf.a(ubu, ubg);
    }
    
    public static fcl j(final bu bu, final abpq abpq, final abpq abpq2, final zmf zmf, final zlv zlv) {
        return new fcl(bu, abpq, abpq2, zmf, zlv, 9);
    }
    
    public static hzm k(final ubu ubu) {
        return new hzm(ubu);
    }
    
    public static ubu l(final Context context, final acmr acmr) {
        return new ubu(context, acmr, (byte[])null);
    }
    
    public static hxw m() {
        return new hxw();
    }
    
    public static uae n(final vbs vbs, final Map map) {
        return (uae)vbs.d(map);
    }
    
    public static jki o(final arwh arwh) {
        return new jki(arwh, (afaq)fkw.c, (byte[])null, (byte[])null);
    }
    
    public static Context p(final vwa vwa) {
        return vwa.C();
    }
    
    public static Context q(final vwa vwa, final gkx gkx) {
        Object c;
        if (gkx.a() == gkv.b) {
            c = vwa.C();
        }
        else if (((vai)vwa.a).aU() && ((vai)vwa.a).aV()) {
            c = new ContextThemeWrapper((Context)vwa.b, 2132083649);
        }
        else {
            c = new ContextThemeWrapper((Context)vwa.b, 2132083648);
        }
        return (Context)c;
    }
    
    public static fzw r(final ueu ueu) {
        return new fzw(ueu);
    }
    
    public static fzw s(final bu bu, final htk htk) {
        return new fzw(bu, htk, (byte[])null);
    }
    
    public static ubg t(final uqp uqp, final uqb uqb, final aujg aujg, final uay uay, final uau uau, final uas uas, final uaz uaz, final aujg aujg2) {
        return new ubg(uqp, uqb, aujg, uay, uau, uas, uaz, aujg2, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final Object a() {
        throw null;
    }
}
