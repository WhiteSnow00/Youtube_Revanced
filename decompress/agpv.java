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

public final class agpv extends arwu
{
    public final Executor a;
    public final Set b;
    public final Deque c;
    public int d;
    public boolean e;
    public final agpu f;
    public boolean g;
    public arwu h;
    public auoh i;
    public arxu j;
    private final arws k;
    private final arzi l;
    private final afgh m;
    private final LinkedHashMap n;
    private final Set o;
    private final Queue p;
    private final arwr q;
    private final Queue r;
    private int s;
    private arze t;
    
    public agpv(final arws k, final arzi l, final arwr q, final afgh m) {
        this.b = agra.O();
        this.n = new LinkedHashMap();
        this.o = agra.O();
        this.e = false;
        this.g = false;
        this.k = k;
        this.l = l;
        this.q = q;
        this.m = m;
        this.c = new ArrayDeque();
        this.r = new ArrayDeque();
        this.p = new ArrayDeque();
        this.i = new auoh(((afjx)m).c, 1, 0, 0);
        Executor executor;
        if ((executor = q.c) == null) {
            executor = afwd.a;
        }
        final agpu f = new agpu(executor);
        this.f = f;
        this.a = new afxl(this, afxr.f(f), 2);
    }
    
    private final void i(agpt agpt, int i, final int c) {
        adme.U(agpt.a instanceof MessageLite, "Only MessageLite is supported");
        agpt.a.getClass();
        while (i < c) {
            final afgh afgh = this.m.get(i);
            for (int size = afgh.size(), j = 0; j < size; ++j) {
                final cye cye = afgh.get(j);
            }
            ++i;
        }
        agpt.c = c;
        if (agpt.b.isEmpty()) {
            while (!this.c.isEmpty()) {
                agpt = this.c.peek();
                if (!agpt.b.isEmpty() || agpt.c != agpt.d.i.e) {
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
        final auoh i = this.i;
        adme.U(i.d == 4 ^ true, "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        final int d = i.d;
        auoh j;
        if (d == 3) {
            j = new auoh(i.e, 4, i.c, i.b);
        }
        else {
            if (d == 1) {
                final boolean a = i.a;
            }
            final int c = i.c;
            final int n = c + 1;
            final int e = i.e;
            if (n < e) {
                j = new auoh(e, 1, n, i.b);
            }
            else {
                j = new auoh(e, 3, c, i.b);
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
    
    private static final aapu k(final arwr arwr, final arze arze, final String s) {
        arze.getClass();
        s.getClass();
        return new aapu(arwr, arze, s);
    }
    
    @Override
    public final void b(final String s, final Throwable t) {
        this.a.execute(aewf.h(new aegq(this, s, t, 12)));
    }
    
    @Override
    public final void c() {
        this.a.execute(aewf.h(new aevy(this, 16)));
    }
    
    public final void d() {
        if (this.e) {
            final agpt agpt = this.c.peekLast();
            final int n = this.i.d - 1;
            if (n != 1) {
                if (n == 3) {
                    if (agpt == null) {
                        this.h.c();
                    }
                }
            }
            else if (agpt == null || (agpt.b.isEmpty() && agpt.c == agpt.d.i.b + 1)) {
                this.j();
            }
        }
    }
    
    public final void e() {
        final int n = this.i.d - 1;
        if (n != 1) {
            if (n == 3) {
                for (final agpt agpt : this.c) {
                    this.i(agpt, agpt.c, this.i.e);
                }
            }
        }
        else {
            for (final agpt agpt2 : this.c) {
                final int c = agpt2.c;
                final int b = this.i.b;
                if (c <= b) {
                    this.i(agpt2, c, b + 1);
                }
            }
        }
    }
    
    @Override
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
                    final Iterator iterator = r.iterator();
                    while (iterator.hasNext()) {
                        o = iterator.next();
                        this.j.c(o);
                    }
                    if (empty) {
                        this.j.a(Status.OK, null);
                    }
                }
                this.a.execute(aewf.h((Runnable)new zuo(this, n, 12)));
            }
        }
        finally {
            monitorexit(r);
            while (true) {}
        }
    }
    
    @Override
    public final void g(final Object o) {
        this.a.execute(aewf.h(new afaa(this, o, 7)));
    }
    
    public final void h(final arze arze) {
        final aapu k = k(this.q, arze, this.k.b());
        final afgh afgh = this.m.get(this.i.c);
        for (int size = afgh.size(), i = 0; i < size; ++i) {
            final cye cye = afgh.get(i);
            final arwr q = this.q;
            aapu j;
            if (q == k.c) {
                j = k;
            }
            else {
                j = k(q, (arze)k.a, (String)k.b);
            }
            final int n = ((eot)cye.a).b() - 1;
            if (n != 0) {
                if (n != 1) {
                    ((arze)j.a).f(eos.c, "default-signed-in-account");
                }
                else {
                    ((arze)j.a).f(eos.c, "pseudonymous");
                }
            }
            else {
                ((arze)j.a).f(eos.b, ((eot)cye.a).a());
            }
            this.o.add(cye);
        }
        if (this.n.isEmpty()) {
            this.j();
        }
    }
    
    @Override
    public final void l(final arxu arxu, final arze t) {
        this.j = new agps(this, new agpz((arxu)new arzu(arxu, this.m, this.o, (byte[])null, (byte[])null), null, null), null, null);
        this.t = t;
        this.a.execute(aewf.h(new afaa(this, t, 9)));
    }
}
