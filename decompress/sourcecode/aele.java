import android.app.Application;
import youtube.media.engine.api.MediaEngineAudioContainerRegistrar;
import java.util.Set;
import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aele implements arjd
{
    public static cmc b(final aexq aexq, final afts afts, final aeke aeke, final cnd b) {
        final cma cma = new cma();
        cma.a = (Executor)afts;
        cma.d = (cmy)new aeld(aeke, 0);
        cma.c = (Executor)afts;
        cma.b = b;
        final aekq aekq = (aekq)((aexw)aexq).a;
        if (aekq.a.h()) {
            cma.e = (String)aekq.a.c();
        }
        return cma.a();
    }
    
    public static aekm c(final Executor executor, final aexq aexq) {
        return new aekm(executor, 0);
    }
    
    public static cmc d() {
        throw new IllegalArgumentException("Do not directly use the WorkManager or Configuration types. See go/tiktok/dev/androidx/work.");
    }
    
    public static aely e(final br br, final aelv aelv, final Executor executor) {
        return (aely)new aems(br, aelv, executor);
    }
    
    public static aeoe f(final aexq aexq) {
        return adwd.aV(aexq, null);
    }
    
    public static qja g() {
        return (qja)aeoj.a;
    }
    
    public static qja h(final Context context) {
        return (qja)new aeok(context, 0);
    }
    
    public static aepq i(final aepp aepp) {
        return new aepq(aepp);
    }
    
    public static afqr j() {
        final afqq a = afqq.a;
        a.getClass();
        return (afqr)a;
    }
    
    public static void k(final Activity activity) {
        if (activity != null) {
            return;
        }
        throw new IllegalStateException("Attempted use of the activity when it is null");
    }
    
    public static bu l(final Activity activity) {
        try {
            final bu bu = (bu)activity;
            bu.getClass();
            return bu;
        }
        catch (final ClassCastException ex) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), ex);
        }
    }
    
    public static cgi m(final Activity activity, final Set set) {
        return new cgi(activity, set);
    }
    
    public static MediaEngineAudioContainerRegistrar n(final nmo nmo) {
        return new MediaEngineAudioContainerRegistrar(nmo, (byte[])null);
    }
    
    public static agp o(final aeoe aeoe, final arvv arvv) {
        return new agp(aeoe, arvv, (byte[])null, (byte[])null);
    }
    
    public static aekw p(final atjj atjj, final ahar ahar) {
        atjj.getClass();
        return (aekw)new aelb((atjj)new aauf(atjj, 9), ahar, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static Application q(final aeby aeby) {
        final Application r = aqqn.r((Context)aeby.a);
        r.getClass();
        return r;
    }
    
    public static Context r(final aeby aeby) {
        return (Context)aeby.a;
    }
    
    public static aseo s(final atjj atjj) {
        return new aseo(atjj);
    }
}
