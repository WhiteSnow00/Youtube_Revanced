import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbs implements arjd
{
    public static tku b(final atjj atjj) {
        final tku a = fbr.a(atjj);
        a.getClass();
        return a;
    }
    
    public static fbt c(final tmd tmd) {
        return new fbt(tmd);
    }
    
    public static tal d(final atjj atjj, final tlq tlq, final atjj atjj2, final tme tme, final asho asho, final tlu tlu, final tra tra, final tmd tmd) {
        final int b = tlq.b(tlq.T);
        Object o;
        if (b == 1) {
            o = new tar(atjj, (tao)atjj2.a(), tme.f().c((asjc)new flh(tlq, tlu, asho, 1)), tra, tmd);
        }
        else if (b == 2) {
            final tao tao = (tao)atjj2.a();
            final ArrayList list = new ArrayList();
            if (tlq.m(tlq.ap)) {
                list.add(((ashe)tlu.f).W((asjc)exl.d).z().J((asjd)exd.f).W((asjc)exl.e).ax());
            }
            list.add(((ashe)tlu.f).W((asjc)exl.f).z().J((asjd)exd.g).W((asjc)exl.g).ax());
            list.add(tme.f().J((asjc)exl.h).T((long)tlq.b(tlq.an), TimeUnit.SECONDS, asho, (ashs)ashp.I((Object)fbu.b)).E((asjc)new fdk(tlq, asho, 1)));
            o = new tar(atjj, tao, ashp.l((Iterable)list).B((asix)ezm.e).e().D(), tra, tmd);
        }
        else {
            o = atjj.a();
        }
        ((tar)o).getClass();
        return (tal)o;
    }
    
    public static tan e(final atjj atjj, final tlq tlq) {
        tan a;
        if (tlq.m(tlq.aq)) {
            a = (tan)atjj.a();
        }
        else {
            a = tan.a;
        }
        a.getClass();
        return a;
    }
    
    public static tao f(taz taz, final atjj atjj, final tlq tlq) {
        if (tlq.m(tlq.ao)) {
            taz = (taz)atjj.a();
        }
        taz.getClass();
        return (tao)taz;
    }
    
    public static fbv g(final shw shw, final tdz tdz, final bu bu, final wwu wwu, final abno abno, final Executor executor) {
        return new fbv(shw, tdz, bu, wwu, abno, executor);
    }
    
    public static fce h(final Context context, final vax vax) {
        return new fce(context, vax, 0);
    }
    
    public static fcg i(final arhr arhr, final arhr arhr2, final vbq vbq, final zki zki, final asho asho, final vax vax) {
        return new fcg(arhr, arhr2, vbq, zki, asho, vax);
    }
    
    public static fce j(final bu bu, final atjj atjj) {
        return new fce(bu, atjj, 1);
    }
    
    public static eyv k(final bu bu, final vmt vmt, final tny tny) {
        return new eyv(bu, vmt, tny, 3);
    }
    
    public static eyu l(final atjj atjj) {
        return new eyu(atjj, 7);
    }
    
    public static eyu m(final atjj atjj) {
        return new eyu(atjj, 8);
    }
    
    public static fce n(final atjj atjj, final hnj hnj) {
        return new fce(atjj, hnj, 2);
    }
    
    public static eyu o(final rgs rgs) {
        return new eyu(rgs, 9);
    }
    
    public static eyu p(final uvc uvc) {
        return new eyu(uvc, 10);
    }
    
    public static ezp q() {
        return new ezp();
    }
    
    public static fbk r(final tku tku, final Object o, final fzo fzo, final atjj atjj) {
        return new fbk(tku, (avt)o, fzo, atjj, null, null, null);
    }
    
    public static gnl s(final Object o, final vwb vwb, final fax fax, final Activity activity, final rmw rmw, final uyi uyi, final tdg tdg, final gem gem) {
        return new gnl((hyc)o, vwb, fax, activity, rmw, uyi, tdg, gem, 1, null, null, null, null);
    }
    
    public static fcu t(final aum aum, final vax vax, final acyh acyh, final wuu wuu, final asho asho, final aaal aaal, final tku tku, final addr addr, final asho asho2, final abiv abiv) {
        return new fcu(aum, vax, acyh, wuu, asho, aaal, tku, addr, asho2, abiv, null, null, null);
    }
    
    public static fbw u(final Context context, final vax vax, final aeby aeby, final aeby aeby2) {
        return new fbw(context, vax, aeby, aeby2, 0, null, null, null, null);
    }
    
    public static fch v(final Activity activity, final vax vax, final tdz tdz, final aeby aeby, final aeby aeby2) {
        return new fch(activity, vax, tdz, aeby, aeby2, 1, null, null, null, null);
    }
}
