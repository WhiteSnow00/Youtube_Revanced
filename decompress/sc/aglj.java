import java.security.PublicKey;
import android.content.SharedPreferences;
import android.text.TextUtils;
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

public final class aglj implements aglk
{
    public static final Object a;
    private static final ThreadFactory g;
    public final agia b;
    public final aglx c;
    public final aglu d;
    public final aglr e;
    public final aglt f;
    private final Object h;
    private final ExecutorService i;
    private final ExecutorService j;
    private String k;
    private final Set l;
    private final List m;
    
    static {
        a = new Object();
        g = (ThreadFactory)new ndt(2, (char[])null);
    }
    
    public aglj(final agia b, final aglh aglh) {
        final TimeUnit seconds = TimeUnit.SECONDS;
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        final ThreadFactory g = aglj.g;
        final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 30L, seconds, linkedBlockingQueue, g);
        final aglx c = new aglx(b.a(), aglh);
        final aglu d = new aglu(b);
        final aglr b2 = aglr.b();
        final aglt f = new aglt(b);
        final int a = aglp.a;
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
    
    public static aglj b() {
        return c(agia.b());
    }
    
    public static aglj c(final agia agia) {
        khl.aR(true, "Null is not a valid value of FirebaseApp.");
        return (aglj)agia.f((Class)aglk.class);
    }
    
    private final String m() {
        synchronized (this) {
            return this.k;
        }
    }
    
    private final void n(final aglq aglq) {
        synchronized (this.h) {
            this.m.add(aglq);
        }
    }
    
    private final void o() {
        khl.ba(this.e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        khl.ba(this.f(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        khl.ba(this.d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        khl.aR(aglr.d(this.e()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        khl.aR(aglr.b.matcher(this.d()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }
    
    public final nnc a() {
        this.o();
        final String m = this.m();
        if (m != null) {
            return nnv.c((Object)m);
        }
        final nns nns = new nns();
        this.n((aglq)new agln(nns, null));
        final Object a = nns.a;
        this.i.execute((Runnable)new aeue(this, 11));
        return (nnc)a;
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
                if (((aglq)iterator.next()).a(ex)) {
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
    
    public final void h(final aglw aglw) {
        final Object h = this.h;
        monitorenter(h);
        try {
            final Iterator iterator = this.m.iterator();
            while (iterator.hasNext()) {
                if (((aglq)iterator.next()).b(aglw)) {
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
    
    public final void j(final aglw aglw, final aglw aglw2) {
        monitorenter(this);
        try {
            if (this.l.size() != 0 && !aglw.a.equals(aglw2.a)) {
                final Iterator iterator = this.l.iterator();
                while (iterator.hasNext()) {
                    ((agls)iterator.next()).a();
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
        synchronized (aglj.a) {
            final arzp k = arzp.k(this.b.a());
            try {
                aglw aglw2;
                final aglw aglw = aglw2 = this.d.a();
                if (aglw.c()) {
                    final String a2;
                    Label_0230: {
                        if ((this.b.g().equals("CHIME_ANDROID_SDK") || this.b.k()) && aglw.g == 1) {
                            final aglt f = this.f;
                            synchronized (f.b) {
                                synchronized (f.b) {
                                    final SharedPreferences b = f.b;
                                    CharSequence a = null;
                                    Object o = b.getString("|S|id", (String)null);
                                    monitorexit(f.b);
                                    Label_0193: {
                                        if (o != null) {
                                            monitorexit(f.b);
                                            break Label_0193;
                                        }
                                        o = f.b;
                                        synchronized (o) {
                                            final String string = f.b.getString("|S||P|", (String)null);
                                            if (string == null) {
                                                monitorexit(o);
                                            }
                                            else {
                                                final PublicKey b2 = aglt.b(string);
                                                if (b2 == null) {
                                                    monitorexit(o);
                                                }
                                                else {
                                                    a = aglt.a(b2);
                                                    monitorexit(o);
                                                }
                                            }
                                            monitorexit(f.b);
                                            o = a;
                                            if (TextUtils.isEmpty((CharSequence)o)) {
                                                aglp.a();
                                            }
                                            break Label_0230;
                                        }
                                    }
                                }
                            }
                        }
                        a2 = aglp.a();
                    }
                    final aglu d = this.d;
                    final aglv f2 = aglw.f();
                    f2.a = a2;
                    f2.c(3);
                    aglw2 = f2.a();
                    d.b(aglw2);
                }
                if (k != null) {
                    k.g();
                }
                monitorexit(aglj.a);
                this.h(aglw2);
                this.j.execute((Runnable)new agli(this));
            }
            finally {
                if (k != null) {
                    k.g();
                }
            }
        }
    }
    
    public final nnc l() {
        this.o();
        final nns nns = new nns();
        this.n((aglq)new aglm(this.e, nns, null));
        final Object a = nns.a;
        this.i.execute((Runnable)new aeue(this, 10));
        return (nnc)a;
    }
}
