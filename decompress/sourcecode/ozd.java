import android.os.StrictMode$ThreadPolicy;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.SettableFuture;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozd
{
    public final aftr a;
    public final oyz b;
    private final atjj c;
    private final Set d;
    private final oas e;
    private final Executor f;
    private volatile afcw g;
    
    public ozd(final aftr a, final atjj c, final Set d, final oyz b, final oas e) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
        this.f = afva.g((Executor)a);
        agot.E(d.isEmpty() ^ true, (Object)"No logging result handlers provided.");
    }
    
    public static ListenableFuture c(final phq phq, final oze oze) {
        try {
            return oze.b(phq);
        }
        finally {
            final Throwable t;
            return afva.l(t);
        }
    }
    
    private final void d(final ListenableFuture listenableFuture) {
        final afie k = ((afhg)this.d).k();
        while (((Iterator)k).hasNext()) {
            final pbq pbq = (pbq)((Iterator)k).next();
            afva.w(listenableFuture, (afsz)new gqy(8), (Executor)afsl.a);
        }
    }
    
    public final List a(final Class clazz) {
        Object g;
        if ((g = this.g) == null) {
            synchronized (this) {
                if ((g = this.g) == null) {
                    final HashMap hashMap = new HashMap();
                    final ArrayList list = new ArrayList();
                    for (final oze oze : (Set)this.c.a()) {
                        if (oze.a().isEmpty()) {
                            list.add(oze);
                        }
                        else {
                            final afie k = ((afhg)oze.a()).k();
                            while (((Iterator)k).hasNext()) {
                                final Class clazz2 = (Class)((Iterator)k).next();
                                if ((g = hashMap.get(clazz2)) == null) {
                                    g = new ArrayList<oze>();
                                    hashMap.put(clazz2, g);
                                }
                                ((List<oze>)g).add(oze);
                            }
                        }
                    }
                    hashMap.put(ozf.class, list);
                    g = afcw.k((Map)hashMap);
                    this.g = (afcw)g;
                }
            }
        }
        return (List)((afcw)g).getOrDefault((Object)clazz, (Object)afcr.q());
    }
    
    public final void b(final ozc ozc) {
        final StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder(threadPolicy).detectAll().build());
        try {
            final long f = this.e.f();
            final ozg ozg = new ozg();
            try {
                final List a = ozc.a();
                if (a != null && !a.isEmpty()) {
                    final SettableFuture create = SettableFuture.create();
                    this.d(afrp.f(afva.q(aesm.i((Callable)new lax(this, a, 20)), this.f), aesm.d((afry)new ozb(this, create, ozg)), this.f));
                    create.set((Object)(this.e.f() - f));
                }
            }
            finally {
                final Throwable t;
                final ListenableFuture l = afva.l(t);
                afva.l(t);
                this.d(l);
            }
        }
        finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
