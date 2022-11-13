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

public final class hnw
{
    public final oby a;
    public final Executor b;
    public final tqd c;
    public final Object d;
    public ReelSequenceController$PendingContinuation e;
    public ReelSequenceController$PendingContinuation f;
    public final List g;
    public boolean h;
    public boolean i;
    public final vai j;
    public final vai k;
    public final afaj l;
    public final aadx m;
    public final cyb n;
    private final hne o;
    private final atke p;
    private final hmb q;
    
    public hnw(final aadx m, final atke p16, final hmb q, final oby a, final Executor b, final vai j, final cyb n, final vai k, final afaj l, final tqd c, final hne o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
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
    
    public final void a(final ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation, final akqr akqr, final long n) {
        String b;
        if (akqr != null && akqr.d == 5) {
            b = (String)akqr.e;
        }
        else {
            b = null;
        }
        String b2;
        if (akqr != null && akqr.b == 3) {
            b2 = (String)akqr.c;
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
            if (!aezr.f(b)) {
                this.e.b = b;
            }
            if (!aezr.f(b2)) {
                this.f.b = b2;
            }
            final boolean a = this.e.a();
            final boolean a2 = this.f.a();
            this.h = (a2 ^ true);
            monitorexit(o);
            if (akqr != null) {
                if (akqr.h.size() > 0) {
                    final ahbx h = akqr.h;
                    final ArrayList list = new ArrayList(((List)h).size());
                    final ArrayList list2 = new ArrayList(((List)h).size());
                    for (final akqp akqp : agpi.T((List)h)) {
                        if ((akqp.b & 0x1) != 0x0) {
                            o = akqp.c;
                            Object a3;
                            if ((a3 = o) == null) {
                                a3 = aiqj.a;
                            }
                            if (!((ahbc)a3).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                                continue;
                            }
                            o = akqp.c;
                            Object a4;
                            if ((a4 = o) == null) {
                                a4 = aiqj.a;
                            }
                            list.add(a4);
                            Optional optional;
                            if (akqp.d.d() == 0) {
                                optional = Optional.empty();
                            }
                            else {
                                optional = Optional.of((Object)akqp.d);
                            }
                            list2.add((Object)optional);
                        }
                    }
                    final hne o2 = this.o;
                    final long d = o2.d();
                    final hmv p3 = o2.p;
                    adkp.Q(list.size() == list2.size());
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
                                final aiqj aiqj = (aiqj)list.get(i);
                                adkp.Q(hko.o(aiqj));
                                final List a6 = p3.a;
                                --a5;
                                a6.add(0, new hnf(a5, aiqj, (ahab)((Optional)list3.get(i)).orElse((Object)null), false, p3.h));
                                --i;
                            }
                            monitorexit(p3.a);
                            p3.rZ();
                            final int c = o2.p.C(d);
                            if (c != -1) {
                                o2.B = c;
                                o2.q.aa(c);
                                final hnd o3 = o2.o;
                                if (o3 != null && o3.b.k.get() >= 0) {
                                    o3.b.j.execute((Runnable)new hdh(o3, 20));
                                }
                            }
                        }
                    }
                }
                if (akqr.g.size() > 0) {
                    final ahbx g = akqr.g;
                    final ArrayList list4 = new ArrayList(((List)g).size());
                    final ArrayList list5 = new ArrayList<Optional>(((List)g).size());
                    o = ((List)g).iterator();
                    while (((Iterator)o).hasNext()) {
                        final akqp akqp2 = ((Iterator<akqp>)o).next();
                        if ((akqp2.b & 0x1) != 0x0) {
                            aiqj aiqj2;
                            if ((aiqj2 = akqp2.c) == null) {
                                aiqj2 = aiqj.a;
                            }
                            if (!hko.o(aiqj2)) {
                                continue;
                            }
                            aiqj aiqj3;
                            if ((aiqj3 = akqp2.c) == null) {
                                aiqj3 = aiqj.a;
                            }
                            list4.add((Object)aiqj3);
                            Optional optional2;
                            if (akqp2.d.d() == 0) {
                                optional2 = Optional.empty();
                            }
                            else {
                                optional2 = Optional.of((Object)akqp2.d);
                            }
                            list5.add(optional2);
                        }
                    }
                    this.o.i((List)list4, (List)list5);
                    this.q.i(list4);
                }
                final hmv p4 = this.o.p;
                if (p4.g && p4.i != a) {
                    p4.i = a;
                    p4.mT(p4.D());
                }
                this.o.p.L(a2);
                final Optional optional3 = (Optional)this.p.a();
                if (optional3.isPresent()) {
                    ((hqx)optional3.get()).d.b(n);
                }
            }
            synchronized (this.d) {
                final ArrayList list6 = new ArrayList(this.g);
                this.g.clear();
                monitorexit(this.d);
                for (int size = list6.size(), j = 0; j < size; ++j) {
                    ((hnv)list6.get(j)).b();
                }
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final boolean b(final hnv hnv) {
        synchronized (this.d) {
            if (!this.f.a && !this.e.a) {
                return false;
            }
            this.g.add(hnv);
            return true;
        }
    }
    
    public final boolean c() {
        synchronized (this.d) {
            return this.e.a();
        }
    }
    
    public final void d(final ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation, final hsx hsx, final int n, final int c) {
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
                ((vml)((aadx)o).f).e((vls)hsx, (zpf)new hnt(this, reelSequenceController$PendingContinuation, n, hsx, c, d));
            }
        }
    }
    
    public final void e(final int n) {
        Object o = this.d;
        synchronized (o) {
            final String b = this.f.b;
            monitorexit(o);
            if (aezr.f(b)) {
                return;
            }
            o = this.m.m();
            ((hsx)o).a = b;
            this.d(this.f, (hsx)o, 2, n);
        }
    }
}
