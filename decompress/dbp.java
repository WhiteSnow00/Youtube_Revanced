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

public final class dbp implements ComponentCallbacks2
{
    private static volatile dbp g;
    private static volatile boolean h;
    public final dgg a;
    public final dby b;
    public final dge c;
    public final dmq d;
    public final List e;
    public final cll f;
    private final dhc i;
    
    public dbp(final Context context, final qcy qcy, final dhc i, final dgg a, final dge c, final dmq d, final cll f, final int n, final dbo dbo, final Map map, final List list, final List list2, final AppGlideModule appGlideModule, final cya cya, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.e = new ArrayList();
        this.a = a;
        this.c = c;
        this.i = i;
        this.d = d;
        this.f = f;
        if (((Map<K, dbz>)cya.a).get(dbu.class) != null) {
            dkh.b = 0;
        }
        this.b = new dby(context, c, (dpb)new dch(this, list2, appGlideModule), new cll(), dbo, map, list, qcy, cya, n, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static dbp b(final Context context) {
        if (dbp.g == null) {
            final GeneratedAppGlideModule e = e(context.getApplicationContext());
            synchronized (dbp.class) {
                if (dbp.g == null) {
                    if (!dbp.h) {
                        dbp.h = true;
                        final dbx dbx = new dbx();
                        final Context applicationContext = context.getApplicationContext();
                        List<Object> emptyList = (List<Object>)Collections.emptyList();
                        ArrayList list;
                        ApplicationInfo applicationInfo;
                        Iterator iterator;
                        String s;
                        Set b;
                        Iterator<Object> iterator2;
                        List l;
                        dhg dhg;
                        int n;
                        dhg dhg2;
                        dmp a;
                        Iterator<dnc> iterator3;
                        int b2;
                        dhg dhg3;
                        cya cya;
                        dbp g;
                        Label_0070:Block_25_Outer:Label_0665_Outer:Block_14_Outer:Block_17_Outer:
                        while (true) {
                            if (e != null && !((AppGlideModule)e).isManifestParsingEnabled()) {
                                break Label_0070;
                            }
                            Label_0183: {
                                Label_0073: {
                                    break Label_0073;
                                    break Label_0183;
                                }
                                list = new ArrayList();
                                try {
                                    applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                                    emptyList = list;
                                    if (applicationInfo.metaData == null) {
                                        continue Label_0070;
                                    }
                                    iterator = applicationInfo.metaData.keySet().iterator();
                                    while (true) {
                                        emptyList = list;
                                        if (!iterator.hasNext()) {
                                            continue Label_0070;
                                        }
                                        s = (String)iterator.next();
                                        if (!"GlideModule".equals(applicationInfo.metaData.get(s))) {
                                            continue Block_25_Outer;
                                        }
                                        list.add(dne.a(s));
                                    }
                                Block_26_Outer:
                                    while (true) {
                                        while (true) {
                                            Label_0216_Outer:Label_0631_Outer:
                                            while (true) {
                                            Label_0598:
                                                while (true) {
                                                    Block_27: {
                                                        while (true) {
                                                            while (true) {
                                                                Label_0216:Label_0844_Outer:Label_0513_Outer:
                                                                while (true) {
                                                                Label_0424_Outer:
                                                                    while (true) {
                                                                    Label_0277:
                                                                        while (true) {
                                                                        Block_31_Outer:
                                                                            while (true) {
                                                                                Block_21: {
                                                                                    Label_0483: {
                                                                                        while (true) {
                                                                                            Label_0692: {
                                                                                                Block_20_Outer:Block_23_Outer:
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                    Block_19:
                                                                                                        while (true) {
                                                                                                            while (true) {
                                                                                                                while (true) {
                                                                                                                Label_0292:
                                                                                                                    while (true) {
                                                                                                                        while (true) {
                                                                                                                            Block_30: {
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                        while (true) {
                                                                                                                                            dbx.o = new cll();
                                                                                                                                            break Label_0216_Outer;
                                                                                                                                            iftrue(Label_0692:)(dbx.f != null);
                                                                                                                                            break Block_30;
                                                                                                                                            while (true) {
                                                                                                                                                iftrue(Label_0424:)(dbx.e != null);
                                                                                                                                                break Block_21;
                                                                                                                                                b = e.b();
                                                                                                                                                iterator2 = (Iterator<Object>)emptyList.iterator();
                                                                                                                                                break Label_0216;
                                                                                                                                                iftrue(Label_0216:)(!b.contains(iterator2.next().getClass()));
                                                                                                                                                break Label_0424_Outer;
                                                                                                                                                l = dbx.l;
                                                                                                                                                iftrue(Label_0867:)(l != null);
                                                                                                                                                dbx.l = Collections.emptyList();
                                                                                                                                                break Block_26_Outer;
                                                                                                                                                dhg = new dhg(false);
                                                                                                                                                dhg.b(dhk.a());
                                                                                                                                                dhg.a = "source";
                                                                                                                                                dbx.d = dhg.a();
                                                                                                                                                continue Block_14_Outer;
                                                                                                                                            }
                                                                                                                                            n = 2;
                                                                                                                                            dhg2 = new dhg(true);
                                                                                                                                            dhg2.b(n);
                                                                                                                                            dhg2.a = "animation";
                                                                                                                                            dbx.j = dhg2.a();
                                                                                                                                            break Label_0483;
                                                                                                                                            iftrue(Label_0538:)(dbx.o != null);
                                                                                                                                            continue Label_0665_Outer;
                                                                                                                                        }
                                                                                                                                        Label_0867: {
                                                                                                                                            dbx.l = Collections.unmodifiableList((List<?>)l);
                                                                                                                                        }
                                                                                                                                        break Block_26_Outer;
                                                                                                                                        iftrue(Label_0435:)(dbx.j == null);
                                                                                                                                        break Block_20_Outer;
                                                                                                                                        dbx.m = new dhc((long)dbx.p.c);
                                                                                                                                        continue Block_14_Outer;
                                                                                                                                    }
                                                                                                                                    a = e.a();
                                                                                                                                    break Label_0277;
                                                                                                                                    ((dnc)iterator3.next()).applyOptions(applicationContext, dbx);
                                                                                                                                    break Label_0292;
                                                                                                                                    Label_0447: {
                                                                                                                                        n = 1;
                                                                                                                                    }
                                                                                                                                    continue Label_0513_Outer;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            dbx.f = (dgv)new dgz(applicationContext);
                                                                                                                            break Label_0692;
                                                                                                                            dbx.i = a;
                                                                                                                            iterator3 = emptyList.iterator();
                                                                                                                            break Label_0292;
                                                                                                                            iftrue(Label_0665:)(dbx.m != null);
                                                                                                                            continue Block_17_Outer;
                                                                                                                        }
                                                                                                                        Label_0324: {
                                                                                                                            iftrue(Label_0338:)(e == null);
                                                                                                                        }
                                                                                                                        break Block_19;
                                                                                                                        iftrue(Label_0259:)(!iterator2.hasNext());
                                                                                                                        continue Label_0844_Outer;
                                                                                                                    }
                                                                                                                    iftrue(Label_0324:)(!iterator3.hasNext());
                                                                                                                    continue Label_0631_Outer;
                                                                                                                }
                                                                                                                iftrue(Label_0382:)(dbx.d != null);
                                                                                                                continue Block_23_Outer;
                                                                                                            }
                                                                                                            Label_0435: {
                                                                                                                iftrue(Label_0447:)(dhk.a() < 4);
                                                                                                            }
                                                                                                            continue Label_0513_Outer;
                                                                                                        }
                                                                                                        ((AppGlideModule)e).applyOptions(applicationContext, dbx);
                                                                                                        continue Block_31_Outer;
                                                                                                    }
                                                                                                    dbx.q = new qcy(dbx.m, dbx.f, dbx.e, dbx.d, new dhk((ExecutorService)new ThreadPoolExecutor(0, Integer.MAX_VALUE, dhk.a, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(), (ThreadFactory)new dhj((ThreadFactory)new dhi(0), "source-unlimited", false))), dbx.j, dbx.k);
                                                                                                    continue Block_20_Outer;
                                                                                                }
                                                                                                break Label_0483;
                                                                                            }
                                                                                            iftrue(Label_0844:)(dbx.q != null);
                                                                                            continue Block_26_Outer;
                                                                                        }
                                                                                        b2 = dbx.p.b;
                                                                                        iftrue(Label_0581:)(b2 <= 0);
                                                                                        break Block_27;
                                                                                    }
                                                                                    iftrue(Label_0513:)(dbx.p != null);
                                                                                    break Label_0277;
                                                                                }
                                                                                dhg3 = new dhg(true);
                                                                                dhg3.b(1);
                                                                                dhg3.a = "disk-cache";
                                                                                dbx.e = dhg3.a();
                                                                                continue Block_17_Outer;
                                                                            }
                                                                            Label_0274: {
                                                                                a = null;
                                                                            }
                                                                            continue Label_0277;
                                                                        }
                                                                        dbx.p = new dhd(applicationContext).c();
                                                                        continue Label_0424_Outer;
                                                                    }
                                                                    iterator2.remove();
                                                                    continue Label_0216;
                                                                }
                                                                Label_0581: {
                                                                    dbx.b = (dgg)new dgh();
                                                                }
                                                                break Label_0598;
                                                                dbx.c = (dge)new dgn(dbx.p.a);
                                                                continue Block_26_Outer;
                                                            }
                                                            iftrue(Label_0631:)(dbx.c != null);
                                                            continue;
                                                        }
                                                    }
                                                    dbx.b = (dgg)new dgo(b2);
                                                    continue Label_0598;
                                                }
                                                iftrue(Label_0259:)(e == null || e.b().isEmpty());
                                                continue Label_0216_Outer;
                                            }
                                            iftrue(Label_0598:)(dbx.b != null);
                                            continue;
                                        }
                                        Label_0259: {
                                            iftrue(Label_0274:)(e == null);
                                        }
                                        continue Block_26_Outer;
                                    }
                                    cya = new cya(dbx.n, null, null);
                                    g = new dbp(applicationContext, dbx.q, dbx.m, dbx.b, dbx.c, new dmq(dbx.i, cya, (byte[])null), dbx.o, dbx.g, dbx.h, dbx.a, dbx.l, emptyList, (AppGlideModule)e, cya, null, null, null, null, null);
                                    applicationContext.registerComponentCallbacks((ComponentCallbacks)g);
                                    dbp.g = g;
                                    dbp.h = false;
                                    return dbp.g;
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
        return dbp.g;
    }
    
    public static dcm c(final Context context) {
        clm.l((Object)context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
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
        dph.j();
        ((dpd)this.i).i();
        this.a.c();
        this.c.b();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
        this.d();
    }
    
    public final void onTrimMemory(final int n) {
        dph.j();
        Object o = this.e;
        monitorenter(o);
        try {
            for (dcm dcm : this.e) {}
            monitorexit(o);
            o = this.i;
            int n2 = 0;
            Label_0099: {
                if (n >= 40) {
                    ((dpd)o).i();
                    n2 = n;
                }
                else {
                    if ((n2 = n) < 20) {
                        if ((n2 = n) != 15) {
                            break Label_0099;
                        }
                        n2 = 15;
                    }
                    ((dpd)o).j(((dpd)o).e() / 2L);
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
