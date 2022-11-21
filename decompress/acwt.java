import java.util.concurrent.Executor;
import j$.util.Optional;
import java.util.concurrent.ExecutorService;
import android.content.Context;
import java.util.Map;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwt implements arom
{
    public static acxo b(final Activity activity, final Map map) {
        final acxo acxo = (acxo)map.get(activity.getClass()).a();
        acxo.getClass();
        return acxo;
    }
    
    public static acyq c(final Context context, final znq znq) {
        return new acyq(context, znq);
    }
    
    public static tkf d(final tkh tkh, final tju tju, final ExecutorService executorService, final ExecutorService executorService2, final ExecutorService executorService3, final tov tov) {
        final long e = tov.e(tov.T);
        final dbo dbo = new dbo();
        final tkg a = tkg.a(tju, (zct)null);
        final long e2 = tov.e(tov.T);
        Optional optional;
        if ((0x40000L & e2) != 0x0L) {
            optional = Optional.of((Object)executorService2);
        }
        else if ((e2 & 0x80000L) != 0x0L) {
            optional = Optional.of((Object)executorService3);
        }
        else {
            optional = Optional.empty();
        }
        Optional optional2;
        if ((e & 0x100000L) != 0x0L) {
            optional2 = Optional.of((Object)executorService);
        }
        else {
            optional2 = Optional.empty();
        }
        final tkf c = tkh.c((dba)dbo, a, (aefs)null, "suggest", optional, optional2, (Executor)afwd.a);
        c.getClass();
        return c;
    }
    
    public static addc e(final Activity activity) {
        return new addc(activity);
    }
    
    public static addh f(final veh veh, final Executor executor, final vqe vqe, final cl cl, final xaa xaa, final atnb atnb) {
        return new addh(veh, executor, vqe, cl, xaa, atnb);
    }
    
    public static adfi g(final atnb atnb) {
        return new adfi(atnb);
    }
    
    public static hlu h(final acxk acxk, final xaa xaa, final acya acya) {
        return new hlu(acxk, xaa, acya, 19);
    }
    
    public static abbe i(final thg thg) {
        return new abbe(thg, 7);
    }
    
    public static abbe j(final thg thg) {
        return new abbe(thg, 8, (byte[])null);
    }
    
    public static zsl k(final atnb atnb, final atnb atnb2, final vbo vbo) {
        return new zsl(atnb, atnb2, vbo, 2);
    }
    
    public static agjn l(final vbo vbo) {
        return new agjn(vbo);
    }
    
    public static kkq m() {
        return new kkq((byte[])null);
    }
    
    public static adfe n() {
        return new adfe();
    }
    
    public static acyz o(final atnb atnb, final vey vey, final acoe acoe, final xbu xbu, final tre tre, final vbs vbs, final oco oco) {
        return new acyz(atnb, vey, acoe, xbu, tre, vbs, oco, null);
    }
    
    public static adfe p() {
        return new adfe();
    }
    
    public static acws q() {
        return new acws();
    }
    
    public static agnl r(final Executor executor) {
        return new agnl(executor);
    }
    
    public static adde s(final aheu aheu, final aheu aheu2, final aheu aheu3) {
        return new adde(aheu, aheu2, aheu3, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static acyg t(final aapu aapu, final veh veh, final xaa xaa) {
        return new acyg(aapu, veh, xaa, null, null, null, null);
    }
    
    public static acya u(final acyg acyg, final aefs aefs, final adgg adgg) {
        return new acya(acyg, aefs, adgg, null, null, null, null);
    }
    
    @Override
    public final Object a() {
        throw null;
    }
}
