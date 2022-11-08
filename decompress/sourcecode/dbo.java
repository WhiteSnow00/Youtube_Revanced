import android.content.res.Configuration;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.Iterator;
import android.content.pm.ApplicationInfo;
import com.bumptech.glide.GeneratedAppGlideModule;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentCallbacks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;
import com.bumptech.glide.module.AppGlideModule;
import java.util.Map;
import android.content.Context;
import java.util.List;
import android.content.ComponentCallbacks2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbo implements ComponentCallbacks2
{
    private static volatile dbo g;
    private static volatile boolean h;
    public final dgf a;
    public final dbx b;
    public final dgd c;
    public final dmp d;
    public final List e;
    public final clk f;
    private final dhb i;
    
    public dbo(final Context context, final qbo qbo, final dhb i, final dgf a, final dgd c, final dmp d, final clk f, final int n, final dbn dbn, final Map map, final List list, final List list2, final AppGlideModule appGlideModule, final cxz cxz, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.e = new ArrayList();
        this.a = a;
        this.c = c;
        this.i = i;
        this.d = d;
        this.f = f;
        if (((Map<K, dby>)cxz.a).get(dbt.class) != null) {
            dkg.b = 0;
        }
        this.b = new dbx(context, c, (dpa)new dcg(this, list2, appGlideModule), new clk(), dbn, map, list, qbo, cxz, n, null, null, null, null, null);
    }
    
    public static dbo b(final Context context) {
        if (dbo.g == null) {
            final GeneratedAppGlideModule e = e(context.getApplicationContext());
            synchronized (dbo.class) {
                if (dbo.g == null) {
                    if (!dbo.h) {
                        dbo.h = true;
                        final dbw dbw = new dbw();
                        final Context applicationContext = context.getApplicationContext();
                        List<Object> emptyList = (List<Object>)Collections.emptyList();
                        ArrayList list;
                        ApplicationInfo applicationInfo;
                        Iterator iterator;
                        String s;
                        dmo a;
                        dhf dhf;
                        Iterator<Object> iterator2;
                        dhf dhf2;
                        int b;
                        Iterator<dnb> iterator3;
                        List l;
                        dhf dhf3;
                        int n;
                        Set b2;
                        cxz cxz;
                        dbo g;
                        Label_0064:Block_17_Outer:Label_0264_Outer:Block_16_Outer:Label_0205_Outer:Label_0627_Outer:
                        while (true) {
                            if (e != null && !((AppGlideModule)e).isManifestParsingEnabled()) {
                                break Label_0064;
                            }
                            Label_0175: {
                                Label_0067: {
                                    break Label_0067;
                                    break Label_0175;
                                }
                                list = new ArrayList();
                                try {
                                    applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                                    emptyList = list;
                                    if (applicationInfo.metaData == null) {
                                        continue Label_0064;
                                    }
                                    iterator = applicationInfo.metaData.keySet().iterator();
                                    while (true) {
                                        emptyList = list;
                                        if (!iterator.hasNext()) {
                                            continue Label_0064;
                                        }
                                        s = (String)iterator.next();
                                        if (!"GlideModule".equals(applicationInfo.metaData.get(s))) {
                                            continue Block_17_Outer;
                                        }
                                        list.add(dnd.a(s));
                                    }
                                    while (true) {
                                        Label_0205:Label_0318_Outer:
                                        while (true) {
                                            Block_14: {
                                                while (true) {
                                                Label_0507_Outer:
                                                    while (true) {
                                                        Label_0400: {
                                                            while (true) {
                                                                Label_0797: {
                                                                    while (true) {
                                                                        Block_25: {
                                                                            while (true) {
                                                                            Label_0423:
                                                                                while (true) {
                                                                                Block_27_Outer:
                                                                                    while (true) {
                                                                                        while (true) {
                                                                                            Block_30: {
                                                                                            Label_0596:
                                                                                                while (true) {
                                                                                                    Label_0278: {
                                                                                                        Label_0484: {
                                                                                                        Label_0566_Outer:
                                                                                                            while (true) {
                                                                                                            Label_0566:
                                                                                                                while (true) {
                                                                                                                    Block_23: {
                                                                                                                        while (true) {
                                                                                                                        Block_20_Outer:
                                                                                                                            while (true) {
                                                                                                                            Label_0360:
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                    Label_0264:
                                                                                                                                        while (true) {
                                                                                                                                            while (true) {
                                                                                                                                                a = e.a();
                                                                                                                                                break Label_0264;
                                                                                                                                                iftrue(Label_0248:)(e == null || e.b().isEmpty());
                                                                                                                                                break Block_14;
                                                                                                                                                dhf = new dhf(true);
                                                                                                                                                dhf.b(1);
                                                                                                                                                dhf.a = "disk-cache";
                                                                                                                                                dbw.e = dhf.a();
                                                                                                                                                break Label_0400;
                                                                                                                                                iterator2.remove();
                                                                                                                                                break Label_0205;
                                                                                                                                                iftrue(Label_0420:)(dhj.a() < 4);
                                                                                                                                                break Block_23;
                                                                                                                                                Label_0248: {
                                                                                                                                                    iftrue(Label_0261:)(e == null);
                                                                                                                                                }
                                                                                                                                                continue Label_0264_Outer;
                                                                                                                                            }
                                                                                                                                            dbw.q = new qbo(dbw.m, dbw.f, dbw.e, dbw.d, new dhj((ExecutorService)new ThreadPoolExecutor(0, Integer.MAX_VALUE, dhj.a, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(), (ThreadFactory)new dhi((ThreadFactory)new dhh(0), "source-unlimited", false))), dbw.j, dbw.k);
                                                                                                                                            break Label_0797;
                                                                                                                                            dhf2 = new dhf(false);
                                                                                                                                            dhf2.b(dhj.a());
                                                                                                                                            dhf2.a = "source";
                                                                                                                                            dbw.d = dhf2.a();
                                                                                                                                            break Label_0360;
                                                                                                                                            dbw.b = (dgf)new dgn(b);
                                                                                                                                            break Label_0566;
                                                                                                                                            dbw.p = new dhc(applicationContext).c();
                                                                                                                                            break Label_0484;
                                                                                                                                            iftrue(Label_0566:)(dbw.b != null);
                                                                                                                                            break Label_0566;
                                                                                                                                            iftrue(Label_0596:)(dbw.c != null);
                                                                                                                                            break Label_0566_Outer;
                                                                                                                                            ((dnb)iterator3.next()).applyOptions(applicationContext, dbw);
                                                                                                                                            break Label_0278;
                                                                                                                                            iftrue(Label_0651:)(dbw.f != null);
                                                                                                                                            break Block_30;
                                                                                                                                            dbw.i = a;
                                                                                                                                            iterator3 = emptyList.iterator();
                                                                                                                                            break Label_0278;
                                                                                                                                            Label_0261: {
                                                                                                                                                a = null;
                                                                                                                                            }
                                                                                                                                            continue Label_0264;
                                                                                                                                        }
                                                                                                                                        Label_0818: {
                                                                                                                                            dbw.l = Collections.unmodifiableList((List<?>)l);
                                                                                                                                        }
                                                                                                                                        break Label_0423;
                                                                                                                                        dhf3 = new dhf(true);
                                                                                                                                        dhf3.b(n);
                                                                                                                                        dhf3.a = "animation";
                                                                                                                                        dbw.j = dhf3.a();
                                                                                                                                        break Block_20_Outer;
                                                                                                                                        iftrue(Label_0797:)(dbw.q != null);
                                                                                                                                        continue Block_20_Outer;
                                                                                                                                    }
                                                                                                                                    iftrue(Label_0360:)(dbw.d != null);
                                                                                                                                    continue Block_27_Outer;
                                                                                                                                }
                                                                                                                                iftrue(Label_0400:)(dbw.e != null);
                                                                                                                                continue Block_16_Outer;
                                                                                                                            }
                                                                                                                            iftrue(Label_0484:)(dbw.p != null);
                                                                                                                            continue Label_0507_Outer;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    n = 2;
                                                                                                                    continue Label_0423;
                                                                                                                    Label_0550: {
                                                                                                                        dbw.b = (dgf)new dgg();
                                                                                                                    }
                                                                                                                    continue Label_0566;
                                                                                                                }
                                                                                                                b = dbw.p.b;
                                                                                                                iftrue(Label_0550:)(b <= 0);
                                                                                                                continue Label_0566_Outer;
                                                                                                            }
                                                                                                            dbw.c = (dgd)new dgm(dbw.p.a);
                                                                                                            break Label_0596;
                                                                                                            dbw.l = Collections.emptyList();
                                                                                                            break Label_0423;
                                                                                                        }
                                                                                                        iftrue(Label_0507:)(dbw.o != null);
                                                                                                        break Block_25;
                                                                                                    }
                                                                                                    iftrue(Label_0308:)(!iterator3.hasNext());
                                                                                                    continue Label_0627_Outer;
                                                                                                }
                                                                                                iftrue(Label_0627:)(dbw.m != null);
                                                                                                break Label_0205;
                                                                                            }
                                                                                            dbw.f = (dgu)new dgy(applicationContext);
                                                                                            continue Label_0318_Outer;
                                                                                        }
                                                                                        iftrue(Label_0205:)(!b2.contains(iterator2.next().getClass()));
                                                                                        continue Label_0205_Outer;
                                                                                    }
                                                                                    Label_0420: {
                                                                                        n = 1;
                                                                                    }
                                                                                    continue Label_0423;
                                                                                }
                                                                                cxz = new cxz(dbw.n, null, null);
                                                                                g = new dbo(applicationContext, dbw.q, dbw.m, dbw.b, dbw.c, new dmp(dbw.i, cxz, (byte[])null), dbw.o, dbw.g, dbw.h, dbw.a, dbw.l, emptyList, (AppGlideModule)e, cxz, null, null, null, null, null);
                                                                                applicationContext.registerComponentCallbacks((ComponentCallbacks)g);
                                                                                dbo.g = g;
                                                                                dbo.h = false;
                                                                                return dbo.g;
                                                                                Label_0308: {
                                                                                    iftrue(Label_0318:)(e == null);
                                                                                }
                                                                                break Label_0507_Outer;
                                                                                iftrue(Label_0248:)(!iterator2.hasNext());
                                                                                continue;
                                                                            }
                                                                        }
                                                                        dbw.o = new clk();
                                                                        continue Label_0627_Outer;
                                                                    }
                                                                }
                                                                l = dbw.l;
                                                                iftrue(Label_0818:)(l != null);
                                                                continue;
                                                            }
                                                        }
                                                        iftrue(Label_0457:)(dbw.j != null);
                                                        continue Label_0627_Outer;
                                                    }
                                                    ((AppGlideModule)e).applyOptions(applicationContext, dbw);
                                                    continue;
                                                }
                                            }
                                            b2 = e.b();
                                            iterator2 = (Iterator<Object>)emptyList.iterator();
                                            continue Label_0205;
                                        }
                                        dbw.m = new dhb(dbw.p.c);
                                        continue;
                                    }
                                }
                                catch (final PackageManager$NameNotFoundException ex) {
                                    throw new RuntimeException("Unable to find metadata to parse GlideModules", (Throwable)ex);
                                }
                            }
                            break;
                        }
                    }
                    throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                }
            }
        }
        return dbo.g;
    }
    
    public static dcl c(final Context context) {
        cll.l((Object)context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).d.a(context);
    }
    
    private static GeneratedAppGlideModule e(final Context context) {
        final GeneratedAppGlideModule generatedAppGlideModule = null;
        Label_0096: {
            GeneratedAppGlideModule generatedAppGlideModule2;
            try {
                generatedAppGlideModule2 = (GeneratedAppGlideModule)Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
            }
            catch (final InvocationTargetException ex) {
                f(ex);
                generatedAppGlideModule2 = generatedAppGlideModule;
            }
            catch (final NoSuchMethodException ex2) {
                f(ex2);
                generatedAppGlideModule2 = generatedAppGlideModule;
            }
            catch (final IllegalAccessException ex3) {
                f(ex3);
                generatedAppGlideModule2 = generatedAppGlideModule;
            }
            catch (final InstantiationException ex4) {
                f(ex4);
                generatedAppGlideModule2 = generatedAppGlideModule;
            }
            catch (final ClassNotFoundException ex5) {
                if (Log.isLoggable("Glide", 5)) {
                    break Label_0096;
                }
                generatedAppGlideModule2 = generatedAppGlideModule;
            }
            return generatedAppGlideModule2;
        }
        Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
        return null;
    }
    
    private static void f(final Exception ex) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", ex);
    }
    
    public final Context a() {
        return this.b.getBaseContext();
    }
    
    public final void d() {
        dpg.k();
        this.i.i();
        this.a.c();
        this.c.b();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
        this.d();
    }
    
    public final void onTrimMemory(final int n) {
        dpg.k();
        Object o = this.e;
        monitorenter(o);
        try {
            for (dcl dcl : this.e) {}
            monitorexit(o);
            o = this.i;
            int n2 = 0;
            Label_0100: {
                if (n >= 40) {
                    ((dpc)o).i();
                    n2 = n;
                }
                else {
                    if ((n2 = n) < 20) {
                        if ((n2 = n) != 15) {
                            break Label_0100;
                        }
                        n2 = 15;
                    }
                    ((dpc)o).j(((dpc)o).e() / 2L);
                }
            }
            this.a.e(n2);
            this.c.d(n2);
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
