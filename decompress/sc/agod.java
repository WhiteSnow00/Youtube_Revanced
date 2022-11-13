import java.util.List;
import io.grpc.Status;
import java.util.Iterator;
import com.google.protobuf.MessageLite;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedHashMap;
import java.util.Deque;
import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agod extends arua
{
    public final Executor a;
    public final Set b;
    public final Deque c;
    public int d;
    public boolean e;
    public final agoc f;
    public boolean g;
    public arua h;
    public aulm i;
    public arbu j;
    private final arty k;
    private final arwo l;
    private final afeq m;
    private final LinkedHashMap n;
    private final Set o;
    private final Queue p;
    private final artx q;
    private final Queue r;
    private int s;
    private arwk t;
    
    public agod(final arty k, final arwo l, final artx q, final afeq m) {
        this.b = agqs.aj();
        this.n = new LinkedHashMap();
        this.o = agqs.aj();
        this.e = false;
        this.g = false;
        this.k = k;
        this.l = l;
        this.q = q;
        this.m = m;
        this.c = new ArrayDeque();
        this.r = new ArrayDeque();
        this.p = new ArrayDeque();
        this.i = new aulm(((afih)m).c, 1, 0, 0);
        Object o;
        if ((o = q.c) == null) {
            o = afum.a;
        }
        final agoc f = new agoc((Executor)o);
        this.f = f;
        this.a = (Executor)new afvu(this, afwm.g((Executor)f), 2);
    }
    
    private final void i(agob agob, int i, final int c) {
        adkp.R(agob.a instanceof MessageLite, (Object)"Only MessageLite is supported");
        agob.a.getClass();
        while (i < c) {
            final afeq afeq = (afeq)this.m.get(i);
            for (int size = ((List)afeq).size(), j = 0; j < size; ++j) {
                final cyb cyb = (cyb)((List)afeq).get(j);
            }
            ++i;
        }
        agob.c = c;
        if (agob.b.isEmpty()) {
            while (!this.c.isEmpty()) {
                agob = this.c.peek();
                if (!agob.b.isEmpty() || agob.c != agob.d.i.e) {
                    break;
                }
                final Object a = this.c.poll().a;
                if (this.i.d == 4) {
                    this.h.g(a);
                }
                else {
                    this.p.add(a);
                }
            }
            this.d();
        }
    }
    
    private final void j() {
        final aulm i = this.i;
        adkp.R(i.d == 4 ^ true, (Object)"UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        final int d = i.d;
        aulm j;
        if (d == 3) {
            j = new aulm(i.e, 4, i.c, i.b);
        }
        else {
            if (d == 1) {
                final boolean a = i.a;
            }
            final int c = i.c;
            final int n = c + 1;
            final int e = i.e;
            if (n < e) {
                j = new aulm(e, 1, n, i.b);
            }
            else {
                j = new aulm(e, 3, c, i.b);
            }
        }
        this.i = j;
        final int n2 = j.d - 1;
        if (n2 == 0) {
            this.h(this.t);
            return;
        }
        if (n2 != 2) {
            this.e();
            return;
        }
        (this.h = this.k.a(this.l, this.q)).l(this.j, this.t);
        final int d2 = this.d;
        if (d2 > 0) {
            this.h.f(d2);
        }
        final Iterator iterator = this.p.iterator();
        while (iterator.hasNext()) {
            this.h.g(iterator.next());
        }
        if (this.e && this.c.isEmpty()) {
            this.h.c();
        }
        this.j();
    }
    
    private static final aujg k(final artx artx, final arwk arwk, final String s) {
        arwk.getClass();
        s.getClass();
        return new aujg(artx, arwk, s);
    }
    
    public final void b(final String s, final Throwable t) {
        this.a.execute(aeun.h((Runnable)new adlo(this, s, t, 14)));
    }
    
    public final void c() {
        this.a.execute(aeun.h((Runnable)new aeue(this, 16)));
    }
    
    public final void d() {
        if (this.e) {
            final agob agob = this.c.peekLast();
            final int n = this.i.d - 1;
            if (n != 1) {
                if (n == 3) {
                    if (agob == null) {
                        this.h.c();
                    }
                }
            }
            else if (agob == null || (agob.b.isEmpty() && agob.c == agob.d.i.b + 1)) {
                this.j();
            }
        }
    }
    
    public final void e() {
        final int n = this.i.d - 1;
        if (n != 1) {
            if (n == 3) {
                for (final agob agob : this.c) {
                    this.i(agob, agob.c, this.i.e);
                }
            }
        }
        else {
            for (final agob agob2 : this.c) {
                final int c = agob2.c;
                final int b = this.i.b;
                if (c <= b) {
                    this.i(agob2, c, b + 1);
                }
            }
        }
    }
    
    public final void f(final int n) {
        Queue r = this.r;
        monitorenter(r);
        try {
            this.s += n;
            monitorexit(r);
            r = new ArrayDeque();
            Object o = this.r;
            synchronized (o) {
                if (this.r.isEmpty()) {
                    monitorexit(o);
                }
                else {
                    for (int s = this.s, i = 0; i < s; ++i) {
                        final Object poll = this.r.poll();
                        if (poll != null) {
                            r.add(poll);
                            --this.s;
                        }
                    }
                    final boolean empty = this.r.isEmpty();
                    monitorexit(o);
                    o = r.iterator();
                    while (((Iterator)o).hasNext()) {
                        this.j.c(((Iterator)o).next());
                    }
                    if (empty) {
                        this.j.a(Status.OK, null);
                    }
                }
                this.a.execute(aeun.h((Runnable)new aasq(this, n, 11)));
            }
        }
        finally {
            monitorexit(r);
            while (true) {}
        }
    }
    
    public final void g(final Object o) {
        this.a.execute(aeun.h((Runnable)new agjf(this, o, 5)));
    }
    
    public final void h(final arwk arwk) {
        final aujg k = k(this.q, arwk, this.k.b());
        final afeq afeq = (afeq)this.m.get(this.i.c);
        for (int size = ((List)afeq).size(), i = 0; i < size; ++i) {
            final cyb cyb = (cyb)((List)afeq).get(i);
            final artx q = this.q;
            aujg j;
            if (q == k.c) {
                j = k;
            }
            else {
                j = k(q, (arwk)k.b, (String)k.a);
            }
            final int n = ((eoq)cyb.a).b() - 1;
            if (n != 0) {
                if (n != 1) {
                    ((arwk)j.b).f(eop.c, (Object)"default-signed-in-account");
                }
                else {
                    ((arwk)j.b).f(eop.c, (Object)"pseudonymous");
                }
            }
            else {
                ((arwk)j.b).f(eop.b, (Object)((eoq)cyb.a).a());
            }
            this.o.add(cyb);
        }
        if (this.n.isEmpty()) {
            this.j();
        }
    }
    
    public final void l(final arbu arbu, final arwk t) {
        this.j = new agoa(this, new agog((arbu)new arxa(arbu, this.m, this.o, (byte[])null, (byte[])null), null, null), null, null);
        this.t = t;
        this.a.execute(aeun.h((Runnable)new agjf(this, t, 7)));
    }
}
