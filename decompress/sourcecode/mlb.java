import java.util.Iterator;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TimerTask;
import android.os.Handler;
import java.util.Set;
import java.util.Deque;
import android.util.LruCache;
import android.util.SparseIntArray;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mlb
{
    public final mnb a;
    long b;
    public final mlu c;
    List d;
    final SparseIntArray e;
    final LruCache f;
    final List g;
    final Deque h;
    public mpy i;
    public mpy j;
    public final Set k;
    private final Handler l;
    private final TimerTask m;
    
    public mlb(final mlu c) {
        this.k = Collections.synchronizedSet(new HashSet<Object>());
        this.a = new mnb("MediaQueue");
        this.c = c;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.l = new aeke(Looper.getMainLooper(), (byte[])null);
        this.m = new mky(this);
        c.A((mlc)new mla(this));
        this.f = new mkz(this);
        this.b = this.a();
        this.g();
    }
    
    private final void j() {
        this.l.removeCallbacks((Runnable)this.m);
    }
    
    private final void k() {
        final mpy j = this.j;
        if (j != null) {
            j.f();
            this.j = null;
        }
    }
    
    private final void l() {
        final mpy i = this.i;
        if (i != null) {
            i.f();
            this.i = null;
        }
    }
    
    public final long a() {
        final MediaStatus f = this.c.f();
        if (f != null) {
            final MediaInfo a = f.a;
            int a2;
            if (a == null) {
                a2 = -1;
            }
            else {
                a2 = a.a;
            }
            if (!MediaStatus.f(f.e, f.f, f.l, a2)) {
                return f.b;
            }
        }
        return 0L;
    }
    
    public final void b() {
        this.e();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        this.j();
        this.h.clear();
        this.k();
        this.l();
        this.d();
        this.c();
    }
    
    public final void c() {
        synchronized (this.k) {
            final Iterator iterator = this.k.iterator();
            if (!iterator.hasNext()) {
                return;
            }
            final mlc mlc = (mlc)iterator.next();
            throw null;
        }
    }
    
    public final void d() {
        synchronized (this.k) {
            final Iterator iterator = this.k.iterator();
            if (!iterator.hasNext()) {
                return;
            }
            final mlc mlc = (mlc)iterator.next();
            throw null;
        }
    }
    
    public final void e() {
        synchronized (this.k) {
            final Iterator iterator = this.k.iterator();
            if (!iterator.hasNext()) {
                return;
            }
            final mlc mlc = (mlc)iterator.next();
            throw null;
        }
    }
    
    public final void f() {
        this.e.clear();
        for (int i = 0; i < this.d.size(); ++i) {
            this.e.put((int)this.d.get(i), i);
        }
    }
    
    public final void g() {
        kgk.aQ("Must be called from the main thread.");
        if (this.b == 0L) {
            return;
        }
        if (this.j != null) {
            return;
        }
        this.k();
        this.l();
        final mlu c = this.c;
        kgk.aQ("Must be called from the main thread.");
        Object w;
        if (!c.n()) {
            w = mlu.w();
        }
        else {
            w = new mlh(c);
            mlu.v((mlr)w);
        }
        (this.j = (mpy)w).g((mqc)new mkx(this, 1));
    }
    
    public final void h() {
        this.j();
        this.l.postDelayed((Runnable)this.m, 500L);
    }
    
    public final void i() {
        synchronized (this.k) {
            final Iterator iterator = this.k.iterator();
            if (!iterator.hasNext()) {
                return;
            }
            final mlc mlc = (mlc)iterator.next();
            throw null;
        }
    }
}
