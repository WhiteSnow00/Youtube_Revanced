import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;
import j$.util.Optional;
import java.util.concurrent.ExecutorService;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achk implements arom
{
    public static acia b(final Context context) {
        return new acia(context);
    }
    
    public static dba c(final Context context) {
        final File file = new File(context.getCacheDir(), "glide_disk_cache");
        Object o;
        if (!file.isDirectory() && !file.mkdirs()) {
            o = new dbo();
        }
        else {
            o = new tnm(file, 262144000);
            ((dba)o).c();
        }
        return (dba)o;
    }
    
    public static tkf d(final tkh tkh, final dba dba, final tju tju, final ExecutorService executorService, final ExecutorService executorService2, final ExecutorService executorService3, final atnb atnb, final atnb atnb2, final tov tov) {
        Optional optional;
        Optional optional2;
        if ((boolean)false) {
            final Optional of = Optional.of((Object)executorService2);
            final Optional of2 = Optional.of((Object)executorService);
            optional = of;
            optional2 = of2;
        }
        else {
            final long e = tov.e(tov.T);
            Optional optional3;
            if ((0x8000L & e) != 0x0L) {
                optional3 = Optional.of((Object)executorService2);
            }
            else if ((0x10000L & e) != 0x0L) {
                optional3 = Optional.of((Object)executorService3);
            }
            else if ((e & 0x10000000L) != 0x0L) {
                optional3 = Optional.of((Object)atnb2.a());
            }
            else {
                optional3 = Optional.empty();
            }
            final long e2 = tov.e(tov.T);
            Optional optional4;
            if ((0x20000L & e2) != 0x0L) {
                optional4 = Optional.of((Object)executorService);
            }
            else if ((e2 & 0x8000000L) != 0x0L) {
                optional4 = Optional.of((Object)atnb.a());
            }
            else {
                optional4 = Optional.empty();
            }
            final Optional optional5 = optional4;
            optional = optional3;
            optional2 = optional5;
        }
        final tkf c = tkh.c(dba, tkg.a(tju, (zct)null), (aefs)null, "glide-http-request-queue", optional, optional2, (Executor)afwd.a);
        c.getClass();
        return c;
    }
    
    public static acjq e(final atnb atnb, final afbh afbh, final afbh afbh2, final atnb atnb2) {
        return new acjq(atnb, afbh, afbh2, atnb2);
    }
    
    public static Context f(final Map map, final atnb atnb, final Activity activity) {
        final Context context = (Context)((atnb)afbh.j(map.get(activity.getClass())).e(atnb)).a();
        context.getClass();
        return context;
    }
    
    public static Context g(final Map map, final atnb atnb, final Activity activity) {
        final Context context = (Context)((atnb)afbh.j(map.get(activity.getClass())).e(atnb)).a();
        context.getClass();
        return context;
    }
    
    public static acno h(final arna arna) {
        return new acno(arna);
    }
    
    public static acvb i(final atnb atnb, final atnb atnb2) {
        return new acvb(atnb, atnb2, 0);
    }
    
    public static acve j(final oco oco, final arna arna, final zoa zoa) {
        return new acve(oco, arna, zoa);
    }
    
    public static fcd k(final vey vey, final zoa zoa, final askz askz, final veh veh) {
        return new fcd(vey, zoa, askz, veh, 20);
    }
    
    public static khi l(final Context context) {
        return new khi(context, 4, (byte[])null);
    }
    
    public static kex m(final Context context, final xax xax, final acup acup) {
        return new kex(context, xax, acup, 5);
    }
    
    public static kex n(final Context context, final xax xax, final acva acva) {
        return new kex(context, xax, acva, 6);
    }
    
    public static acjq o(final atnb atnb, final atnb atnb2, final atnb atnb3, final atnb atnb4, final Map map, final Map map2, final Map map3, final Map map4) {
        final acjq acjq = new acjq();
        ((agop)acjq.d).y(atnb);
        ((agop)acjq.c).y(atnb2);
        ((agop)acjq.b).y(atnb3);
        ((agop)acjq.a).y(atnb4);
        ((agop)acjq.d).x(map);
        ((agop)acjq.c).x(map2);
        ((agop)acjq.b).x(map3);
        ((agop)acjq.a).x(map4);
        return acjq;
    }
    
    public static acmy p(final acjq acjq) {
        return new acmy(acjq, null, null, null);
    }
    
    public static agnl q(final acoe acoe) {
        return new agnl(acoe, null);
    }
    
    public static achj r(final vey vey, final zoa zoa, final askz askz, final aheu aheu, final veh veh) {
        return new achj(vey, zoa, askz, aheu, veh, null, null, null, null);
    }
    
    public static tbk s(final aheu aheu, final veh veh) {
        return new tbk(aheu, veh, 17, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static aheu t(final acjq acjq) {
        return new aheu(acjq, (byte[])null);
    }
    
    public static fdg u(final aheu aheu, final vxu vxu, final zoa zoa, final veh veh, final Executor executor, final vey vey) {
        return new fdg(aheu, vxu, zoa, veh, executor, vey, 6, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static aefs v(final adiy adiy) {
        return new aefs(adiy);
    }
    
    @Override
    public final Object a() {
        throw null;
    }
}
