import com.google.apps.tiktok.account.api.controller.KeepStateCallbacksHandler;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Set;
import android.app.Activity;
import android.content.Context;
import java.lang.reflect.Method;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Handler;
import java.util.concurrent.Executor;
import com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinImpl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adrn implements arom
{
    public static Boolean b() {
        return true;
    }
    
    public static aeoa c(final aerx aerx) {
        aerx.getClass();
        return (aeoa)new FuturesMixinImpl((atnb)new aawk(aerx, 9), (avw)aerx, aerx.getLifecycle());
    }
    
    public static aeog d(final Executor executor, final afbh afbh) {
        return new aeog(executor, 0);
    }
    
    public static cmg e(final afbh afbh, final afxk afxk, final aeny aeny, final cnh b) {
        final cme cme = new cme();
        cme.a = afxk;
        cme.d = (cnc)new aeox((Handler)aeny, 0);
        cme.c = afxk;
        cme.b = b;
        final aeok aeok = (aeok)((afbn)afbh).a;
        if (aeok.a.h()) {
            cme.e = (String)aeok.a.c();
        }
        return cme.a();
    }
    
    public static cmg f() {
        throw new IllegalArgumentException("Do not directly use the WorkManager or Configuration types. See go/tiktok/dev/androidx/work.");
    }
    
    public static aepr g(final br br, final aepo aepo, final Executor executor) {
        return (aepr)new aeql(br, aepo, executor);
    }
    
    public static aerx h(final afbh afbh) {
        return aegu.L(afbh, null);
    }
    
    public static ExtensionRegistryLite i() {
        final aeux o = aewp.o("provideExtensionRegistry");
        try {
            final ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            o.close();
            generatedRegistry.getClass();
            return generatedRegistry;
        }
        finally {
            Label_0059: {
                final Throwable t2;
                final Throwable t4;
                try {
                    o.close();
                    break Label_0059;
                }
                finally {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s, (Class[])array);
                    final Throwable t = t2;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t3 = t4;
                    array2[n4] = t3;
                    method.invoke(t, array2);
                }
                try {
                    final Class<Throwable> clazz = Throwable.class;
                    final String s = "addSuppressed";
                    final int n = 1;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<Throwable> clazz2 = Throwable.class;
                    array[n2] = clazz2;
                    final Method method = clazz.getDeclaredMethod(s, (Class[])array);
                    final Throwable t = t2;
                    final int n3 = 1;
                    final Object[] array2 = new Object[n3];
                    final int n4 = 0;
                    final Throwable t3 = t4;
                    array2[n4] = t3;
                    method.invoke(t, array2);
                }
                catch (final Exception ex) {}
            }
        }
    }
    
    public static qle j() {
        return (qle)aesc.a;
    }
    
    public static qle k(final Context context) {
        return (qle)new aesd(context, 0);
    }
    
    public static aetj l(final aeth aeth) {
        return new aetj(aeth);
    }
    
    public static cgm m(final Activity activity, final Set set) {
        return new cgm(activity, set);
    }
    
    public static agr n(final aerx aerx, final aqwo aqwo) {
        return new agr(aerx, aqwo, (byte[])null, (byte[])null);
    }
    
    public static agnv o(final atnb atnb) {
        return new agnv(atnb);
    }
    
    public static adrm p(final oco oco, final ScheduledExecutorService scheduledExecutorService, final arzb arzb, final admj admj, final adgg adgg, final adnd adnd, final adqd adqd) {
        return new adrm(oco, scheduledExecutorService, arzb, admj, adgg, adnd, adqd, null, null, null, null);
    }
    
    public static aenc q(final agnv agnv) {
        return new aenc(agnv, null, null, null);
    }
    
    public static zkt r(final agnv agnv, final Map map, final Map map2, final Set set, final aeky aeky) {
        return new zkt(agnv, map, map2, set, aeky, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static aekk s(final aerx aerx, final Object o, final ActivityAccountState activityAccountState, final aeoa aeoa, final aapu aapu, final KeepStateCallbacksHandler keepStateCallbacksHandler, final Object o2, final aeky aeky, final ExtensionRegistryLite extensionRegistryLite, final afbh afbh) {
        return new aekk(aerx, (aekj)o, activityAccountState, aeoa, aapu, keepStateCallbacksHandler, (zkt)o2, aeky, extensionRegistryLite, afbh, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static aapu t(final Set set) {
        return new aapu(set);
    }
    
    public static aheu u(final aapu aapu, final adgg adgg) {
        return new aheu(aapu, adgg, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static ActivityAccountState v(final aerx aerx, final aapu aapu, final KeepStateCallbacksHandler keepStateCallbacksHandler, final ExtensionRegistryLite extensionRegistryLite, final agr agr) {
        return new ActivityAccountState(aerx, aapu, keepStateCallbacksHandler, extensionRegistryLite, agr, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    @Override
    public final Object a() {
        throw null;
    }
}
