import android.os.Bundle;
import java.util.HashMap;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReference;
import android.app.Application;
import java.util.Iterator;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.Collection;
import java.util.Collections;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import com.google.firebase.components.ComponentDiscoveryService;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfz
{
    public static final Object a;
    public static final Map b;
    private static final Executor g;
    public final aghg c;
    public final AtomicBoolean d;
    public final agjg e;
    public final List f;
    private final Context h;
    private final String i;
    private final aggd j;
    private final AtomicBoolean k;
    private final agho l;
    
    static {
        a = new Object();
        g = new agfx();
        b = new abg();
    }
    
    protected agfz(final Context h, String metaData, final aggd j) {
        this.d = new AtomicBoolean(false);
        this.k = new AtomicBoolean();
        this.f = new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        kgk.aL(h);
        this.h = h;
        kgk.aV(metaData);
        this.i = metaData;
        this.j = j;
        final ArrayList list = new ArrayList();
        metaData = null;
        try {
            final PackageManager packageManager = h.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            }
            else {
                final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(h, (Class)ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    final String string = ComponentDiscoveryService.class.toString();
                    final StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(" has no service info.");
                    Log.w("ComponentDiscovery", sb.toString());
                }
                else {
                    metaData = (String)serviceInfo.metaData;
                }
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        List<String> emptyList;
        if (metaData == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            emptyList = Collections.emptyList();
        }
        else {
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = ((Bundle)metaData).keySet().iterator();
            while (true) {
                emptyList = list2;
                if (!iterator.hasNext()) {
                    break;
                }
                final String s = (String)iterator.next();
                if (!"com.google.firebase.components.ComponentRegistrar".equals(((Bundle)metaData).get(s)) || !s.startsWith("com.google.firebase.components:")) {
                    continue;
                }
                list2.add(s.substring(31));
            }
        }
        final Iterator<String> iterator2 = emptyList.iterator();
        while (iterator2.hasNext()) {
            list.add(new aghf((String)iterator2.next(), 1));
        }
        final Executor g = agfz.g;
        final ArrayList list3 = new ArrayList();
        final ArrayList list4 = new ArrayList();
        list3.addAll(list);
        list3.add(new aghf((aghd)new FirebaseCommonRegistrar(), 0));
        aety.k(agha.e((Object)h, (Class)Context.class, new Class[0]), (List)list4);
        aety.k(agha.e((Object)this, (Class)agfz.class, new Class[0]), (List)list4);
        aety.k(agha.e((Object)j, (Class)aggd.class, new Class[0]), (List)list4);
        final aghg c = new aghg(g, list3, list4);
        this.c = c;
        this.l = new agho((agjg)new aghe(this, h, 1));
        this.e = c.c(agip.class);
        final xpb xpb = new xpb(this);
        this.l();
        if (this.d.get() && mqp.a.c()) {
            xpb.z(true);
        }
        this.f.add(xpb);
    }
    
    public static agfz b() {
        synchronized (agfz.a) {
            final agfz agfz = agfz.b.get("[DEFAULT]");
            if (agfz != null) {
                return agfz;
            }
            final String a = muk.a();
            final StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
            sb.append(a);
            sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static agfz c(final Context context, final aggd aggd) {
        return d(context, aggd, "[DEFAULT]");
    }
    
    public static agfz d(Context a, final aggd aggd, final String s) {
        final AtomicReference a2 = agfw.a;
        Label_0082: {
            if (a.getApplicationContext() instanceof Application) {
                final Application application = (Application)a.getApplicationContext();
                if (agfw.a.get() == null) {
                    final agfw agfw = new agfw();
                    final AtomicReference a3 = agfw.a;
                    while (!a3.compareAndSet(null, agfw)) {
                        if (a3.get() != null) {
                            break Label_0082;
                        }
                    }
                    mqp.b(application);
                    mqp.a.a((mqo)agfw);
                }
            }
        }
        final String trim = s.trim();
        Context applicationContext = a;
        if (a.getApplicationContext() != null) {
            applicationContext = a.getApplicationContext();
        }
        a = (Context)agfz.a;
        monitorenter(a);
        try {
            final Map b = agfz.b;
            final boolean containsKey = b.containsKey(trim);
            final StringBuilder sb = new StringBuilder();
            sb.append("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            kgk.aU(containsKey ^ true, sb.toString());
            kgk.aX(applicationContext, "Application context cannot be null.");
            final agfz agfz = new agfz(applicationContext, trim, aggd);
            b.put(trim, agfz);
            monitorexit(a);
            agfz.i();
            return agfz;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    private final void l() {
        kgk.aU(this.k.get() ^ true, "FirebaseApp was deleted");
    }
    
    public final Context a() {
        this.l();
        return this.h;
    }
    
    public final aggd e() {
        this.l();
        return this.j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof agfz && this.i.equals(((agfz)o).g());
    }
    
    public final Object f(final Class clazz) {
        this.l();
        return this.c.a(clazz);
    }
    
    public final String g() {
        this.l();
        return this.i;
    }
    
    public final String h() {
        final String l = meo.L(this.g().getBytes(Charset.defaultCharset()));
        final String i = meo.L(this.e().b.getBytes(Charset.defaultCharset()));
        final StringBuilder sb = new StringBuilder();
        sb.append(l);
        sb.append("+");
        sb.append(i);
        return sb.toString();
    }
    
    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }
    
    public final void i() {
        if (!ajr.a(this.h)) {
            this.g();
            final Context h = this.h;
            if (agfy.a.get() == null) {
                final agfy agfy = new agfy(h);
                final AtomicReference a = agfy.a;
                while (!a.compareAndSet(null, agfy)) {
                    if (a.get() != null) {
                        return;
                    }
                }
                h.registerReceiver((BroadcastReceiver)agfy, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
            return;
        }
        this.g();
        final aghg c = this.c;
        final boolean k = this.k();
        final AtomicReference b = c.b;
        do {
            if (b.compareAndSet(null, k)) {
                synchronized (c) {
                    final HashMap hashMap = new HashMap(c.a);
                    monitorexit(c);
                    c.e(hashMap, k);
                    break;
                }
            }
        } while (b.get() == null);
        ((agip)this.e.a()).c();
    }
    
    public final boolean j() {
        this.l();
        return ((agkb)this.l.a()).a();
    }
    
    public final boolean k() {
        return "[DEFAULT]".equals(this.g());
    }
    
    @Override
    public final String toString() {
        final ArrayList list = new ArrayList();
        kgk.bc("name", this.i, list);
        kgk.bc("options", this.j, list);
        return kgk.bb(list, this);
    }
}
