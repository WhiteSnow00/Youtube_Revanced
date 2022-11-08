import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppa implements arjd
{
    public static ppb b(final Context context, final psz psz, final arhr arhr, final arhr arhr2, final plx plx, final arhr arhr3, final arhr arhr4, final arhr arhr5, final arhr arhr6, final arhr arhr7, final arhr arhr8, final arhr arhr9, final arhr arhr10, final arhr arhr11, final arhr arhr12) {
        return new ppb(context, psz, arhr, arhr2, plx, arhr3, arhr4, arhr5, arhr6, arhr7, arhr8, arhr9, arhr10, arhr11, arhr12);
    }
    
    public static ppc c(final poo poo, final plx plx) {
        return new ppc(poo, plx);
    }
    
    public static ppd d(final poo poo, final plx plx) {
        return new ppd(poo, plx);
    }
    
    public static ppe e(final poo poo) {
        return new ppe(poo);
    }
    
    public static pph f(final poo poo) {
        return new pph(poo);
    }
    
    public static ppj g(final poo poo, final plx plx) {
        return new ppj(poo, plx);
    }
    
    public static ppk h(final poo poo) {
        return new ppk(poo);
    }
    
    public static ppu i(final Context context, final pqj pqj) {
        return new ppu(context, pqj);
    }
    
    public static ppf j(final poo poo, final phy phy) {
        return new ppf(poo, phy, (byte[])null);
    }
    
    public static ppl k(final poj poj, final plu plu, final phy phy, final pof pof, final qbo qbo, final Set set, final oas oas) {
        return new ppl(poj, plu, phy, pof, qbo, set, oas, (byte[])null, (byte[])null);
    }
    
    public static ppm l(final poj poj, final plu plu, final qbo qbo, final oas oas) {
        return new ppm(poj, plu, qbo, oas, (byte[])null, (byte[])null);
    }
    
    public static pqw m() {
        return new pqw();
    }
    
    public static psp n(final pps pps, final qbo qbo) {
        return new psp(pps, qbo, 1, (byte[])null, (byte[])null);
    }
    
    public static cya o(final cya cya) {
        return new cya((eqv)cya.a);
    }
    
    public static ptb p(final blt blt, final ppd ppd) {
        return blt.C((psy)ppd, "CHIME_DELETE_USER_SUBSCRIPTION", 4);
    }
    
    public static ptb q(final blt blt, final ppc ppc) {
        return blt.C((psy)ppc, "CHIME_CREATE_USER_SUBSCRIPTION", 3);
    }
    
    public static ptb r(final blt blt, final ppe ppe) {
        return blt.C((psy)ppe, "CHIME_FETCH_LATEST_THREADS", 2);
    }
    
    public static ptb s(final blt blt, final ppf ppf) {
        return blt.C((psy)ppf, "CHIME_FETCH_UPDATED_THREADS", 2);
    }
    
    public static ptb t(final blt blt, final pph pph) {
        return blt.C((psy)pph, "CHIME_REMOVE_TARGET", 1);
    }
    
    public static ptb u(final blt blt, final ppd ppd) {
        return blt.C((psy)ppd, "CHIME_SET_USER_PREFERENCE", 6);
    }
    
    public static ptb v(final blt blt, final ppk ppk) {
        return blt.C((psy)ppk, "CHIME_STORE_TARGET", 1);
    }
}
