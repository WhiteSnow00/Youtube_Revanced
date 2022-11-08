import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccq
{
    final ccg a;
    final int b;
    final ccs c;
    final List d;
    public final WeakReference e;
    public ListenableFuture f;
    private final ccs g;
    private final ccs h;
    private boolean i;
    private boolean j;
    
    public ccq(final cco cco, final ccs c, final ccg a, final int b, final ccs h, final Collection collection) {
        final List list = null;
        this.f = null;
        this.i = false;
        this.j = false;
        this.e = new WeakReference((T)cco);
        this.c = c;
        this.a = a;
        this.b = b;
        this.g = cco.p;
        this.h = h;
        List d;
        if (collection == null) {
            d = list;
        }
        else {
            d = new ArrayList(collection);
        }
        this.d = d;
        cco.j.postDelayed((Runnable)new aur(this, 19), 15000L);
    }
    
    final void a() {
        if (!this.i) {
            if (!this.j) {
                this.j = true;
                final ccg a = this.a;
                if (a != null) {
                    a.i(0);
                    this.a.a();
                }
            }
        }
    }
    
    public final void b() {
        dmk.r();
        if (!this.i) {
            if (!this.j) {
                final cco cco = (cco)this.e.get();
                if (cco != null && cco.x == this) {
                    final ListenableFuture f = this.f;
                    if (f == null || !f.isCancelled()) {
                        this.i = true;
                        cco.x = null;
                        final cco cco2 = (cco)this.e.get();
                        if (cco2 != null) {
                            final ccs p = cco2.p;
                            final ccs g = this.g;
                            if (p == g) {
                                cco2.j.b(263, g, this.b);
                                final ccg q = cco2.q;
                                if (q != null) {
                                    q.i(this.b);
                                    cco2.q.a();
                                }
                                if (!cco2.t.isEmpty()) {
                                    for (final ccg ccg : cco2.t.values()) {
                                        ccg.i(this.b);
                                        ccg.a();
                                    }
                                    cco2.t.clear();
                                }
                                cco2.q = null;
                            }
                        }
                        final cco cco3 = (cco)this.e.get();
                        if (cco3 != null) {
                            final ccs c = this.c;
                            cco3.p = c;
                            cco3.q = this.a;
                            final ccs h = this.h;
                            if (h == null) {
                                cco3.j.b(262, new akp((Object)this.g, (Object)c), this.b);
                            }
                            else {
                                cco3.j.b(264, new akp((Object)h, (Object)c), this.b);
                            }
                            cco3.t.clear();
                            cco3.h();
                            cco3.n();
                            final List d = this.d;
                            if (d != null) {
                                cco3.p.h(d);
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
