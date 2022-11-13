import j$.util.Optional;
import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import android.content.Context;
import android.app.Activity;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxp implements arls
{
    public static hxo b(final vai vai, final arkg arkg, final arkg arkg2) {
        return new hxo(vai, arkg, arkg2);
    }
    
    public static void c(final wyw wyw) {
        wyw.getClass();
    }
    
    public static wyv d(final wyw wyw, final Map map, final Activity activity) {
        Object o;
        if (map.containsKey(activity.getClass())) {
            o = map.get(activity.getClass()).a();
        }
        else {
            o = new hyl(wyw, 0);
        }
        ((wyv)o).getClass();
        return (wyv)o;
    }
    
    public static acpk e(final Context context, final acpk acpk) {
        return (acpk)new gfl(context, acpk);
    }
    
    public static acpk f(final aeqe aeqe) {
        final acpk ak = ((hym)((arlm)aeqe.a()).aR()).aK();
        ak.getClass();
        return ak;
    }
    
    public static wyv g(final aeqe aeqe) {
        final wyv ay = ((hym)((arlm)aeqe.a()).aR()).ay();
        ay.getClass();
        return ay;
    }
    
    public static hyn h(final Context context, final atke atke, final vaf vaf) {
        return new hyn(context, atke, vaf);
    }
    
    public static hyx i(final tcq tcq, final wxx wxx, final oby oby, final vai vai) {
        return new hyx(tcq, wxx, oby, vai);
    }
    
    public static vlb j() {
        return new vlb(1);
    }
    
    public static gpx k(final Activity activity, final gkx gkx) {
        return new gpx(activity, gkx, 8);
    }
    
    public static hyt l(final tgd tgd) {
        return new hyt(tgd, 3, (byte[])null);
    }
    
    public static gpx m(final atke atke, final atke atke2) {
        return new gpx(atke, atke2, 9);
    }
    
    public static vnw n(final arkg arkg, final vaf vaf) {
        return new vnw(arkg, vaf, 1);
    }
    
    public static hzn o() {
        return iaj.a();
    }
    
    public static hzn p(final trt trt, final ashi ashi, final arwh arwh) {
        return new hzn(trt, ashi, arwh, null, null);
    }
    
    public static hyr q(final vwa vwa) {
        return new hyr(vwa, null, null, null);
    }
    
    public static hyy r(final Context context, final atke atke, final atke atke2, final atke atke3, final top top, final atke atke4, final hyx hyx, final msr msr, final tnu tnu, final wxx wxx, final oby oby, final vai vai) {
        return new hyy(context, atke, atke2, atke3, top, atke4, hyx, msr, tnu, wxx, oby, vai, null, null, null);
    }
    
    public static hzc s(final atke atke, final oby oby, final fzw fzw, final vaf vaf, final arwh arwh, final atke atke2, final atke atke3, final atke atke4, final Executor executor, final Executor executor2, final asid asid, final ScheduledExecutorService scheduledExecutorService, final jki jki, final blu blu, final vai vai, final tnu tnu, final atke atke5, final atke atke6) {
        return new hzc(atke, oby, fzw, vaf, arwh, atke2, atke3, atke4, executor, executor2, asid, scheduledExecutorService, jki, blu, vai, tnu, atke5, atke6, null, null, null, null);
    }
    
    public static gbu t(final gbc gbc, final Handler handler, final ziy ziy, final vai vai) {
        return (gbu)new gbf(Optional.empty(), Optional.empty(), gbc, handler, ziy, vai, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static blu u(final skt skt, final fmr fmr, final fzw fzw, final ajb ajb, final hzn hzn) {
        return new blu(skt, fmr, fzw, ajb, hzn, null, null, null, null, null, null);
    }
    
    public final Object a() {
        throw null;
    }
}
