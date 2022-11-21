import android.database.Cursor;
import android.util.Log;
import android.os.Looper;
import java.util.concurrent.locks.Lock;
import java.util.Set;
import java.util.concurrent.Callable;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.Map;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cfw
{
    public volatile cgp a;
    public Executor b;
    public cgt c;
    public final cfu d;
    public boolean e;
    public List f;
    public final Map g;
    public final Map h;
    private final ReentrantReadWriteLock i;
    private final ThreadLocal j;
    
    public cfw() {
        this.d = this.a();
        this.g = new LinkedHashMap();
        this.i = new ReentrantReadWriteLock();
        this.j = new ThreadLocal();
        DesugarCollections.synchronizedMap((Map)new LinkedHashMap()).getClass();
        this.h = new LinkedHashMap();
    }
    
    public static final Object q(final Class clazz, final cgt cgt) {
        if (clazz.isInstance(cgt)) {
            return cgt;
        }
        return null;
    }
    
    protected abstract cfu a();
    
    protected abstract cgt b(final cfr p0);
    
    public final cgt c() {
        cgt c;
        if ((c = this.c) == null) {
            atqz.b("internalOpenHelper");
            c = null;
        }
        return c;
    }
    
    public final Object d(final Callable callable) {
        callable.getClass();
        this.k();
        try {
            final Object call = callable.call();
            this.n();
            return call;
        }
        finally {
            this.l();
        }
    }
    
    public List e(final Map map) {
        map.getClass();
        return (List)atnz.a;
    }
    
    protected Map f() {
        return (Map)atoa.a;
    }
    
    public Set g() {
        return (Set)atob.a;
    }
    
    public final Lock h() {
        final ReentrantReadWriteLock.ReadLock lock = this.i.readLock();
        lock.getClass();
        return lock;
    }
    
    public final void i() {
        if (this.e) {
            return;
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }
    
    public final void j() {
        if (!this.o() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }
    
    public final void k() {
        this.i();
        this.i();
        final cgp a = this.c().a();
        this.d.a(a);
        if (((cgy)a).b.isWriteAheadLoggingEnabled()) {
            a.e();
            return;
        }
        a.d();
    }
    
    public final void l() {
        this.c().a().f();
        if (!this.o()) {
            final cfu d = this.d;
            if (d.b.compareAndSet(false, true)) {
                final cet h = d.h;
                Executor b;
                if ((b = d.a.b) == null) {
                    atqz.b("internalQueryExecutor");
                    b = null;
                }
                b.execute(d.f);
            }
        }
    }
    
    public final void m(final cgp cgp) {
        final cfu d = this.d;
        synchronized (d.e) {
            if (d.c) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            cgp.g("PRAGMA temp_store = MEMORY;");
            cgp.g("PRAGMA recursive_triggers='ON';");
            cgp.g("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            d.a(cgp);
            d.g = cgp.k("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            d.c = true;
        }
    }
    
    public final void n() {
        this.c().a().h();
    }
    
    public final boolean o() {
        return this.c().a().i();
    }
    
    public final Cursor p(final cgv cgv) {
        this.i();
        this.j();
        return this.c().a().a(cgv);
    }
}
