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

public final class acey implements arjd
{
    public static daw b(final Context context) {
        final File file = new File(context.getCacheDir(), "glide_disk_cache");
        Object o;
        if (!file.isDirectory() && !file.mkdirs()) {
            o = new dbk();
        }
        else {
            o = new tkf(file, 262144000);
            ((daw)o).c();
        }
        return (daw)o;
    }
    
    public static acei c(final Context context) {
        return new acei(context);
    }
    
    public static tgw d(final tgy tgy, final daw daw, final tgl tgl, final ExecutorService executorService, final ExecutorService executorService2, final ExecutorService executorService3, final atjj atjj, final atjj atjj2, final tlq tlq) {
        Optional optional;
        Optional optional2;
        if ((boolean)false) {
            final Optional of = Optional.of((Object)executorService2);
            final Optional of2 = Optional.of((Object)executorService);
            optional = of;
            optional2 = of2;
        }
        else {
            final long e = tlq.e(tlq.S);
            Optional optional3;
            if ((0x8000L & e) != 0x0L) {
                optional3 = Optional.of((Object)executorService2);
            }
            else if ((0x10000L & e) != 0x0L) {
                optional3 = Optional.of((Object)executorService3);
            }
            else if ((e & 0x10000000L) != 0x0L) {
                optional3 = Optional.of((Object)atjj2.a());
            }
            else {
                optional3 = Optional.empty();
            }
            final long e2 = tlq.e(tlq.S);
            Optional optional4;
            if ((0x20000L & e2) != 0x0L) {
                optional4 = Optional.of((Object)executorService);
            }
            else if ((e2 & 0x8000000L) != 0x0L) {
                optional4 = Optional.of((Object)atjj.a());
            }
            else {
                optional4 = Optional.empty();
            }
            optional2 = optional4;
            optional = optional3;
        }
        final tgw c = tgy.c(daw, tgx.a(tgl, (yzf)null), (avt)null, "glide-http-request-queue", optional, optional2, (Executor)afsl.a);
        c.getClass();
        return c;
    }
    
    public static acga e(final atjj atjj, final aexq aexq, final aexq aexq2, final atjj atjj2) {
        return new acga(atjj, aexq, aexq2, atjj2);
    }
    
    public static Context f(final Map map, final atjj atjj, final Activity activity) {
        final Context context = (Context)((atjj)aexq.j(map.get(activity.getClass())).e(atjj)).a();
        context.getClass();
        return context;
    }
    
    public static Context g(final Map map, final atjj atjj, final Activity activity) {
        final Context context = (Context)((atjj)aexq.j(map.get(activity.getClass())).e(atjj)).a();
        context.getClass();
        return context;
    }
    
    public static acjy h(final arhr arhr) {
        return new acjy(arhr);
    }
    
    public static acrl i(final atjj atjj, final atjj atjj2) {
        return new acrl(atjj, atjj2, 0);
    }
    
    public static acro j(final oas oas, final arhr arhr, final zki zki) {
        return new acro(oas, arhr, zki);
    }
    
    public static actx k(final Activity activity, final Map map) {
        final actx actx = (actx)map.get(activity.getClass()).a();
        actx.getClass();
        return actx;
    }
    
    public static kfy l(final Context context) {
        return new kfy(context, 4, (byte[])null);
    }
    
    public static kdn m(final Context context, final wxs wxs, final acqz acqz) {
        return new kdn(context, wxs, acqz, 5);
    }
    
    public static kdn n(final Context context, final wxs wxs, final acrk acrk) {
        return new kdn(context, wxs, acrk, 6);
    }
    
    public static hkr o(final actt actt, final wwu wwu, final acuj acuj) {
        return new hkr(actt, wwu, acuj, 19);
    }
    
    public static acga p(final atjj atjj, final atjj atjj2, final atjj atjj3, final atjj atjj4, final Map map, final Map map2, final Map map3, final Map map4) {
        final acga acga = new acga();
        ((agkw)acga.c).u(atjj);
        ((agkw)acga.a).u(atjj2);
        ((agkw)acga.d).u(atjj3);
        ((agkw)acga.b).u(atjj4);
        ((agkw)acga.c).t(map);
        ((agkw)acga.a).t(map2);
        ((agkw)acga.d).t(map3);
        ((agkw)acga.b).t(map4);
        return acga;
    }
    
    public static acji q(final acga acga) {
        return new acji(acga, null);
    }
    
    public static agfu r(final uyf uyf) {
        return new agfu(uyf);
    }
    
    public static kjf s() {
        return new kjf((byte[])null);
    }
    
    public static agjt t(final acko acko) {
        return new agjt(acko, (byte[])null);
    }
    
    public static acuj u(final acup acup, final aeby aeby, final aeby aeby2) {
        return new acuj(acup, aeby, aeby2, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static aeby v(final adfg adfg) {
        return new aeby(adfg);
    }
}
