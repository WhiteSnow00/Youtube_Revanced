import android.content.SharedPreferences;
import android.text.TextUtils;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agji implements agjj
{
    public static final Object a;
    private static final ThreadFactory g;
    public final agfz b;
    public final agjw c;
    public final agjt d;
    public final agjq e;
    public final agjs f;
    private final Object h;
    private final ExecutorService i;
    private final ExecutorService j;
    private String k;
    private final Set l;
    private final List m;
    
    static {
        a = new Object();
        g = (ThreadFactory)new nco(2, (char[])null);
    }
    
    public agji(final agfz b, final agjg agjg) {
        final TimeUnit seconds = TimeUnit.SECONDS;
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        final ThreadFactory g = agji.g;
        final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 30L, seconds, linkedBlockingQueue, g);
        final agjw c = new agjw(b.a(), agjg);
        final agjt d = new agjt(b);
        final agjq b2 = agjq.b();
        final agjs f = new agjs(b);
        final int a = agjo.a;
        this.h = new Object();
        this.l = new HashSet();
        this.m = new ArrayList();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = b2;
        this.f = f;
        this.i = i;
        this.j = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), g);
    }
    
    public static agji b() {
        return c(agfz.b());
    }
    
    public static agji c(final agfz agfz) {
        kgk.aN(true, (Object)"Null is not a valid value of FirebaseApp.");
        return (agji)agfz.f((Class)agjj.class);
    }
    
    private final String m() {
        synchronized (this) {
            return this.k;
        }
    }
    
    private final void n(final agjp agjp) {
        synchronized (this.h) {
            this.m.add(agjp);
        }
    }
    
    private final void o() {
        kgk.aW(this.e(), (Object)"Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        kgk.aW(this.f(), (Object)"Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        kgk.aW(this.d(), (Object)"Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        kgk.aN(agjq.d(this.e()), (Object)"Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        kgk.aN(agjq.b.matcher(this.d()).matches(), (Object)"Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }
    
    public final nly a() {
        this.o();
        final String m = this.m();
        if (m != null) {
            return nmr.c((Object)m);
        }
        final nmo nmo = new nmo();
        this.n((agjp)new agjm(nmo, null));
        final Object a = nmo.a;
        this.i.execute((Runnable)new aesf(this, 10));
        return (nly)a;
    }
    
    final String d() {
        return this.b.e().a;
    }
    
    final String e() {
        return this.b.e().b;
    }
    
    final String f() {
        return this.b.e().d;
    }
    
    public final void g(final Exception ex) {
        final Object h = this.h;
        monitorenter(h);
        try {
            final Iterator iterator = this.m.iterator();
            while (iterator.hasNext()) {
                if (((agjp)iterator.next()).a(ex)) {
                    iterator.remove();
                }
            }
            monitorexit(h);
        }
        finally {
            monitorexit(h);
            while (true) {}
        }
    }
    
    public final void h(final agjv agjv) {
        final Object h = this.h;
        monitorenter(h);
        try {
            final Iterator iterator = this.m.iterator();
            while (iterator.hasNext()) {
                if (((agjp)iterator.next()).b(agjv)) {
                    iterator.remove();
                }
            }
            monitorexit(h);
        }
        finally {
            monitorexit(h);
            while (true) {}
        }
    }
    
    public final void i(final String k) {
        synchronized (this) {
            this.k = k;
        }
    }
    
    public final void j(final agjv agjv, final agjv agjv2) {
        monitorenter(this);
        try {
            if (this.l.size() != 0 && !agjv.a.equals(agjv2.a)) {
                final Iterator iterator = this.l.iterator();
                while (iterator.hasNext()) {
                    ((agjr)iterator.next()).a();
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void k() {
        synchronized (agji.a) {
            final aseo h = aseo.h(this.b.a());
            try {
                agjv agjv2;
                final agjv agjv = agjv2 = this.d.a();
                if (agjv.c()) {
                    final String a2;
                    Label_0253: {
                        if ((this.b.g().equals("CHIME_ANDROID_SDK") || this.b.k()) && agjv.g == 1) {
                            final agjs f = this.f;
                            synchronized (f.b) {
                                Object o = f.b;
                                synchronized (o) {
                                    final SharedPreferences b = f.b;
                                    CharSequence a = null;
                                    Object o2 = b.getString("|S|id", (String)null);
                                    monitorexit(o);
                                    Label_0204: {
                                        if (o2 != null) {
                                            monitorexit(f.b);
                                            break Label_0204;
                                        }
                                        o2 = f.b;
                                        synchronized (o2) {
                                            o = f.b.getString("|S||P|", (String)null);
                                            if (o == null) {
                                                monitorexit(o2);
                                            }
                                            else {
                                                o = agjs.b((String)o);
                                                if (o == null) {
                                                    monitorexit(o2);
                                                }
                                                else {
                                                    a = agjs.a((PublicKey)o);
                                                    monitorexit(o2);
                                                }
                                            }
                                            monitorexit(f.b);
                                            o2 = a;
                                            if (TextUtils.isEmpty((CharSequence)o2)) {
                                                agjo.a();
                                            }
                                            break Label_0253;
                                        }
                                    }
                                }
                            }
                        }
                        a2 = agjo.a();
                    }
                    final agjt d = this.d;
                    final agju f2 = agjv.f();
                    f2.a = a2;
                    f2.c(3);
                    agjv2 = f2.a();
                    d.b(agjv2);
                }
                if (h != null) {
                    h.e();
                }
                monitorexit(agji.a);
                this.h(agjv2);
                this.j.execute((Runnable)new agjh(this));
            }
            finally {
                if (h != null) {
                    h.e();
                }
            }
        }
    }
    
    public final nly l() {
        this.o();
        final nmo nmo = new nmo();
        this.n((agjp)new agjl(this.e, nmo, null));
        final Object a = nmo.a;
        this.i.execute((Runnable)new aesf(this, 9));
        return (nly)a;
    }
}
