import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;
import android.content.Context;
import android.app.Activity;
import java.util.Map;
import com.google.android.apps.youtube.app.common.playervideoviewlayoutdelegate.PlayerVideoViewLayoutDelegateController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqj implements arjd
{
    public static abbp b(final bu bu) {
        return (abbp)kum.aQ(bu, "AUTO_TRANSLATE_SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
    }
    
    public static abbp c(final bu bu) {
        return (abbp)kum.aQ(bu, "SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
    }
    
    public static abbo d(final bu bu, final abno abno, final ish ish, final abbp abbp) {
        return new abbo(bu, abno, (abbm)ish, abbp);
    }
    
    public static hkp e(final ftc ftc, final abno abno) {
        return new hkp(ftc, abno);
    }
    
    public static abno f(final abns abns) {
        final abno o = abns.o();
        o.getClass();
        return o;
    }
    
    public static abrx g(final vhg vhg, final abns abns) {
        return new abrx(vhg, abns);
    }
    
    public static abbp h(final bu bu) {
        return (abbp)kum.aQ(bu, "AUTO_TRANSLATE_SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
    }
    
    public static abbp i(final bu bu) {
        return (abbp)kum.aQ(bu, "SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
    }
    
    public static abbo j(final bu bu, final abno abno, final ish ish, final abbp abbp) {
        return new abbo(bu, abno, (abbm)ish, abbp);
    }
    
    public static tku k(final atjj atjj, final atjj atjj2, final uyf uyf) {
        amhi amhi;
        if ((amhi = uyf.b().m) == null) {
            amhi = amhi.a;
        }
        anoq anoq;
        if ((anoq = amhi.f) == null) {
            anoq = anoq.a;
        }
        tku tku;
        if (anoq.d) {
            tku = (tku)atjj2.a();
        }
        else {
            tku = (tku)atjj.a();
        }
        tku.getClass();
        return tku;
    }
    
    public static PlayerVideoViewLayoutDelegateController l(final iqi iqi, final fjp fjp, final geu geu, final lhe lhe) {
        return new PlayerVideoViewLayoutDelegateController(iqi, fjp, geu, lhe);
    }
    
    public static fqr m() {
        return new fqr();
    }
    
    public static fjp n(final atjj atjj, final atjj atjj2, final Map map, final Activity activity) {
        Object o;
        if (map.containsKey(activity.getClass())) {
            o = atjj.a();
        }
        else {
            o = atjj2.a();
        }
        final fjp fjp = (fjp)o;
        fjp.getClass();
        return fjp;
    }
    
    public static tbd o(final Context context, final String c, final atjj atjj, final aftr aftr, final qbo qbo, final atjj atjj2) {
        final fqo a = fqo.a;
        final qos d = qou.d(context, (Executor)aftr);
        d.b();
        d.c = c;
        d.d((String[])((afci)fqp.a).toArray(new String[0]));
        d.e((qot)new fqm(a, 0));
        final qou a2 = d.a();
        final qoq a3 = qor.a();
        a3.f(fqp.a(context));
        a3.e((MessageLite)a);
        a3.b((qon)a2);
        final tkv d2 = tkw.d(atjj, aftr);
        d2.a = bbt.r;
        d2.b((aexg)fna.f);
        d2.b = fna.g;
        d2.c = (tad)fnb.e;
        a3.b((qon)d2.a());
        return ((auip)atjj2.a()).bK(qan.h(qbo.D(a3.a())), (MessageLite)fqo.a);
    }
    
    public static tkx p(final van van, final zki zki) {
        final fqo a = fqo.a;
        return van.e((aexg)new etw(a, zki, 5), (tad)fnb.f, (MessageLite)a);
    }
    
    public static bhu q(final tku tku) {
        return new bhu(tku);
    }
    
    public static ish r(final Context context, final bu bu, final abno abno, final abbp abbp, final abbp abbp2, final aja aja, final ftc ftc, final uyi uyi) {
        return new ish(context, bu, abno, abbp, abbp2, aja, (ftd)new fqi(ftc), uyi, (byte[])null, (byte[])null);
    }
    
    public static ish s(final Context context, final bu bu, final abno abno, final abbp abbp, final abbp abbp2, final aja aja, final hkp hkp, final uyi uyi) {
        return new ish(context, bu, abno, abbp, abbp2, aja, (ftd)hkp, uyi, (byte[])null, (byte[])null);
    }
    
    public static ftc t(final cxz cxz) {
        return (ftc)cxz.I("/youtube/app/immersive_live_more_menu/");
    }
    
    public static frc u(final Context context, final Executor executor, final zjr zjr, final osb osb, final aeby aeby) {
        return new frc(executor, aeby, null, null);
    }
    
    public static gmy v(final Context context, final abno abno, final ira ira, final wwu wwu, final ish ish, final aeby aeby) {
        return new gmy(context, abno, ira, wwu, ish, aeby, (byte[])null, (byte[])null, (byte[])null);
    }
}
