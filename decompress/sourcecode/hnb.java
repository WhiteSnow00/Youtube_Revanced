import java.util.Iterator;
import java.util.Collection;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.List;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnb
{
    public final oas a;
    public final Executor b;
    public final tny c;
    public final Object d;
    public ReelSequenceController$PendingContinuation e;
    public ReelSequenceController$PendingContinuation f;
    public final List g;
    public boolean h;
    public boolean i;
    public final uyi j;
    public final uyi k;
    public final aeyk l;
    public final aaca m;
    public final cya n;
    private final hmk o;
    private final atjj p;
    private final hlf q;
    
    public hnb(final aaca m, final atjj p16, final hlf q, final oas a, final Executor b, final uyi j, final cya n, final uyi k, final aeyk l, final tny c, final hmk o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.d = new Object();
        this.e = new ReelSequenceController$PendingContinuation();
        this.f = new ReelSequenceController$PendingContinuation();
        this.g = new ArrayList();
        this.m = m;
        this.o = o;
        this.p = p16;
        this.q = q;
        this.j = j;
        this.n = n;
        this.a = a;
        this.b = b;
        this.k = k;
        this.l = l;
        this.c = c;
    }
    
    public final void a(final ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation, final akoo akoo, final long n) {
        String b;
        if (akoo != null && akoo.d == 5) {
            b = (String)akoo.e;
        }
        else {
            b = null;
        }
        String b2;
        if (akoo != null && akoo.b == 3) {
            b2 = (String)akoo.c;
        }
        else {
            b2 = null;
        }
        Object o = this.d;
        monitorenter(o);
        try {
            reelSequenceController$PendingContinuation.a = false;
            reelSequenceController$PendingContinuation.b = null;
            reelSequenceController$PendingContinuation.c = 1;
            if (!aexs.f(b)) {
                this.e.b = b;
            }
            if (!aexs.f(b2)) {
                this.f.b = b2;
            }
            final boolean a = this.e.a();
            final boolean a2 = this.f.a();
            this.h = (a2 ^ true);
            monitorexit(o);
            if (akoo != null) {
                if (akoo.h.size() > 0) {
                    final agzy h = akoo.h;
                    final ArrayList list = new ArrayList(h.size());
                    final ArrayList list2 = new ArrayList(h.size());
                    for (final akom akom : adwd.ap(h)) {
                        if ((akom.b & 0x1) != 0x0) {
                            o = akom.c;
                            Object a3;
                            if ((a3 = o) == null) {
                                a3 = aioe.a;
                            }
                            if (!((agzd)a3).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                                continue;
                            }
                            o = akom.c;
                            Object a4;
                            if ((a4 = o) == null) {
                                a4 = aioe.a;
                            }
                            list.add(a4);
                            Optional optional;
                            if (akom.d.d() == 0) {
                                optional = Optional.empty();
                            }
                            else {
                                optional = Optional.of((Object)akom.d);
                            }
                            list2.add((Object)optional);
                        }
                    }
                    final hmk o2 = this.o;
                    final long d = o2.d();
                    final hma p3 = o2.p;
                    agot.D(list.size() == list2.size());
                    Label_0559: {
                        if (list.isEmpty()) {
                            break Label_0559;
                        }
                        synchronized (p3.a) {
                            long a5;
                            if (p3.a.isEmpty()) {
                                a5 = 0L;
                            }
                            else {
                                a5 = p3.a.get(0).a;
                            }
                            int i = list.size() - 1;
                            final ArrayList list3 = list2;
                            while (i >= 0) {
                                final aioe aioe = (aioe)list.get(i);
                                agot.D(iba.y(aioe));
                                final List a6 = p3.a;
                                --a5;
                                a6.add(0, new hml(a5, aioe, (agyc)((Optional)list3.get(i)).orElse((Object)null), false, p3.h));
                                --i;
                            }
                            monitorexit(p3.a);
                            ((nq)p3).rT();
                            final int c = o2.p.C(d);
                            if (c != -1) {
                                o2.B = c;
                                o2.q.aa(c);
                                final hmj o3 = o2.o;
                                if (o3 != null && o3.b.k.get() >= 0) {
                                    o3.b.j.execute((Runnable)new hmi(o3, 0));
                                }
                            }
                        }
                    }
                }
                if (akoo.g.size() > 0) {
                    final agzy g = akoo.g;
                    final ArrayList list4 = new ArrayList(g.size());
                    final ArrayList list5 = new ArrayList<Optional>(g.size());
                    o = g.iterator();
                    while (((Iterator)o).hasNext()) {
                        final akom akom2 = ((Iterator<akom>)o).next();
                        if ((akom2.b & 0x1) != 0x0) {
                            aioe aioe2;
                            if ((aioe2 = akom2.c) == null) {
                                aioe2 = aioe.a;
                            }
                            if (!iba.y(aioe2)) {
                                continue;
                            }
                            aioe aioe3;
                            if ((aioe3 = akom2.c) == null) {
                                aioe3 = aioe.a;
                            }
                            list4.add((Object)aioe3);
                            Optional optional2;
                            if (akom2.d.d() == 0) {
                                optional2 = Optional.empty();
                            }
                            else {
                                optional2 = Optional.of((Object)akom2.d);
                            }
                            list5.add(optional2);
                        }
                    }
                    this.o.i(list4, list5);
                    this.q.i((List)list4);
                }
                final hma p4 = this.o.p;
                if (p4.g && p4.i != a) {
                    p4.i = a;
                    ((nq)p4).tc(p4.D());
                }
                this.o.p.L(a2);
                final Optional optional3 = (Optional)this.p.a();
                if (optional3.isPresent()) {
                    ((hqc)optional3.get()).d.b(n);
                }
            }
            int j = 0;
            synchronized (this.d) {
                final ArrayList list6 = new ArrayList(this.g);
                this.g.clear();
                monitorexit(this.d);
                while (j < list6.size()) {
                    ((hna)list6.get(j)).b();
                    ++j;
                }
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final boolean b(final hna hna) {
        synchronized (this.d) {
            if (!this.f.a && !this.e.a) {
                return false;
            }
            this.g.add(hna);
            return true;
        }
    }
    
    public final boolean c() {
        synchronized (this.d) {
            return this.e.a();
        }
    }
    
    public final void d(final ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation, final hsb hsb, final int n, final int c) {
        Object o = this.d;
        synchronized (o) {
            final int c2 = reelSequenceController$PendingContinuation.c;
            if (c2 == 0) {
                throw null;
            }
            if (c2 - 1 < c - 1) {
                reelSequenceController$PendingContinuation.c = c;
            }
            if (!reelSequenceController$PendingContinuation.a) {
                reelSequenceController$PendingContinuation.a = true;
                monitorexit(o);
                final long d = this.a.d();
                o = this.m;
                ((vkh)((aaca)o).f).e((vjn)hsb, (znj)new hmz(this, reelSequenceController$PendingContinuation, n, hsb, c, d));
            }
        }
    }
    
    public final void e(final int n) {
        Object o = this.d;
        synchronized (o) {
            final String b = this.f.b;
            monitorexit(o);
            if (aexs.f(b)) {
                return;
            }
            o = this.m.m();
            ((hsb)o).a = b;
            this.d(this.f, (hsb)o, 2, n);
        }
    }
}
