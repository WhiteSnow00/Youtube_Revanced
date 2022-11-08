import com.google.apps.tiktok.account.AccountId;
import com.google.android.youtube.api.jar.client.d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Callable;
import java.util.Collections;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aepd implements aepp
{
    private static final afik j;
    public final oas a;
    public final afts b;
    public final aejp c;
    public final aeph d;
    public final Map e;
    public final ListenableFuture f;
    public final abg g;
    public final Map h;
    public final Map i;
    private final Context k;
    private final aftr l;
    private final aexq m;
    private final AtomicReference n;
    private final ahar o;
    
    static {
        j = afik.m("com/google/apps/tiktok/sync/impl/SyncManager");
    }
    
    public aepd(final oas a, final Context k, final afts b, final aftr l, final aejp c, final aexq m, final aeph d, final Set set, final Map map, final Set set2, final Map map2, final Map e, final ahar o, final byte[] array, final byte[] array2) {
        final abg g = new abg();
        this.g = g;
        this.h = new abg();
        this.i = new abg();
        this.n = new AtomicReference();
        this.a = a;
        this.k = k;
        this.b = b;
        this.l = l;
        this.c = c;
        this.m = m;
        this.d = d;
        this.e = e;
        agot.E(set2.isEmpty(), (Object)"SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        agot.E(map2.isEmpty(), (Object)"SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.f = d.c();
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<String, V> entry : ((afcw)map).r()) {
            o(aepk.a(aeot.a((String)entry.getKey())), (Map.Entry)entry, hashMap);
        }
        for (final aeov aeov : set) {
            if (aeov.a && hashMap.put(aepk.a(aeov.b()), aeov) != null) {
                ((afii)((afii)((afii)((afig)aepd.j).g()).g(1, TimeUnit.DAYS)).j("com/google/apps/tiktok/sync/impl/SyncManager", "getApplicationSyncletBindings", 707, "SyncManager.java")).t("Duplicate SyncKey found between Set and Map bound Synclets for key %s. Make sure to use either one or the other style, not both", (Object)aeov.b().b());
            }
        }
        g.putAll(hashMap);
        this.o = o;
    }
    
    private final ListenableFuture m() {
        return afrp.e(((ahbd)((aexw)this.m).a).x(), aesm.a((aexg)aekx.c), (Executor)this.b);
    }
    
    private final ListenableFuture n() {
        final SettableFuture create = SettableFuture.create();
        final AtomicReference n = this.n;
        while (!n.compareAndSet(null, create)) {
            if (n.get() != null) {
                return afva.n(this.n.get());
            }
        }
        create.setFuture(afrp.e(this.m(), aesm.a((aexg)new aeis(this, 8)), (Executor)this.b));
        return afva.n(this.n.get());
    }
    
    private static final void o(final aepk aepk, final Map.Entry entry, final Map map) {
        try {
            final aeov aeov = (aeov)entry.getValue().a();
            if (aeov.a) {
                if (!aepk.b.equals((Object)aeov.b())) {
                    ((afii)((afii)((afig)aepd.j).g()).j("com/google/apps/tiktok/sync/impl/SyncManager", "safePutBindingEntry", 784, "SyncManager.java")).x("Synclet @IntoMap and SyncletBinding SyncKeys don't match for intoMap: %s and binding: %s", (Object)entry.getKey(), (Object)aeov.a());
                }
                map.put(aepk, aeov);
            }
        }
        catch (final RuntimeException ex) {
            ((afii)((afii)((afii)((afig)aepd.j).g()).i((Throwable)ex)).j("com/google/apps/tiktok/sync/impl/SyncManager", "safePutBindingEntry", 772, "SyncManager.java")).t("Error accessing SyncletBinding for key %s. Its Synclet will be skipped", (Object)new agmj((Object)entry.getKey()));
        }
    }
    
    public final ListenableFuture d() {
        agot.E(true, (Object)"onAccountsChanged called without an AccountManager bound");
        final ListenableFuture g = this.g(this.m());
        final aeph d = this.d;
        final ListenableFuture rt = d.c.rt(aesm.i((Callable)new adbx(d, 13)));
        final ListenableFuture k = afva.G(g, rt).k(aesm.c((afrx)new aepb(this, g, rt, 2)), (Executor)this.b);
        this.n.set(k);
        final ListenableFuture t = afva.t(k, 10L, TimeUnit.SECONDS, this.b);
        final aftp b = aftp.b(aesm.h((Runnable)new d(t, 18)));
        t.addListener((Runnable)b, (Executor)afsl.a);
        return (ListenableFuture)b;
    }
    
    public final ListenableFuture e() {
        final ListenableFuture m = afva.m(Collections.emptySet());
        this.l(m);
        return m;
    }
    
    public final ListenableFuture f() {
        final long c = this.a.c();
        final aeph d = this.d;
        return afqg.k(d.c.rt((Callable)new aepg(d, c, 0)), aesm.c((afrx)new aeiq(this, 8)), (Executor)this.b);
    }
    
    public final ListenableFuture g(final ListenableFuture listenableFuture) {
        return afrp.f(this.n(), (afry)new aacz(listenableFuture, 18), (Executor)afsl.a);
    }
    
    public final void h(final Set set) {
        final abg g = this.g;
        monitorenter(g);
        try {
            for (final AccountId accountId : set) {
                final abg g2 = this.g;
                final HashMap hashMap = new HashMap();
                final aepi aepi = (aepi)agnj.J(this.k, (Class)aepi.class, accountId);
                for (final Map.Entry<String, V> entry : ((afcw)aepi.f()).r()) {
                    o(aepk.b(accountId, aeot.a((String)entry.getKey())), (Map.Entry)entry, hashMap);
                }
                final afie k = ((afhg)aepi.g()).k();
                while (((Iterator)k).hasNext()) {
                    final aeov aeov = (aeov)((Iterator)k).next();
                    if (aeov.a && hashMap.put(aepk.b(accountId, aeov.b()), aeov) != null) {
                        ((afii)((afii)((afig)aepd.j).g()).j("com/google/apps/tiktok/sync/impl/SyncManager", "getAccountSyncletBindings", 744, "SyncManager.java")).t("Duplicate SyncKey found between Set and Map bound Synclets for key %s. Make sure to use either one or the other style, not both", (Object)aeov.b().b());
                    }
                }
                g2.putAll(hashMap);
            }
            monitorexit(g);
        }
        finally {
            monitorexit(g);
            while (true) {}
        }
    }
    
    public final void l(ListenableFuture n) {
        n = afva.n(afrp.f(this.f, aesm.d((afry)new xpu(this, n, 18)), (Executor)this.b));
        this.c.c(n);
        n.addListener((Runnable)new d(n, 17), (Executor)this.b);
    }
}
