import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccu
{
    final cck a;
    final int b;
    final ccw c;
    final List d;
    public final WeakReference e;
    public ListenableFuture f;
    private final ccw g;
    private final ccw h;
    private boolean i;
    private boolean j;
    
    public ccu(final ccs ccs, final ccw c, final cck a, final int b, final ccw h, final Collection collection) {
        final List list = null;
        this.f = null;
        this.i = false;
        this.j = false;
        this.e = new WeakReference((T)ccs);
        this.c = c;
        this.a = a;
        this.b = b;
        this.g = ccs.p;
        this.h = h;
        List d;
        if (collection == null) {
            d = list;
        }
        else {
            d = new ArrayList(collection);
        }
        this.d = d;
        ccs.j.postDelayed((Runnable)new asa(this, 20), 15000L);
    }
    
    final void a() {
        if (!this.i) {
            if (!this.j) {
                this.j = true;
                final cck a = this.a;
                if (a != null) {
                    a.i(0);
                    this.a.a();
                }
            }
        }
    }
    
    public final void b() {
        dmo.r();
        if (!this.i) {
            if (!this.j) {
                final ccs ccs = (ccs)this.e.get();
                if (ccs != null && ccs.x == this) {
                    final ListenableFuture f = this.f;
                    if (f == null || !f.isCancelled()) {
                        this.i = true;
                        ccs.x = null;
                        final ccs ccs2 = (ccs)this.e.get();
                        if (ccs2 != null) {
                            final ccw p = ccs2.p;
                            final ccw g = this.g;
                            if (p == g) {
                                ccs2.j.b(263, g, this.b);
                                final cck q = ccs2.q;
                                if (q != null) {
                                    q.i(this.b);
                                    ccs2.q.a();
                                }
                                if (!ccs2.t.isEmpty()) {
                                    for (final cck cck : ccs2.t.values()) {
                                        cck.i(this.b);
                                        cck.a();
                                    }
                                    ccs2.t.clear();
                                }
                                ccs2.q = null;
                            }
                        }
                        final ccs ccs3 = (ccs)this.e.get();
                        if (ccs3 != null) {
                            final ccw c = this.c;
                            ccs3.p = c;
                            ccs3.q = this.a;
                            final ccw h = this.h;
                            if (h == null) {
                                ccs3.j.b(262, new akr((Object)this.g, (Object)c), this.b);
                            }
                            else {
                                ccs3.j.b(264, new akr((Object)h, (Object)c), this.b);
                            }
                            ccs3.t.clear();
                            ccs3.h();
                            ccs3.n();
                            final List d = this.d;
                            if (d != null) {
                                ccs3.p.h(d);
                            }
                        }
                        return;
                    }
                }
                this.a();
            }
        }
    }
}
